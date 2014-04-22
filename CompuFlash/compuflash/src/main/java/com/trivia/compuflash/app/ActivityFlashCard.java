package com.trivia.compuflash.app;

import android.app.Dialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


import java.util.ArrayList;


public class ActivityFlashCard extends ActionBarActivity
{
    Context context = this;
    private String activityTitle;
    private String webSiteURL;
    private boolean singleFolder = false;
    private int numberOfAdditionalURLs = 0;

    private ArrayList<String>urlList = new ArrayList<String>();
    private ArrayList <Question> questions = new ArrayList<Question>();
    private Integer numberOfEntries;

    TextView titleDescriptionTextView;
    ProgressBar loadingProgress;
    ListView questionListView;
    QuestionArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_card);

        Bundle cardsWanted= getIntent().getExtras();
        if (getIntent().hasExtra("searchType"))
        {
            activityTitle = (cardsWanted.getString("searchType"));
            webSiteURL    = (cardsWanted.getString("website"));
            urlList.add(webSiteURL);
        }
        if(getIntent().hasExtra("singleFolder"))
        {
            singleFolder = true;
        }

        TextView titleTextView = (TextView)findViewById(R.id.menuTitleTextView);
        titleTextView.setText(activityTitle);

        titleDescriptionTextView = (TextView)findViewById(R.id.menuTitleDescriptionTextView);
        //titleDescriptionTextView.setText(webSiteURL);

        questionListView = (ListView)findViewById(R.id.questionListView);

        ImageButton backButton = (ImageButton)findViewById(R.id.backButtonDirectory);
        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onBackPressed();
            }
        });


        new SingleFolderParse().execute();
    }


    private class SingleFolderParse extends AsyncTask<Void, Void, Void>
    {
        Dialog loadingDialog = new Dialog(ActivityFlashCard.this);

        @Override
        protected void onPreExecute()
        {
            super.onPreExecute();

            //this method will be running on UI thread
            loadingDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            Window dialogWindow = loadingDialog.getWindow();
            dialogWindow.setBackgroundDrawableResource(R.drawable.white_rounded_corners);
            loadingDialog.setContentView(R.layout.dialog_loading_screen);
            loadingProgress = (ProgressBar) loadingDialog.findViewById(R.id.progressBar);
            loadingDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params)
        {
            try
            {
                questions.clear();
                numberOfEntries = 0;

                Document document = Jsoup.connect(webSiteURL).get();

                Elements urls = document.select("div.div-multipager > a[href]");
                if(urls.size() == 0)
                {
                    urls = document.select("p.ib-pager > a[href]");
                }

                int numberOfURLs = urls.size();

                //StringBuilder yup = new StringBuilder();
                for(Element url : urls)
                {
                    urlList.add(webSiteURL + url.text());
                    //yup.append(webSiteURL + url.text()+"\n\n");

                }

                loadingProgress.setMax(urls.size());
                loadingProgress.setSecondaryProgress(urls.size());

                //Question numberQuestion = new Question();
                //numberQuestion.setTitle(yup.toString());
                //questions.add(numberQuestion);



                for(int i = 0; i < urls.size(); i++)
                {
                    document = Jsoup.connect(urlList.get(i)).get();

                    boolean foundStart = false;
                    boolean foundEnd = false;

                    Elements links = document.getAllElements();




                    for (Element link : links)
                    {


                        if (link.hasAttr("class"))
                        {

                            if(link.attr("class").equals("ib-pager"))
                            {
                                foundEnd = true;

                            }
                        }

                        if( foundStart && !foundEnd)
                        {
                            if (link.attr("class").equals("tech-question ib-green"))
                            {
                                foundStart = true;
                                numberOfEntries++;
                                Question nextQuestion = new Question();
                                nextQuestion.setQuestion(link.text());
                                nextQuestion.setTitle("Question " + numberOfEntries);


                                if(link.nextElementSibling().attr("class").equals("tech-answer"))
                                {
                                    Element tempLink = link;
                                    Elements answer = link.nextElementSibling().select("p");

                                    StringBuilder answerBuilder = new StringBuilder();

                                    for(Element singleAnswer : answer)
                                    {
                                        answerBuilder.append(singleAnswer.text() + "\n");
                                    }

                                    Elements olAnswers = tempLink.nextElementSibling().select("ol.tech-ol-123 > li");
                                    for(Element liAnswers : olAnswers)
                                    {
                                        Elements liset = liAnswers.select("li");
                                        for(Element li : liset)
                                        {
                                            answerBuilder.append(li.text() + "\n");
                                        }

                                    }

                                    nextQuestion.setAnswer(answerBuilder.toString());
                                }

                                questions.add(nextQuestion);
                            }
                        }

                        if (link.hasAttr("class"))
                        {
                            if (link.attr("class").equals("tech-div"))
                            {
                                foundStart = true;
                            }
                        }
                    }

                    loadingProgress.incrementProgressBy(1);
                }




            }
            catch (Exception e)
            {
                e.printStackTrace();
                questions.add(new Question("error", "error", "error"));
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            //At this point, the loading dialog is still showing and all data has been parsed
            //from the site. Now we set a lot of variables

            QuestionArrayAdapter adapter = new QuestionArrayAdapter(context, questions);
            questionListView.setAdapter(adapter);

            titleDescriptionTextView.setText(numberOfEntries + " Questions");


            //this method will be running on UI thread
            loadingDialog.dismiss();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_flash_card, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed()
    {
        finish();
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }

}

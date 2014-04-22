package com.trivia.compuflash.app;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by danielrobertson on 4/11/14.
 */
public class DialogCreator
{
    public static void questionDialog(final Context context, final String question, final String answer)
    {


        final Dialog questionDialog = new Dialog(context);

        questionDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        Window dialogWindow = questionDialog.getWindow();
        dialogWindow.setBackgroundDrawableResource(R.drawable.white_rounded_corners);
        questionDialog.setContentView(R.layout.dialog_question);


        final TextView questionTitle = (TextView)questionDialog.findViewById(R.id.dialogQuestionTextView);
        questionTitle.setText(question);

        questionTitle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                questionDialog.dismiss();
                answerDialog(context, answer);
            }
        });


        final Button questionCloseButton = (Button)questionDialog.findViewById(R.id.dialogAnswerButton);
        questionCloseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                questionDialog.dismiss();
                answerDialog(context, answer);
            }
        });
        questionCloseButton.setVisibility(View.GONE);


        questionDialog.show();
    }

    public static void answerDialog(Context context, String answer)
    {
        final Dialog answerDialog = new Dialog(context);

        answerDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        Window dialogWindow = answerDialog.getWindow();
        dialogWindow.setBackgroundDrawableResource(R.drawable.white_rounded_corners);
        answerDialog.setContentView(R.layout.dialog_answer);


        final TextView answerText = (TextView)answerDialog.findViewById(R.id.dialogAnswerTextView);
        answerText.setText(answer);




        final Button questionCloseButton = (Button)answerDialog.findViewById(R.id.dialogAnswerButton);
        questionCloseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                answerDialog.dismiss();
            }
        });

        answerDialog.show();
    }
}

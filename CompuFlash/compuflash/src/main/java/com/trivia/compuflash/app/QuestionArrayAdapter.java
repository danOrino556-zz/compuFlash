package com.trivia.compuflash.app;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by danielrobertson on 4/11/14.
 */
public class QuestionArrayAdapter extends ArrayAdapter<Question>
{
    private final Context context;
    private final ArrayList<Question> values;

    public QuestionArrayAdapter(Context context, ArrayList<Question> values)
    {
        super(context, R.layout.question_row, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        final int i = position;

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.question_row, parent, false);

        final TextView textView = (TextView) rowView.findViewById(R.id.authorRowTextView);
        textView.setText(values.get(position).getTitle());

        textView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textView.setTextColor(Color.parseColor("#b8bdc0"));

                DialogCreator.questionDialog(context, values.get(i).getQuestion(), values.get(i).getAnswer());

            }
        });

        return rowView;
    }
}

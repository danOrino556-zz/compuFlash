package com.trivia.compuflash.app;

/**
 * Created by danielrobertson on 4/11/14.
 */
public class Question
{
    private String question;
    private String answer = new String("");
    private String title;

    public Question()
    {

    }

    public Question (String question, String answer, String title)
    {
        this.setQuestion(question);
        this.setTitle(title);
        this.setAnswer(answer);
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

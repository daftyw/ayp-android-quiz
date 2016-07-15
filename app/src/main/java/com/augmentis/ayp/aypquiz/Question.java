package com.augmentis.ayp.aypquiz;

/**
 * Created by Rawin on 14-Jul-16.
 */
public class Question {
    private int questionId;
    private boolean answer;
    private boolean cheated;

    public Question(int questionId, boolean answer) {
        this.questionId = questionId;
        this.answer = answer;
        this.cheated = false;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public boolean getCheated() {
        return cheated;
    }

    public void setCheated(boolean cheated) {
        this.cheated = cheated;
    }
}

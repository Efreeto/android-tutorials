package com.voicebox.bignerdrach.geoquiz;

public class TrueFalse {
    private int mQuestion;
    private boolean mIsAnswerTrue;

    public boolean isAnswerTrue() {
        return mIsAnswerTrue;
    }

    public void setIsAnswerTrue(boolean isAnswerTrue) {
        mIsAnswerTrue = isAnswerTrue;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public TrueFalse (int question, boolean isAnswerTrue) {
        mQuestion = question;
        mIsAnswerTrue = isAnswerTrue;

    }
}

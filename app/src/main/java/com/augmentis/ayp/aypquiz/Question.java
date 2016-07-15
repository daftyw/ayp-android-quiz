package com.augmentis.ayp.aypquiz;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Rawin on 14-Jul-16.
 */
public class Question implements Parcelable {
    private int questionId;
    private boolean answer;
    private boolean cheated;

    private Question(Parcel parcel) {
        questionId = parcel.readInt();
        boolean[] booleanArr = new boolean[2];
        parcel.readBooleanArray(booleanArr);
        answer = booleanArr[0];
        cheated = booleanArr[1];
    }

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(questionId);
        dest.writeBooleanArray(new boolean[] { answer, cheated });
    }

    public static final Parcelable.Creator<Question> CREATOR = new Parcelable.Creator<Question>() {

        @Override
        public Question createFromParcel(Parcel source) {
            return new Question(source);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };
}

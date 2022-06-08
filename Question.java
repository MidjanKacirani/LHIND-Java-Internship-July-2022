package javaAssignment1;

public class Question {

    public Question(String question) {
        this.question = question;
    }

    private int answer;

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    private String question;
    /*
    final static int AGREE = 1;
    final static int SLIGHTLY_AGREE = 2;
    final static int SLIGHTLY_DISAGREE = 3;
    final static int DISAGREE = 4;
    final static int NOT_ANSWER = 5;
    */

}

package javaAssignment1;
import java.util.ArrayList;
import java.util.Scanner;
public class Helper {
    private static Scanner objSk = new Scanner(System.in);

    protected static Question getQuestion() {

        String question;
        do {
            System.out.println("Write the question: ");
            question = objSk.next();
        } while (!question.isBlank());

        Question questionSet = new Question(question);

        return questionSet;
    }

    protected static boolean validationMethod(ArrayList<Question> arg) {

        if (arg.size() < 10) {
            System.out.println("A survey needs to have at least 10");
            return true;
        }
        if (arg.size() > 40) {
            System.out.println("A survey can have a max of 40 questions");
            return false;
        }

        return true;

    }


    protected static ArrayList<Question> getQuestionList() {
        ArrayList<Question> questionArrayList = new ArrayList<Question>();
        boolean validation = true;
        do {
            Question question = getQuestion();
            if(questionArrayList.contains(question)){
                System.out.println("Question is already inserted in the survey");
            }else{
                questionArrayList.add(question);
            }
            System.out.println("Do you want to add more questions?(Yes/No) ");
            String response = objSk.next();
            if (response.equalsIgnoreCase("Yes")) {
                validation = validationMethod(questionArrayList);
            } else {
                if (response.equalsIgnoreCase("No")) {
                    validation = validationMethod(questionArrayList);
                } else {
                    System.out.println("Enter a valid response");
                }
            }
        }while(validation);

        return questionArrayList;

    }

    protected static void printAnswers(){
        System.out.println("1) Agree");
        System.out.println("2) Slightly Agree");
        System.out.println("3) Slightly Disagree");
        System.out.println("4) Disagree");
        System.out.println("5) Don't want to answer");
    }

}

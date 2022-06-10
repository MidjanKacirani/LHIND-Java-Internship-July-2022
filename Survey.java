package javaAssignment1;
import java.util.ArrayList;
import java.util.Scanner;

public class Survey {

    private String surveyName;
    private String surveyDescription;

    private ArrayList<SurveyResult> listOfResults;

    public ArrayList<Question> getQuestionArrayList() {
        return questionArrayList;
    }

    private ArrayList<Question> questionArrayList = new ArrayList<Question>();

    private Scanner objSk = new Scanner(System.in);

    public Survey() {

        System.out.println("Enter Survey Name: ");
        this.surveyName = objSk.next();
        System.out.println("Enter Survey Description: ");
        this.surveyDescription = objSk.next();

        questionArrayList = Helper.getQuestionList();

    }

    public void startSurvey(Candidate surveyTaker){
    listOfResults.add(new SurveyResult(surveyTaker, Helper.takeSurvey(this)));
    }



}

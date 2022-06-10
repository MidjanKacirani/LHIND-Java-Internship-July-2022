package javaAssignment1;

import java.util.ArrayList;

public class SurveyResult {

    public SurveyResult(Candidate surveyTaker, ArrayList<Integer> responses) {
        this.surveyTaker = surveyTaker;
        this.responses = responses;
    }

    public Candidate getSurveyTaker() {
        return surveyTaker;
    }

    public ArrayList<Integer> getResponses() {
        return responses;
    }

    private Candidate surveyTaker;
    private ArrayList<Integer> responses;

    public void setResponses(ArrayList<Integer> argList){
        responses = argList;
    }




}

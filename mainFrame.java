package javaAssignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class mainFrame {


    public static void main(String[] args){

        ArrayList<Candidate> listOfCandidate = new ArrayList<Candidate>();
        ArrayList<Survey> listOfSurverys = new ArrayList<Survey>();

    int response = 0;
        Scanner objSk = new Scanner(System.in);
    do{
        System.out.println("============== MENU ==============");
        System.out.println("1) Create a candidate");
        System.out.println("2) Create a survey");
        System.out.println("3) Take a survey");
        System.out.println("4) Exit");
        System.out.println("==================================");
        System.out.println();

        System.out.println("Your choice: ");
        response = objSk.nextInt();
        switch (response){
            case 1: {
                String firstName = objSk.next();
                String lastName = objSk.next();
                String email = objSk.next();
                String phoneNumber = objSk.next();
               listOfCandidate.add(new Candidate(firstName, lastName, phoneNumber, email));
                break;
            }

            case 2 : {
            listOfSurverys.add(new Survey());
            break;
            }
        }



    }while(response != 4);


    }

}

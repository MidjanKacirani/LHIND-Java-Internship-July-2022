package javaAssignment1;

public class Candidate {

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Candidate(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


}

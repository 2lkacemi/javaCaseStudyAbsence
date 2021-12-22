package caseStudy.entities;

public class Person implements Trackable {
    private String firstName;
    private String lastName;
    private static String school;
    private int authorizedAbsence;

    //parameterized constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int trackSituation() {
        return authorizedAbsence;
    }

    public void display(){
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Person.school = school;
    }

    public int getAuthorizedAbsence() {
        return authorizedAbsence;
    }

    public void setAuthorizedAbsence(int authorizedAbsence) {
        this.authorizedAbsence = authorizedAbsence;
    }
}

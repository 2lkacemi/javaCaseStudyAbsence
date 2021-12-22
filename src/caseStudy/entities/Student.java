package caseStudy.entities;

import caseStudy.exception.AbsenceException;

import java.util.ArrayList;

public class Student extends Person {

    private char group;
    private ArrayList<Absence> allAbsences = new ArrayList<>();

    public Student(String firstName, String lastName, char group, ArrayList<Absence> allAbsences) {
        super(firstName, lastName);
        this.group = group;
        this.allAbsences = allAbsences;
    }

    /** method that control if absence is justified or not
     * method that take in parameter
     * @param a an object of type Absence
     * @param reason of type String
     * @throws AbsenceException
     */

    public boolean justify(Absence a, String reason) throws AbsenceException {
        if(!reason.isEmpty()){
            a.setJustification(true);
            return true;
        }else{
            a.setJustification(false);
            throw new AbsenceException();
        }
    }

    /**
     * if the absence is not justified ==> authorizedAbsence--
     * @return
     */
    public int trackSituation(){
        setAuthorizedAbsence(10);
        for (Absence a:this.allAbsences) {
            if(!a.isJustification()){
                setAuthorizedAbsence(getAuthorizedAbsence()-1);
            }
        }
        return getAuthorizedAbsence();
    }

    /**
     * add absence to list of absences
     * @param a
     */
    public void addAbsence(Absence a){
        allAbsences.add(a);
        System.out.println("Absence added successfully");
    }

    @Override
    public void display() {
        super.display();
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    public ArrayList<Absence> getAllAbsences() {
        return allAbsences;
    }

    public void setAllAbsences(ArrayList<Absence> allAbsences) {
        this.allAbsences = allAbsences;
    }
}

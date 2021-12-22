package caseStudy.entities;

public class Professor extends Person {

    private int teachingHours;
    private int objective;
    private String speciality;

    public Professor(String firstName, String lastName, int teachingHours, int objective, String speciality)     {
        super(firstName, lastName);
        this.teachingHours = teachingHours;
        this.objective = objective;
        this.speciality = speciality;
    }

    public int trackSituation(){
        return (objective - teachingHours);
    }

    public void display(){
    }

    public int getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }

    public int getObjective() {
        return objective;
    }

    public void setObjective(int objective) {
        this.objective = objective;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


}

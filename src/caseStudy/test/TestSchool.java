package caseStudy.test;

import caseStudy.entities.Absence;
import caseStudy.entities.Professor;
import caseStudy.entities.Student;
import caseStudy.exception.AbsenceException;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestSchool {
    public static void main(String[] args) {


        Student stYoussef = new Student("Youssef","A" , 'A', new ArrayList<>());
        Student stMohammed = new Student("Mohammed","A" , 'B', new ArrayList<>());
        Student stMouna = new Student("Mouna","A" , 'A', new ArrayList<>());

        Professor prAhmed = new Professor("Ahmed" ,"B",12,60,"computer science");
        Professor prImane = new Professor("Imane" ,"A",32,80,"commmunication");

        Absence absence1 = new Absence(LocalDate.of(2018,12,3), false);
        Absence absence2 = new Absence(LocalDate.of(2018,11,28), false);
        Absence absence3 = new Absence(LocalDate.of(2018,11,26), false);

        stYoussef.addAbsence(absence1);
        stYoussef.addAbsence(absence2);
        stMouna.addAbsence(absence3);

        try{
            stMouna.justify(absence3, "Participation à une journée sportive");
        } catch (AbsenceException e) {
            System.out.println(e.toString());
        }

        System.out.println(stMohammed.getAllAbsences());
        System.out.println(stMouna.getAllAbsences());
        System.out.println(stYoussef.getAllAbsences());

        System.out.println(stMohammed.trackSituation());
        System.out.println(stMouna.trackSituation());
        System.out.println(stYoussef.trackSituation());





    }
}

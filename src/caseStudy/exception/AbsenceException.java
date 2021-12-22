package caseStudy.exception;

import caseStudy.entities.Absence;
import caseStudy.entities.Student;

public class AbsenceException extends Exception {

    public String toString() {
            return "Motif non renseigné";
    }
}

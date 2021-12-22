package caseStudy.entities;

import java.time.LocalDate;

public class Absence {

    private LocalDate dateAbsence;
    private boolean justification;

    public Absence(LocalDate dateAbsence, boolean justification) {
        this.dateAbsence = dateAbsence;
        this.justification = justification;
    }

    public Absence() {
    }

    public LocalDate getDateAbsence() {
        return dateAbsence;
    }

    public void setDateAbsence(LocalDate dateAbsence) {
        this.dateAbsence = dateAbsence;
    }

    public boolean isJustification() {
        return justification;
    }

    public void setJustification(boolean justification) {
        this.justification = justification;
    }

    @Override
    public String toString() {
        return "Absence{" +
                "dateAbsence=" + dateAbsence +
                ", justification=" + justification +
                '}';
    }
}

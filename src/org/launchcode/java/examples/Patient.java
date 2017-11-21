package org.launchcode.java.examples;

import exercises.Problem;

import java.util.ArrayList;
import java.util.Date;

public class Patient {

    private static int nextId = 0;
    private static int getNextId() {
        return nextId++;
    }
    private String name;
    private Date birthdate;
    private String ssn;
    private int id;
    private ArrayList<Problem> problems;

    public Patient(String name, Date birthdate, String ssn) {
        this.name = name;
        this.birthdate = birthdate;
        this.ssn = ssn;
        this.id = getNextId();
        this.problems = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", ssn='" + ssn + '\'' +
                ", id=" + id +
                ", problems=" + problems +
                '}';
    }

    public void addProblem(Problem p) {

        for (Problem pOld: problems) {
            if (pOld.equals(p))

    }
    }
}

package student.report.card;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

    private String name;
    private String id;
    private Subject[] subjects;
    private double percentage;

    public void calculatePercentage() {
        double total = 0;
        int n = this.subjects.length;
        for (int i = 0; i < n; i++) {
            total += this.subjects[i].getMarks();
        }
        this.percentage = (double) (total / (100 * n)) * 100;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }


    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            //e.printStackTrace();
        }
        return null;
    }
}

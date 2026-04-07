package com.demo;

import com.demo.model.Student;
import com.demo.util.ReportGenerator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Alice", Arrays.asList(60, 70, 80));
        Student s2 = new Student("Bob", Arrays.asList(80, 85, 90));

        ReportGenerator.generateReport(s1);
        ReportGenerator.generateReport(s2);
    }
}
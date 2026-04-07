package com.demo.util;

import com.demo.model.Student;
import com.demo.service.AnalyticsService;

public class ReportGenerator {

    public static void generateReport(Student student) {
        AnalyticsService service = new AnalyticsService();

        System.out.println("Student: " + student.getName());
        System.out.println("Average: " + service.calculateAverage(student));
        System.out.println("Trend: " + service.performanceTrend(student));
    }
}
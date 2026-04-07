package com.demo.service;

import com.demo.model.Student;
import java.util.*;

public class AnalyticsService {

    public double calculateAverage(Student student) {
        return student.getMarks().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public Map<String, Integer> calculateRank(List<Student> students) {
        students.sort((s1, s2) ->
                Double.compare(calculateAverage(s2), calculateAverage(s1)));

        Map<String, Integer> ranks = new HashMap<>();
        int rank = 1;

        for (Student s : students) {
            ranks.put(s.getName(), rank++);
        }

        return ranks;
    }

    public String performanceTrend(Student student) {
        List<Integer> marks = student.getMarks();

        if (marks.get(marks.size() - 1) > marks.get(0)) {
            return "Improving";
        } else if (marks.get(marks.size() - 1) < marks.get(0)) {
            return "Declining";
        }
        return "Stable";
    }
}
package com.demo;

import com.demo.model.Student;
import com.demo.service.AnalyticsService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AnalyticsServiceTest {

    AnalyticsService service = new AnalyticsService();

    @Test
    void testAverage() {
        Student s = new Student("Test", Arrays.asList(50, 60, 70));
        assertEquals(60.0, service.calculateAverage(s));
    }

    @Test
    void testTrend() {
        Student s = new Student("Test", Arrays.asList(50, 60, 70));
        assertEquals("Improving", service.performanceTrend(s));
    }

    @Test
    void testDataConsistency() {
        Student s = new Student("Test", Arrays.asList(10, 20, 30));
        assertNotNull(service.calculateAverage(s));
    }
}
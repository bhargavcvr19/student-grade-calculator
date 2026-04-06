package com.example;

public class GradeCalculator {

    public int getTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public double getAverage(int m1, int m2, int m3) {
        return getTotal(m1, m2, m3) / 3.0;
    }

    public String getResult(int m1, int m2, int m3) {
        if (m1 >= 35 && m2 >= 35 && m3 >= 35) {
            return "PASS";
        }
        return "FAIL";
    }
}

package com.arun.models;

public class Student {
    private String name;
    private String roll_no;
    private int [] marks = new int[5];

    public Student (String name, String roll_no, int[] marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks.clone();
    }

    public double getAverage() {
        double result = 0;
        for(int num : marks) {
            result+=num;
        }
        return result/marks.length;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nRoll No.: " + roll_no + "\nAverage marks: " + getAverage();
    }
}

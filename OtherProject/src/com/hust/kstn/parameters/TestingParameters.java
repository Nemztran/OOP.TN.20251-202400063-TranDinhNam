package com.hust.kstn.parameters;

public class TestingParameters {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        swap(s1, s2);
        System.out.println("First student: " + s1.getName());
        System.out.println("Second student: " + s2.getName());
    }
    public static void swap(Student s1, Student s2) {
        String tmp1 = s1.getName();
        int tmp2 = s1.getStudentId();
        s1.setName(s2.getName());
        s2.setName(tmp1);
        s1.setStudentId(s2.getStudentId());
        s2.setStudentId(tmp2);
    }


}

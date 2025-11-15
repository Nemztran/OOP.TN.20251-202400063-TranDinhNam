package com.hust.kstn.parameters;

public class Student {
    private int studentId;
    private String name;
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

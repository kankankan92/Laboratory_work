package com.company;

public class LaboratoryWork {

    private int quantityStrings;
    private Student student;
    private Teacher teacher;
    private String mark;
    private Study study;

    LaboratoryWork(int quantityStrings){
        this.quantityStrings = quantityStrings;
    }

    public int getQuantityStrings() {
        return quantityStrings;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }
}

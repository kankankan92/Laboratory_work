package com.company;

public abstract class Teacher {

    private String name;
    protected int loyalty;

    Teacher(String name) {
        this.name = name;
    }

    public void checkWork(LaboratoryWork laboratoryWork) {
        laboratoryWork.setTeacher(this);
        if (laboratoryWork.getQuantityStrings() < loyalty) {
            laboratoryWork.setMark("не сдал");
        } else {
            laboratoryWork.setMark("сдал");
        }
    }

    protected String getName() {
        return name;
    }
}

package com.company;

import java.util.Random;

public abstract class Student {

    private String name;
    protected int minStrings;
    protected int maxStrings;
    private LaboratoryWork laboratoryWork;

    Student(String name) {
        this.name = name;
    }

    protected LaboratoryWork writeLaboratoryWork() {
        Random random = new Random();
        int quantityStrings = minStrings + random.nextInt(maxStrings - minStrings + 1);
        LaboratoryWork laboratoryWork = new LaboratoryWork(quantityStrings);
        this.laboratoryWork = laboratoryWork;
        laboratoryWork.setStudent(this);
        if (random.nextInt(2) == 0){
            laboratoryWork.setStudy(Study.PHYSICS);
        }else {
            laboratoryWork.setStudy(Study.LITERATURE);
        }
        return laboratoryWork;
    }

    public String getName() {
        return name;
    }

    public LaboratoryWork getLaboratoryWork() {
        return laboratoryWork;
    }
}

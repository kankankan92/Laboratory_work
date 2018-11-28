package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new CleverStudent("Настя");
        Student student2 = new StupidStudent("Ролик");
        Student student3 = new CleverStudent("Вова");
        Student student4 = new StupidStudent("Вадим");
        Student student5 = new CleverStudent("Катя");
        Teacher teacher1 = new KindTeacher("Василий Васильевич Мягков");
        Teacher teacher2 = new EvilTeacher("Эдуард Эдмондовч Мудаков");
        teacher2.checkWork(student1.writeLaboratoryWork());
        teacher1.checkWork(student2.writeLaboratoryWork());
        teacher2.checkWork(student3.writeLaboratoryWork());
        teacher2.checkWork(student4.writeLaboratoryWork());
        teacher1.checkWork(student5.writeLaboratoryWork());
        System.out.println("Студент "+ student1.getName() + " " + student1.getLaboratoryWork().getMark()+ " работу по предмету: " + student1.getLaboratoryWork().getStudy()+ ", количество строк: " + student1.getLaboratoryWork().getQuantityStrings()  + ", проверяющий: "+ student1.getLaboratoryWork().getTeacher().getName() );
        System.out.println("Студент "+ student2.getName() + " " + student2.getLaboratoryWork().getMark()+ " работу по предмету: " + student2.getLaboratoryWork().getStudy()+ ", количество строк: " + student2.getLaboratoryWork().getQuantityStrings()  + ", проверяющий: "+ student2.getLaboratoryWork().getTeacher().getName() );
        System.out.println("Студент "+ student3.getName() + " " + student3.getLaboratoryWork().getMark()+ " работу по предмету: " + student3.getLaboratoryWork().getStudy()+ ", количество строк: " + student3.getLaboratoryWork().getQuantityStrings()  + ", проверяющий: "+ student3.getLaboratoryWork().getTeacher().getName() );
        System.out.println("Студент "+ student4.getName() + " " + student4.getLaboratoryWork().getMark()+ " работу по предмету: " + student4.getLaboratoryWork().getStudy()+ ", количество строк: " + student4.getLaboratoryWork().getQuantityStrings()  + ", проверяющий: "+ student4.getLaboratoryWork().getTeacher().getName() );
        System.out.println("Студент "+ student5.getName() + " " + student5.getLaboratoryWork().getMark()+ " работу по предмету: " + student5.getLaboratoryWork().getStudy()+ ", количество строк: " + student5.getLaboratoryWork().getQuantityStrings()  + ", проверяющий: "+ student5.getLaboratoryWork().getTeacher().getName() );
    }
}

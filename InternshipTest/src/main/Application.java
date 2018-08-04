package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");

        university.addStudent(new Student("Oleksandr", "Khlopin"));
        university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"));

        university.students.get(0).setKnowledge(new Knowledge(100));
        university.students.get(1).setKnowledge(new Knowledge(-5));
        university.students.get(2).setKnowledge(new Knowledge(69));
        university.students.get(3).setKnowledge(new Knowledge(43));

        Internship internship = new Internship("Interlink");

        internship.selectStudents(university.students);

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}

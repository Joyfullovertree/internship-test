package institution.interlink;

import person.Student;
import java.util.ArrayList;

public class Internship {
    public String name;
    public ArrayList<Student> interns = new ArrayList<>();

    public Internship(String name) {
        //TODO: Implementation is needed
        this.name = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
        interns.add(student);
    }

    public void selectStudents(ArrayList<Student> students) {
        for (int i = 0; i<students.size(); i++) {
            if (students.get(i).knowledge.level > 50) {
                setStudent(students.get(i));
            }
        }
    }

    public String getStudents() {
        //TODO: Implementation is needed
        String allInterns = "";
        for (int i = 0; i<interns.size(); i++) {
            allInterns = allInterns + interns.get(i).name + "\n";
        }
        return allInterns;
    }
}

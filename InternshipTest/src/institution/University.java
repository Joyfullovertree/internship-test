package institution;

import person.Student;
import java.util.ArrayList;

public class University {
	public String name;
	public ArrayList<Student> students = new ArrayList<>();
	
    public University(String name) {
        //TODO: Implementation is needed
        this.name = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    }

    public void addStudent(Student student) {
        //TODO: Implementation is needed
        students.add(student);
    }
}

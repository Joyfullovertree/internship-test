package person;

import person.consciousness.Knowledge;

public class Student {
    public String firstName = "";
    public String lastName = "";
    public String name = "";
    
    public Student(String name) {
        //TODO: Implementation is needed
        this.name = name;
        //Separation of name for firstName and lastName
        if (this.name.indexOf(" ") != -1) {
            String[] names = this.name.split(" ");
            firstName = names[0];
            lastName = names[1];
        }
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //Unification of firstName and lastName into name
        name = String.join(" ", this.firstName, this.lastName);
    }

    public void setKnowledge(Knowledge knowledge) {
        //TODO: Implementation is needed
    }
}

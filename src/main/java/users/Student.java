package users;

import javax.persistence.Entity;

@Entity
public class Student extends User {

    public Student(String email, String password, String fName, String lName){
        super(email, password, fName, lName);
    }

    public Student(){

    }
}

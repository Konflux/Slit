package users;

import javax.persistence.Entity;

@Entity
public class Teacher extends User {

    public Teacher(String email, String password, String fName, String lName){
        super(email, password, fName, lName);
    }

    public Teacher(){

    }
}

package users;

import javax.persistence.Entity;

@Entity
public class AssistantTeacher extends User {

    public AssistantTeacher (String email, String password, String fName, String lName){
        super(email, password, fName, lName);
    }

    public AssistantTeacher(){
    }
}

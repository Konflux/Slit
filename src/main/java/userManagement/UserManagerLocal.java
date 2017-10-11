package userManagement;

import users.User;

import javax.ejb.Local;

@Local
public interface UserManagerLocal {
    User getUser(String id);
    void saveUser(User u);
}
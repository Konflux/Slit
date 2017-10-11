package userManagement;

import users.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class UserManagerBean implements UserManagerLocal {

    @PersistenceContext
    private EntityManager em;

    public UserManagerBean(){
    }

    @Override
    public User getUser(String id) {
        return em.find(User.class, id);
    }

    @Override
    public void saveUser(User u){
        em.persist(u);
    }
}
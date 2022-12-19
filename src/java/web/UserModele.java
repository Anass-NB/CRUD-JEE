
package web;

import java.util.ArrayList;
import java.util.List;
import metier.User;




public class UserModele {
    private String ville;
    private List<User> users = new ArrayList<User>();

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    
}

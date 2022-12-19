
package metier;

public class User {
    int id;
    String Login;
    String Password;
    String Email;
    String Ville;
    public User(){
        super();
    }
    public User(int id, String Login, String Password, String Email, String Ville) {
        this.id = id;
        this.Login = Login;
        this.Password = Password;
        this.Email = Email;
        this.Ville = Ville;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }
    
    
}

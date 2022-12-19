package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserImp {

    public UserImp() {
    }

    public User addUser(User u) {

        Connection conn = SingletonConnection.getConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("insert into users(id,login,password,email,ville) values (?,?,?,?,?)");
            ps.setInt(1, u.getId());
            ps.setString(2, u.getLogin());
            ps.setString(3, u.getPassword());
            ps.setString(4, u.getEmail());
            ps.setString(5, u.getVille());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return u;
    }

    public List<User> gettAllUsers() {

        List<User> all_users = new ArrayList<User>();
        Connection conn = SingletonConnection.getConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from users");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setLogin(rs.getString("login"));
                u.setEmail(rs.getString("email"));
                u.setVille(rs.getString("ville"));
                all_users.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return all_users;
    }

    public List<User> getClientsParVille(String ville) {
        List<User> allusers = new ArrayList<User>();
        Connection conn = SingletonConnection.getConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from users where ville like ?");
            ps.setString(1, "%" + ville + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setLogin(rs.getString("login"));
                u.setEmail(rs.getString("email"));
                u.setVille(rs.getString("ville"));
                allusers.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allusers;
    }

    public User GetClientByID(String id) {
        Connection conn = SingletonConnection.getConnection();
        User u = new User();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from users where id=?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u.setId(rs.getInt("id"));
                u.setLogin(rs.getString("login"));
                u.setEmail(rs.getString("email"));
                u.setVille(rs.getString("ville"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }

    public void UpdateUser(User user) {
        Connection conn = SingletonConnection.getConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("update users SET id=?,login=?,email=?,password=?,ville=? WHERE id=?");
            ps.setInt(1, user.getId());
            ps.setString(2, user.getLogin());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getVille());
            ps.setInt(6, user.getId());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void DeleteClient(String id) {
        Connection conn = SingletonConnection.getConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("delete from users where id= ?");
            ps.setString(1, id);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

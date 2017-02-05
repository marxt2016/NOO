package application.objects;

/**
 * Created by Olga_Melnikova on 10/19/2016.
 */
public class User {

    private String name;
    private String username;
    private String password;
    private String systemName;

    public User(String name, String username, String password, String systemName) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.systemName = systemName;
    }
    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", systemName='" + systemName + '\'' +
                '}';
    }
}

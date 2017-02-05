package application.objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Created by Olga_Melnikova on 10/19/2016.
 */
@XmlRootElement(name = "credentials")
@XmlType(propOrder = {"users"})
public class Credentials {

    private List<User> users;


    public Credentials() {}
    public Credentials(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    @XmlElement(name="user")
    @XmlElementWrapper
    public void setUsers(List<User> users) {
        this.users = users;
    }







}

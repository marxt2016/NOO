package application.objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Created by Olga_Melnikova on 10/19/2016.
 */
@XmlRootElement(name = "personsdata")
@XmlType(propOrder = {"persons"})
public class PersonsData {

    private List<Person> persons;


    public PersonsData() {}
    public PersonsData(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    @XmlElement(name="person")
    @XmlElementWrapper
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }







}

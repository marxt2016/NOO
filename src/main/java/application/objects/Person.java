package application.objects;

/**
 * Created by Olga_Melnikova on 10/19/2016.
 */
public class Person {


    private String type;
    private String first;
    private String last;
    private String middle;
    private String bday;

    public Person(String type, String first, String last, String middle, String bday) {
        this.type = type;
        this.first = first;
        this.last = last;
        this.middle = middle;
        this.bday = bday;
    }

    public Person() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }


    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + type + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", middle='" + middle + '\'' +
                ", bday='" + bday + '\'' +
                '}';
    }

}

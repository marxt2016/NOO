package application.objects;

/**
 * Created by Olga_Melnikova on 10/19/2016.
 */
public class Position {


    private String type;
    private String name;
    private String division;
    private String skills;

    public Position(){}
    public Position(String type, String name, String division, String skills) {
        this.type = type;
        this.name = name;
        this.division = division;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Position{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", division='" + division + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }


}

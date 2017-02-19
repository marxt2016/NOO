package application.objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Created by Olga_Melnikova on 10/19/2016.
 */
@XmlRootElement(name = "positionsdata")
@XmlType(propOrder = {"positions"})
public class PositionsData {

    private List<Position> positions;


    public PositionsData() {}
    public PositionsData(List<Position> positions) {
        this.positions = positions;
    }

    public List<Position> getPositions() {  return positions;    }

    @XmlElement(name="position")
    @XmlElementWrapper
    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }







}

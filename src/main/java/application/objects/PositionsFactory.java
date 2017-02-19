package application.objects;

import core.parser.Parser;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Olga_Melnikova on 11/12/2016.
 */
public class PositionsFactory {
    public static PositionsData generateSet() throws Exception{
        Parser parser = new Parser();
        File file = new File("./src/main/resources/positions.xml");
        PositionsData set = (PositionsData) parser.getObject(file, PositionsData.class);
        return set;
    }

    public static HashMap<String, List<String>> generatePositionsSet() {
        HashMap<String, List<String>> hmap = null;
        try {
            PositionsData set = generateSet();
            hmap = new HashMap<String, List<String>>();
            List<Position> allPositions = set.getPositions();
            for (Position p : allPositions) {
                List<String> list = new ArrayList<>();
                list.add(p.getName());
                list.add(p.getDivision());
                list.add(p.getSkills());
                hmap.put(p.getType(), list);
            }
        }catch(Exception e){
            e.getMessage();
        }
        return hmap;
    }
//    public static void main (String args[]) throws Exception{
//        PositionsData set = generateSet();
//         HashMap<String, List<String>> hmap = new HashMap<String, List<String>>();
//        List<Position> allPositions = set.getPositions();
//        System.out.println(set.getPositions());
//        for (Position p : allPositions) {
//            List<String> list = new ArrayList<>();
//            list.add(p.getName());
//            list.add(p.getDivision());
//            list.add(p.getSkills());
//            hmap.put(p.getType(), list);
//        }
//        System.out.println(hmap.get("manager"));
//        for ( Map.Entry<String, List<String>> entry : hmap.entrySet()) {
//            String key = entry.getKey();
//            List<String> values = entry.getValue();
//            System.out.println(key);
//        }
//    }

}

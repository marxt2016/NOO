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
public class CredentialsFactory {
    public static Credentials generateSet() throws Exception{
        Parser parser = new Parser();
        File file = new File("./src/main/resources/credentials.xml");
        Credentials set = (Credentials) parser.getObject(file, Credentials.class);
        return set;
    }

    public static HashMap<String, List<String>> generateCredentialsSet() {
        HashMap<String, List<String>> hmap = null;
        try {
            Credentials set = generateSet();
            hmap = new HashMap<String, List<String>>();
            List<User> allUsers = set.getUsers();
            for (User u : allUsers) {
                List<String> list = new ArrayList<>();
                list.add(u.getUsername());
                list.add(u.getPassword());
                list.add(u.getSystemName());
                hmap.put(u.getName(), list);
            }
        }catch(Exception e){
            e.getMessage();
        }
        return hmap;
    }
//    public static void main (String args[]) throws Exception{
//        Credentials set = generateSet();
//        HashMap<String, List<String>> hmap = new HashMap<String, List<String>>();
//        List<User> allUsers= set.getUsers();
//        System.out.println(set.getUsers());
//        for (User u:allUsers){
//            List<String> list = new ArrayList<>();
//            list.add(u.getUsername());
//            list.add(u.getPassword());
//            list.add(u.getSystemName());
//            hmap.put(u.getName(), list);
//        }
//        System.out.println(hmap.get("admin"));
//        for ( Map.Entry<String, List<String>> entry : hmap.entrySet()) {
//            String key = entry.getKey();
//            List<String> values = entry.getValue();
//            System.out.println(key);
//        }
//    }

}

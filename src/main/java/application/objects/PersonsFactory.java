package application.objects;

import core.parser.Parser;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Olga_Melnikova on 11/12/2016.
 */
public class PersonsFactory {
    public static PersonsData generateSet() throws Exception{
        Parser parser = new Parser();
        File file = new File("./src/main/resources/persons.xml");
        PersonsData set = (PersonsData) parser.getObject(file, PersonsData.class);
        return set;
    }

    public static HashMap<String, List<String>> generatePersonsSet() {
        HashMap<String, List<String>> hmap = null;
        try {
            PersonsData set = generateSet();
            hmap = new HashMap<String, List<String>>();
            List<Person> allPersons = set.getPersons();
            for (Person p : allPersons) {
                List<String> list = new ArrayList<>();
                list.add(p.getFirst());
                list.add(p.getLast());
                list.add(p.getMiddle());
                list.add(p.getBday());
                list.add(p.getResumeEducationSchool());
                list.add(p.getResumeEducationSpecialty());
                list.add(p.getResumeEducationFromDate());
                list.add(p.getResumeEducationToDate());
                list.add(p.getResumeEducationSkills());
                list.add(p.getResumeWorkCompany());
                list.add(p.getResumeWorkPosition());
                list.add(p.getResumeWorkFromDate());
                list.add(p.getResumeWorkToDate());
                list.add(p.getResumeWorkRate());
                list.add(p.getResumeWorkSkills());
                list.add(p.getResumeCourseName());
                list.add(p.getResumeCourseHours());
                list.add(p.getResumeCourseSkills());
                list.add(p.getResumeDissName());
                list.add(p.getResumeDissSpecialty());
                list.add(p.getResumeDissYear());
                list.add(p.getResumeDissConsultant());
                list.add(p.getResumeDissSkills());
                list.add(p.getResumePubName());
                list.add(p.getResumePubDate());
                list.add(p.getResumePubIsbn());
                list.add(p.getResumePubPages());
                list.add(p.getResumePubCoworker());
                list.add(p.getResumePubSkills());
                list.add(p.getResumePatentName());
                list.add(p.getResumePatentNumber());
                list.add(p.getResumePatentDate());
                list.add(p.getResumePatentOwner());
                list.add(p.getResumePatentCoworker());
                list.add(p.getResumePatentSkills());
                hmap.put(p.getType(), list);
            }
        }catch(Exception e){
            e.getMessage();
        }
        return hmap;
    }
//    public static void main (String args[]) throws Exception{
//        Persons set = generateSet();
//        HashMap<String, List<String>> hmap = new HashMap<String, List<String>>();
//        List<User> allUsers= set.getUsers();
//        System.out.println(set.getUsers());
//        for (User u:allUsers){
//            List<String> list = new ArrayList<>();
//            list.add(u.getLast());
//            list.add(u.getMiddle());
//            list.add(u.getBday());
//            hmap.put(u.getFirst(),list);
//        }
//        System.out.println(hmap.get("admin"));
//        for ( Map.Entry<String, List<String>> entry : hmap.entrySet()) {
//            String key = entry.getKey();
//            List<String> values = entry.getValue();
//            System.out.println(key);
//        }
//    }

}

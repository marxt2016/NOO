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
    //Resume Education
    private String resumeEducationSchool;
    private String resumeEducationSpecialty;
    private String resumeEducationFromDate;
    private String resumeEducationToDate;
    private String resumeEducationSkills;
    //Resume Work
    private String resumeWorkCompany;
    private String resumeWorkPosition;
    private String resumeWorkFromDate;
    private String resumeWorkToDate;
    private String resumeWorkRate;
    private String resumeWorkSkills;
    //Resume Courses
    private String resumeCourseName;
    private String resumeCourseHours;
    private String resumeCourseSkills;
    //Resume Researches
    private String resumeDissName;
    private String resumeDissSpecialty;
    private String resumeDissYear;
    private String resumeDissConsultant;
    private String resumeDissSkills;
    private String resumePubName;
    private String resumePubDate;
    private String resumePubIsbn;
    private String resumePubPages;
    private String resumePubCoworker;
    private String resumePubSkills;
    //Resume Patents
    private String resumePatentName;
    private String resumePatentNumber;
    private String resumePatentDate;
    private String resumePatentOwner;
    private String resumePatentCoworker;
    private String resumePatentSkills;

    public Person (){}

    public Person(String type, String first, String last, String middle, String bday, String resumeEducationSchool, String resumeEducationSpecialty, String resumeEducationFromDate, String resumeEducationToDate, String resumeEducationSkills, String resumeWorkCompany, String resumeWorkPosition, String resumeWorkFromDate, String resumeWorkToDate, String resumeWorkRate, String resumeWorkSkills, String resumeCourseName, String resumeCourseHours, String resumeCourseSkills, String resumeDissName, String resumeDissSpecialty, String resumeDissYear, String resumeDissConsultant, String resumeDissSkills, String resumePubName, String resumePubDate, String resumePubIsbn, String resumePubPages, String resumePubCoworker, String resumePubSkills, String resumePatentName, String resumePatentNumber, String resumePatentDate, String resumePatentOwner, String resumePatentCoworker, String resumePatentSkills) {
        this.type = type;
        this.first = first;
        this.last = last;
        this.middle = middle;
        this.bday = bday;
        this.resumeEducationSchool = resumeEducationSchool;
        this.resumeEducationSpecialty = resumeEducationSpecialty;
        this.resumeEducationFromDate = resumeEducationFromDate;
        this.resumeEducationToDate = resumeEducationToDate;
        this.resumeEducationSkills = resumeEducationSkills;
        this.resumeWorkCompany = resumeWorkCompany;
        this.resumeWorkPosition = resumeWorkPosition;
        this.resumeWorkFromDate = resumeWorkFromDate;
        this.resumeWorkToDate = resumeWorkToDate;
        this.resumeWorkRate = resumeWorkRate;
        this.resumeWorkSkills = resumeWorkSkills;
        this.resumeCourseName = resumeCourseName;
        this.resumeCourseHours = resumeCourseHours;
        this.resumeCourseSkills = resumeCourseSkills;
        this.resumeDissName = resumeDissName;
        this.resumeDissSpecialty = resumeDissSpecialty;
        this.resumeDissYear = resumeDissYear;
        this.resumeDissConsultant = resumeDissConsultant;
        this.resumeDissSkills = resumeDissSkills;
        this.resumePubName = resumePubName;
        this.resumePubDate = resumePubDate;
        this.resumePubIsbn = resumePubIsbn;
        this.resumePubPages = resumePubPages;
        this.resumePubCoworker = resumePubCoworker;
        this.resumePubSkills = resumePubSkills;
        this.resumePatentName = resumePatentName;
        this.resumePatentNumber = resumePatentNumber;
        this.resumePatentDate = resumePatentDate;
        this.resumePatentOwner = resumePatentOwner;
        this.resumePatentCoworker = resumePatentCoworker;
        this.resumePatentSkills = resumePatentSkills;
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

    public String getResumeEducationSchool() {
        return resumeEducationSchool;
    }

    public void setResumeEducationSchool(String resumeEducationSchool) {
        this.resumeEducationSchool = resumeEducationSchool;
    }

    public String getResumeEducationSpecialty() {
        return resumeEducationSpecialty;
    }

    public void setResumeEducationSpecialty(String resumeEducationSpecialty) {
        this.resumeEducationSpecialty = resumeEducationSpecialty;
    }

    public String getResumeEducationFromDate() {
        return resumeEducationFromDate;
    }

    public void setResumeEducationFromDate(String resumeEducationFromDate) {
        this.resumeEducationFromDate = resumeEducationFromDate;
    }

    public String getResumeEducationToDate() {
        return resumeEducationToDate;
    }

    public void setResumeEducationToDate(String resumeEducationToDate) {
        this.resumeEducationToDate = resumeEducationToDate;
    }

    public String getResumeEducationSkills() {
        return resumeEducationSkills;
    }

    public void setResumeEducationSkills(String resumeEducationSkills) {
        this.resumeEducationSkills = resumeEducationSkills;
    }

    public String getResumeWorkCompany() {
        return resumeWorkCompany;
    }

    public void setResumeWorkCompany(String resumeWorkCompany) {
        this.resumeWorkCompany = resumeWorkCompany;
    }

    public String getResumeWorkPosition() {
        return resumeWorkPosition;
    }

    public void setResumeWorkPosition(String resumeWorkPosition) {
        this.resumeWorkPosition = resumeWorkPosition;
    }

    public String getResumeWorkFromDate() {
        return resumeWorkFromDate;
    }

    public void setResumeWorkFromDate(String resumeWorkFromDate) {
        this.resumeWorkFromDate = resumeWorkFromDate;
    }

    public String getResumeWorkToDate() {
        return resumeWorkToDate;
    }

    public void setResumeWorkToDate(String resumeWorkToDate) {
        this.resumeWorkToDate = resumeWorkToDate;
    }

    public String getResumeWorkRate() {
        return resumeWorkRate;
    }

    public void setResumeWorkRate(String resumeWorkRate) {
        this.resumeWorkRate = resumeWorkRate;
    }

    public String getResumeWorkSkills() {
        return resumeWorkSkills;
    }

    public void setResumeWorkSkills(String resumeWorkSkills) {
        this.resumeWorkSkills = resumeWorkSkills;
    }

    public String getResumeCourseName() {
        return resumeCourseName;
    }

    public void setResumeCourseName(String resumeCourseName) {
        this.resumeCourseName = resumeCourseName;
    }

    public String getResumeCourseHours() {
        return resumeCourseHours;
    }

    public void setResumeCourseHours(String resumeCourseHours) {
        this.resumeCourseHours = resumeCourseHours;
    }

    public String getResumeCourseSkills() {
        return resumeCourseSkills;
    }

    public void setResumeCourseSkills(String resumeCourseSkills) {
        this.resumeCourseSkills = resumeCourseSkills;
    }

    public String getResumeDissName() {
        return resumeDissName;
    }

    public void setResumeDissName(String resumeDissName) {
        this.resumeDissName = resumeDissName;
    }

    public String getResumeDissSpecialty() {
        return resumeDissSpecialty;
    }

    public void setResumeDissSpecialty(String resumeDissSpecialty) {
        this.resumeDissSpecialty = resumeDissSpecialty;
    }

    public String getResumeDissYear() {
        return resumeDissYear;
    }

    public void setResumeDissYear(String resumeDissYear) {
        this.resumeDissYear = resumeDissYear;
    }

    public String getResumeDissConsultant() {
        return resumeDissConsultant;
    }

    public void setResumeDissConsultant(String resumeDissConsultant) {
        this.resumeDissConsultant = resumeDissConsultant;
    }

    public String getResumeDissSkills() {
        return resumeDissSkills;
    }

    public void setResumeDissSkills(String resumeDissSkills) {
        this.resumeDissSkills = resumeDissSkills;
    }

    public String getResumePubName() {
        return resumePubName;
    }

    public void setResumePubName(String resumePubName) {
        this.resumePubName = resumePubName;
    }

    public String getResumePubDate() {
        return resumePubDate;
    }

    public void setResumePubDate(String resumePubDate) {
        this.resumePubDate = resumePubDate;
    }

    public String getResumePubIsbn() {
        return resumePubIsbn;
    }

    public void setResumePubIsbn(String resumePubIsbn) {
        this.resumePubIsbn = resumePubIsbn;
    }

    public String getResumePubPages() {
        return resumePubPages;
    }

    public void setResumePubPages(String resumePubPages) {
        this.resumePubPages = resumePubPages;
    }

    public String getResumePubCoworker() {
        return resumePubCoworker;
    }

    public void setResumePubCoworker(String resumePubCoworker) {
        this.resumePubCoworker = resumePubCoworker;
    }

    public String getResumePubSkills() {
        return resumePubSkills;
    }

    public void setResumePubSkills(String resumePubSkills) {
        this.resumePubSkills = resumePubSkills;
    }

    public String getResumePatentName() {
        return resumePatentName;
    }

    public void setResumePatentName(String resumePatentName) {
        this.resumePatentName = resumePatentName;
    }

    public String getResumePatentNumber() {
        return resumePatentNumber;
    }

    public void setResumePatentNumber(String resumePatentNumber) {
        this.resumePatentNumber = resumePatentNumber;
    }

    public String getResumePatentDate() {
        return resumePatentDate;
    }

    public void setResumePatentDate(String resumePatentDate) {
        this.resumePatentDate = resumePatentDate;
    }

    public String getResumePatentOwner() {
        return resumePatentOwner;
    }

    public void setResumePatentOwner(String resumePatentOwner) {
        this.resumePatentOwner = resumePatentOwner;
    }

    public String getResumePatentCoworker() {
        return resumePatentCoworker;
    }

    public void setResumePatentCoworker(String resumePatentCoworker) {
        this.resumePatentCoworker = resumePatentCoworker;
    }

    public String getResumePatentSkills() {
        return resumePatentSkills;
    }

    public void setResumePatentSkills(String resumePatentSkills) {
        this.resumePatentSkills = resumePatentSkills;
    }



    @Override
    public String toString() {
        return "Person{" +
                "type='" + type + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", middle='" + middle + '\'' +
                ", bday='" + bday + '\'' +
                ", resumeEducationSchool='" + resumeEducationSchool + '\'' +
                ", resumeEducationSpecialty='" + resumeEducationSpecialty + '\'' +
                ", resumeEducationFromDate='" + resumeEducationFromDate + '\'' +
                ", resumeEducationToDate='" + resumeEducationToDate + '\'' +
                ", resumeEducationSkills='" + resumeEducationSkills + '\'' +
                ", resumeWorkCompany='" + resumeWorkCompany + '\'' +
                ", resumeWorkPosition='" + resumeWorkPosition + '\'' +
                ", resumeWorkFromDate='" + resumeWorkFromDate + '\'' +
                ", resumeWorkToDate='" + resumeWorkToDate + '\'' +
                ", resumeWorkRate='" + resumeWorkRate + '\'' +
                ", resumeWorkSkills='" + resumeWorkSkills + '\'' +
                ", resumeCourseName='" + resumeCourseName + '\'' +
                ", resumeCourseHours='" + resumeCourseHours + '\'' +
                ", resumeCourseSkills='" + resumeCourseSkills + '\'' +
                ", resumeDissName='" + resumeDissName + '\'' +
                ", resumeDissSpecialty='" + resumeDissSpecialty + '\'' +
                ", resumeDissYear='" + resumeDissYear + '\'' +
                ", resumeDissConsultant='" + resumeDissConsultant + '\'' +
                ", resumeDissSkills='" + resumeDissSkills + '\'' +
                ", resumePubName='" + resumePubName + '\'' +
                ", resumePubDate='" + resumePubDate + '\'' +
                ", resumePubIsbn='" + resumePubIsbn + '\'' +
                ", resumePubPages='" + resumePubPages + '\'' +
                ", resumePubCoworker='" + resumePubCoworker + '\'' +
                ", resumePubSkills='" + resumePubSkills + '\'' +
                ", resumePatentName='" + resumePatentName + '\'' +
                ", resumePatentNumber='" + resumePatentNumber + '\'' +
                ", resumePatentDate='" + resumePatentDate + '\'' +
                ", resumePatentOwner='" + resumePatentOwner + '\'' +
                ", resumePatentCoworker='" + resumePatentCoworker + '\'' +
                ", resumePatentSkills='" + resumePatentSkills + '\'' +
                '}';
    }

}

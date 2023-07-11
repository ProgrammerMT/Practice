package training.day5.Homework;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class Student extends Person {
    private int studentsClass;
    private int numberInClass;

    private Map<String, Integer> grades;

    //private ArrayList<String> subjects;
    //private ArrayList<Integer> subjectGrade;

    public Student(String name, String gender, int ID, int studentsClass, int numberInClass) {
        super(name, gender, ID);
        this.studentsClass = studentsClass;
        this.numberInClass = numberInClass;
        this.grades = new HashMap<>();
        //this.subjects = new ArrayList<>();
        //this.subjectGrade = new ArrayList<>();
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
        //subjects.add(subject);
        //subjectGrade.add(grade);
    }

    public int getGrade(String subject) {
        return grades.getOrDefault(subject, -1);
    }

    public List<String> getSubjects() {
        return new ArrayList<>(grades.keySet());
    }

    public int getStudentsClass() {
        return studentsClass;
    }

    public void setStudentsClass(int studentsClass) {
        this.studentsClass = studentsClass;
    }

    public int getNumberInClass() {
        return numberInClass;
    }

    public void setNumberInClass(int numberInClass) {
        this.numberInClass = numberInClass;
    }

    /*public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Integer> getSubjectGrade() {
       return subjectGrade;
    }

    public void setSubjectGrade(ArrayList<Integer> subjectGrade) {
        this.subjectGrade = subjectGrade;
    }
     */
}

package training.day5.Homework;

import java.util.ArrayList;
import java.util.*;

public class Student extends Person{
    private int studentsClass;
    private int numberInClass;

    private ArrayList<String> subjects;
    private ArrayList<Integer> subjectGrade;

    public Student(String name, String gender, int ID, int studentsClass, int numberInClass) {
        super(name, gender, ID);
        this.studentsClass = studentsClass;
        this.numberInClass = numberInClass;
        this.subjects = new ArrayList<>();
        this.subjectGrade = new ArrayList<>();
    }

    public void addGrade(String subject, int grade){
        subjects.add(subject);
        subjectGrade.add(grade);
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

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public int getGrade(String subject) {
        int index = subjects.indexOf(subject);
        if (index != -1) {
            return subjectGrade.get(index);
        }
        return -1;
    }

    public ArrayList<Integer> getSubjectGrade() {
        return subjectGrade;
    }

    public void setSubjectGrade(ArrayList<Integer> subjectGrade) {
        this.subjectGrade = subjectGrade;
    }
}

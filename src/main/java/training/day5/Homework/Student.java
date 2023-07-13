package training.day5.Homework;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class Student extends Person {

    private int studentsClass;
    private int numberInClass;

    private Map<String, Integer> grades;

    public Student(String name, String gender, int ID, int studentsClass, int numberInClass) {
        super(name, gender, ID);
        this.studentsClass = studentsClass;
        this.numberInClass = numberInClass;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
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

    public Map<String, Integer> getGrades() { return grades; }

    public void setStudentsClass(int studentsClass) {
        this.studentsClass = studentsClass;
    }

    public int getNumberInClass() {
        return numberInClass;
    }

    public void setNumberInClass(int numberInClass) {
        this.numberInClass = numberInClass;
    }

    public String toString() {
        return super.toString() + " " + studentsClass + " " + numberInClass + " " + grades;
    }
}

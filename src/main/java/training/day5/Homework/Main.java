package training.day5.Homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        //Students
        Student student1 = new Student("Alice", "Female", 1, 10, 1);
        student1.addGrade("Math", 5);
        student1.addGrade("Science", 6);
        student1.addGrade("English", 4);
        school.addStudent(student1);

        Student student2 = new Student("Bob", "Male", 2, 9, 2);
        student2.addGrade("Math", 2);
        student2.addGrade("Science", 4);
        student2.addGrade("English", 5);
        school.addStudent(student2);

        // Teachers
        Teacher teacher1 = new Teacher("Mr. Smith", "Male", 1001, "School X", new ArrayList<>(Arrays.asList("Math", "Science")), 5000);
        school.addTeacher(teacher1);
        Teacher teacher2 = new Teacher("Mrs. Johnson", "Female", 1002, "School X", new ArrayList<>(Arrays.asList("Math", "Science")), 4500);
        school.addTeacher(teacher2);

        school.printStudentsInfo();
        school.printTeacherInfo();

        String subject = "Math";
        Student studentWithHighestGrade = school.studentsHighestGrade(subject);
        System.out.println("Student with the highest grade in " + subject + ": " + studentWithHighestGrade.getName());

        Student studentWithLowestGrade = school.studentsLowestGrade(subject);
        System.out.println("Student with the lowest grade in " + subject + ": " + studentWithLowestGrade.getName());

        double averageSalary = school.averageSalary();
        System.out.println("Average salary: " + averageSalary);

        Student student = student1; // Choose a student for calculation
        double averageGradeOfStudent = school.averageGradeOfStudent(student);
        System.out.println("Average grade of " + student.getName() + ": " + averageGradeOfStudent);

        double classAverageGrade = school.classAverageGrade();
        System.out.println("Class average grade: " + classAverageGrade);

        String subjectWithHighestGrade = school.subjectWithHighestGrade(student);
        System.out.println("Subject with the highest grade for " + student.getName() + ": " + subjectWithHighestGrade);

        Teacher teacherWithHighestGrades = school.teacherWithHighestGrades();
        System.out.println("Teacher signing the highest grades: " + teacherWithHighestGrades.getName());
    }
}

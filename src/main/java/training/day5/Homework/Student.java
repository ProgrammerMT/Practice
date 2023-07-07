package training.day5.Homework;

public class Student extends Person{
    private int studentsClass;
    private int numberInClass;
    private double[] subjectGrade;

    public Student(String name, String gender, int ID, int studentsClass, int numberInClass, double[] subjectGrade) {
        super(name, gender, ID);
        this.studentsClass = studentsClass;
        this.numberInClass = numberInClass;
        this.subjectGrade = subjectGrade;
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

    public double[] getSubjectGrade() {
        return subjectGrade;
    }

    public void setSubjectGrade(double[] subjectGrade) {
        this.subjectGrade = subjectGrade;
    }
}

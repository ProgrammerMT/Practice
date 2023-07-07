package training.day5.Homework;

public class Teacher extends Person{
    private String school;
    private String[] subjects;
    private double salary;

    public Teacher(String name, String gender, int ID, String school, String[] subjects, double salary) {
        super(name, gender, ID);
        this.school = school;
        this.subjects = subjects;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

package training.day4;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Person");
    }

    public void learn(){
        System.out.println("This person is learning");
    }

    public void eat(){
        System.out.println("This person is eating");
    }

    public void talk(){
        System.out.println("This person is talking");
    }

    //!!!***!!!
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(){
        if (age < 0){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    public static void main(String[] args) {

    }
}

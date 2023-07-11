package training.day4;

public class Singer extends Person{
    public String name;
    public Singer(String name, int age){
        super(name, age);
        System.out.println("Singer");
        canPlayGuitar = false;
    }

    public Singer(String name, int age, String bandName){
        this(name, age);
        System.out.println("Singer2");
    }
    public final boolean canPlayGuitar; // = false;
    public String bandName;

    public void sing(){
        System.out.println("Singing");
    }

    public void playGuitar(){
        if (canPlayGuitar){
            System.out.println("Playing guitar");
        }
        else{
            System.out.println("I cannot play the guitar");
        }
    }

    public void learn(){
        super.learn();
        System.out.println("The singer is learning");
    }
    public static void main(String[] args) {

    }
}

package training.day4;

public class Main {
    public static void main(String[] args) {
        //teoriq
        //Singer singer = new Singer("Ivan", 12, "bandName");
        //singer.canPlayGuitar = true;
        //Person person = new Person("Ivan", 10);
        Person person = new Singer("Ivan", 10);
        ((Singer)person).playGuitar();
        person.learn();
    }
}

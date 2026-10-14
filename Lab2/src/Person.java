public class Person {
    String fullName;
    int age;

    public void move(){
        System.out.println("Такой-то "+ fullName + " идет...");

    }

    public void talk(){
        System.out.println("Такой-то "+ fullName + " говорит...");

    }

    public Person(){

    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;

    }

}

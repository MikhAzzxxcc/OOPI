public class CAT {

    String name;
    double weight;
    int age;
    String color;
    String address;

    public CAT(String name){
        this.name = name;
        this.weight = 4.0;
        this.age = 2;

    }
    public CAT(String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;

    }

    public CAT(String name, int age, double  weight){
        this.name = name;
        this.age = age;
        this.weight = 4;

    }

    public CAT(double weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    public CAT(double weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
    }


    public String toString() {
        return "Имя: " + name +
                "\nВес: " + weight +
                "\nВозраст: " + age +
                "\nЦвет: " + color +
                "\nАдрес: " + address;
    }


}

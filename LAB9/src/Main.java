public class Main {
    public static void main(String[] args) {
        House house = new House();

        house.setValues(9, 2015, "ЖК Ала-Тоо");

        house.printValues();

        System.out.println("Возраст дома: " + house.getYears() + " лет");

        System.out.println("\nИнформация через toString():");
        System.out.println(house);

        System.out.println(house.getYears1() + " лет");
    }

}


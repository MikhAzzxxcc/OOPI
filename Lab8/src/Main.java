public class Main {
    public static void main(String[] args) {

        Flower flower1 = new Flower("Роза", 500, 8, 50);
        Flower flower2 = new Flower("Тюльпан", 300, 9, 40);
        Flower flower3 = new Flower("Лилия", 450, 7, 60);
        Flower flower4 = new Flower("Хризантема", 350, 6, 45);

        Flower[] flowers = {flower1, flower2, flower3, flower4};
         Boquet boquet = new Boquet(flowers, 50);
        System.out.println("Стоимость букета " + boquet.getAccessoriesPrice());
        boquet.sortByFreshness();
        System.out.println("\nЦветы после сортировки по свежести: ");
        for (Flower flower : boquet.flowers) {
            System.out.println(flower.name + " — свежесть: " + flower.freshness);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        CAT cat1 = new CAT("Felix");
        CAT cat2 = new CAT("Барсик", 3.9, 2);
        CAT cat3 = new CAT("Рыжик", 4, 3.3);
        CAT cat4 = new CAT(5.5, "Белый");
        CAT cat5 = new CAT(6.7, "Голубой", "5 мкр дом 67");

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);

    }
}
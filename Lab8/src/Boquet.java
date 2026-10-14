public class Boquet {
    Flower[] flowers;
    double accessoriesPrice;


    public  Boquet(Flower[] flowers, double accessoriesPrice){
        this.flowers= flowers;
        this.accessoriesPrice =accessoriesPrice;

    }

    public double getAccessoriesPrice() {
        double total = accessoriesPrice;

        for(Flower flower : flowers){
            total += flower.prise;
        }
        return total;

    }

    public void sortByFreshness() {
        for (int i = 0; i < flowers.length - 1; i++) {
            for (int j = 0; j < flowers.length - 1 - i; j++) {
                if (flowers[j].freshness < flowers[j + 1].freshness) {
                    Flower temp = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = temp;
                }
            }
        }
    }

    public void findByStemLength(int minLength, int maxLength) {
        System.out.println("Цветы со стеблем от " + minLength + " до " + maxLength + " см:");

        for (Flower flower : flowers) {
            if (flower.stem >= minLength && flower.stem<= maxLength) {
                System.out.println(flower.name + " — " + flower.stem + " см");
            }
        }
    }
}

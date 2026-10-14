public class House {

    int floors;
    int buildYear;
    String name;


    public void setValues(int floors, int buildYear, String name) {
        this.floors = floors;
        this.buildYear = buildYear;
        this.name = name;
    }


    public void printValues() {
        System.out.println("Количество этажей: " + floors);
        System.out.println("Год постройки: " + buildYear);
        System.out.println("Название: " + name);
    }

    public int getYears() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - buildYear;
    }

    public int getYears1() {
        int currentYear = 2026;
        return currentYear - buildYear;
    }




    @Override
    public String toString() {
        return "Количество этажей: " + floors +
                "\nГод постройки: " + buildYear +
                "\nНазвание: " + name;
    }



}

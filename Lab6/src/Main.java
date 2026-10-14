public class Main{
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student(1, "","","",2007, "", "", "", 1, "");
        students[1] = new Student(2, "Петров", "Петр", "Петрович",
                2006, "Бишкек", "0555234567", "Экономика", 2, "ЭК-2");

        students[2] = new Student(3, "Сидоров", "Алексей", "Алексеевич",
                2008, "Ош", "0555345678", "IT", 1, "ИТ-1");

        students[3] = new Student(4, "Ким", "Данил", "Олегович",
                2005, "Бишкек", "0555456789", "IT", 2, "ИТ-2");

        students[4] = new Student(5, "Смирнова", "Анна", "Сергеевна",
                2007, "Ош", "0555567890", "Экономика", 2, "ЭК-2");

        students[5] = new Student(6, "Орлов", "Максим", "Игоревич",
                2008, "Бишкек", "0555678901", "IT", 1, "ИТ-3");

        System.out.println("Студенты факультета: ИТ");
        for (Student student : students){
            if (student.faculty.equals("IT")){
                System.out.println(student.lastName + " " + student.firstName);

            }
        }
System.out.println();
        System.out.println("Студенты 1го курса и факультета: ИТ");
        for (Student student : students){
            if (student.faculty.equals("IT") && (student.course == 1)){
                System.out.println(student.lastName + " " + student.firstName);

            }
        }

        System.out.println();


        System.out.println("Студенты родившиеся позднее 2006 года: ");
        for (Student student : students){
            if (student.birthDate > 2006){
                System.out.println(student.lastName + " " + student.firstName);
            }
        }

        System.out.println();

        System.out.println("Студенты состоящие в одной группе:  ");
        for (Student student : students){
            if (student.group.equals("ЭК-2")){
                System.out.println(student.lastName + " " + student.firstName);
            }
        }


    }
}
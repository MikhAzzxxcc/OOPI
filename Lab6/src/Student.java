public class Student {
    int id;
    String lastName;
    String firstName;
    String middleName;
    int birthDate;
    String address;
    String phone;
    String faculty;
    int course;
    String group;

    public Student(int id, String lastName, String firstName, String middleName,
                   int birthDate, String address, String phone,
                   String faculty, int course, String group){

        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;

    }
}

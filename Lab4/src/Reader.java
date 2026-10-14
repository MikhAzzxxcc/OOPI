public class Reader {
    String fullName;
    String libraryCardNumber;
    String faculty;
    String dateOfBirth;
    String phoneNumber;

    public void takebook(){
        System.out.println(fullName+" взял книгу");

    }

    public void returnBook(){
        System.out.println(fullName+" вернул книгу");

    }

    public Reader(String fullName){
        this.fullName = fullName;
    }


}

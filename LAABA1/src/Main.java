public class Main{
    public static void main(String[] args) {

        Phone phone1 = new Phone("0555123123", "IPhone", 4.3);
        Phone phone2 = new Phone("0709123123", "Xiaomi", 5.0);
        Phone phone3 = new Phone("0501123123", "ViVo", 6.7);


        phone1.receiveCall("MIk");
        phone1.getNumber();
        phone1.receiveCall("PP", phone2.getNumber());

        System.out.println(phone1.getNumber());
        phone1.receiveCall("Xiaomi", "0709123123");
        phone1.sendMassage( phone2.getNumber(), phone3.getNumber());
        phone2.sendMassage("0555123123", "0501123123");

        phone2.setWeight(67);






    }
}







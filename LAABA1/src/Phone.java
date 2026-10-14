public class Phone {
//параметры
    private String number;
    private String model;
    private double weight;


//конструктор 3 параметра
    public Phone(String number, String model, double weight)
    {
        this(number,model);//связаные два конструктора

        this.weight = weight;
    }
    public void weightTo(double weight){

        System.out.println(this.weight = weight + 1);
    }
    private Phone(double  ){




    }





    public void receiveCall(String name) {

        System.out.println("Звонит "+ name);

    }

    public String getNumber() {

        return number;

    }
//конструктор 2 паратмерта
    public Phone(String number, String model){
        this.number = number;
        this.model = model;

    }
//конструктор без параметров
    public void setWeight(double we){
        this.weight = weight + 1 ;
    }

    public void receiveCall(String name,String number) {

        System.out.println("Звонит: "+ name );
        System.out.println("Его Номер: "+ number);
        System.out.println("ПЫтается дозвониться "+ name + "от "  );

    }


    public void tel(String number, String model){
        System.out.println(model + number);
    }




    public void sendMassage(String... numbers){
        for (String number : numbers){
            System.out.println((this.number + " Отправил сообщение на номер" + number));

        }
    }



}

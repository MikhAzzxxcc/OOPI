
    public class Phone {

        String number;
        String model;
        double weight;

        // Конструктор без параметров
        public Phone() {
        }

        // Конструктор с двумя параметрами
        public Phone(String number, String model) {
            this.number = number;
            this.model = model;
        }

        // Конструктор с тремя параметрами
        public Phone(String number, String model, double weight) {
            this(number, model);
            this.weight = weight;
        }

        // Метод для входящего звонка
        public void receiveCall(String name) {
            System.out.println("Звонит " + name);
        }

        // Перегруженный метод receiveCall
        public void receiveCall(String name, String number) {
            System.out.println("Звонит " + name + ", номер: " + number);
        }

        // Возвращает номер телефона
        public String getNumber() {
            return number;
        }

        // Отправка сообщения нескольким номерам
        public void sendMessage(String... numbers) {
            System.out.println("Сообщение отправлено на номера:");

            for (String number : numbers) {
                System.out.println(number);
            }
        }
    }
}

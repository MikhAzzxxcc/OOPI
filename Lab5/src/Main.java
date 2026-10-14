import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Alex", 23);
        Engine engine1 = new Engine(450, "AUDI");
        Car car1 = new Car("AUDI", "Бизнес", 1800, driver1, engine1);

        car1.start();
        car1.stop();
        car1.turnLeft();
        car1.turnRight();
        car1.toString();




    }
}

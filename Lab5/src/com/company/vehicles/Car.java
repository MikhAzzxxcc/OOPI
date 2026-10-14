package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

import javax.print.DocFlavor;

public class Car {
    String brand;
    String carClass;
    double weight;
    Driver driver;
    Engine engine;

    public Car(String brand, String carClass, double weight, Driver driver, Engine engine){
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;

    }


    public void start() {
        System.out.println("Поехали");

    }
    public void stop() {
        System.out.println("Останавливаемся");

    }
    public void turnRight() {
        System.out.println("Поворот направо");

    }
    public void turnLeft() {
        System.out.println("Поворот налаво");

    }
    public String toString() {
        return "Марка: " + brand +
                "\nКласс: " + carClass +
                "\nВес: " + weight +
                "\nВодитель: " + driver.fullName +
                "\nСтаж: " + driver.drivingExperience +
                "\nМощность двигателя: " + engine.power +
                "\nПроизводитель двигателя: " + engine.manufacturer;}




}

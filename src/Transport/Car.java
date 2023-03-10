package Transport;

import Driver.DriverB;
import Transport.enums.BodyTypes;

public class Car extends Transport <DriverB> {

    private BodyTypes bodyTypes;

    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver,
               BodyTypes bodyTypes) {
        super(brand, model, engineVolume, driver);
        this.bodyTypes = bodyTypes;
    }

    public BodyTypes getBodyTypes() {
        return bodyTypes;
    }

    public void setBodyTypes(BodyTypes bodyTypes) {
        this.bodyTypes = bodyTypes;
    }

    @Override
    public void printType() {
        if (bodyTypes == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + ". " + bodyTypes);
        }
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль " + getBrand() + getModel() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль " + getBrand() + getModel() + " закончил движение");
    }


    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомбиля " + getBrand() + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у автомбиля " + getBrand() + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у автомбиля " + getBrand() + getModel());
    }
}

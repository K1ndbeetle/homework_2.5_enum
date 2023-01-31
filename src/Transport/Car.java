package Transport;

import Driver.DriverB;

public class Car extends Transport <DriverB> {

    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver) {
        super(brand, model, engineVolume, driver);
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

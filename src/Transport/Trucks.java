package Transport;

import Driver.DriverC;

public class Trucks extends Transport <DriverC> {

    public Trucks(String brand,
                  String model,
                  double engineVolume,
                  DriverC driver) {
        super(brand, model, engineVolume, driver);
    }


    @Override
    public void startMove() {
        System.out.println("Грузовик " + getBrand() + getModel() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик " + getBrand() + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика " + getBrand() + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у грузовика " + getBrand() + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у грузовика " + getBrand() + getModel());
    }
}

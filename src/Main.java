import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Trucks;

public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Иван ИВанов Иванович", true, 15);

        Car carAudi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                driverB);

        Car carBmw = new Car(
                "BMW",
                "Z8",
                3.0,
                driverB);

        Car carKia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                driverB);

        Car carHyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                driverB);

        printInfo(carAudi);
        printInfo(carBmw);
        printInfo(carKia);
        printInfo(carHyundai);
        System.out.println();

        DriverD driverD = new DriverD("Фёдор Фёдорович Колесников", true, 10);

        Bus busDaewoo = new Bus(
                "Daewoo",
                "BS 106",
                6.5,
                driverD);

        Bus busHiger = new Bus(
                "Higer",
                "KLQ 6122B",
                10,
                driverD);

        Bus busSetra = new Bus(
                "Setra",
                "S215 HD",
                8,
                driverD);

        Bus busVolvo = new Bus(
                "Volvo",
                "9500",
                7.7,
                driverD);

        printInfo(busDaewoo);
        printInfo(busHiger);
        printInfo(busSetra);
        printInfo(busVolvo);
        System.out.println();

        DriverC driverC = new DriverC("Антон Антонович Антонов", true, 17);

        Trucks trucksMan = new Trucks(
                "Man",
                "TGX",
                12.4,
                driverC);

        Trucks trucksScania = new Trucks(
                "Scania",
                "XT",
                16,
                driverC);

        Trucks trucksTatra = new Trucks(
                "Tatra",
                "T815",
                12.7,
                driverC);

        Trucks trucksRenault = new Trucks(
                "Renault",
                "Magnum",
                12.8,
                driverC);

        printInfo(trucksMan);
        printInfo(trucksScania);
        printInfo(trucksTatra);
        printInfo(trucksRenault);
    }

    public static void printInfo(Transport<?> transport){
        System.out.println("Водитель с категорией B " + transport.getDriver().getFIO() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет учавствовать в заезде");
    }
}

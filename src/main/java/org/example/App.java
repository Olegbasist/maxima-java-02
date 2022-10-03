package org.example;

//  22.09.2022  Запретить создание экземпляров класса Transport, метод getPrice сделать абстрактным.
//
// TODO: 22.09.2022 Описать класс Logistics - бизнес логику нашей логистики,
//  при создании которого мы будем передавать ему некоторое количество объектов класса Transport , заполняя свойство vehicles.
//
// TODO: 22.09.2022 Описать методы Transport getShipping(City city, int weight, int hours)
//  - найти самое оптимальное по стоимости доставки транспортное средство.
//
// TODO: 22.09.2022 Необходимо учесть грузоподъемность и необходимость доставки в указанный срок,
//  для определения возможности перевозки определенным транспортом описать метод isShippingAvailable()
//
// TODO: 22.09.2022 Описать Интерфейс Repairable с методами void startRepair(), void finishRepair(), boolean isRepairing(). Все виды транспорта должны реализовывать этот интерфейс.
//  В классе Logistics учесть состояние транспортного средства при расчете грузоперевозок.

public class App 
{
    public static void main( String[] args )
    {

        // Первый город
        System.out.println("--------------------------------------------------");
        City city = new City("Первый город", 5741);
        city.printDistance();
        //System.out.println("Аэропорт: " +city.isHasAirport()+ " Река: " +city.isOnWater());

        //Второй город
        System.out.println("--------------------------------------------------");
        City city2 = new City("Второй городок", 146,true, false);
        city2.printDistance();
        //System.out.println("Аэропорт: " +city2.isHasAirport()+ " Река: " +city2.isOnWater());

        // Стоимость перевозки Грузовиком
        System.out.println("--------------------------------------------------");
        Truck truck = new Truck("Грузовик", 5000, 75, 3);
        /*truck.setName("Грузовик");
        truck.setCapacity(5000);
        truck.setSpeed(70);
        truck.setCostOfKm(3);*/
        truck.printVehicleFetcher();
        System.out.print("Стоимость перезвозки 1Кг груза до " +city.getName()+ " составит ");
        System.out.print(truck.getPrice(city));
        System.out.println(" рублей");
        System.out.print("Стоимость перезвозки 1Кг груза до " +city2.getName()+ " составит ");
        System.out.print(truck.getPrice(city2));
        System.out.println(" рублей");


        System.out.println("--------------------------------------------------");

      //Стоимость перевозки кораблём
        Ship ship = new Ship ("Корабль", 250000, 25, 1);
        /*ship.setName("Корабль");
        ship. setCapacity(250000);
        ship.setSpeed(25);
        ship.setCostOfKm(1);*/
        ship.printVehicleFetcher();
        System.out.print("Стоимость перезвозки 1Кг груза до " +city.getName()+ " составит ");
        System.out.print(ship.getPrice(city));
        System.out.println(" рублей");
        System.out.print("Стоимость перезвозки 1Кг груза до " +city2.getName()+ " составит ");
        System.out.print(ship.getPrice(city2));
        System.out.println(" рублей");

        System.out.println("--------------------------------------------------");

        //Стоимость перевозки самолётом
        Plane plane = new Plane("Самолёт", 800, 900, 57);
        /*plane.setName("Самолёт");
        plane.setCapacity(800);
        plane.setSpeed(900);
        plane.setCostOfKm(57);*/
        plane.printVehicleFetcher();
        System.out.print("Стоимость перезвозки 1Кг груза до " +city.getName()+ " составит ");
        System.out.print(plane.getPrice(city));
        System.out.println(" рублей");
        System.out.print("Стоимость перезвозки 1Кг груза до " +city2.getName()+ " составит ");
        System.out.print(plane.getPrice(city2));
        System.out.println(" рублей");

        System.out.println("--------------------------------------------------");




    }


}

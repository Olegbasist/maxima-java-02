package org.example;

// 12.09.2022 Создать новый maven-проект и репозиторий maxima-java-02

// 12.09.2022  В pom.xml установить версию junit 4.13

// 12.09.2022  Описать класс City (город) со свойствами:
//        name — имя, строка.
//        distanceKm — расстояние, число

// 12.09.2022  Описать класс Transport (транспортное средство) со свойствами:
//        name — имя, строка.
//        capacity — грузоподъемность, число.
//        speed — скорость, число.
//        costOfKm — стоимость за километр, дробное число

//12.09.2022  Описать метод float getPrice(City city), возвращающий стоимость перевозки для нашего транспорта.

// 12.09.2022  В обоих классах описать конструкторы с указанными свойствами в указанном порядке и геттеры-сеттеры всех свойств.

// 15.09.2022 Предусмотреть сокращенный синтаксис создания города, при котором будет считаться что река есть, а аэропорта нет.
// 15.09.2022 Описать три класса Ship, Plane и Truck, со свойствами и методами, аналогичными транспорту.

public class App 
{
    public static void main( String[] args )
    {
        Transport vehicle = new Transport();
        /*vehicle.setName("Некий транспорт");
        vehicle.setCapacity(242);
        vehicle.setSpeed(4);
        vehicle.setCostOfKm(0.52F);
        vehicle.printVehicleFeacher();*/
        System.out.println("--------------------------------------------------");

        // Первый город
        City city = new City(false,true);
        city.setName("Городище");
        city.setDistanceKm(1576);
        city.printDistance();
        //vehicle.printPrice(vehicle.getPrice(city));
        //System.out.println(vehicle.getPrice(city));

        //Второй город
        System.out.println("--------------------------------------------------");
        City city2 = new City(true,false);
        city2.setName("Городок");
        city2.setDistanceKm(165);
        city2.printDistance();
        //vehicle.printPrice(vehicle.getPrice(city2));


        // Стоимость перевозки разным транспортом
        System.out.println("--------------------------------------------------");
        Truck truck = new Truck();
        truck.setName("Грузовик");
        truck.setCapacity(5000);
        truck.setSpeed(70);
        truck.setCostOfKm(3);
        truck.printVehicleFeacher();
        System.out.print("Стоимость перезвозки 1Кг груза до " +city.getName()+ " составит ");
        System.out.print(truck.getPrice(city));
        System.out.println(" рублей");
        System.out.print("Стоимость перезвозки 1Кг груза до " +city2.getName()+ " составит ");
        System.out.print(truck.getPrice(city2));
        System.out.println(" рублей");


        System.out.println("--------------------------------------------------");

        //Стоимость перевозки кораблём
        Ship ship = new Ship();
        ship.setName("Корабль");
        ship. setCapacity(250000);
        ship.setSpeed(25);
        ship.setCostOfKm(1);
        ship.printVehicleFeacher();
        System.out.print("Стоимость перезвозки 1Кг груза до " +city.getName()+ " составит ");
        System.out.print(ship.getPrice(city));
        System.out.println(" рублей");
        System.out.print("Стоимость перезвозки 1Кг груза до " +city2.getName()+ " составит ");
        System.out.print(ship.getPrice(city2));
        System.out.println(" рублей");

        System.out.println("--------------------------------------------------");

        //Стоимость перевозки самолётом
        Plane plane = new Plane();
        plane.setName("Самолёт");
        plane.setCapacity(800);
        plane.setSpeed(900);
        plane.setCostOfKm(57);
        plane.printVehicleFeacher();
        System.out.print("Стоимость перезвозки 1Кг груза до " +city.getName()+ " составит ");
        System.out.print(plane.getPrice(city));
        System.out.println(" рублей");
        System.out.print("Стоимость перезвозки 1Кг груза до " +city2.getName()+ " составит ");
        System.out.print(plane.getPrice(city2));
        System.out.println(" рублей");

        System.out.println("--------------------------------------------------");


    }


}

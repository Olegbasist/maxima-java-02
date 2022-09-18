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

// TODO: 15.09.2022 Предусмотреть сокращенный синтаксис создания города, при котором будет считаться что река есть, а аэропорта нет.
// 15.09.2022 Описать три класса Ship, Plane и Truck, со свойствами и методами, аналогичными транспорту.

public class App 
{
    public static void main( String[] args )
    {
        Transport vehicle = new Transport();
        vehicle.setName("Телега");
        vehicle.setCapacity(242);
        vehicle.setSpeed(4);
        vehicle.setCostOfKm(0.52F);
        vehicle.printVehicleFeacher();
        System.out.println("--------------------------------------------------");


        City city = new City();
        city.setName("Городищище");
        city.setDistanceKm(1576);
        city.printDistance();
        System.out.println("--------------------------------------------------");
        vehicle.printPrice(vehicle.getPrice(city));
        System.out.println(vehicle.getPrice(city));

    }


}

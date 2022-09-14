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

//TODO: 12.09.2022  Описать метод float getPrice(City city), возвращающий стоимость перевозки для нашего транспорта.

//TODO: 12.09.2022  В обоих классах описать конструкторы с указанными свойствами в указанном порядке и геттеры-сеттеры всех свойств.


public class App 
{
    public static void main( String[] args )
    {
        Transport telega = new Transport();
        telega.name = "Телега";
        telega.capacity = 260;
        telega.speed = 5;
        telega.costOfKm = 0.87F;
        System.out.println(telega.name+ " вмещает " +telega.capacity+ "Кг. груза, едет со скоростью " +telega.speed+ "Км/ч и стоит " +telega.costOfKm+ " рубля за 1Км. пути");

        int cargoWeight = 60;

        City city = new City();
        city.name = "'Место назначения'";
        city.distanceKm = 1896;
        city.printDistance();
        System.out.println("Транспортировка груза весом " +cargoWeight+ "Кг. до пункта " +city.name+ " будет стоить " +(telega.costOfKm*(telega.capacity/100*cargoWeight/100)*city.distanceKm)+ " рублей");


    }
}

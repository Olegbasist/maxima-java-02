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
// Cвойства инициализировать в коротком конструкторе константами, либо вызывать более длинный конструктор указывая праметры явно.
// 15.09.2022 Описать три класса Ship, Plane и Truck, со свойствами и методами, аналогичными транспорту.
//
// Ship, Plane и Truck должны быть наследниками Transport.

// 21.09.2022 В City должен быть два конструктора: с четырьмя и с двумя параметрами, для полного создания, либо для сокращенного. У Вас либо задаем имя и расстояние, либо параметры вода/аэропорт, это некорректно.
// В транспорте в getPrice прямая ссылка на свойство, а не вызов геттера.
// В Ship и Plane в getPrice можно использовать конструктор суперкласса - попробуйте, к этому не буду придираться
// 22.09.2022  Уберите дефолтные конструкторы и инициализируйте объекты сразу при создании.
// 22.09.2022 В методах getPrice вы дублируете код (умножение). Можно написать так: return !city.isOnWater() ? 0 : super.getPrice(city),

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

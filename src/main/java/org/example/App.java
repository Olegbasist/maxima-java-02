package org.example;

//  22.09.2022  Запретить создание экземпляров класса Transport, метод getPrice сделать абстрактным.
//
//  22.09.2022 Описать класс Logistics - бизнес логику нашей логистики,
//  при создании которого мы будем передавать ему некоторое количество объектов класса Transport , заполняя свойство vehicles.
//
//  22.09.2022 Описать методы Transport getShipping(City city, int weight, int hours)
//  - найти самое оптимальное по стоимости доставки транспортное средство.
//
//  22.09.2022 Необходимо учесть грузоподъемность и необходимость доставки в указанный срок,
//  для определения возможности перевозки определенным транспортом описать метод isShippingAvailable()
//
//  22.09.2022 Описать Интерфейс Repairable с методами void startRepair(), void finishRepair(), boolean isRepairing(). Все виды транспорта должны реализовывать этот интерфейс.
//  В классе Logistics учесть состояние транспортного средства при расчете грузоперевозок.



public class App {

    public static void main( String[] args ) {

       // Первый город
        System.out.println("--------------------------------------------------");
        City city = new City("Небольшой городок на реке", 5741);
        city.printDistance();
        //System.out.println("Аэропорт: " +city.isHasAirport()+ " Река: " +city.isOnWater());

        //Второй город
        System.out.println("--------------------------------------------------");
        City city2 = new City("Большой город в степи", 146,true, false);
        city2.printDistance();
        //System.out.println("Аэропорт: " +city2.isHasAirport()+ " Река: " +city2.isOnWater());



        System.out.println("--------------------------------------------------");


// Создаем массив транспортов

        Transport [] vehicles = new Transport[6];
        vehicles[0] = new Truck("Грузовик", 5000, 85, 2.3f);
        vehicles[1] = new Truck("Тягач с полуприцепом", 12000, 68, 1.7f);
        vehicles[2] = new Truck("Грузовичёк", 2000, 90, 1.4f);
        vehicles[3] = new Ship("Сухогруз ''Доктор наук профессор Шварценгольд''", 1200000, 25, 0.79f);
        vehicles[4] = new Plane("Грузовой самолёт", 5500, 900, 4.2f);
        vehicles[5] = new Plane("Маленький самолёт", 1200, 750, 5.5f);

// Пробуем поставить на ремонт
        vehicles[5].startRepair();
        vehicles[5].finishRepair();
        System.out.println("Сломанный транспорт сломан: " +vehicles[5].isRepairing());


// Посылаем объекты в Logistics заполняя ими vehicles

        Logistics logistics = new Logistics(vehicles);

//Получаем результат
        System.out.println("Самый дешевый транспорт по версии Logistics, будет: ");
        System.out.println(logistics.getShipping(city2,8000,24).getName());

    }









}

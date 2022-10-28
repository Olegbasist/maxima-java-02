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

// TODO: 25.10.2022 Задание из коментария в начале следующего урока:
//  1) Дано: массив транспортов (объектов)
//  2) Из этого массива нужно найти 1 объект содержащий минимальное значение
//      (это развитие задачи на поиск минимума в массиве)
//      Вместо чисел - объекты, по объектам считается цена
//  3) Искать элементы надо с учётом доступности
//      (не всегда объекты могут достигать города (вода, аэропорт)),
//      (не достаточно высокая скорость, не достаточная грузоподъемность),
//      (транспортное средство может быть на ремонте)
//  Подсказка: В запускающем коде (Арр) создаем объекты,
//      затем их переменным числом передаем в Logistics,
//      в логистике формируется массив транспортных средств
//      и из них мы выбираем наиболее дешевое (поиск минимума в массиве)
//  Подсказка2: если не понимаете isShippingAvailable сделайте сначала без него
//  САМАЯ БОЛЬШАЯ ПОДСКАЗКА: не привязыватсья к какому-то конкретному классу, а работать с суперклассом
//      (он же грузовик, он же является инстансом транспорта)


import java.util.*;
import java.util.stream.Stream;

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

        /*Transport [] vehicle = new Transport[5];
            vehicle[0] = new Truck("Грузовик", 5000, 85, 2.3f);
            vehicle[1] = new Truck("Тягач с полуприцепом", 12000, 68, 1.7f);
            vehicle[2] = new Truck("Грузовичёк", 2000, 90, 1.4f);
            vehicle[3] = new Ship("Сухогруз ''Доктор наук профессор Шварценгольд''", 12000000, 25, 0.79f);
            vehicle[4] = new Plane("Грузовой самолёт", 5500, 900, 4.2f);

            for (Transport obj: vehicle){
                System.out.println(obj.getName()+ " " +obj.getCapacity()+ " " +obj.getSpeed()+ " " +obj.getCostOfKm());
                System.out.print("Стоимость перезвозки 1Кг груза до " +city.getName()+ " составит ");
                System.out.print(obj.getPrice(city));
                System.out.println(" рублей");
                System.out.print("Стоимость перезвозки 1Кг груза до " +city2.getName()+ " составит ");
                System.out.print(obj.getPrice(city2));
                System.out.println(" рублей");
                System.out.println("--------------------------------------------------");
            }
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
            for (Transport obj: vehicle){
                System.out.print("Стоимость перевозки " +obj.getName()+ " = ");
                System.out.println(obj.getCostOfKm()* city.getDistanceKm());
            }*/




        /*for (Transport obj: vehicle) {
            System.out.println(obj.getShipping(city, 100, 50));

            for (int i=0; i< vehicle.length; i++) {
                Logistics logistics = new Logistics(vehicle[i]);
                //System.out.println(logistics.getShipping());
                System.out.println(logistics.getShipping(city, 100, 50));*/

// Решаем задачу последовательно
// Создаем массив транспортов

        Transport [] vehicle = new Transport[5];
        vehicle[0] = new Truck("Грузовик", 5000, 85, 2.3f);
        vehicle[1] = new Truck("Тягач с полуприцепом", 12000, 68, 1.7f);
        vehicle[2] = new Truck("Грузовичёк", 2000, 90, 1.4f);
        vehicle[3] = new Ship("Сухогруз ''Доктор наук профессор Шварценгольд''", 12000000, 25, 0.79f);
        vehicle[4] = new Plane("Грузовой самолёт", 5500, 900, 4.2f);


        ArrayList<Object> objectsArrayList = new ArrayList<>();
        float minCostOfDelivery = Float.MAX_VALUE;
        Transport cheapestVehicle = null;
        for (Transport obj: vehicle){
            //Collections.addAll(objectsArrayList, obj.getPrice(city2));
            float costOfDelivery = obj.getPrice(city2);
            //System.out.println(obj);
            System.out.print(obj.getName());
            System.out.print(" доставит груз за - ");
            System.out.println(costOfDelivery);

            if (minCostOfDelivery > costOfDelivery && costOfDelivery !=0) {
                minCostOfDelivery = costOfDelivery;
                cheapestVehicle = obj;
            };
            System.out.println("Текущая минимальная стоимость: " +minCostOfDelivery);
            System.out.println("Текущий самый дешевый транспорт :" +cheapestVehicle);
            System.out.println("");

        }

        //System.out.print("Всего транспортных средств: ");
        //System.out.println(objectsArrayList.size());


        //Collections.addAll(objectsArrayList, vehicle);
        //System.out.println(Arrays.stream(vehicle).findAny());
        //objectsArrayList.forEach(o ->  System.out.println(o));
        //Object max = Collections.max(objectsArrayList);







    }
}

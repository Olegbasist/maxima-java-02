package org.example;

// TODO: написать тесты для класса TransportFactory


public class App {

    public static void main( String[] args ) throws Exception {

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

        /*Transport [] vehicles = new Transport[5];
            vehicles[0] = new Truck("Грузовик", 5000, 85, 2.3f);
            vehicles[1] = new Truck("Тягач с полуприцепом", 12000, 68, 1.7f);
            vehicles[2] = new Truck("Грузовичок", 2000, 90, 1.4f);
            vehicles[3] = new Ship("Сухогруз ''Доктор наук профессор Шварценгольд''", 12000000, 25, 0.79f);
            vehicles[4] = new Plane("Грузовой самолёт", 5500, 900, 4.2f);

            for (Transport obj: vehicles){
                System.out.println(obj.getName()+ " " +obj.getCapacity()+ " " +obj.getSpeed()+ " " +obj.getCostOfKm());
                System.out.print("Стоимость перевозки 1Кг груза до " +city.getName()+ " составит ");
                System.out.print(obj.getPrice(city));
                System.out.println(" рублей");
                System.out.print("Стоимость перевозки 1Кг груза до " +city2.getName()+ " составит ");
                System.out.print(obj.getPrice(city2));
                System.out.println(" рублей");
                System.out.println("--------------------------------------------------");
            }
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
            for (Transport obj: vehicles){
                System.out.print("Стоимость перевозки " +obj.getName()+ " = ");
                System.out.println(obj.getCostOfKm()* city.getDistanceKm());
            }*/




        /*for (Transport obj: vehicles) {
            System.out.println(obj.getShipping(city, 100, 50));

            for (int i=0; i< vehicles.length; i++) {
                Logistics logistics = new Logistics(vehicles[i]);
                //System.out.println(logistics.getShipping());
                System.out.println(logistics.getShipping(city, 100, 50));*/

// Решаем задачу последовательно
// Создаем массив транспортов

        Transport [] vehicles = new Transport[6];
        vehicles[0] = new Truck("Грузовик", 5000, 85, 2.3f);
        vehicles[1] = new Truck("Тягач с полуприцепом", 12000, 68, 1.7f);
        vehicles[2] = new Truck("Грузовичок", 2000, 90, 1.4f);
        vehicles[3] = new Ship("Сухогруз ''Доктор наук профессор Шварценгольд''", 1200000, 25, 0.79f);
        vehicles[4] = new Plane("Грузовой самолёт", 5500, 900, 4.2f);
        vehicles[5] = new Plane("Маленький самолёт", 1200, 750, 5.5f);

// Пробуем поставить на ремонт
        vehicles[5].startRepair();
        vehicles[5].finishRepair();
        System.out.println("Сломанный транспорт сломан: " +vehicles[5].isRepairing());


        //ArrayList<Object> objectsArrayList = new ArrayList<>();
/*        float minCostOfDelivery = Float.MAX_VALUE;
        Transport cheapestVehicle = null;
        for (Transport obj: vehicles){
            //Collections.addAll(objectsArrayList, obj.getPrice(city2));
            float costOfDelivery = obj.getPrice(city2);
            System.out.println(obj);
            System.out.print(obj.getName());
            System.out.print(" доставит груз за - ");
            System.out.println(costOfDelivery);

            if (minCostOfDelivery > costOfDelivery && costOfDelivery !=0) {
                minCostOfDelivery = costOfDelivery;
                cheapestVehicle = obj;
            }
            System.out.println("Текущая минимальная стоимость: " +minCostOfDelivery);
            System.out.println("Текущий самый дешевый транспорт :" +cheapestVehicle);
            System.out.println("");

        }*/

// Посылаем объекты в Logistics заполняя ими vehicles



        Logistics logistics = new Logistics(vehicles);


        /*logisticsWithoutList.setVehicles(vehicles[0]);
        logisticsWithoutList.setVehicles(vehicles[1]);
        logisticsWithoutList.setVehicles(vehicles[2]);
        logisticsWithoutList.setVehicles(vehicles[3]);
        logisticsWithoutList.setVehicles(vehicles[4]);*/
        //logisticsWithoutList.setVehicles(new Truck("Грузищще", 5864, 120, 1.1f));
//        System.out.println("Вот какие транспорты получились:");
//        logistics.listOfVehicles();
        System.out.println("Самый дешевый транспорт по версии Logistics, будет: ");
        System.out.println(logistics.getShipping(city2,800,24).getName());

// Добавляем все вихикл в ЭррейЛист и затем ищем минимум

        /*ArrayList<Transport> arrOfTransports = new ArrayList<>();
        //arrOfTransports.add(vehicles[0]);
        //arrOfTransports.add(vehicles[1]);
        Collections.addAll(arrOfTransports, vehicles);
        arrOfTransports.forEach(elem -> System.out.println(elem));
        for (Transport obj: arrOfTransports){
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
            System.out.println("");*/

        System.out.println("Создаем транспорт:");
        TransportFactory transportFactory = new TransportFactory();
        Transport transport = transportFactory.getTransport(city, 15587, 178);
        System.out.println(transport.getName()+ " Вместимость: " + transport.getCapacity()+ " Скорость: " + transport.getSpeed());
        System.out.println("//////////////////////////////////////////////////////////////////////");
        System.out.println("Создаем транспорт альтернативным кодом:");
        TransportFactoryAnotherTry transportFactoryAnotherTry = new TransportFactoryAnotherTry();
        Transport transport2 = transportFactoryAnotherTry.getTransport(city, 15587, 178);
        System.out.println(transport2.getName()+ " Вместимость: " + transport2.getCapacity()+ " Скорость: " + transport.getSpeed());

    }
}

package org.example;

//  22.09.2022 Описать класс Logistics - бизнес логику нашей логистики,
//  при создании которого мы будем передавать ему некоторое количество объектов класса Transport ,
//  заполняя свойство vehicles.
//
//
//  22.09.2022 Описать методы Transport getShipping(City city, int weight, int hours) - найти самое оптимальное по стоимости доставки транспортное средство.
//
//  22.09.2022 Необходимо учесть грузоподъемность и необходимость доставки в указанный срок,
//  для определения возможности перевозки определенным транспортом описать метод isShippingAvailable()
//
//  22.09.2022 В классе Logistics учесть состояние транспортного средства при расчете грузоперевозок.
//



public class Logistics {

    Transport[] vehicles;
    boolean shippingIsAvailable;

    public Logistics(Transport ... vehicles) {
        this.vehicles=vehicles;
    }

    public Transport getShipping(City city, int weight, int hours){
        float costOfDelivery;
        float minCostOfDelivery = Float.MAX_VALUE;
        Transport cheapestVehicle = null;


            for (Transport obj : vehicles) {
                costOfDelivery = obj.getPrice(city);
                shippingIsAvailable = isShippingAvailable(city, weight, hours, obj);

                if (shippingIsAvailable && minCostOfDelivery > costOfDelivery) {
                    minCostOfDelivery = costOfDelivery;
                    cheapestVehicle = obj;
                }
            }


        return cheapestVehicle;
    }

    private boolean isShippingAvailable(City city, int weight, int hours, Transport obj){
        shippingIsAvailable = obj.getPrice(city) != 0
                && city.getDistanceKm() / obj.getSpeed() <= hours
                && obj.getCapacity() >= weight
                && !(obj.isRepairing());

        if (obj.isRepairing()){
            System.out.println("Самый дешевый транспорт в логистике - на ремонте!");
        }
        return shippingIsAvailable;
    }



}
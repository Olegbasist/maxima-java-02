package org.example;

//  22.09.2022 Описать класс Logistics - бизнес логику нашей логистики,
//  при создании которого мы будем передавать ему некоторое количество объектов класса Transport ,
//  заполняя свойство vehicles.
//
//
//  22.09.2022 Описать методы Transport getShipping(City city, int weight, int hours) - найти самое оптимальное по стоимости доставки транспортное средство.
//
// TODO: 22.09.2022 Необходимо учесть грузоподъемность и необходимость доставки в указанный срок,
//  для определения возможности перевозки определенным транспортом описать метод isShippingAvailable()
//
// TODO: 22.09.2022 В классе Logistics учесть состояние транспортного средства при расчете грузоперевозок.
//

import java.util.ArrayList;
import java.util.Collections;

public class Logistics {

    Transport[] vehicles;
    boolean shippingIsAvailable;

    public Logistics(Transport ... vehicles) {
        this.vehicles=vehicles;
    }

    public Transport[] getVehicles() {
        return vehicles;
    }

    public Transport getShipping(City city, int weight, int hours) throws NullPointerException{
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

    public boolean isShippingAvailable(City city, int weight, int hours, Transport obj){
        shippingIsAvailable = true;
        if (obj.getPrice(city) == 0
                | city.getDistanceKm()/ obj.getSpeed() > hours
                | obj.getCapacity() < weight){
            shippingIsAvailable = false;
        }
        return shippingIsAvailable;
    }



}
package org.example;

/*      Методы округления всегда вызываются с одними и теми же параметрами getRightCapacity(weight), getRightSpeed(requiredSpeed)
        - это индикатор того что в них нет вариативности, их код можно просто в getTransport включить.

        Округление вот оно все, 10 и 500 можно константами перед округлением определить:
        int neededSpeed = (city.getDistanceKm()/time);
        int newVehicleSpeed = neededSpeed % 10 == 0 ? neededSpeed : neededSpeed - neededSpeed % 10 + 10;
        int newVehiclecapacity = weight % 500 == 0 ? weight :weight - weight % 500 + 500 ;

        Ну и тернарник в данном случае немного запутывает, хотя, если методы округления убрать, то может будет полегче.
        Сравните с вариантом:
        if (neededSpeed<=40 && city.isOnWater()) return new Ship(SHIP_NAME, newVehiclecapacity, newVehicleSpeed, SHIP_COST);
         if(neededSpeed>120 && city.hasAirport()) return new Plane(PLANE_NAME, newVehiclecapacity, newVehicleSpeed, PLANE_COST);
         return new Truck(TRUCK_NAME, newVehiclecapacity, newVehicleSpeed, TRUCK_COST);

        И плюс шесть строк определят константы (Spring позволит их читать из настроек)*/


public class TransportFactoryAnotherTry {

    public Transport getTransport(City city, int weight, int hours){

        int requiredSpeed = city.getDistanceKm()/hours;

        int ten = 10;
        int roundedSpeed = requiredSpeed % ten == 0 ? requiredSpeed
                        : requiredSpeed - requiredSpeed % ten + ten;
        int five = 500;
        int roundedCapacity = weight % five == 0 ? weight
                        : weight - weight % five + five;

        return requiredSpeed < 40 && city.isOnWater() ? getShip(roundedCapacity, roundedSpeed)
                : requiredSpeed > 120 && city.isHasAirport() ? getPlane(roundedCapacity, roundedSpeed)
                : getTruck(roundedCapacity, roundedSpeed);
    }


    private Transport getTruck (int capacity, int speed ){

        final float costOfKm = 2.5f;
        final String trackName = "Автопоезд 'Mad Max'";

        return new Truck(trackName,capacity, speed, costOfKm);
    }

    private Transport getShip (int capacity, int speed ){

        final float costOfKm = 1.7f;
        String shipName = "Сухогруз 'Доктор наук профессор Шварценгольд'";

        return new Ship(shipName,capacity, speed, costOfKm);
    }

    private Transport getPlane (int capacity, int speed ){

        final float costOfKm = 7.8f;
        String airplaneName = "Грузовой самолёт 'Сибирский буревестник'";

        return new Plane(airplaneName,capacity, speed, costOfKm);
    }


}

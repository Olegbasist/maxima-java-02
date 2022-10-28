package org.example;
//

public class Plane extends Transport{

    // Подсчёт стоимости перевозки
    public float getPrice(City city){
        if (city.isHasAirport()) {
            return (getCostOfKm() * city.getDistanceKm());
        }
        else {
            return 0;
        }

    }




}

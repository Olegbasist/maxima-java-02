package org.example;

//  22.09.2022 Описать Интерфейс Repairable
//  с методами void startRepair(), void finishRepair(), boolean isRepairing().
//  Все виды транспорта должны реализовывать этот интерфейс.


public interface Repairable {

    void startRepair();
    void finishRepair();
    boolean isRepairing();
}

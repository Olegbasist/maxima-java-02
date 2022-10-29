package org.example;

// TODO: 22.09.2022 Описать Интерфейс Repairable
//  с методами void startRepair(), void finishRepair(), boolean isRepairing().
//  Все виды транспорта должны реализовывать этот интерфейс.


public interface Repairable {

    public abstract void startRepair();
    public abstract void finishRepair();
    public abstract boolean isRepairing();
}

package devices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Device implements Observable {
    public abstract void printStatus();
    public abstract void operate();
    public abstract String getName();
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    protected int getInp() {
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }

    protected List<Observer> observers = new ArrayList<>();
}

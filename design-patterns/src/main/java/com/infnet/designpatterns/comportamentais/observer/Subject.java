package com.infnet.designpatterns.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public Subject() {
    }

    public Subject(List<Observer> observers, int state) {
        this.observers = observers;
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for(Observer observer: observers) {
            observer.update();
        }
    }
}

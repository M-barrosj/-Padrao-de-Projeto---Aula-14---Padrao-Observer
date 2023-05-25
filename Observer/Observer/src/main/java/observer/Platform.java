/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JCMB
 */
public class Platform {
    private List<IObserver> observers = new ArrayList<>();

    public void attach(IObserver observer) {
        observers.add(observer);
    }

    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String movie) {
        for (IObserver observer : observers) {
            observer.update(movie);
        }
    }

    public void addMovie(String movie) {
        notifyObservers(movie);
    }
}
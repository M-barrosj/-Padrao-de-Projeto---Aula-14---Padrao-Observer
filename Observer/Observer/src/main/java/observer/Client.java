/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.List;

/**
 *
 * @author JCMB
 */
public class Client implements IObserver{
    private String name;
    private List<String> favoriteGenres;

    public Client(String name, List<String> favoriteGenres) {
        this.name = name;
        this.favoriteGenres = favoriteGenres;
    }

    @Override
    public void update(String movie) {
        System.out.println("Notificação para cliente " + name + ": Novo filme adicionado: " + movie);
    }

    public void setFavoriteGenres(List<String> favoriteGenres) {
        this.favoriteGenres = favoriteGenres;
    }

    public List<String> getFavoriteGenres() {
        return favoriteGenres;
    }
}
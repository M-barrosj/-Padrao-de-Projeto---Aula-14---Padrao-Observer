/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author JCMB
 */
public class MovieGenre implements IObserver{
    private String genre;

    public MovieGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void update(String movie) {
        System.out.println("Novo filme adicionado ao genero " + genre + ": " + movie);
    }
}
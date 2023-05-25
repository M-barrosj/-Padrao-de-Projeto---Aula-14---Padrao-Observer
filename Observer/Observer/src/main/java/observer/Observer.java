/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 *
 * @author JCMB
 */
public class Observer {
    public static void main(String[] args) {
        Platform platform = new Platform();

        MovieGenre actionGenre = new MovieGenre("Ação");
        MovieGenre comedyGenre = new MovieGenre("Comedia");
        MovieGenre horrorGenre = new MovieGenre("Terror");
        MovieGenre animeGenre = new MovieGenre("Anime");
        MovieGenre sciFiGenre = new MovieGenre("Sci-Fi");

        platform.attach(actionGenre);
        platform.attach(comedyGenre);
        platform.attach(horrorGenre);
        platform.attach(animeGenre);
        platform.attach(sciFiGenre);

        Client client1 = new Client("John", new ArrayList<>());
        Client client2 = new Client("Alice", new ArrayList<>());
        Client client3 = new Client("Bob", new ArrayList<>());
        Client client4 = new Client("Emily", new ArrayList<>());
        Client client5 = new Client("Mike", new ArrayList<>());

        client1.setFavoriteGenres(Arrays.asList("Ação", "Sci-Fi"));
        client2.setFavoriteGenres(Arrays.asList("Comedia", "Anime"));
        client3.setFavoriteGenres(Collections.singletonList("Terror"));
        client4.setFavoriteGenres(Collections.singletonList("Sci-Fi"));
        client5.setFavoriteGenres(Arrays.asList("Açao", "Terror"));

        platform.attach(client1);
        platform.attach(client2);
        platform.attach(client3);
        platform.attach(client4);
        platform.attach(client5);

        platform.addMovie("Avengers: Endgame");  // Ação, Sci-Fi
        platform.addMovie("Friends");  // Comedia
        platform.addMovie("The Conjuring");  // Terror
        platform.addMovie("Attack on Titan");  // Anime
        platform.addMovie("Interstellar");  // Sci-Fi
        platform.addMovie("John Wick");  // Açao

        platform.detach(client3);

        platform.addMovie("Saw");  // Terror
        platform.addMovie("Death Note");  // Anime
        platform.addMovie("The Hangover");  // Comedia
    }
}
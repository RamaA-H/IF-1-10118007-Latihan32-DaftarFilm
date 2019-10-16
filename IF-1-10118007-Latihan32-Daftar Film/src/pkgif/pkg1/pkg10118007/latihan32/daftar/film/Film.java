/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan32.daftar.film;

/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menampilkan Daftar Film
 * @author Rama
 */
public class Film {


    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String filmName, String filmGenre, double filmRating, int filmDuration) {
        System.out.printf("%nJudul Film\t: %s%n", filmName);
        System.out.printf("Genre Film\t: %s%n", filmGenre);
        System.out.printf("Rating Film\t: %.1f%n", filmRating);
        System.out.printf("Duration Film\t: %d menit%n", filmDuration);
    }
}

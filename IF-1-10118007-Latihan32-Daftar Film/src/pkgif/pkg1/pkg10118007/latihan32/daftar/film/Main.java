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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film nonton = new Film();

        System.out.println("===Daftar Film Sedang Tayang===");
        nonton.nowPlaying("Venom", "Action, Horror, Scifi", 8.5, 120);
        nonton.nowPlaying("Small Foot", "Animation", 9.0, 96);
        nonton.nowPlaying("Crazy Rich Asian", "Comedy", 7.8, 119);
        nonton.nowPlaying("Asih", "Horror", 6.0, 100);
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lake;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Liseth
 */
public final class Song {

    private final Frog frog = new Frog();
    private final Cricket cricket = new Cricket();
    private final Dragonfly dragon = new Dragonfly();
    private List<List<String>> songs;

    public Song() {
        songs = new ArrayList<>();
        songs.add(song1());
        songs.add(song2());
        songs.add(song3());
    }

    public String Sing(String sound) {
        try {
            if (shouldExit(sound)) {
                return "";
            }
            for (List<String> i : songs) {
                int pos = containPosition(i, sound) + 1;
                if (pos > 0) {
                    return remainingSounds(i, pos);
                }
            }
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return "";

    }

    public boolean shouldExit(String sound) {
        return sound.equals(frog.sound(2)) || sound.equals(frog.sound(3));
    }

    public int containPosition(List<String> song, String sound) {
        try {
            for (int i = 0; i < song.size(); i++) {
                if (song.get(i).equals(sound)) {
                    return i;
                }
            }
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return -1;
    }

    public String remainingSounds(List<String> song, int pos) {
        String rem = "";
        try {
            for (int i = pos; i < song.size(); i++) {
                rem += song.get(i);
                if (notLastElement(i, song.size() - 1)) {
                    rem += ", ";
                }
            }
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return rem;
    }

    public boolean notLastElement(int pos, int tam) {
        return pos != tam;
    }

    public List<String> song1() {
        List<String> song1 = new ArrayList<>();
        try {
            song1.add(frog.sound(0));
            song1.add(dragon.sound(0));
            song1.add(cricket.sound(0));
            song1.add(frog.sound(2));
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return song1;
    }

    public List<String> song2() {
        List<String> song2 = new ArrayList<>();
        try {
            song2.add(dragon.sound(2));
            song2.add(frog.sound(1));
            song2.add(cricket.sound(1));
            song2.add(frog.sound(3));
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return song2;
    }

    public List<String> song3() {
        List<String> song3 = new ArrayList<>();
        try {
            song3.add(cricket.sound(2));
            song3.add(dragon.sound(1));
            song3.add(cricket.sound(0));
            song3.add(frog.sound(2));
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return song3;
    }

    public List<List<String>> getSongs() {
        return songs;
    }

    public void setSongs(List<List<String>> songs) {
        this.songs = songs;
    }

}

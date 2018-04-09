/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lake;

/**
 *
 * @author Liseth
 */
public class Animal {

    protected String[] Sounds;

    public String sound(int i) {
        return Sounds[i];
    }

    public String[] getSounds() {
        return Sounds;
    }

    public void setSounds(String[] Sounds) {
        this.Sounds = Sounds;
    }

}

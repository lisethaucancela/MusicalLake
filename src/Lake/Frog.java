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
public class Frog extends Animal {

    public Frog() {
        this.setSounds(new String[4]);
        this.getSounds()[0] = "brr";
        this.getSounds()[1] = "birip";
        this.getSounds()[2] = "brrah";
        this.getSounds()[3] = "croac";
    }

}

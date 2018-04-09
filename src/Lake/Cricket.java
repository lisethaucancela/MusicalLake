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
public class Cricket extends Animal {
    
    public Cricket() {
        this.setSounds(new String[3]);
        this.getSounds()[0] = "cric-cric";
        this.getSounds()[1] = "trri-trri";
        this.getSounds()[2] = "bri-bri";
    }
    
}

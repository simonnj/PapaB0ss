/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly;

import java.util.Random;

/**
 *
 * @author erso
 */
public class Die 
{
    private static Random generator = new Random();
    private int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public Die() {
        this(6);
    }
    
    public int roll(){
        return generator.nextInt(sides) + 1;
    }
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author erso
 */
public class Dice {

    private Die die1;
    private Die die2;
    private int roll1;
    private int roll2;

    public Dice() {
        die1 = new Die(6);
        die2 = new Die(6);
    }
    
    public int roll(){
        roll1 = die1.roll();
        roll2 = die2.roll();
        return roll1 + roll2;
    }
    
    public boolean isEqual(){
        return roll1 == roll2;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dice dice = new Dice();
        for(int i = 0; i < 20; i++){
            System.out.print("roll: " + dice.roll());
            System.out.println("\t" + dice.isEqual());
        }
                
    }
    
}

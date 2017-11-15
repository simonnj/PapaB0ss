
package monopoly_2_for_fx;

import monopoly.Player;

/**
 *
 * @author erso
 */
public abstract class OwnebleField implements FieldInterface{
    private String[] FIELD_NAMES =
    {
        "Start", "Rødovrevej", "Prøv lykken", "Hvidovrevej", "Indkomstskat", "Øresund A/S",
        "Roskildevej", "?", "Valby Langgade", "Allégade", "Fængsel", "Frederiksberg Allé", "Tuborg",
        "Büllowsvej", "Gl. Kongevej", "D.F.D.S A/S", "Bernstorffsvej", "?", "Hellerupvej", "Strandvejen",
        "Parkering", "Trianglen", "?", "Østerbrogade", "Grønningen", "Ø.K. A/S", "Bredgade",
        "Kgs Nytorv", "Carlsberg", "Østergade", "Gå i Fængsel!", "Amagertorv", "Vimmelskaftet", "?", "Nygade",
        "D/S Bornholm 1866", "?", "Frederiksberg Allé", "Statsskat", "Rådhuspladsen"
    };
    private int number;
    private int price;
    private Player owner = null;

    protected OwnebleField(String[] name, int number, int price)
    {
        this.FIELD_NAMES = name;
        this.number = number;
        this.price = price;
    }

    //@Override
    public String[] getName(){
        return FIELD_NAMES;
    }

    //@Override
    public int getNumber()
    {
        return number;
    }

    public int getPrice()
    {
        return price;
    }

    public Player getOwner()
    {
        return owner;
    }

    public void setOwner(Player owner)
    {
        this.owner = owner;
    }

    @Override
    public String toString()
    {
        return "OwnebleField{" + "" + FIELD_NAMES + "," + number 
                + "," + price + "," + owner + '}';
    }
    
    
    

}

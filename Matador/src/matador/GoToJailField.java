package monopoly_2_for_fx;

import monopoly.Player;

/**
 *
 * @author erso
 */
public class GoToJailField implements FieldInterface
{

    private String[] FIELD_NAMES;
    private int number;

    public GoToJailField(String [] name, int number)
    {
        this.FIELD_NAMES = name;
        this.number = number;
    }

    @Override
    public String [] getName()
    {
        return FIELD_NAMES;
    }

    @Override
    public int getNumber()
    {
        return number;
    }

    @Override
    public void consequense(Player poorPlayer)
    {
        poorPlayer.setPos(MonopolyConstants.JAIL_POS);
        
    }

    @Override
    public String toString()
    {
        return "GoToJailField{" + "" + FIELD_NAMES + "," + number + '}';
    }
    
    

}

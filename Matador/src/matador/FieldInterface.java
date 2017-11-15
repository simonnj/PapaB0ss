
package monopoly_2_for_fx;

import monopoly.Player;

/**
 *
 * @author erso
 */
public interface FieldInterface
{
    // Disse metoder er underforstået 'public abstract static': 
    String [] getName();
    int getNumber();
    void consequense(Player poorPlayer);
    
}

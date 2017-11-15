package monopoly;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erso
 */
public class Field 
{
   String[] FIELD_NAMES =
    {
        "Start", "Rødovrevej", "Prøv lykken", "Hvidovrevej", "Indkomstskat", "Øresund A/S",
        "Roskildevej", "?", "Valby Langgade", "Allégade", "Fængsel", "Frederiksberg Allé", "Tuborg",
        "Büllowsvej", "Gl. Kongevej", "D.F.D.S A/S", "Bernstorffsvej", "?", "Hellerupvej", "Strandvejen",
        "Parkering", "Trianglen", "?", "Østerbrogade", "Grønningen", "Ø.K. A/S", "Bredgade",
        "Kgs Nytorv", "Carlsberg", "Østergade", "Gå i Fængsel!", "Amagertorv", "Vimmelskaftet", "?", "Nygade",
        "D/S Bornholm 1866", "?", "Frederiksberg Allé", "Statsskat", "Rådhuspladsen"
    };
    private int pos;

    public Field(String [] name, int pos) {
        this.FIELD_NAMES = name;
        this.pos = pos;
    }

    public String [] getName() {
        return FIELD_NAMES;
    }

    public int getPos() {
        return pos;
    }

    @Override
    public String toString() {
        return "Field{" + "" + FIELD_NAMES + ", " + pos + '}';
    }
    
    

}

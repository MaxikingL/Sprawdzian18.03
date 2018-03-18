package obiad.dodatki;

import obiad.Obiad;

public class Frytki extends dodatki {
    Obiad obiad;

    public Frytki(){ this.obiad=obiad;}


    @Override
    public String pobierzOpis() {
        return "frytki";
    }

    @Override
    public double koszt() {return  2.00;
    }
}


package obiad.dodatki;

import obiad.Obiad;

public class Surówki extends dodatki {
    Obiad obiad;

    public Surówki(){this.obiad=obiad;}

    @Override
    public String pobierzOpis() {
        return " 3 rodzaje surowki";
    }

    @Override
    public double koszt() {
        return 4.00;
    }
}

package obiad.dodatki;

import obiad.Obiad;

public  class Sos extends dodatki {
    Obiad obiad;

    public Sos(){this.obiad=obiad;}

    @Override
    public String pobierzOpis() {
        return "sos" ;
    }

    @Override
    public double koszt() {
        return 1.00;
    }
}

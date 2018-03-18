package obiad.dodatki;

import obiad.Obiad;

public class Ziemniaki extends dodatki {
    Obiad obiad;

    public  Ziemniaki(Obiad obiad){this.obiad=obiad;}

    @Override
    public String pobierzOpis() {
        return "ziemniaki";
    }

    @Override
    public double koszt() {
        return 5.00;
    }
}

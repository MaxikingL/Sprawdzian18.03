package obiad.obiad;

import obiad.Obiad;

public class Schabowy extends Obiad {
    @Override
    public String pobierzOpis() {
        return "Schabowy";
    }

    @Override
    public double koszt() {
        return 15.00;
    }
}

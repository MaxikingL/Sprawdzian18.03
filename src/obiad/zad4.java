package obiad;

import obiad.dodatki.Frytki;
import obiad.dodatki.Sos;
import obiad.dodatki.Surówki;
import obiad.dodatki.dodatki;
import obiad.obiad.Dorsz;
import obiad.obiad.Mielony;
import obiad.obiad.Schabowy;

public class zad4 {

    public static void main(String[] args) {



        Obiad mielony = new Mielony();
        Obiad dorsz = new Dorsz();

        Obiad schabowy = new Schabowy();
        Obiad frytki = new Frytki();
        Obiad surowka = new Surówki();
        Obiad sos = new Sos();


        System.out.println(schabowy.pobierzOpis()+" + "+frytki.pobierzOpis()+" + "
                + surowka.pobierzOpis()+" + "+ sos.pobierzOpis());

        System.out.println();


        System.out.println(frytki.koszt()+schabowy.koszt()+surowka.koszt()+sos.koszt()+" zł");





    }



}

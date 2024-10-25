package presentation;

import dao.IDaoImpl;
import metier.IMerier;
import metier.MetierImpl;

public class pres {

    public static void main(String[] args) {

        /*
        - injec des dep = creer objet de la class doaimpl et metieimpl et on fait l'assosiation entre les deux objets
         */

        //injectio via setter
        IDaoImpl d = new IDaoImpl();
        MetierImpl metier = new MetierImpl();

        metier.setDao(d); // inject des dep vie setter
        //si on veut le faire avec le constructeur >>         MetierImpl metier = new MetierImpl(d);

        System.out.println("Res = " + metier.calcul());




    }
}

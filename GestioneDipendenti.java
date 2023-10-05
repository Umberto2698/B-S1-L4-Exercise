import dipendentiAziendali.Dipartimento;
import dipendentiAziendali.Dipendente;
import dipendentiAziendali.Livello;

import static dipendentiAziendali.Dipendente.calcolaPaga;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(1, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(2, Dipartimento.PRODUZIONE);
        Dipendente dipendente3 = new Dipendente(3, 1500, 40, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZONE);
        Dipendente dipendente4 = new Dipendente(4, 2500, 50, Livello.DIRIGENTE, Dipartimento.VENDITE);

        System.out.println(dipendente1.promuovi());
        System.out.println(dipendente3.promuovi());

        Dipendente[] listaDipendenti = {dipendente1, dipendente2, dipendente3, dipendente4};
        double sommaStipendi = 0;
        for (Dipendente dipendente : listaDipendenti) {
            System.out.println(dipendente.stampaDatiDipendente());
            sommaStipendi += calcolaPaga(dipendente, 5);
        }
        System.out.println("Le spese totali relativi agli stipendi di questo mese ammontano a " + sommaStipendi);
    }
}

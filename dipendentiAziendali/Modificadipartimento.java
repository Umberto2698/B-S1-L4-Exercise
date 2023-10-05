package dipendentiAziendali;

class Modificadipartimento extends Dipendente {

    public Modificadipartimento(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    public Modificadipartimento(double stipendioBase, int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        super(stipendioBase, matricola, stipendio, importoOrarioStraordinario, livello, dipartimento);
    }


}

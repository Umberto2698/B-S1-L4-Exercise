package dipendentiAziendali;

class Modificadipartimento extends Dipendente {

    public Modificadipartimento(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    public Modificadipartimento(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        super(matricola, stipendio, importoOrarioStraordinario, livello, dipartimento);
    }


}

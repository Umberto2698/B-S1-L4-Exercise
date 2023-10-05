package dipendentiAziendali;

public class Dipendente {
    private double stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
        this.dipartimento = dipartimento;
    }

    public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public static double calcoloPaga(Dipendente dipendente) {
        return dipendente.stipendio;
    }

    public static double calcolaPaga(Dipendente dipendente, int straordinari) {
        return dipendente.stipendio + straordinari * dipendente.importoOrarioStraordinario;
    }

    public String stampaDatiDipendente() {
        return "dipendentiAziendali.Dipendente{" +
                "stipendioBase=" + stipendioBase + ", " +
                "matricola=" + matricola + ", " +
                "stipendio=" + stipendio + ", " +
                "importoOrarioStraordinario=" + importoOrarioStraordinario + ", " +
                "livello=" + livello + ", " +
                "dipartimento=" + dipartimento +
                '}';
    }

    public Livello promuovi() {
        if (this.livello == Livello.OPERAIO) {
            this.livello = Livello.IMPIEGATO;
            this.stipendio = this.stipendio == stipendioBase ? stipendioBase * 1.2 : this.stipendio * 1.2;
        } else if (this.livello == Livello.IMPIEGATO) {
            this.livello = Livello.QUADRO;
            this.stipendio = this.stipendio == stipendioBase ? stipendioBase * 1.5 : this.stipendio * 1.5;
        } else if (this.livello == Livello.QUADRO) {
            this.livello = Livello.DIRIGENTE;
            this.stipendio = this.stipendio == stipendioBase ? stipendioBase * 2 : this.stipendio * 2;
        } else {
            System.out.println("Il dipendente è il ditigente e non può essere promosso.");
        }
        return this.livello;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatriola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }
}

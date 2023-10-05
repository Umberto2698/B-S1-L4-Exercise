package dipendentiAziendali;

public class ModificaDipartimento {

    private Dipartimento dipartimento;

    public ModificaDipartimento(Dipendente dipendente) {
        this.dipartimento = dipendente.getDipartimento();
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}

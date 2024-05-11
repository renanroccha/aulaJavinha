public class AlunoPos extends Aluno{
    private Double notaArtigo;

    public AlunoPos(String nome, String ra, Double notaContinua, Double notaEntrega, Double notaArtigo) {
        super(nome, ra, notaContinua, notaEntrega);
        this.notaArtigo = notaArtigo;
    }

    public Double getNotaArtigo() {
        return notaArtigo;
    }

    public void setNotaArtigo(Double notaArtigo) {
        this.notaArtigo = notaArtigo;
    }


    @Override
    public Double calcularNotaFinal() {
     return notaArtigo + super.getNotaContinua() + notaEntrega;
    }


    @Override
    public String toString() {
        return "AlunoPos{" +
                "notaArtigo=" + notaArtigo +
                ", notaContinua=" + notaContinua +
                ", notaEntrega=" + notaEntrega +
                '}';
    }
}

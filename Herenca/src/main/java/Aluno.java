public class Aluno {


    private String nome;
    private String ra;
    protected Double notaContinua;
    protected Double notaEntrega;


    public Aluno(String nome, String ra, Double notaContinua, Double notaEntrega) {
        this.nome = nome;
        this.ra = ra;
        this.notaContinua = notaContinua;
        this.notaEntrega = notaEntrega;
    }


    public Double calcularNotaFinal() {
        return notaContinua + notaEntrega;
    }

    public void apresentarSprint(){
        System.out.println("Apresentar Sprint");
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Double getNotaContinua() {
        return notaContinua;
    }

    public void setNotaContinua(Double notaContinua) {
        this.notaContinua = notaContinua;
    }

    public Double getNotaEntrega() {
        return notaEntrega;
    }

    public void setNotaEntrega(Double notaEntrega) {
        this.notaEntrega = notaEntrega;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                ", notaContinua=" + notaContinua +
                ", notaEntrega=" + notaEntrega +
                '}';
    }
}
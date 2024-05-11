public class Contato {

    private String nome;
    private String telefone;
    private Boolean bloqueado;


    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }




    public void bloqueado(){
        bloqueado = true;
    }

    public void desbloqueado(){
        bloqueado = false;
    }


    public Boolean getBloqueado() {
        return bloqueado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return
                """
                        nome %s
                        telefone %s
                        bloqueado %b
                        """.formatted(nome,telefone,bloqueado);


    }








}







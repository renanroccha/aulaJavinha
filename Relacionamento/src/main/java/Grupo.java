
import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private String nome;
    private List<Contato> contatos;


    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }

    public List<Contato> buscarContatoNome(String nome){
        List<Contato> contatosEncontrado = new ArrayList<>();
       for (Contato contatoDaVez : contatos){
            if (contatoDaVez.getNome().contains(nome)){
               contatosEncontrado.add(contatoDaVez);
            }
        }
        return contatosEncontrado;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }


    @Override
    public String toString() {
        return """
                
                Nome: %s
                contatos %s
                """.formatted(nome , contatos);
    }
}

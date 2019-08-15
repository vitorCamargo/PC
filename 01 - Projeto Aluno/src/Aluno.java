/* @author Vitor */
public class Aluno {
    
    private String nome;
    private String curso;
    private String cidade;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void Cadastrar(String nome, String curso, String cidade, int idade) {
        setNome(nome);
        setCurso(curso);
        setCidade(cidade);
        setIdade(idade);
    }
    
    public String Exibir() {
        String r = "<html>Nome: " + getNome()
                + "<br/>Curso: " + getCurso()
                + "<br/>Cidade: " + getCidade()
                + "<br/>Idade: " + getIdade() + "</html>";
        
        return r;
    }
}
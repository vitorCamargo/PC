/* @author Vitor */
public class Professor extends Pessoa {
    private String formacao;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public void cadastrar(String nome, int idade, char sexo, String formacao) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setFormacao(formacao);
    }
    
    public String exibir() {
        String result = "Nome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nSexo: " + getSexo()
                + "\nFormação: " + getFormacao();
        return result;
    }
}
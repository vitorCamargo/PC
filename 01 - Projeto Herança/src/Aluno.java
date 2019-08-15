/* @author Vitor */
public class Aluno extends Pessoa {
    
    private int matricula;
    private float nota[] = new float[2];

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float[] getNota() {
        return nota;
    }

    public void setNota(float[] nota) {
        this.nota = nota;
    }
    
    public void cadastrar(String nome, int idade, char sexo, int matricula, float nota[]) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setMatricula(matricula);
        setNota(nota);
    }
    
    public String exibir() {
        String result = "Nome: " + getNome() 
                + "\nIdade: " + getIdade()
                + "\nSexo: " + getSexo()
                + "\nMatricula: " + getMatricula()
                + "\nMedia: " + calcularMedia();
        return result;
    }
    
    private float calcularMedia() {
        float media = (this.nota[0] + this.nota[1]) / 2;
        return media;
    }
}
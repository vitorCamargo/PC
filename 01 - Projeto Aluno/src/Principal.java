/* @author Vitor */
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        
        String nome = JOptionPane.showInputDialog("Digite seu Nome: ");
        String curso = JOptionPane.showInputDialog("Digite seu Curso: ");
        String cidade = JOptionPane.showInputDialog("Digite seu Cidade: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade: "));
        
        aluno.Cadastrar(nome, curso, cidade, idade);
        aluno.Exibir();
        
        JOptionPane.showMessageDialog(null, aluno.Exibir());
    }
}
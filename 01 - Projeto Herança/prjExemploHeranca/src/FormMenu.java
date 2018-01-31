/* @author Vitor */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FormMenu extends javax.swing.JFrame {

    private static Aluno a;
    private static Professor p;
    
    public FormMenu(Aluno aluno, Professor professor){
        a = aluno;
        p = professor;
        initComponents();
    }
    
    public FormMenu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastrarAluno = new javax.swing.JButton();
        btCadastrarProfessor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCadastrarAluno.setBackground(new java.awt.Color(240, 240, 241));
        btCadastrarAluno.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        btCadastrarAluno.setForeground(new java.awt.Color(102, 102, 102));
        btCadastrarAluno.setText("ALUNO");
        btCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarAlunoActionPerformed(evt);
            }
        });

        btCadastrarProfessor.setBackground(new java.awt.Color(240, 240, 241));
        btCadastrarProfessor.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        btCadastrarProfessor.setForeground(new java.awt.Color(102, 102, 102));
        btCadastrarProfessor.setText("PROFESSOR");
        btCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarProfessorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("SISTEMA DE CADASTRO DE ALUNOS E PROFESSORES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarAlunoActionPerformed
        formCadastrar fr = new formCadastrar();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCadastrarAlunoActionPerformed

    private void btCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarProfessorActionPerformed
        formCadastrarProfessor fr = new formCadastrarProfessor();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCadastrarProfessorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarAluno;
    private javax.swing.JButton btCadastrarProfessor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
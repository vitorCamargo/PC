/* @author Vitor */
import javax.swing.JOptionPane;

public class formCadastrar extends javax.swing.JFrame {
    
    private Aluno a;
    private Professor p;
    
    public formCadastrar() {
        a = new Aluno();
        p = new Professor();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdadeA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbSexoA = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btExibir = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("SISTEMA DE CADASTRO DE ALUNOS");

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel5.setText("Nome:");

        txtNomeA.setFont(new java.awt.Font("Century Schoolbook", 1, 10)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel6.setText("Idade:");

        txtIdadeA.setFont(new java.awt.Font("Century Schoolbook", 1, 10)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel7.setText("Sexo");

        cbSexoA.setFont(new java.awt.Font("Century Schoolbook", 1, 10)); // NOI18N
        cbSexoA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Feminino", "Masculino" }));

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel8.setText("Matrícula");

        txtMatricula.setFont(new java.awt.Font("Century Schoolbook", 1, 10)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel9.setText("Notas:");

        txtNota1.setFont(new java.awt.Font("Century Schoolbook", 1, 10)); // NOI18N

        txtNota2.setFont(new java.awt.Font("Century Schoolbook", 1, 10)); // NOI18N

        btCadastrar.setBackground(new java.awt.Color(240, 240, 241));
        btCadastrar.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(102, 102, 102));
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btExibir.setBackground(new java.awt.Color(240, 240, 241));
        btExibir.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        btExibir.setForeground(new java.awt.Color(102, 102, 102));
        btExibir.setText("EXIBIR");
        btExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirActionPerformed(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(240, 240, 241));
        btVoltar.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(102, 102, 102));
        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbSexoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMatricula))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtIdadeA))
                                .addComponent(txtNomeA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNota2)
                                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExibir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdadeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbSexoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        if(txtNomeA.getText().equals("") || txtIdadeA.getText().equals("") 
                || txtMatricula.getText().equals("") || txtNota1.getText().equals("") 
                || txtNota2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            String nomeA = txtNomeA.getText();
            int idadeA = Integer.parseInt(txtIdadeA.getText());
            char sexoA;
            if(cbSexoA.getSelectedIndex() == 0) {
                sexoA = 'F';
            } else {
                sexoA = 'M';
            }
            int matricula = Integer.parseInt(txtMatricula.getText());
            
            float[] notas;
            notas = new float[2];
            notas[0] = Float.parseFloat(txtNota1.getText());
            notas[1] = Float.parseFloat(txtNota2.getText());
            
            a.cadastrar(nomeA, idadeA, sexoA, matricula, notas);
            JOptionPane.showMessageDialog(null, "Aluno Cadastrado");
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExibirActionPerformed
        if(a == null) {
            JOptionPane.showMessageDialog(null, "Cadastre primeiro");
        } else {
            formExibir fr = new formExibir(a, p);
            fr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btExibirActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        FormMenu fr = new FormMenu(a, p);
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExibir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox cbSexoA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtIdadeA;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNomeA;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    // End of variables declaration//GEN-END:variables
}
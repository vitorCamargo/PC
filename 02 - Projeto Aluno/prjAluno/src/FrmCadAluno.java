/* @author Vitor */
public class FrmCadAluno extends javax.swing.JFrame {

    public FrmCadAluno() {
        initComponents();
        jDBConnection1.connectDB();
        gryAluno.execQuery();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDBLabelCount1 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField1 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBConnection1 = new lib.jdb.connection.JDBConnection();
        gryAluno = new lib.jdb.jdbquery.JDBQuery();
        jDBLabelCount9 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDBTable1 = new lib.jdb.control.jdbtable.JDBTable();
        jDBButtonSave1 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonNew1 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel1 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonDelete1 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonLast1 = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
        jDBButtonNext1 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonPrevious1 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonFirst1 = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        jDBLabelCount2 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField2 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount3 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBSpinner1 = new lib.jdb.control.jdbspinner.JDBSpinner();
        jDBLabelCount4 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField3 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLabelCount5 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount6 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBSpinner2 = new lib.jdb.control.jdbspinner.JDBSpinner();
        jDBComboBox1 = new lib.jdb.control.jdbcombobox.JDBComboBox();

        jDBLabelCount1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLabelCount1.setText("Nome da Marca:");

        jDBTextField1.setBorder(null);
        jDBTextField1.setFieldName("nome");
        jDBTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBTextField1.setName("txtNomeMarca"); // NOI18N

        jDBConnection1.setURL("jdbc:mysql://localhost/bdCurso");
        jDBConnection1.setDriver("com.mysql.jdbc.Driver");
        jDBConnection1.setPassword("minas");
        jDBConnection1.setUserName("root");

        gryAluno.setJDBConnection(jDBConnection1);
        gryAluno.setSQL("select*from aluno");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDBLabelCount9.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jDBLabelCount9.setForeground(new java.awt.Color(102, 102, 102));
        jDBLabelCount9.setText("SISTEMA DE CADASTRO DE ALUNO");

        jDBTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jDBTable1.setJDBQuery(gryAluno);
        jDBTable1.setEditable(false);
        jDBTable1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jDBTable1);

        jDBButtonSave1.setJDBQuery(gryAluno);
        jDBButtonSave1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonSave1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonSave1.setLabel("Savar");

        jDBButtonNew1.setJDBQuery(gryAluno);
        jDBButtonNew1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonNew1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonNew1.setLabel("Novo");
        jDBButtonNew1.setPreferredSize(new java.awt.Dimension(101, 40));

        jDBButtonCancel1.setJDBQuery(gryAluno);
        jDBButtonCancel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonCancel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonCancel1.setLabel("Cancelar");

        jDBButtonDelete1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonDelete1.setText("Deletar");
        jDBButtonDelete1.setJDBQuery(gryAluno);
        jDBButtonDelete1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jDBButtonLast1.setJDBQuery(gryAluno);
        jDBButtonLast1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonLast1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonLast1.setLabel("Último");

        jDBButtonNext1.setJDBQuery(gryAluno);
        jDBButtonNext1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonNext1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonNext1.setLabel("Próximo");

        jDBButtonPrevious1.setJDBQuery(gryAluno);
        jDBButtonPrevious1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonPrevious1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonPrevious1.setLabel("Anterior");

        jDBButtonFirst1.setJDBQuery(gryAluno);
        jDBButtonFirst1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonFirst1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonFirst1.setLabel("Primeiro");

        jDBLabelCount2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLabelCount2.setText("Nome:");

        jDBTextField2.setJDBQuery(gryAluno);
        jDBTextField2.setBorder(null);
        jDBTextField2.setFieldName("nome");
        jDBTextField2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBTextField2.setName("txtNomeMarca"); // NOI18N

        jDBLabelCount3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLabelCount3.setText("Idade:");

        jDBSpinner1.setJDBQuery(gryAluno);
        jDBSpinner1.setBorder(null);
        jDBSpinner1.setFieldName("idade");
        jDBSpinner1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jDBLabelCount4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLabelCount4.setText("Curso:");

        jDBTextField3.setJDBQuery(gryAluno);
        jDBTextField3.setBorder(null);
        jDBTextField3.setFieldName("renda");
        jDBTextField3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBTextField3.setName("txtNomeMarca"); // NOI18N

        jDBLabelCount5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLabelCount5.setText("Renda:");

        jDBLabelCount6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLabelCount6.setText("Ano Cadastro:");

        jDBSpinner2.setJDBQuery(gryAluno);
        jDBSpinner2.setBorder(null);
        jDBSpinner2.setFieldName("ano_cadastro");
        jDBSpinner2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jDBComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Informática", "Nutrição", "Enfermagem", "Eletrotécnica", "Info. Internet", "Química" }));
        jDBComboBox1.setJDBQuery(gryAluno);
        jDBComboBox1.setFieldName("curso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDBButtonFirst1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDBButtonNew1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDBButtonLast1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBButtonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jDBLabelCount9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBLabelCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDBLabelCount9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDBLabelCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBLabelCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBLabelCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBLabelCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBLabelCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDBTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBButtonNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDBButtonDelete1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonLast1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib.jdb.jdbquery.JDBQuery gryAluno;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel1;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete1;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst jDBButtonFirst1;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast jDBButtonLast1;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew1;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext1;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious1;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave1;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox1;
    private lib.jdb.connection.JDBConnection jDBConnection1;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount1;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount2;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount3;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount4;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount5;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount6;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount9;
    private lib.jdb.control.jdbspinner.JDBSpinner jDBSpinner1;
    private lib.jdb.control.jdbspinner.JDBSpinner jDBSpinner2;
    private lib.jdb.control.jdbtable.JDBTable jDBTable1;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField1;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField2;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

/* author Vitor */
public class FrmPrincipal extends javax.swing.JFrame {
    public FrmPrincipal() {
        
        initComponents();
        conexao.connectDB();
        qryJogador.execQuery();
        qryPokemon.execQuery();
        qryPokedex.execQuery();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iFrmJogador = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDBSpinner1 = new lib.jdb.control.jdbspinner.JDBSpinner();
        jDBTextField1 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField2 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBPanelButton1 = new lib.jdb.control.jdbpanelbutton.JDBPanelButton();
        conexao = new lib.jdb.connection.JDBConnection();
        qryJogador = new lib.jdb.jdbquery.JDBQuery();
        iFrmPokemon = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDBTextField3 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBComboBox1 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        jDBPanelButton2 = new lib.jdb.control.jdbpanelbutton.JDBPanelButton();
        qryPokemon = new lib.jdb.jdbquery.JDBQuery();
        iFrmPokedex = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDBPanelButton3 = new lib.jdb.control.jdbpanelbutton.JDBPanelButton();
        jDBTextField4 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBSpinner2 = new lib.jdb.control.jdbspinner.JDBSpinner();
        jDBSpinner3 = new lib.jdb.control.jdbspinner.JDBSpinner();
        jDBSpinner4 = new lib.jdb.control.jdbspinner.JDBSpinner();
        jDBLookUpComboBox1 = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        jDBLookUpComboBox2 = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        qryPokedex = new lib.jdb.jdbquery.JDBQuery();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        iFrmJogador.setTitle("CADASTRO DE JOGADOR");
        iFrmJogador.setVisible(true);

        jLabel1.setText("Nome:");

        jLabel3.setText("Idade:");

        jLabel4.setText("País:");

        jDBSpinner1.setJDBQuery(qryJogador);
        jDBSpinner1.setFieldName("idade");

        jDBTextField1.setJDBQuery(qryJogador);
        jDBTextField1.setFieldName("nome");

        jDBTextField2.setJDBQuery(qryJogador);
        jDBTextField2.setFieldName("pais");

        jDBPanelButton1.setJDBQuery(qryJogador);

        javax.swing.GroupLayout iFrmJogadorLayout = new javax.swing.GroupLayout(iFrmJogador.getContentPane());
        iFrmJogador.getContentPane().setLayout(iFrmJogadorLayout);
        iFrmJogadorLayout.setHorizontalGroup(
            iFrmJogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrmJogadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iFrmJogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iFrmJogadorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jDBTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(iFrmJogadorLayout.createSequentialGroup()
                        .addGroup(iFrmJogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(iFrmJogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDBPanelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        iFrmJogadorLayout.setVerticalGroup(
            iFrmJogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrmJogadorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(iFrmJogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jDBTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(iFrmJogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jDBSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(iFrmJogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jDBTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jDBPanelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        conexao.setURL("jdbc:mysql://localhost/bdPokemonGO");
        conexao.setDriver("com.mysql.jdbc.Driver");
        conexao.setPassword("minas");
        conexao.setUserName("root");

        qryJogador.setJDBConnection(conexao);
        qryJogador.setSQL("select*from jogador");

        iFrmPokemon.setTitle("CADASTRO DE POKEMON");
        iFrmPokemon.setVisible(true);

        jLabel2.setText("Nome:");

        jLabel5.setText("Tipo:");

        jDBTextField3.setJDBQuery(qryPokemon);
        jDBTextField3.setFieldName("nome");

        jDBComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inseto", "Planta", "Poison", "Voador", "Ground", "Fogo", "Água", "Elétrico", "Lutador", "Normal", "Fantasma", "Fada", "Dragão", "Dark", "Gelo" }));
        jDBComboBox1.setJDBQuery(qryPokemon);
        jDBComboBox1.setEditable(true);
        jDBComboBox1.setFieldName("tipo");

        jDBPanelButton2.setJDBQuery(qryPokemon);

        javax.swing.GroupLayout iFrmPokemonLayout = new javax.swing.GroupLayout(iFrmPokemon.getContentPane());
        iFrmPokemon.getContentPane().setLayout(iFrmPokemonLayout);
        iFrmPokemonLayout.setHorizontalGroup(
            iFrmPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrmPokemonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iFrmPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iFrmPokemonLayout.createSequentialGroup()
                        .addGroup(iFrmPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(iFrmPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDBPanelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        iFrmPokemonLayout.setVerticalGroup(
            iFrmPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrmPokemonLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(iFrmPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jDBTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(iFrmPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jDBComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jDBPanelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        qryPokemon.setJDBConnection(conexao);
        qryPokemon.setSQL("select*from pokemon");

        iFrmPokedex.setTitle("POKEDEX");
        iFrmPokedex.setVisible(true);

        jLabel6.setText("Apelido:");

        jLabel7.setText("HP:");

        jLabel8.setText("Candy:");

        jLabel9.setText("CP:");

        jLabel10.setText("Jogador:");

        jLabel11.setText("Pokemon:");

        jDBPanelButton3.setJDBQuery(qryPokedex);

        jDBTextField4.setJDBQuery(qryPokedex);
        jDBTextField4.setFieldName("apelido");
        jDBTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField4ActionPerformed(evt);
            }
        });

        jDBSpinner2.setJDBQuery(qryPokedex);
        jDBSpinner2.setFieldName("hp");

        jDBSpinner3.setJDBQuery(qryPokedex);
        jDBSpinner3.setFieldName("candy");

        jDBSpinner4.setJDBQuery(qryPokedex);
        jDBSpinner4.setFieldName("cp");

        jDBLookUpComboBox1.setJDBListQuery(qryJogador);
        jDBLookUpComboBox1.setJDBQuery(qryPokedex);
        jDBLookUpComboBox1.setInvisibleFields("id\nidade\npais");
        jDBLookUpComboBox1.setKeyField("jogador_id");
        jDBLookUpComboBox1.setKeyListField("id");

        jDBLookUpComboBox2.setJDBListQuery(qryPokemon);
        jDBLookUpComboBox2.setJDBQuery(qryPokedex);
        jDBLookUpComboBox2.setInvisibleFields("id");
        jDBLookUpComboBox2.setKeyField("pokemon_id");
        jDBLookUpComboBox2.setKeyListField("id");

        javax.swing.GroupLayout iFrmPokedexLayout = new javax.swing.GroupLayout(iFrmPokedex.getContentPane());
        iFrmPokedex.getContentPane().setLayout(iFrmPokedexLayout);
        iFrmPokedexLayout.setHorizontalGroup(
            iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrmPokedexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDBPanelButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(iFrmPokedexLayout.createSequentialGroup()
                        .addGroup(iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDBTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(iFrmPokedexLayout.createSequentialGroup()
                        .addGroup(iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iFrmPokedexLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18))
                            .addGroup(iFrmPokedexLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(22, 22, 22)))
                        .addGroup(iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDBLookUpComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBLookUpComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        iFrmPokedexLayout.setVerticalGroup(
            iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrmPokedexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jDBTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jDBSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jDBSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jDBSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jDBLookUpComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(iFrmPokedexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jDBLookUpComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jDBPanelButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        qryPokedex.setJDBConnection(conexao);
        qryPokedex.setSQL("select*from lista_pokemon");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setResizable(false);
        setState(6);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setName("dskPrincipal"); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastrar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Jogador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Pokemon");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Lista");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        iFrmJogador.setVisible(true);
        jDesktopPane1.add(iFrmJogador);
        iFrmJogador.setSize(593, 231);
        iFrmJogador.toFront();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        iFrmPokemon.setVisible(true);
        jDesktopPane1.add(iFrmPokemon);
        iFrmPokemon.setSize(593, 196);
        iFrmPokemon.toFront();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jDBTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        iFrmPokedex.setVisible(true);
        jDesktopPane1.add(iFrmPokedex);
        iFrmPokedex.setSize(593, 337);
        iFrmPokedex.toFront();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib.jdb.connection.JDBConnection conexao;
    private javax.swing.JInternalFrame iFrmJogador;
    private javax.swing.JInternalFrame iFrmPokedex;
    private javax.swing.JInternalFrame iFrmPokemon;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox1;
    private lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox jDBLookUpComboBox1;
    private lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox jDBLookUpComboBox2;
    private lib.jdb.control.jdbpanelbutton.JDBPanelButton jDBPanelButton1;
    private lib.jdb.control.jdbpanelbutton.JDBPanelButton jDBPanelButton2;
    private lib.jdb.control.jdbpanelbutton.JDBPanelButton jDBPanelButton3;
    private lib.jdb.control.jdbspinner.JDBSpinner jDBSpinner1;
    private lib.jdb.control.jdbspinner.JDBSpinner jDBSpinner2;
    private lib.jdb.control.jdbspinner.JDBSpinner jDBSpinner3;
    private lib.jdb.control.jdbspinner.JDBSpinner jDBSpinner4;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField1;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField2;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField3;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private lib.jdb.jdbquery.JDBQuery qryJogador;
    private lib.jdb.jdbquery.JDBQuery qryPokedex;
    private lib.jdb.jdbquery.JDBQuery qryPokemon;
    // End of variables declaration//GEN-END:variables
}
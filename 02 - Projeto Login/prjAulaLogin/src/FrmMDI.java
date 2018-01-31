/* @author Vitor */
public class FrmMDI extends javax.swing.JFrame {

    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public FrmMDI() {
        initComponents();
        conexao.connectDB();
        qryLogin.execQuery();
        qryCliente.execQuery();
        qryMarca.execQuery();
        qryProduto.execQuery();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iFrmUsuario = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDBTextField1 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField2 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField3 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBCheckBox1 = new lib.jdb.control.jdbcheckbox.JDBCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDBTable1 = new lib.jdb.control.jdbtable.JDBTable();
        jDBPanelButton1 = new lib.jdb.control.jdbpanelbutton.JDBPanelButton();
        iFrmCliente = new javax.swing.JInternalFrame();
        jDBPanelButton2 = new lib.jdb.control.jdbpanelbutton.JDBPanelButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDBTextField7 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField9 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel10 = new javax.swing.JLabel();
        jDBTextField10 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel11 = new javax.swing.JLabel();
        jDBTextField11 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel12 = new javax.swing.JLabel();
        jDBComboBox1 = new lib.jdb.control.jdbcombobox.JDBComboBox();
        jDBSpinner1 = new lib.jdb.control.jdbspinner.JDBSpinner();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jDBTable3 = new lib.jdb.control.jdbtable.JDBTable();
        iFrmMarca = new javax.swing.JInternalFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jDBTextField4 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDBTable2 = new lib.jdb.control.jdbtable.JDBTable();
        jDBPanelButton3 = new lib.jdb.control.jdbpanelbutton.JDBPanelButton();
        iFrmProduto = new javax.swing.JInternalFrame();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jDBTextField8 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField12 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel19 = new javax.swing.JLabel();
        jDBTextArea1 = new lib.jdb.control.jdbtextarea.JDBTextArea();
        jLabel21 = new javax.swing.JLabel();
        jDBTextField16 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jLabel22 = new javax.swing.JLabel();
        jDBLookUpComboBox1 = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        jDBSpinner2 = new lib.jdb.control.jdbspinner.JDBSpinner();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jDBTable4 = new lib.jdb.control.jdbtable.JDBTable();
        jDBPanelButton4 = new lib.jdb.control.jdbpanelbutton.JDBPanelButton();
        conexao = new lib.jdb.connection.JDBConnection();
        qryLogin = new lib.jdb.jdbquery.JDBQuery();
        qryCliente = new lib.jdb.jdbquery.JDBQuery();
        qryMarca = new lib.jdb.jdbquery.JDBQuery();
        qryProduto = new lib.jdb.jdbquery.JDBQuery();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jUsuario = new javax.swing.JMenuItem();
        jCliente = new javax.swing.JMenuItem();
        jMarca = new javax.swing.JMenuItem();
        jProduto = new javax.swing.JMenuItem();

        iFrmUsuario.setClosable(true);
        iFrmUsuario.setTitle("Cadastro de Usuário");
        iFrmUsuario.setVisible(true);

        jTabbedPane1.setToolTipText("Cadastro");
        jTabbedPane1.setInheritsPopupMenu(true);

        jLabel1.setText("Login:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Senha:");

        jDBTextField1.setJDBQuery(qryLogin);
        jDBTextField1.setFieldName("nome");

        jDBTextField2.setJDBQuery(qryLogin);
        jDBTextField2.setFieldName("login");

        jDBTextField3.setJDBQuery(qryLogin);
        jDBTextField3.setFieldName("senha");

        jDBCheckBox1.setJDBQuery(qryLogin);
        jDBCheckBox1.setFieldName("bloqueado");
        jDBCheckBox1.setText("Bloqueado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDBCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDBTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jDBTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jDBTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jDBTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jDBCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jDBTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jDBTable1.setJDBQuery(qryLogin);
        jScrollPane1.setViewportView(jDBTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listagem", jPanel3);

        jDBPanelButton1.setJDBQuery(qryLogin);

        javax.swing.GroupLayout iFrmUsuarioLayout = new javax.swing.GroupLayout(iFrmUsuario.getContentPane());
        iFrmUsuario.getContentPane().setLayout(iFrmUsuarioLayout);
        iFrmUsuarioLayout.setHorizontalGroup(
            iFrmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(iFrmUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDBPanelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        iFrmUsuarioLayout.setVerticalGroup(
            iFrmUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrmUsuarioLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBPanelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Cadastro");

        iFrmCliente.setClosable(true);
        iFrmCliente.setVisible(true);

        jDBPanelButton2.setJDBQuery(qryCliente);

        jTabbedPane3.setToolTipText("Cadastro");
        jTabbedPane3.setInheritsPopupMenu(true);

        jLabel7.setText("Idade:");

        jLabel8.setText("Nome:");

        jLabel9.setText("Renda:");

        jDBTextField7.setJDBQuery(qryCliente);
        jDBTextField7.setFieldName("nome");

        jDBTextField9.setJDBQuery(qryCliente);
        jDBTextField9.setFieldName("renda");
        jDBTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField9ActionPerformed(evt);
            }
        });

        jLabel10.setText("Endereço:");

        jDBTextField10.setJDBQuery(qryCliente);
        jDBTextField10.setFieldName("endereco");

        jLabel11.setText("Cidade:");

        jDBTextField11.setJDBQuery(qryCliente);
        jDBTextField11.setFieldName("cidade");

        jLabel12.setText("UF:");

        jDBComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jDBComboBox1.setJDBQuery(qryCliente);
        jDBComboBox1.setFieldName("uf");

        jDBSpinner1.setJDBQuery(qryCliente);
        jDBSpinner1.setFieldName("idade");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jDBSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jDBTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDBTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jDBTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jDBComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDBTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jDBTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jDBTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jDBTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jDBTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jDBComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Cadastro", jPanel5);

        jDBTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jDBTable3.setJDBQuery(qryCliente);
        jScrollPane3.setViewportView(jDBTable3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Listagem", jPanel6);

        javax.swing.GroupLayout iFrmClienteLayout = new javax.swing.GroupLayout(iFrmCliente.getContentPane());
        iFrmCliente.getContentPane().setLayout(iFrmClienteLayout);
        iFrmClienteLayout.setHorizontalGroup(
            iFrmClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrmClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iFrmClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iFrmClienteLayout.createSequentialGroup()
                        .addComponent(jDBPanelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        iFrmClienteLayout.setVerticalGroup(
            iFrmClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iFrmClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jDBPanelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        iFrmMarca.setClosable(true);
        iFrmMarca.setVisible(true);

        jTabbedPane2.setToolTipText("Cadastro");
        jTabbedPane2.setInheritsPopupMenu(true);

        jLabel5.setText("Nome:");

        jDBTextField4.setJDBQuery(qryMarca);
        jDBTextField4.setFieldName("nome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addComponent(jDBTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jDBTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cadastro", jPanel2);

        jDBTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jDBTable2.setJDBQuery(qryMarca);
        jScrollPane2.setViewportView(jDBTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Listagem", jPanel4);

        jDBPanelButton3.setJDBQuery(qryMarca);

        javax.swing.GroupLayout iFrmMarcaLayout = new javax.swing.GroupLayout(iFrmMarca.getContentPane());
        iFrmMarca.getContentPane().setLayout(iFrmMarcaLayout);
        iFrmMarcaLayout.setHorizontalGroup(
            iFrmMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrmMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
            .addGroup(iFrmMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(iFrmMarcaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jDBPanelButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        iFrmMarcaLayout.setVerticalGroup(
            iFrmMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrmMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(iFrmMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iFrmMarcaLayout.createSequentialGroup()
                    .addContainerGap(237, Short.MAX_VALUE)
                    .addComponent(jDBPanelButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        iFrmProduto.setClosable(true);
        iFrmProduto.setVisible(true);

        jTabbedPane4.setToolTipText("Cadastro");
        jTabbedPane4.setInheritsPopupMenu(true);

        jLabel14.setText("Nome:");

        jLabel15.setText("Lucro:");

        jDBTextField8.setJDBQuery(qryProduto);
        jDBTextField8.setFieldName("nome");

        jDBTextField12.setJDBQuery(qryProduto);
        jDBTextField12.setFieldName("lucro");
        jDBTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField12ActionPerformed(evt);
            }
        });

        jLabel19.setText("Descrição:");

        jDBTextArea1.setJDBQuery(qryProduto);
        jDBTextArea1.setFieldName("descricao");

        jLabel21.setText("Preço:");

        jDBTextField16.setJDBQuery(qryProduto);
        jDBTextField16.setFieldName("preco");
        jDBTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBTextField16ActionPerformed(evt);
            }
        });

        jLabel22.setText("Marca:");

        jDBLookUpComboBox1.setJDBListQuery(qryMarca);
        jDBLookUpComboBox1.setJDBQuery(qryProduto);
        jDBLookUpComboBox1.setInvisibleFields("id");
        jDBLookUpComboBox1.setKeyField("marca_id");
        jDBLookUpComboBox1.setKeyListField("id");

        jDBSpinner2.setJDBQuery(qryProduto);
        jDBSpinner2.setFieldName("estoque");

        jLabel13.setText("Estoque:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel21))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jDBTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jDBTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDBTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jDBLookUpComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jDBSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 177, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jDBTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jDBTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jDBTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jDBLookUpComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jDBTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Cadastro", jPanel7);

        jDBTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jDBTable4.setJDBQuery(qryProduto);
        jScrollPane4.setViewportView(jDBTable4);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Listagem", jPanel8);

        jDBPanelButton4.setJDBQuery(qryProduto);

        javax.swing.GroupLayout iFrmProdutoLayout = new javax.swing.GroupLayout(iFrmProduto.getContentPane());
        iFrmProduto.getContentPane().setLayout(iFrmProdutoLayout);
        iFrmProdutoLayout.setHorizontalGroup(
            iFrmProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrmProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iFrmProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iFrmProdutoLayout.createSequentialGroup()
                        .addComponent(jDBPanelButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        iFrmProdutoLayout.setVerticalGroup(
            iFrmProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iFrmProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addGap(18, 18, 18)
                .addComponent(jDBPanelButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        conexao.setURL("jdbc:mysql://localhost/dbAulaLogin");
        conexao.setDriver("com.mysql.jdbc.Driver");
        conexao.setPassword("minas");
        conexao.setUserName("root");

        qryLogin.setJDBConnection(conexao);
        qryLogin.setSQL("select*from Usuario");

        qryCliente.setJDBConnection(conexao);
        qryCliente.setSQL("select*from cliente");

        qryMarca.setJDBConnection(conexao);
        qryMarca.setSQL("select*from marca");

        qryProduto.setJDBConnection(conexao);
        qryProduto.setSQL("select*from produto");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastro");

        jUsuario.setText("Usuário");
        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jUsuario);

        jCliente.setText("Cliente");
        jCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jCliente);

        jMarca.setText("Marca");
        jMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMarcaActionPerformed(evt);
            }
        });
        jMenu2.add(jMarca);

        jProduto.setText("Produto");
        jProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jProduto);

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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        limparForms();
        iFrmUsuario.setVisible(true);
        jDesktopPane1.add(iFrmUsuario);
        iFrmUsuario.setSize(605, 353);
        iFrmUsuario.toFront();
    }//GEN-LAST:event_jUsuarioActionPerformed

    private void jDBTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField9ActionPerformed

    private void jDBTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField12ActionPerformed

    private void jDBTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBTextField16ActionPerformed

    private void jClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClienteActionPerformed
        limparForms();
        iFrmCliente.setVisible(true);
        jDesktopPane1.add(iFrmCliente);
        iFrmCliente.setSize(605, 383);
        iFrmCliente.toFront();
    }//GEN-LAST:event_jClienteActionPerformed

    private void jMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMarcaActionPerformed
        limparForms();
        iFrmMarca.setVisible(true);
        jDesktopPane1.add(iFrmMarca);
        iFrmMarca.setSize(597, 323);
        iFrmMarca.toFront();
    }//GEN-LAST:event_jMarcaActionPerformed

    private void jProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProdutoActionPerformed
        limparForms();
        iFrmProduto.setVisible(true);
        jDesktopPane1.add(iFrmProduto);
        iFrmProduto.setSize(605, 391);
        iFrmProduto.toFront();
    }//GEN-LAST:event_jProdutoActionPerformed

    public void limparForms(){
        iFrmProduto.setVisible(false);
        iFrmCliente.setVisible(false);
        iFrmMarca.setVisible(false);
        iFrmUsuario.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(FrmMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib.jdb.connection.JDBConnection conexao;
    private javax.swing.JInternalFrame iFrmCliente;
    private javax.swing.JInternalFrame iFrmMarca;
    private javax.swing.JInternalFrame iFrmProduto;
    private javax.swing.JInternalFrame iFrmUsuario;
    private javax.swing.JMenuItem jCliente;
    private lib.jdb.control.jdbcheckbox.JDBCheckBox jDBCheckBox1;
    private lib.jdb.control.jdbcombobox.JDBComboBox jDBComboBox1;
    private lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox jDBLookUpComboBox1;
    private lib.jdb.control.jdbpanelbutton.JDBPanelButton jDBPanelButton1;
    private lib.jdb.control.jdbpanelbutton.JDBPanelButton jDBPanelButton2;
    private lib.jdb.control.jdbpanelbutton.JDBPanelButton jDBPanelButton3;
    private lib.jdb.control.jdbpanelbutton.JDBPanelButton jDBPanelButton4;
    private lib.jdb.control.jdbspinner.JDBSpinner jDBSpinner1;
    private lib.jdb.control.jdbspinner.JDBSpinner jDBSpinner2;
    private lib.jdb.control.jdbtable.JDBTable jDBTable1;
    private lib.jdb.control.jdbtable.JDBTable jDBTable2;
    private lib.jdb.control.jdbtable.JDBTable jDBTable3;
    private lib.jdb.control.jdbtable.JDBTable jDBTable4;
    private lib.jdb.control.jdbtextarea.JDBTextArea jDBTextArea1;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField1;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField10;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField11;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField12;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField16;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField2;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField3;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField4;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField7;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField8;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMarca;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JMenuItem jProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JMenuItem jUsuario;
    private lib.jdb.jdbquery.JDBQuery qryCliente;
    private lib.jdb.jdbquery.JDBQuery qryLogin;
    private lib.jdb.jdbquery.JDBQuery qryMarca;
    private lib.jdb.jdbquery.JDBQuery qryProduto;
    // End of variables declaration//GEN-END:variables
}
/* @author Vitor */
public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
        jDBConnection2.connectDB();
        gryProduto.execQuery();
        gryMarca.execQuery();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IFrmCadMarca = new javax.swing.JInternalFrame();
        jDBLabelCount1 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount6 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBTextField1 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBButtonSave1 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonNew1 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel1 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonDelete1 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonFirst1 = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        jDBButtonPrevious1 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonNext1 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonLast1 = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
        IFrmCadProduto = new javax.swing.JInternalFrame();
        jDBLabelCount7 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount2 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount3 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount4 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBLabelCount8 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jDBButtonLast2 = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
        jDBButtonNext2 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonPrevious2 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonFirst2 = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        jDBButtonSave2 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonNew2 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonCancel2 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonDelete2 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBTextField2 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField3 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextField4 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLookUpComboBox1 = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        jDBButtonRefresh1 = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        jDBConnection2 = new lib.jdb.connection.JDBConnection();
        gryMarca = new lib.jdb.jdbquery.JDBQuery();
        gryProduto = new lib.jdb.jdbquery.JDBQuery();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDBTable1 = new lib.jdb.control.jdbtable.JDBTable();
        jDBLabelCount9 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDBTable2 = new lib.jdb.control.jdbtable.JDBTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        IFrmCadMarca.setBorder(null);
        IFrmCadMarca.setClosable(true);
        IFrmCadMarca.setTitle("Cadastro de Marcas");
        IFrmCadMarca.setVisible(true);
        IFrmCadMarca.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                IFrmCadMarcaComponentMoved(evt);
            }
        });

        jDBLabelCount1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLabelCount1.setText("Nome da Marca:");

        jDBLabelCount6.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jDBLabelCount6.setForeground(new java.awt.Color(102, 102, 102));
        jDBLabelCount6.setText("CADASTRO DE MARCAS");

        jDBTextField1.setJDBQuery(gryMarca);
        jDBTextField1.setBorder(null);
        jDBTextField1.setFieldName("nome");
        jDBTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBTextField1.setName("txtNomeMarca"); // NOI18N

        jDBButtonSave1.setJDBQuery(gryMarca);
        jDBButtonSave1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonSave1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonSave1.setLabel("Savar");

        jDBButtonNew1.setJDBQuery(gryMarca);
        jDBButtonNew1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonNew1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonNew1.setLabel("Novo");
        jDBButtonNew1.setPreferredSize(new java.awt.Dimension(101, 40));

        jDBButtonCancel1.setJDBQuery(gryMarca);
        jDBButtonCancel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonCancel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonCancel1.setLabel("Cancelar");

        jDBButtonDelete1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonDelete1.setText("Deletar");
        jDBButtonDelete1.setJDBQuery(gryMarca);
        jDBButtonDelete1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jDBButtonFirst1.setJDBQuery(gryMarca);
        jDBButtonFirst1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonFirst1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonFirst1.setLabel("Primeiro");

        jDBButtonPrevious1.setJDBQuery(gryMarca);
        jDBButtonPrevious1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonPrevious1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonPrevious1.setLabel("Anterior");

        jDBButtonNext1.setJDBQuery(gryMarca);
        jDBButtonNext1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonNext1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonNext1.setLabel("Próximo");

        jDBButtonLast1.setJDBQuery(gryMarca);
        jDBButtonLast1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonLast1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonLast1.setLabel("Último");

        javax.swing.GroupLayout IFrmCadMarcaLayout = new javax.swing.GroupLayout(IFrmCadMarca.getContentPane());
        IFrmCadMarca.getContentPane().setLayout(IFrmCadMarcaLayout);
        IFrmCadMarcaLayout.setHorizontalGroup(
            IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IFrmCadMarcaLayout.createSequentialGroup()
                .addGroup(IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IFrmCadMarcaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDBButtonFirst1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jDBButtonSave1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDBButtonNew1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jDBButtonNext1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDBButtonLast1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDBButtonDelete1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                    .addGroup(IFrmCadMarcaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jDBLabelCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IFrmCadMarcaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDBLabelCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDBTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        IFrmCadMarcaLayout.setVerticalGroup(
            IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IFrmCadMarcaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jDBLabelCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDBButtonNew1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDBButtonDelete1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(IFrmCadMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonLast1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IFrmCadProduto.setBorder(null);
        IFrmCadProduto.setClosable(true);
        IFrmCadProduto.setTitle("Cadastro de Produtos");
        IFrmCadProduto.setVisible(true);
        IFrmCadProduto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                IFrmCadProdutoComponentMoved(evt);
            }
        });

        jDBLabelCount7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jDBLabelCount7.setForeground(new java.awt.Color(102, 102, 102));
        jDBLabelCount7.setText("CADASTRO DE PRODUTOS");

        jDBLabelCount2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLabelCount2.setText("Nome do Produto:");

        jDBLabelCount3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLabelCount3.setText("Preço:");

        jDBLabelCount4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLabelCount4.setText("Estoque:");

        jDBLabelCount8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLabelCount8.setText("Marca:");

        jDBButtonLast2.setJDBQuery(gryProduto);
        jDBButtonLast2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonLast2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonLast2.setLabel("Último");

        jDBButtonNext2.setJDBQuery(gryProduto);
        jDBButtonNext2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonNext2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonNext2.setLabel("Próximo");

        jDBButtonPrevious2.setJDBQuery(gryProduto);
        jDBButtonPrevious2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonPrevious2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonPrevious2.setLabel("Anterior");

        jDBButtonFirst2.setJDBQuery(gryProduto);
        jDBButtonFirst2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonFirst2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonFirst2.setLabel("Primeiro");

        jDBButtonSave2.setJDBQuery(gryProduto);
        jDBButtonSave2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonSave2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonSave2.setLabel("Savar");

        jDBButtonNew2.setJDBQuery(gryProduto);
        jDBButtonNew2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonNew2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonNew2.setLabel("Novo");

        jDBButtonCancel2.setJDBQuery(gryProduto);
        jDBButtonCancel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonCancel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonCancel2.setLabel("Cancelar");

        jDBButtonDelete2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonDelete2.setText("Deletar");
        jDBButtonDelete2.setJDBQuery(gryProduto);
        jDBButtonDelete2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jDBTextField2.setJDBQuery(gryProduto);
        jDBTextField2.setBorder(null);
        jDBTextField2.setFieldName("nome");
        jDBTextField2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBTextField2.setName("txtNomeProduto"); // NOI18N

        jDBTextField3.setJDBQuery(gryProduto);
        jDBTextField3.setBorder(null);
        jDBTextField3.setFieldName("estoque");
        jDBTextField3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBTextField3.setName("txtEstoque"); // NOI18N

        jDBTextField4.setJDBQuery(gryProduto);
        jDBTextField4.setBorder(null);
        jDBTextField4.setFieldName("preco");
        jDBTextField4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBTextField4.setName("txtPreco"); // NOI18N

        jDBLookUpComboBox1.setJDBListQuery(gryMarca);
        jDBLookUpComboBox1.setJDBQuery(gryProduto);
        jDBLookUpComboBox1.setBorder(null);
        jDBLookUpComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDBLookUpComboBox1.setInheritsPopupMenu(true);
        jDBLookUpComboBox1.setInvisibleFields("id");
        jDBLookUpComboBox1.setKeyField("marca_id");
        jDBLookUpComboBox1.setKeyListField("id");
        jDBLookUpComboBox1.setName("cbxMarca"); // NOI18N

        jDBButtonRefresh1.setJDBQuery(gryProduto);
        jDBButtonRefresh1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jDBButtonRefresh1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDBButtonRefresh1.setText("Atualizar");

        javax.swing.GroupLayout IFrmCadProdutoLayout = new javax.swing.GroupLayout(IFrmCadProduto.getContentPane());
        IFrmCadProduto.getContentPane().setLayout(IFrmCadProdutoLayout);
        IFrmCadProdutoLayout.setHorizontalGroup(
            IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IFrmCadProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IFrmCadProdutoLayout.createSequentialGroup()
                        .addComponent(jDBButtonFirst2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(jDBButtonPrevious2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBButtonNext2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBButtonLast2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IFrmCadProdutoLayout.createSequentialGroup()
                        .addComponent(jDBButtonNew2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBButtonSave2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBButtonCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBButtonDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(IFrmCadProdutoLayout.createSequentialGroup()
                        .addGroup(IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDBLabelCount7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(IFrmCadProdutoLayout.createSequentialGroup()
                                .addGroup(IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBLabelCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBLabelCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDBTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(IFrmCadProdutoLayout.createSequentialGroup()
                                        .addComponent(jDBLookUpComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDBButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jDBTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        IFrmCadProdutoLayout.setVerticalGroup(
            IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IFrmCadProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDBLabelCount7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLabelCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBLabelCount8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBLookUpComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDBButtonSave2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNew2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(IFrmCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDBButtonPrevious2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDBButtonNext2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDBButtonLast2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jDBButtonFirst2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDBTextField4.getAccessibleContext().setAccessibleName("");

        jDBConnection2.setURL("jdbc:mysql://localhost/revisao");
        jDBConnection2.setDriver("com.mysql.jdbc.Driver");
        jDBConnection2.setPassword("minas");
        jDBConnection2.setUserName("root");

        gryMarca.setJDBConnection(jDBConnection2);
        gryMarca.setSQL("select*from marca");

        gryProduto.setJDBConnection(jDBConnection2);
        gryProduto.setSQL("select*from produto");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro de Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

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
        jDBTable1.setJDBQuery(gryProduto);
        jDBTable1.setEditable(false);
        jDBTable1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jDBTable1);

        jDBLabelCount9.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jDBLabelCount9.setForeground(new java.awt.Color(102, 102, 102));
        jDBLabelCount9.setText("SISTEMA DE CADASTRO DE PRODUTOS");

        jDBTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jDBTable2.setJDBQuery(gryMarca);
        jDBTable2.setEditable(false);
        jDBTable2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(jDBTable2);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDBLabelCount9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDBLabelCount9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDBLabelCount9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar2.setBorder(null);

        jMenu2.setText("Arquivo");
        jMenu2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem4.setText("Cadastrar Marca");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem5.setText("Cadastrar Produto");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem6.setText("Sair");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

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

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jDesktopPane1.remove(IFrmCadProduto);
        IFrmCadMarca.setVisible(false);
        IFrmCadProduto.setVisible(true);
        IFrmCadProduto.setSize(500, 349);
        jDesktopPane1.add(IFrmCadProduto);
        IFrmCadProduto.toFront();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jDesktopPane1.remove(IFrmCadMarca);
        IFrmCadProduto.setVisible(false);
        IFrmCadMarca.setVisible(true);
        IFrmCadMarca.setSize(510, 256);
        jDesktopPane1.add(IFrmCadMarca);
        IFrmCadMarca.toFront();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void IFrmCadMarcaComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_IFrmCadMarcaComponentMoved
        IFrmCadMarca.setLocation(0, 0);
    }//GEN-LAST:event_IFrmCadMarcaComponentMoved

    private void IFrmCadProdutoComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_IFrmCadProdutoComponentMoved
        IFrmCadProduto.setLocation(0, 0);
    }//GEN-LAST:event_IFrmCadProdutoComponentMoved

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
    private javax.swing.JInternalFrame IFrmCadMarca;
    private javax.swing.JInternalFrame IFrmCadProduto;
    private lib.jdb.jdbquery.JDBQuery gryMarca;
    private lib.jdb.jdbquery.JDBQuery gryProduto;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel1;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel2;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete1;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete2;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst jDBButtonFirst1;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst jDBButtonFirst2;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast jDBButtonLast1;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast jDBButtonLast2;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew1;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew2;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext1;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext2;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious1;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious2;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh jDBButtonRefresh1;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave1;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave2;
    private lib.jdb.connection.JDBConnection jDBConnection2;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount1;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount2;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount3;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount4;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount6;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount7;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount8;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount9;
    private lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox jDBLookUpComboBox1;
    private lib.jdb.control.jdbtable.JDBTable jDBTable1;
    private lib.jdb.control.jdbtable.JDBTable jDBTable2;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField1;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField2;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField3;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextField4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
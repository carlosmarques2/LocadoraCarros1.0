/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoracarros;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edunativa
 */
public class TelaPrincipal extends javax.swing.JFrame {

     ArrayList<Clientes> lst_Clientes;
        String tipo;
        public void CarregarTabela(){
            DefaultTableModel modelo;
            modelo = new DefaultTableModel(new Object[]{"Nome","Idade","CPF","Celular"},0);
            
            for (int i = 0; i < lst_Clientes.size(); i++) {
                modelo.addRow(new Object[]{lst_Clientes.get(i).getNome(),
                                           lst_Clientes.get(i).getIdade(),
                                           lst_Clientes.get(i).getCPF(),
                                           lst_Clientes.get(i).getCelular()});
                
            }
            tbCliente.setModel(modelo);
            
            
        }
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        lst_Clientes = new ArrayList();
        tipo = "navegar";
        manipularInterface();
    }
    
     public void manipularInterface(){
        switch(tipo){
            case "navegar":
                    btnNovo.setEnabled(true);
                    btnEditar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    btnSalvar.setEnabled(false);
                    btnCancelar.setEnabled(false);
        
                    jtNome.setEnabled(false);
                    jtIdade.setEnabled(false);
                    jFormattedCPF.setEnabled(false);
                    jFormattedCelular.setEnabled(false);
                    jTEndereco.setEnabled(false);
                    jTNumero.setEnabled(false);
                    jComboBoxCidades.setEnabled(false);
                    
                break;
            case "novo":
                    btnNovo.setEnabled(false);
                    btnEditar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    btnSalvar.setEnabled(true);
                    btnCancelar.setEnabled(true);
        
                    jtNome.setEnabled(true);
                    jtIdade.setEnabled(true);
                    jFormattedCPF.setEnabled(true);
                    jFormattedCelular.setEnabled(true);
                    jTEndereco.setEnabled(true);
                    jTNumero.setEnabled(true);
                    jComboBoxCidades.setEnabled(true);
                    
                    jtNome.setText("");
                    jtIdade.setText("");
                    jFormattedCPF.setText("");
                    jFormattedCelular.setText("");
                    jTEndereco.setText("");
                    jTNumero.setText("");
                break;
            case "editar":
                    btnNovo.setEnabled(false);
                    btnEditar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    btnSalvar.setEnabled(true);
                    btnCancelar.setEnabled(true);
        
                    jtNome.setEnabled(true);
                    jtIdade.setEnabled(true);
                    jFormattedCPF.setEnabled(true);
                    jFormattedCelular.setEnabled(true);
                    jTEndereco.setEnabled(true);
                    jTNumero.setEnabled(true);
                    
                break;
            case "excluir":
                    btnNovo.setEnabled(true);
                    btnEditar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    btnSalvar.setEnabled(false);
                    btnCancelar.setEnabled(false);
        
                    jtNome.setEnabled(false);
                    jtIdade.setEnabled(false);
                    jFormattedCPF.setEnabled(false);
                    jFormattedCelular.setEnabled(false);
                    jTEndereco.setEnabled(false);
                    jTNumero.setEnabled(false);
                    
                break;
            case "selecao":
                    btnNovo.setEnabled(true);
                    btnEditar.setEnabled(true);
                    btnExcluir.setEnabled(true);
                    btnSalvar.setEnabled(false);
                    btnCancelar.setEnabled(false);
        
                    jtNome.setEnabled(false);
                    jtIdade.setEnabled(false);
                    jFormattedCPF.setEnabled(false);
                    jFormattedCelular.setEnabled(false);
                    jTEndereco.setEnabled(false);
                    jTNumero.setEnabled(false);
                break;
                
            default:
                System.out.println("Tipo Inválido!\n");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonFormasPagramento = new javax.swing.ButtonGroup();
        jTPAreas = new javax.swing.JTabbedPane();
        jTPAreaCadastroCliente = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        PainelCadastroCliente = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtIdade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTNumero = new javax.swing.JTextField();
        jFormattedCPF = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxCidades = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jRadioButtonAVista = new javax.swing.JRadioButton();
        jRadioButtonCartaoAVista = new javax.swing.JRadioButton();
        jRadioButtonCartao = new javax.swing.JRadioButton();
        jFormattedCelular = new javax.swing.JFormattedTextField();
        jTPCadVeiculos = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema LocaCar");

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade", "CPF", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCliente);
        if (tbCliente.getColumnModel().getColumnCount() > 0) {
            tbCliente.getColumnModel().getColumn(1).setResizable(false);
            tbCliente.getColumnModel().getColumn(1).setPreferredWidth(4);
            tbCliente.getColumnModel().getColumn(2).setResizable(false);
            tbCliente.getColumnModel().getColumn(2).setPreferredWidth(6);
        }

        btnNovo.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        PainelCadastroCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Cadastro de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabelNome.setText("Nome: ");

        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Idade: ");

        jtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdadeActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF nº: ");

        jLabel4.setText("Celular: ");

        btnSalvar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço: ");

        jLabel6.setText("nº ");

        try {
            jFormattedCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedCPF.setToolTipText("");

        jLabel7.setText("Cidade: ");

        jComboBoxCidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amaraji", "Boa Vista", "Mucajaí", "Iracema", "Caracaraí", "Petrolina", "Novo Paraiso", "Vila Moderna", "São Luiz", "São João da Baliza", "Caroebe", "Entre Rios", "Bonfim", "Cantar", "Rorainópolis", "Normandia", "Pacaraima", " " }));
        jComboBoxCidades.setSelectedIndex(1);
        jComboBoxCidades.setToolTipText("");

        jLabel8.setText("Formas de Pagamento:");

        buttonFormasPagramento.add(jRadioButtonAVista);
        jRadioButtonAVista.setSelected(true);
        jRadioButtonAVista.setText("à Vista");
        jRadioButtonAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAVistaActionPerformed(evt);
            }
        });

        buttonFormasPagramento.add(jRadioButtonCartaoAVista);
        jRadioButtonCartaoAVista.setText("Cartão à Vista");

        buttonFormasPagramento.add(jRadioButtonCartao);
        jRadioButtonCartao.setText("Cartão");

        try {
            jFormattedCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelCadastroClienteLayout = new javax.swing.GroupLayout(PainelCadastroCliente);
        PainelCadastroCliente.setLayout(PainelCadastroClienteLayout);
        PainelCadastroClienteLayout.setHorizontalGroup(
            PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jRadioButtonAVista)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonCartaoAVista)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonCartao)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroClienteLayout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addGap(11, 11, 11)
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelCadastroClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))))
                .addContainerGap())
        );
        PainelCadastroClienteLayout.setVerticalGroup(
            PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabel1))))
                .addGap(6, 6, 6)
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonAVista)
                    .addComponent(jRadioButtonCartaoAVista)
                    .addComponent(jRadioButtonCartao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PainelCadastroCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addComponent(PainelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTPAreaCadastroCliente.addTab("Lista de Clientes", jPanel1);

        jTPAreas.addTab("Cadastro Cliente", jTPAreaCadastroCliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        jTPCadVeiculos.addTab("Lista de Veiculos", jPanel2);

        jTPAreas.addTab("Cad Veiculos", jTPCadVeiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPAreas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPAreas)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteMouseClicked
        int index = tbCliente.getSelectedRow();
        if(index >=0 && index < lst_Clientes.size()){
            Clientes c = lst_Clientes.get(index);
            jtNome.setText(c.getNome());
            jtIdade.setText(String.valueOf(c.getNome()));
            jFormattedCPF.setText(c.getCPF());
            jFormattedCelular.setText(c.getCelular());

            tipo = "selecao";
            manipularInterface();
        }
    }//GEN-LAST:event_tbClienteMouseClicked

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked

    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        tipo = "novo";
        manipularInterface();

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        tipo = "editar";
        manipularInterface();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int index = tbCliente.getSelectedRow();
        if(index >= 0 && index < lst_Clientes.size()){
            lst_Clientes.remove(index);
        }
        CarregarTabela();
        tipo = "navegar";
        manipularInterface();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);

        jtNome.setText("");
        jtIdade.setText("");
        jFormattedCPF.setText("");
        jFormattedCelular.setText("");
        jTEndereco.setText("");
        jTNumero.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        int id = Integer.parseInt(jtIdade.getText());
        if(tipo.equals("novo")){
            Clientes c =  new Clientes(jtNome.getText(), jFormattedCPF.getText(), id,jFormattedCelular.getText());
            lst_Clientes.add(c);

        } else if(tipo.equals("editar")){
            int index = tbCliente.getSelectedRow();
            lst_Clientes.get(index).setNome(jtNome.getText());
            lst_Clientes.get(index).setIdade(id);
            lst_Clientes.get(index).setCPF(jFormattedCPF.getText());
            lst_Clientes.get(index).setCelular(jFormattedCelular.getText());

        }
        CarregarTabela();
        tipo = "navegar";
        manipularInterface();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdadeActionPerformed

    private void jRadioButtonAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAVistaActionPerformed

    private void jFormattedCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedCelularActionPerformed

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCadastroCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonFormasPagramento;
    private javax.swing.JComboBox<String> jComboBoxCidades;
    private javax.swing.JFormattedTextField jFormattedCPF;
    private javax.swing.JFormattedTextField jFormattedCelular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonAVista;
    private javax.swing.JRadioButton jRadioButtonCartao;
    private javax.swing.JRadioButton jRadioButtonCartaoAVista;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTabbedPane jTPAreaCadastroCliente;
    private javax.swing.JTabbedPane jTPAreas;
    private javax.swing.JTabbedPane jTPCadVeiculos;
    private javax.swing.JTextField jtIdade;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTable tbCliente;
    // End of variables declaration//GEN-END:variables
}

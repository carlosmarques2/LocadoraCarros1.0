/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoracarros;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConexaoBancoDeDados;
import utilitarios.ModeloTabela;

/**
 *
 * @author edunativa
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBancoDeDados conecta = new ConexaoBancoDeDados();
    ArrayList<Clientes> lst_Clientes;
    String tipo;

    public void CarregarTabela() {

    }

    ArrayList<Veiculos> lst_Veiculos;
    String acao;

    public void CarregarTabelaVeiculos() {
        DefaultTableModel modeloVeiculo;
        modeloVeiculo = new DefaultTableModel(new Object[]{"Marca", "Modelo", "Placa", "Nº Chassi"}, 0);

        for (int i = 0; i < lst_Veiculos.size(); i++) {
            modeloVeiculo.addRow(new Object[]{lst_Veiculos.get(i).getMarca(),
                lst_Veiculos.get(i).getModelo(),
                lst_Veiculos.get(i).getPlaca(),
                lst_Veiculos.get(i).getNChassi()});

        }
        jTabVeiculos.setModel(modeloVeiculo);

    }

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
        lst_Clientes = new ArrayList();
        lst_Veiculos = new ArrayList();
        tipo = "navegar";
        acao = "navegar";
        manipularInterface();
        manipularCadVeiculos();
    }

    private void manipularInterface() {
        switch (tipo) {
            case "navegar":
                btnNovo.setEnabled(true);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);

                jtNome.setEnabled(false);
                jFormattedDatanascimento.setEnabled(false);
                jFormattedCPF.setEnabled(false);
                jFormattedCelular.setEnabled(false);
                jTEndereco.setEnabled(false);
                jTNumero.setEnabled(false);
                

                break;
            case "novo":
                btnNovo.setEnabled(false);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnSalvar.setEnabled(true);
                btnCancelar.setEnabled(true);

                jtNome.setEnabled(true);
                jFormattedDatanascimento.setEnabled(true);
                jFormattedCPF.setEnabled(true);
                jFormattedCelular.setEnabled(true);
                jTEndereco.setEnabled(true);
                jTNumero.setEnabled(true);
                

                jtNome.setText("");
                jFormattedDatanascimento.setText("");
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
                jFormattedDatanascimento.setEnabled(true);
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
                jFormattedDatanascimento.setEnabled(false);
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
                jFormattedDatanascimento.setEnabled(false);
                jFormattedCPF.setEnabled(false);
                jFormattedCelular.setEnabled(false);
                jTEndereco.setEnabled(false);
                jTNumero.setEnabled(false);
                break;

            default:
                System.out.println("Tipo Inválido!\n");
        }
    }

    //metodo para  Manipular o Cadastro dos Veiculos
    private void manipularCadVeiculos() {
        switch (acao) {
            case "navegar":
                jBNovoCad.setEnabled(true);
                jBEditarCad.setEnabled(false);
                jBExcluirCad.setEnabled(false);
                jBotaoSalvar.setEnabled(false);
                jBotaoCancelar.setEnabled(false);

                jTMarca.setEnabled(false);
                jTModelo.setEnabled(false);
                jTPlaca.setEnabled(false);
                jTChassi.setEnabled(false);

                break;
            case "novo":
                jBNovoCad.setEnabled(false);
                jBEditarCad.setEnabled(false);
                jBExcluirCad.setEnabled(false);
                jBotaoSalvar.setEnabled(true);
                jBotaoCancelar.setEnabled(true);

                jTMarca.setEnabled(true);
                jTModelo.setEnabled(true);
                jTPlaca.setEnabled(true);
                jTChassi.setEnabled(true);

                jTMarca.setText("");
                jTModelo.setText("");
                jTPlaca.setText("");
                jTChassi.setText("");
                break;
            case "editar":

                jBNovoCad.setEnabled(false);
                jBEditarCad.setEnabled(false);
                jBExcluirCad.setEnabled(false);
                jBotaoSalvar.setEnabled(true);
                jBotaoCancelar.setEnabled(true);

                jTMarca.setEnabled(true);
                jTModelo.setEnabled(true);
                jTPlaca.setEnabled(true);
                jTChassi.setEnabled(true);

                break;
            case "excluir":
                jBNovoCad.setEnabled(true);
                jBEditarCad.setEnabled(false);
                jBExcluirCad.setEnabled(false);
                jBotaoSalvar.setEnabled(false);
                jBotaoCancelar.setEnabled(true);

                jTMarca.setEnabled(false);
                jTModelo.setEnabled(false);
                jTPlaca.setEnabled(false);
                jTChassi.setEnabled(false);

                break;
            case "selecao":
                jBNovoCad.setEnabled(true);
                jBEditarCad.setEnabled(true);
                jBExcluirCad.setEnabled(true);
                jBotaoSalvar.setEnabled(false);
                jBotaoCancelar.setEnabled(false);

                jTMarca.setEnabled(false);
                jTModelo.setEnabled(false);
                jTPlaca.setEnabled(false);
                jTChassi.setEnabled(false);

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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTNumero = new javax.swing.JTextField();
        jFormattedCPF = new javax.swing.JFormattedTextField();
        jFormattedCelular = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextFieldNumCNH = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jFormattedDatanascimento = new javax.swing.JFormattedTextField();
        jFormattedDataPrimCNH = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButtonAtualizar = new javax.swing.JButton();
        jTPCadVeiculos = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTMarca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTModelo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTPlaca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanelImagem = new javax.swing.JPanel();
        jLInserirImg = new javax.swing.JLabel();
        jBInserirFoto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTChassi = new javax.swing.JTextField();
        jBNovoCad = new javax.swing.JButton();
        jBEditarCad = new javax.swing.JButton();
        jBExcluirCad = new javax.swing.JButton();
        jPanelListaVeiculos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabVeiculos = new javax.swing.JTable();
        jBotaoSalvar = new javax.swing.JButton();
        jBotaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema LocaCar");

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCliente);

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

        jLabel1.setText("Data Nasc.: ");

        jLabel2.setText("CPF: ");

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

        jLabel6.setText("Nº: ");

        try {
            jFormattedCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedCPF.setToolTipText("");

        try {
            jFormattedCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedCelularActionPerformed(evt);
            }
        });

        jLabel13.setText("CNH nº: ");

        try {
            jFormattedTextFieldNumCNH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("Dados da Habilitação do Cliente");

        jLabel14.setText("Data da 1ª CNH: ");

        try {
            jFormattedDatanascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedDatanascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedDatanascimentoActionPerformed(evt);
            }
        });

        try {
            jFormattedDataPrimCNH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel15.setText("UF:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Cidade:");

        jLabel18.setText("Bairro:");

        jLabel17.setText("RG:");

        javax.swing.GroupLayout PainelCadastroClienteLayout = new javax.swing.GroupLayout(PainelCadastroCliente);
        PainelCadastroCliente.setLayout(PainelCadastroClienteLayout);
        PainelCadastroClienteLayout.setHorizontalGroup(
            PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroClienteLayout.createSequentialGroup()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTEndereco)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel18)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21))
                .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jFormattedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel17)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jFormattedCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldNumCNH, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(4, 4, 4)
                        .addComponent(jFormattedDataPrimCNH, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(jFormattedDatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        PainelCadastroClienteLayout.setVerticalGroup(
            PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jFormattedDatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelCadastroClienteLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelNome)))
                .addGap(6, 6, 6)
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(7, 7, 7)
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jFormattedTextFieldNumCNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jFormattedDataPrimCNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(PainelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos\\Pictures\\matt-icons_view-refresh.png")); // NOI18N
        jButtonAtualizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PainelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovo)
                        .addComponent(btnEditar)
                        .addComponent(btnExcluir))
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PainelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTPAreaCadastroCliente.addTab("Lista de Clientes", jPanel1);

        jTPAreas.addTab("Cadastro Cliente", jTPAreaCadastroCliente);

        jLabel3.setText("Marca: ");

        jLabel9.setText("Modelo: ");

        jLabel10.setText("Placa; ");

        jLabel11.setText("Inserir Foto do Veiculo");

        jPanelImagem.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        jPanelImagem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLInserirImg.setName(""); // NOI18N
        jPanelImagem.add(jLInserirImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 190, 150));

        jBInserirFoto.setText("Inserir Foto");
        jBInserirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirFotoActionPerformed(evt);
            }
        });
        jPanelImagem.add(jBInserirFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel12.setText("Nº do Chassi: ");

        jBNovoCad.setText("NOVO");
        jBNovoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoCadActionPerformed(evt);
            }
        });

        jBEditarCad.setText("EDITAR");
        jBEditarCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarCadActionPerformed(evt);
            }
        });

        jBExcluirCad.setText("EXCLUIR");
        jBExcluirCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirCadActionPerformed(evt);
            }
        });

        jTabVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Placa", "Nº Chassi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTabVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabVeiculosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTabVeiculos);

        jBotaoSalvar.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jBotaoSalvar.setText("Salvar");
        jBotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoSalvarActionPerformed(evt);
            }
        });

        jBotaoCancelar.setText("Cancelar");
        jBotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListaVeiculosLayout = new javax.swing.GroupLayout(jPanelListaVeiculos);
        jPanelListaVeiculos.setLayout(jPanelListaVeiculosLayout);
        jPanelListaVeiculosLayout.setHorizontalGroup(
            jPanelListaVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaVeiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListaVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaVeiculosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBotaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBotaoCancelar)))
                .addContainerGap())
        );
        jPanelListaVeiculosLayout.setVerticalGroup(
            jPanelListaVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaVeiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanelListaVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoSalvar)
                    .addComponent(jBotaoCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTChassi))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jBNovoCad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBEditarCad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBExcluirCad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelListaVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBNovoCad)
                            .addComponent(jBEditarCad)
                            .addComponent(jBExcluirCad))))
                .addGap(23, 23, 23)
                .addComponent(jPanelListaVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPCadVeiculos.addTab("Cadastro", jPanel2);

        jTPAreas.addTab("Cad Veiculos", jTPCadVeiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTPAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTPAreas)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteMouseClicked
        int index = tbCliente.getSelectedRow();
        if (index >= 0 && index < lst_Clientes.size()) {
            Clientes c = lst_Clientes.get(index);
            jtNome.setText(c.getNome());
            jFormattedDatanascimento.setText(c.getDataNascimento());
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
        if (index >= 0 && index < lst_Clientes.size()) {
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
        jFormattedDatanascimento.setText("");
        jFormattedCPF.setText("");
        jFormattedCelular.setText("");
        jTEndereco.setText("");
        jTNumero.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into clientes (nome_cliente,data_nasc_cliente,cpf_cliente,rg_cliente,tel_cliente,end_cliente,bairro_cliente,num_cliente,estado_cliente,cidade_cliente,cnh_cliente,data_cnh_cliente)values(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,jtNome.getText());
            pst.setString(2, jFormattedDatanascimento.getText());
            pst.setString(3, jFormattedCPF.getText());
            pst.setString(4, jTextField4.getText());
            pst.setString(5, jFormattedCelular.getText());
            pst.setString(6, jTEndereco.getText());
            pst.setString(7, jTextField3.getText());
            pst.setString(8, jTNumero.getText());
            pst.setString(9, jTextField1.getText());
            pst.setString(10, jTextField2.getText());
            pst.setString(11, jFormattedTextFieldNumCNH.getText());
            pst.setString(12, jFormattedDataPrimCNH.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro na Inserção\nErro: "+ex.getMessage());
        }
        tipo = "navegar";
        manipularInterface();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jFormattedCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedCelularActionPerformed

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    private void jBInserirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirFotoActionPerformed
        JFileChooser chamarPesqImagem = new JFileChooser(); //Instanciando a classe jFileChooser
        chamarPesqImagem.setDialogTitle("Pesquisar Foto do Veiculo"); //Criando um titulo para Janela de Pesquisa
        chamarPesqImagem.setFileSelectionMode(JFileChooser.FILES_ONLY); //serve para filtrar mais não selecionar diretórios

        FileNameExtensionFilter filtrar = new FileNameExtensionFilter("Imagens", "jpg", "png"); // filtrar pela extrensão do arquivo;
        chamarPesqImagem.setFileFilter(filtrar); //chamando o metodo para filtrar;

        int retornarImagem = chamarPesqImagem.showOpenDialog(this); //Abrindo a Tela na Classe  atual;
        if (retornarImagem == JFileChooser.APPROVE_OPTION) {
            // metodo para quando o abrir for selecionado retornar;
            File arquivo = chamarPesqImagem.getSelectedFile(); //pegar a url da imagem e colocar em arquivo;
            jLInserirImg.setIcon(new ImageIcon(arquivo.getPath())); //abrindo a imagem no Label
        }

    }//GEN-LAST:event_jBInserirFotoActionPerformed

    private void jBNovoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoCadActionPerformed
        jPanelListaVeiculos.setVisible(true);
        acao = "novo";
        manipularCadVeiculos();
    }//GEN-LAST:event_jBNovoCadActionPerformed

    private void jBEditarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarCadActionPerformed
        jPanelListaVeiculos.setVisible(true);
        acao = "editar";
        manipularCadVeiculos();
    }//GEN-LAST:event_jBEditarCadActionPerformed

    private void jBExcluirCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirCadActionPerformed
        int indexs = jTabVeiculos.getSelectedRow();
        if (indexs >= 0 && indexs < lst_Veiculos.size()) {
            lst_Veiculos.remove(indexs);
        }
        CarregarTabelaVeiculos();
        acao = "navegar";
        manipularCadVeiculos();
    }//GEN-LAST:event_jBExcluirCadActionPerformed

    private void jBotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoCancelarActionPerformed
        jBotaoSalvar.setEnabled(false);
        jBotaoCancelar.setEnabled(false);

        jTMarca.setText("");
        jTModelo.setText("");
        jTPlaca.setText("");
        jTChassi.setText("");
    }//GEN-LAST:event_jBotaoCancelarActionPerformed

    private void jBotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoSalvarActionPerformed

        if (acao.equals("novo")) {
            Veiculos v = new Veiculos(jTMarca.getText(), jTModelo.getText(), jTPlaca.getText(), jTChassi.getText());
            lst_Veiculos.add(v);

        } else if (acao.equals("editar")) {
            int indexs = jTabVeiculos.getSelectedRow();
            lst_Veiculos.get(indexs).setMarca(jTMarca.getText());
            lst_Veiculos.get(indexs).setModelo(jTModelo.getText());
            lst_Veiculos.get(indexs).setPlaca(jTPlaca.getText());
            lst_Veiculos.get(indexs).setNChassi(jTChassi.getText());

        }
        CarregarTabelaVeiculos();
        acao = "navegar";
        manipularCadVeiculos();
    }//GEN-LAST:event_jBotaoSalvarActionPerformed

    private void jTabVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabVeiculosMouseClicked
        int indexs = jTabVeiculos.getSelectedRow();
        if (indexs >= 0 && indexs < lst_Veiculos.size()) {
            Veiculos v = lst_Veiculos.get(indexs);
            jTMarca.setText(v.getMarca());
            jTModelo.setText(v.getModelo());
            jTPlaca.setText(v.getPlaca());
            jTChassi.setText(v.getNChassi());

            acao = "selecao";
            manipularCadVeiculos();
        }
    }//GEN-LAST:event_jTabVeiculosMouseClicked

    private void jFormattedDatanascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedDatanascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedDatanascimentoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        preencherTabela("select * from clientes order by id_cliente");
    }//GEN-LAST:event_jButtonAtualizarActionPerformed
    
    public void preencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        String [] Colunas = new String[]{"ID","Nome","CPF","CNH","Telefone"};
        
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getString("id_cliente"),conecta.rs.getString("nome_cliente"),conecta.rs.getString("cpf_cliente"),conecta.rs.getString("cnh_cliente"),conecta.rs.getString("tel_cliente")});
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Preencher o Array List\nErro: "+ex.getMessage());
        }
        
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        tbCliente.setModel(modelo);
        tbCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbCliente.getColumnModel().getColumn(0).setResizable(false);
        
        tbCliente.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbCliente.getColumnModel().getColumn(1).setResizable(false);
        
        tbCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbCliente.getColumnModel().getColumn(2).setResizable(false);
        
        tbCliente.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbCliente.getColumnModel().getColumn(3).setResizable(false);
        
        tbCliente.getColumnModel().getColumn(4).setPreferredWidth(100);
        tbCliente.getColumnModel().getColumn(4).setResizable(false);
        
        tbCliente.getTableHeader().setReorderingAllowed(false);
        tbCliente.setAutoResizeMode(tbCliente.AUTO_RESIZE_OFF);
        tbCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
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
    private javax.swing.JButton jBEditarCad;
    private javax.swing.JButton jBExcluirCad;
    private javax.swing.JButton jBInserirFoto;
    private javax.swing.JButton jBNovoCad;
    private javax.swing.JButton jBotaoCancelar;
    private javax.swing.JButton jBotaoSalvar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JFormattedTextField jFormattedCPF;
    private javax.swing.JFormattedTextField jFormattedCelular;
    private javax.swing.JFormattedTextField jFormattedDataPrimCNH;
    private javax.swing.JFormattedTextField jFormattedDatanascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumCNH;
    private javax.swing.JLabel jLInserirImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelImagem;
    private javax.swing.JPanel jPanelListaVeiculos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTChassi;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTMarca;
    private javax.swing.JTextField jTModelo;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTabbedPane jTPAreaCadastroCliente;
    private javax.swing.JTabbedPane jTPAreas;
    private javax.swing.JTabbedPane jTPCadVeiculos;
    private javax.swing.JTextField jTPlaca;
    private javax.swing.JTable jTabVeiculos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTable tbCliente;
    // End of variables declaration//GEN-END:variables
}

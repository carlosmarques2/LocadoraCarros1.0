/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoracarros;

import javax.swing.JInternalFrame;

/**
 *
 * @author edunativa
 */
public class TelaTabelaVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form TelaTabelaVeiculos
     */
    public TelaTabelaVeiculos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloTelaTabVeiculos = new javax.swing.JLabel();
        jPanelCatPopular = new javax.swing.JPanel();
        carro1 = new javax.swing.JLabel();
        carro2 = new javax.swing.JLabel();
        carro3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerDias1 = new javax.swing.JSpinner();
        jSpinnerDias2 = new javax.swing.JSpinner();
        jSpinnerDias3 = new javax.swing.JSpinner();
        jLQntDias = new javax.swing.JLabel();
        jLQntDias1 = new javax.swing.JLabel();
        jLQntDias2 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelValorCarro1 = new javax.swing.JLabel();
        jLabelValorCarro3 = new javax.swing.JLabel();
        jLabelValorCarro2 = new javax.swing.JLabel();
        jtextVlr1 = new javax.swing.JTextField();
        jtextVlr2 = new javax.swing.JTextField();
        jtextVlr3 = new javax.swing.JTextField();
        jBCalc1 = new javax.swing.JButton();
        jBCalc2 = new javax.swing.JButton();
        jBCalc3 = new javax.swing.JButton();
        jBotaoLocar = new javax.swing.JButton();
        janelaInterna1 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabela de Veiculos");
        setExtendedState(1);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("TelaTabela"); // NOI18N
        getContentPane().setLayout(null);

        TituloTelaTabVeiculos.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        TituloTelaTabVeiculos.setText("LocadoraCar - Tabela de Veiculos");
        getContentPane().add(TituloTelaTabVeiculos);
        TituloTelaTabVeiculos.setBounds(24, 27, 319, 24);

        jPanelCatPopular.setBorder(javax.swing.BorderFactory.createTitledBorder("Carros Populares"));

        carro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadoracarros/Imagens/fiat uno 2015.jpg"))); // NOI18N
        carro1.setText("carroP1");
        carro1.setToolTipText("<html>\n<p>Marca; FIAT</p>\n<p>Modelo: UNO</p>\n<p>Ano: 2015</p>\n</html>");
        carro1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, null));
        carro1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        carro1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                carro1FocusGained(evt);
            }
        });
        carro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carro1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carro1MouseClicked(evt);
            }
        });

        carro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadoracarros/Imagens/fiatbravo.jpg"))); // NOI18N
        carro2.setText("c");
        carro2.setToolTipText("<html> <p>Marca; FORD</p> <p>Modelo: Bravo</p> <p>Ano: 2017</p> </html>");
        carro2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, null));

        carro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadoracarros/Imagens/vw gol 2014.jpeg"))); // NOI18N
        carro3.setText("carroP2");
        carro3.setToolTipText("<html> <p>Marca; VW</p> <p>Modelo: GOL</p> <p>Ano: 2016</p> </html>");
        carro3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, null));

        jLabel1.setText("Valor da Diária: R$");

        jLabel2.setText("Valor da Diária: R$ ");

        jLabel3.setText("Valor da Diária:  R$  ");

        jSpinnerDias1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));

        jSpinnerDias2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));

        jSpinnerDias3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));

        jLQntDias.setText("Qnt. Dias");

        jLQntDias1.setText("Qnt. Dias");

        jLQntDias2.setText("Qnt. Dias");

        jLabel.setText("<html><p>Valor da </p><p>Locação R$ </p></html/>");

        jLabel4.setText("<html><p>Valor da </p><p>Locação R$ </p></html/>");

        jLabel5.setText("<html><p>Valor da </p><p>Locação R$ </p></html/>");

        jLabelValorCarro1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabelValorCarro1.setForeground(new java.awt.Color(204, 0, 0));
        jLabelValorCarro1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelValorCarro1.setText("0");
        jLabelValorCarro1.setToolTipText("");

        jLabelValorCarro3.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabelValorCarro3.setForeground(new java.awt.Color(204, 0, 0));
        jLabelValorCarro3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelValorCarro3.setText("0");

        jLabelValorCarro2.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabelValorCarro2.setForeground(new java.awt.Color(204, 0, 0));
        jLabelValorCarro2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelValorCarro2.setText("0");

        jtextVlr1.setText("90.00");
        jtextVlr1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtextVlr1.setEnabled(false);
        jtextVlr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextVlr1ActionPerformed(evt);
            }
        });

        jtextVlr2.setText("110.00");
        jtextVlr2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtextVlr2.setEnabled(false);
        jtextVlr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextVlr2ActionPerformed(evt);
            }
        });

        jtextVlr3.setText("150.00");
        jtextVlr3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtextVlr3.setEnabled(false);
        jtextVlr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextVlr3ActionPerformed(evt);
            }
        });

        jBCalc1.setText("Calcular");
        jBCalc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalc1ActionPerformed(evt);
            }
        });

        jBCalc2.setText("Calcular");
        jBCalc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalc2ActionPerformed(evt);
            }
        });

        jBCalc3.setText("Calcular");
        jBCalc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalc3ActionPerformed(evt);
            }
        });

        jBotaoLocar.setText("Locar");

        javax.swing.GroupLayout jPanelCatPopularLayout = new javax.swing.GroupLayout(jPanelCatPopular);
        jPanelCatPopular.setLayout(jPanelCatPopularLayout);
        jPanelCatPopularLayout.setHorizontalGroup(
            jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCatPopularLayout.createSequentialGroup()
                .addGroup(jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCatPopularLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelValorCarro1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorCarro2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabelValorCarro3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCatPopularLayout.createSequentialGroup()
                        .addGroup(jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCatPopularLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(carro1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCatPopularLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLQntDias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerDias1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBCalc1))
                            .addGroup(jPanelCatPopularLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(jtextVlr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCatPopularLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLQntDias1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerDias2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBCalc2))
                            .addGroup(jPanelCatPopularLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carro3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelCatPopularLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtextVlr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 13, Short.MAX_VALUE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carro2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCatPopularLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtextVlr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCatPopularLayout.createSequentialGroup()
                                .addComponent(jLQntDias2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerDias3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBCalc3)))))
                .addGap(36, 36, 36))
            .addGroup(jPanelCatPopularLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jBotaoLocar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCatPopularLayout.setVerticalGroup(
            jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCatPopularLayout.createSequentialGroup()
                .addGroup(jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carro1)
                    .addComponent(carro3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carro2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jtextVlr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextVlr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextVlr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerDias1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerDias2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLQntDias)
                    .addComponent(jLQntDias1)
                    .addComponent(jBCalc3)
                    .addComponent(jBCalc1)
                    .addComponent(jBCalc2)
                    .addComponent(jSpinnerDias3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLQntDias2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCatPopularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelValorCarro3)
                    .addComponent(jLabelValorCarro2)
                    .addComponent(jLabelValorCarro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotaoLocar))
        );

        carro1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanelCatPopular);
        jPanelCatPopular.setBounds(16, 65, 741, 267);

        janelaInterna1.setTitle("Locação > Formas de Pagamento");
        janelaInterna1.setVisible(false);

        javax.swing.GroupLayout janelaInterna1Layout = new javax.swing.GroupLayout(janelaInterna1.getContentPane());
        janelaInterna1.getContentPane().setLayout(janelaInterna1Layout);
        janelaInterna1Layout.setHorizontalGroup(
            janelaInterna1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        janelaInterna1Layout.setVerticalGroup(
            janelaInterna1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(janelaInterna1);
        janelaInterna1.setBounds(1726, 891, 0, 0);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtextVlr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextVlr3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextVlr3ActionPerformed

    private void jtextVlr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextVlr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextVlr2ActionPerformed

    private void carro1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carro1MousePressed

    }//GEN-LAST:event_carro1MousePressed

    private void carro1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carro1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_carro1FocusGained

    private void jBCalc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalc1ActionPerformed
        //calculo das Diárias;
        int qnt = Integer.parseInt(jSpinnerDias1.getValue().toString());
        float valor = Float.parseFloat(jtextVlr1.getText());
        float total = qnt * valor;
        jLabelValorCarro1.setText(String.format("%.2f",total));
    }//GEN-LAST:event_jBCalc1ActionPerformed

    private void jtextVlr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextVlr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextVlr1ActionPerformed

    private void jBCalc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalc2ActionPerformed
        //calculo das Diárias;
        int qnt = Integer.parseInt(jSpinnerDias2.getValue().toString());
        float valor = Float.parseFloat(jtextVlr2.getText());
        float total = qnt * valor;
        jLabelValorCarro2.setText(String.format("%.2f",total));
    }//GEN-LAST:event_jBCalc2ActionPerformed

    private void jBCalc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalc3ActionPerformed
        //calculo das Diárias;
        int qnt = Integer.parseInt(jSpinnerDias3.getValue().toString());
        float valor = Float.parseFloat(jtextVlr3.getText());
        float total = qnt * valor;
        jLabelValorCarro3.setText(String.format("%.2f",total));
    }//GEN-LAST:event_jBCalc3ActionPerformed

    private void carro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carro1MouseClicked
       
    }//GEN-LAST:event_carro1MouseClicked

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
            java.util.logging.Logger.getLogger(TelaTabelaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTabelaVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTabelaVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloTelaTabVeiculos;
    private javax.swing.JLabel carro1;
    private javax.swing.JLabel carro2;
    private javax.swing.JLabel carro3;
    private javax.swing.JButton jBCalc1;
    private javax.swing.JButton jBCalc2;
    private javax.swing.JButton jBCalc3;
    private javax.swing.JButton jBotaoLocar;
    private javax.swing.JLabel jLQntDias;
    private javax.swing.JLabel jLQntDias1;
    private javax.swing.JLabel jLQntDias2;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelValorCarro1;
    private javax.swing.JLabel jLabelValorCarro2;
    private javax.swing.JLabel jLabelValorCarro3;
    private javax.swing.JPanel jPanelCatPopular;
    private javax.swing.JSpinner jSpinnerDias1;
    private javax.swing.JSpinner jSpinnerDias2;
    private javax.swing.JSpinner jSpinnerDias3;
    private javax.swing.JInternalFrame janelaInterna1;
    private javax.swing.JTextField jtextVlr1;
    private javax.swing.JTextField jtextVlr2;
    private javax.swing.JTextField jtextVlr3;
    // End of variables declaration//GEN-END:variables
}

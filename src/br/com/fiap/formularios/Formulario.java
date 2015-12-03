package br.com.fiap.formularios;

import br.com.fiap.modelo.Orcamento;
import javax.swing.JOptionPane;
import br.com.fiap.dao.ClienteDAO;
import java.util.Random;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboTurbinaP = new javax.swing.JComboBox();
        cboTurbinaM = new javax.swing.JComboBox();
        cboTurbinaG = new javax.swing.JComboBox();
        cboRegiao = new javax.swing.JComboBox();
        txtTotal = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOrcamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orçamento de Turbinas Eólicas");
        setResizable(false);

        jLabel9.setText("Número do Orçamento:");

        jLabel10.setText("Cliente:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setText("Turbinas Pequenas");

        jLabel11.setText("Turbinas médias");

        jLabel12.setText("Turbinas grandes");

        cboTurbinaP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        cboTurbinaM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        cboTurbinaG.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        cboRegiao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboRegiao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Centro-Oeste", "Sudeste", "Sul", "Nordeste", "Norte" }));
        cboRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRegiaoActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        btnCalcular.setText("Clacular Total");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar Campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnInserir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnInserir.setText("Inserir novo");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setEnabled(false);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar atual");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir atual");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel2.setText("Total em R$");

        jLabel3.setText("Região:");

        txtOrcamento.setEditable(false);
        txtOrcamento.setBackground(new java.awt.Color(204, 204, 204));
        txtOrcamento.setDisabledTextColor(new java.awt.Color(0, 51, 255));
        txtOrcamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOrcamentoFocusLost(evt);
            }
        });
        txtOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrcamentoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Orçamento de Turbinas Eólicas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(cboTurbinaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(91, 91, 91)
                                            .addComponent(cboTurbinaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cboTurbinaG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(65, 65, 65)
                                            .addComponent(jLabel11)
                                            .addGap(49, 49, 49)
                                            .addComponent(jLabel12))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(244, 244, 244)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btnCalcular)))))
                        .addGap(118, 118, 118))))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnEditar)
                    .addComponent(btnPesquisar)
                    .addComponent(txtOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTurbinaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTurbinaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTurbinaG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private final String orcInvalidoMSG = "Orçamento inválido. Por favor, digite apenas números e não deixe o campo em branco.";
    private final String identOrcMSG = "Identificação de Orçamento";
    private final String orcInexistMSG = "Orçamento inexistente na base de dados! Verifique o número.";


    private void cboRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRegiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboRegiaoActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        calcularTotal();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCamposTxt();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(this, "Gostaria de sair do programa?", "Saindo...", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed


    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed

        String cliente = txtNome.getText();
        String regiao = cboRegiao.getSelectedItem().toString();
        int qtdPequena = Integer.parseInt(cboTurbinaP.getSelectedItem().toString());
        int qtdMedia = Integer.parseInt(cboTurbinaM.getSelectedItem().toString());
        int qtdGrande = Integer.parseInt(cboTurbinaG.getSelectedItem().toString());

        if (cliente.trim().length() > 0) {
            if (qtdPequena > 0 || qtdMedia > 0 || qtdGrande > 0) {

                Random random = new Random();
                Orcamento aux = null;

                int numeroOrcamento = Math.abs(random.nextInt(100000) + 1000); //limitei o random para a id do orçamento não ficar imenso (será possível cadastrar até 100001 clientes)

                ClienteDAO clienteDAO = new ClienteDAO();

                aux = clienteDAO.pesquisar(numeroOrcamento);
                int k = 0;

                while (aux != null) {
                    numeroOrcamento = Math.abs(random.nextInt() + 1000);
                    aux = clienteDAO.pesquisar(numeroOrcamento);
                    k++;
                    if (k > 100001) {
                        JOptionPane.showMessageDialog(this, "O limite de 100001 orçamentos foi preenchido na base de dados. Exclua alguns para poder inserir novos.", "Base de dados lotada", JOptionPane.WARNING_MESSAGE);
                        break;

                    }
                }
                if (k < 10002) {
                    calcularTotal();

                    Double total = Double.parseDouble(txtTotal.getText());

                    Orcamento orcamento = new Orcamento(numeroOrcamento, cliente, qtdPequena, qtdMedia, qtdGrande, regiao, total);

                    clienteDAO.inserir(orcamento);

                    txtOrcamento.setText(String.valueOf(numeroOrcamento));

                    JOptionPane.showMessageDialog(this, "Orçamento de número " + numeroOrcamento + " inserido com sucesso na base de dados.", "Inserção de dados", JOptionPane.PLAIN_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, escolha a quantidade de ao menos uma turbina.", "Dados faltando", JOptionPane.WARNING_MESSAGE);
                cboTurbinaP.requestFocus();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Digite o nome do cliente.", "Dados faltando", JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
        }

    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            int numeroOrcamento = Integer.parseInt(txtOrcamento.getText());
            ClienteDAO clienteDAO = new ClienteDAO();
            Orcamento orcamento = clienteDAO.pesquisar(numeroOrcamento);
            if (orcamento == null) {
                JOptionPane.showMessageDialog(this, orcInexistMSG, identOrcMSG, JOptionPane.ERROR_MESSAGE);
                habilitarEdicao();
            } else {
                txtOrcamento.setText(String.valueOf(orcamento.getNumeroOrcamento()));
                txtNome.setText(orcamento.getCliente());
                cboRegiao.setSelectedItem(orcamento.getRegiao());
                cboTurbinaG.setSelectedIndex(orcamento.getQtdGrande());
                cboTurbinaM.setSelectedIndex(orcamento.getQtdMedia());
                cboTurbinaP.setSelectedIndex(orcamento.getQtdPequena());

                txtOrcamento.requestFocus();
                calcularTotal();

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, orcInvalidoMSG, identOrcMSG, JOptionPane.ERROR_MESSAGE);
            habilitarEdicao();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            int numeroOrcamento = Integer.parseInt(txtOrcamento.getText());
            ClienteDAO clienteDAO = new ClienteDAO();
            Orcamento verifica = clienteDAO.pesquisar(numeroOrcamento);
            if (verifica == null) {
                JOptionPane.showMessageDialog(this, orcInexistMSG, identOrcMSG, JOptionPane.WARNING_MESSAGE);
                habilitarEdicao();
            } else {

                String cliente = txtNome.getText();
                String regiao = cboRegiao.getSelectedItem().toString();
                int qtdPequena = Integer.parseInt(cboTurbinaP.getSelectedItem().toString());
                int qtdMedia = Integer.parseInt(cboTurbinaM.getSelectedItem().toString());
                int qtdGrande = Integer.parseInt(cboTurbinaG.getSelectedItem().toString());

                calcularTotal();

                Double total = Double.parseDouble(txtTotal.getText());

                Orcamento orcamento = new Orcamento(numeroOrcamento, cliente, qtdPequena, qtdMedia, qtdGrande, regiao, total);

                clienteDAO.alterar(orcamento);

                limparCamposTxt();
                JOptionPane.showMessageDialog(this, "Modificação realizada com sucesso nos dados do orçamento de número: " + numeroOrcamento, "Alteração bem sucedida", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, orcInvalidoMSG, identOrcMSG, JOptionPane.ERROR_MESSAGE);
            habilitarEdicao();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            int numOrcamento = Integer.parseInt(txtOrcamento.getText().trim());
            ClienteDAO clienteDAO = new ClienteDAO();
            Orcamento orcamento = clienteDAO.pesquisar(numOrcamento);
            if (orcamento == null) {
                JOptionPane.showMessageDialog(this, orcInexistMSG, identOrcMSG, JOptionPane.WARNING_MESSAGE);
                habilitarEdicao();
            } else {
                int resp = JOptionPane.showConfirmDialog(this, "Realmente gostaria de excluir o orçamento de número " + numOrcamento + " da base de dados?", "Exclusão", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(this, "Remoção do orçamento de número " + numOrcamento + " realizada com sucesso.", "Exclusão", JOptionPane.INFORMATION_MESSAGE);

                    clienteDAO.excluir(numOrcamento);
                    limparCamposTxt();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, orcInvalidoMSG, identOrcMSG, JOptionPane.ERROR_MESSAGE);
            habilitarEdicao();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitarEdicao();
    }//GEN-LAST:event_btnEditarActionPerformed


    private void txtOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrcamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrcamentoActionPerformed

    private void txtOrcamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOrcamentoFocusLost
        if (txtOrcamento.isEnabled()) {
            txtOrcamento.setEditable(false);
            txtOrcamento.setBackground(new java.awt.Color(204, 204, 204));
        }
        if (txtOrcamento.getText().trim().length() < 1) {
            btnPesquisar.setEnabled(false);
        }
    }//GEN-LAST:event_txtOrcamentoFocusLost

    private void calcularTotal() {

        String qtdp = cboTurbinaP.getSelectedItem().toString();
        String qtdm = cboTurbinaM.getSelectedItem().toString();
        String qtdg = cboTurbinaG.getSelectedItem().toString();

        double total = (Double.parseDouble(qtdp)) * 20000 + (Double.parseDouble(qtdm)) * 30000 + (Double.parseDouble(qtdg)) * 50000;

        txtTotal.setText(String.format("%.2f", total));
    }

    private void habilitarEdicao() {
        txtOrcamento.setBackground(new java.awt.Color(255, 255, 255));
        txtOrcamento.setEditable(true);
        txtOrcamento.requestFocus();
        btnPesquisar.setEnabled(true);

    }

    private void limparCamposTxt() {
        txtOrcamento.setText("");
        txtNome.setText("");
        cboRegiao.setSelectedIndex(0);
        cboTurbinaG.setSelectedIndex(0);
        cboTurbinaM.setSelectedIndex(0);
        cboTurbinaP.setSelectedIndex(0);
        txtTotal.setText("");
        txtNome.requestFocus();
        btnPesquisar.setEnabled(false);

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Formulario formulario = new Formulario();
                formulario.setVisible(true);
                formulario.setLocationRelativeTo(null);
                formulario.txtNome.requestFocus();
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox cboRegiao;
    private javax.swing.JComboBox cboTurbinaG;
    private javax.swing.JComboBox cboTurbinaM;
    private javax.swing.JComboBox cboTurbinaP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtOrcamento;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

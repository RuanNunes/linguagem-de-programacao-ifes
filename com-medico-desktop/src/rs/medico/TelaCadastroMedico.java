package rs.medico;


import javax.swing.JOptionPane;

import model.MedicoPediatra;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruan Nunes
 */
public class TelaCadastroMedico extends javax.swing.JInternalFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form Tela de Cadastro Medico
     */
    public TelaCadastroMedico() {
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

        jLabelNome = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jLabelTempodeServico = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jTextFieldTempoServico = new javax.swing.JTextField();
        jLabelTempodeServicoEspecializacao = new javax.swing.JLabel();
        jTextFieldTempoServicoEsp = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelTamanhoPortaMalas1 = new javax.swing.JLabel();
        jTextFieldEspecialização = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tela de Cadastro de Médicos");

        jLabelNome.setText("Nome");

        jLabelIdade.setText("Idade");

        jLabelTempodeServico.setText("Tempo de Serviço");

        jTextFieldTempoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTempoServicoActionPerformed(evt);
            }
        });

        jLabelTempodeServicoEspecializacao.setText("Tempo de Serviço com Especialização");

        jButtonCancelar.setBackground(new java.awt.Color(255, 0, 51));
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonCadastrar.setBackground(new java.awt.Color(51, 51, 255));
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setBorderPainted(false);
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jLabelTamanhoPortaMalas1.setText("Especialização:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelIdade)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabelTempodeServico))
                                    .addComponent(jLabelTempodeServicoEspecializacao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTempoServicoEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTempoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 85, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTamanhoPortaMalas1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEspecialização))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCadastrar)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdade)
                    .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTempodeServico)
                    .addComponent(jTextFieldTempoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTempodeServicoEspecializacao)
                    .addComponent(jTextFieldTempoServicoEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTamanhoPortaMalas1)
                    .addComponent(jTextFieldEspecialização, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonCancelar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        MedicoPediatra obj = new MedicoPediatra();
        
        try {
        	obj.setNome(jTextFieldNome.getText());
        	obj.setIdade(Integer.parseInt(jTextFieldIdade.getText()));
        	obj.setTempoDeServico(Integer.parseInt(jTextFieldTempoServico.getText()));
        	obj.setTempoDeServicoComExpecializacao(Integer.parseInt(jTextFieldTempoServicoEsp.getText()));
        	obj.setExpecializacao(jTextFieldEspecialização.getText());
            
//            TelaPrincipal.vetor[TelaPrincipal.qtdMedicos] = obj;
//            TelaPrincipal.qtdMedicos = TelaPrincipal.qtdMedicos + 1;
            //TODO
            //fazer chamada para api rest de medicos

            
            JOptionPane.showMessageDialog(this, "Cadastro de Médico realizado com sucesso!");
            this.dispose();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Campo Idade não aceita letrar e nem caractere especial.\n"
												+ "Campo Tempo de Serviço não aceita letrar e nem caractere especial. \n"
												+ "Campo Tempo de Serviço com expecialização não aceita letrar e nem caractere especial.");
		}
 
		
        
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldTempoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTempoServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTempoServicoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelTempodeServico;
    private javax.swing.JLabel jLabelTempodeServicoEspecializacao;
    private javax.swing.JLabel jLabelTamanhoPortaMalas1;
    private javax.swing.JTextField jTextFieldEspecialização;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTempoServico;
    private javax.swing.JTextField jTextFieldTempoServicoEsp;
    // End of variables declaration//GEN-END:variables
}

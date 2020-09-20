package rs.medico;


import javax.swing.table.DefaultTableModel;

import model.MedicoPediatra;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruan Nunes
 */
public class TelaListagemMedicos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Tela de listagem de Medicos
     */
	
	private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicos;
    
    public TelaListagemMedicos() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) this.jTableMedicos.getModel();
        
        for(int i=0; i < TelaPrincipal.qtdMedicos; i++){
            MedicoPediatra obj = new MedicoPediatra();
            obj = TelaPrincipal.vetor[i];
            
            String nome = obj.getNome();
            String idade = String.valueOf(obj.getIdade());
            String tempoServico = String.valueOf(obj.getTempoDeServico());
            String tempoServicoEspe = String.valueOf(obj.getTempoDeServicoComExpecializacao());
            String Especializacao = obj.getExpecializacao();
            
            modelo.addRow(new String[]{nome, idade, tempoServico, tempoServicoEspe, Especializacao});
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tela de Listagem de Médicos");

        jTableMedicos.setAutoCreateRowSorter(true);
        jTableMedicos.setBackground(new java.awt.Color(204, 204, 204));
        jTableMedicos.setForeground(new java.awt.Color(0, 0, 0));
        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade", "Tempo de Serviço", "Tempo de Serviço com Especialização", "Especialização"
            }
        ));
        jScrollPane1.setViewportView(jTableMedicos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }
}

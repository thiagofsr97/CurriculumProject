
package projetoLp1.Interface;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import projetoLp1.Interface.Model.*;

public class Consulta extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consulta
     */
    public Consulta(LinkedList a) {
        curriculos = a;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        lblNome = new javax.swing.JRadioButton();
        lblCPF = new javax.swing.JRadioButton();
        txtCPF = new javax.swing.JFormattedTextField();

        setClosable(true);

        txtNome.setEnabled(false);

        btnConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");
        lblNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNomeActionPerformed(evt);
            }
        });

        lblCPF.setText("CPF:");
        lblCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCPFActionPerformed(evt);
            }
        });

        txtCPF.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCPF))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        boolean encontrei = false;
        
        switch(caso){
            case 0:
                JOptionPane.showMessageDialog(null, "Campos vazios!");
                break;
            case 1:
                if(!txtNome.getText().equals("")){
                    for(int i = 0; i < curriculos.size(); i++){
                        Curriculo x = curriculos.get(i);
                        String nome1 = x.getDados().getNome();
                        String campo = txtNome.getText();

                        if(nome1.equals(campo)){
                            encontrei = true;
                            TelaPrincipal.criaTela(x,i);
                            this.dispose();
                            break;
                        }
                    }
                    if(encontrei == false){
                        JOptionPane.showMessageDialog(this, "Nome não encontrado!\n"
                                                    + "Favor verificar e tentar novamente!");
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Preencha o campo!");
                }
                break;
            case 2:
                if(!txtCPF.getText().equals("")){
                    for(int i = 0; i < curriculos.size(); i++){
                        Curriculo x = curriculos.get(i);
                        String cpf1 = x.getDados().getCpf();
                        String campo = txtCPF.getText();
                        System.out.println("oi");
                        if(cpf1.equals(campo)){
                            encontrei = true;
                            TelaPrincipal.criaTela(x,i);
                            this.dispose();
                            break;
                        }
                    }
                    if(encontrei == false){
                    JOptionPane.showMessageDialog(this, "CPF não encontrado!\n" 
                                                    + "Favor verificar e tentar novamente!");
                }
                }else{
                    JOptionPane.showMessageDialog(this, "Preencha o campo!");
                }
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fazer a busca!");
        }
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void lblNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNomeActionPerformed
       if(lblNome.isSelected()){
           txtNome.setEnabled(true);
           txtCPF.setEnabled(false);
           lblCPF.setSelected(false);
           caso = 1;
       }else{
           txtNome.setEnabled(false);
           lblCPF.setSelected(false);
           caso = 0;
       }
    }//GEN-LAST:event_lblNomeActionPerformed

    private void lblCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCPFActionPerformed
        if(lblCPF.isSelected()){
           txtCPF.setEnabled(true);
           txtNome.setEnabled(false);
           lblNome.setSelected(false);
           caso = 2;
       }else{
           txtCPF.setEnabled(false);
           lblNome.setSelected(false);
           caso = 0;
       }
    }//GEN-LAST:event_lblCPFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JRadioButton lblCPF;
    private javax.swing.JRadioButton lblNome;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
    private static LinkedList<Curriculo> curriculos;
    private static int caso = 0;
}

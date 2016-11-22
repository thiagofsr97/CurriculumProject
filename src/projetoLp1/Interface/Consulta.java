
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
        lblIndice = new javax.swing.JRadioButton();
        txtIndice = new javax.swing.JFormattedTextField();

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

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setEnabled(false);

        lblIndice.setText("Índice:");
        lblIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblIndiceActionPerformed(evt);
            }
        });

        txtIndice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtIndice.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIndice))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPF)
                            .addComponent(txtIndice))))
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIndice)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        boolean encontrei = false;
        Curriculo x = null;
        int i = 0;
        cont = 0;
        switch(caso){
            case 0:
                JOptionPane.showMessageDialog(null, "Campos vazios!");
                break;
            case 1:
                
                if(!txtNome.getText().equals("")){
                    for(i = 0; i < curriculos.size(); i++){
                        
                        x = curriculos.get(i);
                        String nome1 = x.getDados().getNome();
                        String campo = txtNome.getText();

                        if(nome1.equalsIgnoreCase(campo)){
                            encontrei = true;
                            cont++;
                        }
                    }
                    if(encontrei == false){
                        JOptionPane.showMessageDialog(this, "Nome não encontrado!\n"
                                                    + "Favor verificar e tentar novamente!");
                    }else{
                        if(cont > 1){
                            JOptionPane.showMessageDialog(this, "Foram encontrados "+ cont +" resultados!\n"
                                    + "Para uma busca mais efetiva, procure através do CPF!");
                        }else{
                           TelaPrincipal.criaTela(x,i);
                           this.dispose(); 
                        }
                        
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Preencha o campo!");
                }
                break;
            case 2:
                if(!txtCPF.getText().equals("")){
                    for(i = 0; i < curriculos.size(); i++){
                        x = curriculos.get(i);
                        String cpf1 = x.getDados().getCpf();
                        String campo = txtCPF.getText();
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
            case 3:
                
                if(!txtIndice.getText().equals("")){
                    for(i = 0; i < curriculos.size(); i++){
                        
                        x = curriculos.get(i);
                        int indice1 = Integer.parseInt(txtIndice.getText());
                        
                        if(indice1 == x.getIndice()){
                            encontrei = true;
                            TelaPrincipal.criaTela(x,i);
                            this.dispose();
                            break;
                        }
                    }
                    
                    if(encontrei == false){
                    JOptionPane.showMessageDialog(this, "Índice não encontrado!\n" 
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
           txtCPF.setText("");
           txtIndice.setEnabled(false);
           txtIndice.setText("");
           lblCPF.setSelected(false);
           lblIndice.setSelected(false);
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
           txtNome.setText("");
           txtIndice.setEnabled(false);
           txtIndice.setText("");
           lblNome.setSelected(false);
           lblIndice.setSelected(false);
           caso = 2;
       }else{
           txtCPF.setEnabled(false);
           lblNome.setSelected(false);
           lblIndice.setSelected(false);
           caso = 0;
       }
    }//GEN-LAST:event_lblCPFActionPerformed

    private void lblIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblIndiceActionPerformed
       if(lblIndice.isSelected()){
           txtIndice.setEnabled(true);
           txtCPF.setEnabled(false);
           txtCPF.setText("");
           txtNome.setEnabled(false);
           txtNome.setText("");
           lblCPF.setSelected(false);
           lblNome.setSelected(false);
           caso = 3;
       }else{
           txtIndice.setEnabled(false);
           lblCPF.setSelected(false);
           lblNome.setSelected(false);
           caso = 0;
       }
    }//GEN-LAST:event_lblIndiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JRadioButton lblCPF;
    private javax.swing.JRadioButton lblIndice;
    private javax.swing.JRadioButton lblNome;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtIndice;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
    private static LinkedList<Curriculo> curriculos;
    private static int caso = 0;
    private int cont = 0;
}

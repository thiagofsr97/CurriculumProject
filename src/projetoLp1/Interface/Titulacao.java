/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoLp1.Interface;


import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import projetoLp1.Interface.Model.ClasseTitulacao;
import projetoLp1.Interface.Model.Utils;

/**
 *
 * @author João
 */
public class Titulacao extends javax.swing.JInternalFrame {

    /**
     * Creates new form Titulacao
     */
    public Titulacao() {
        initComponents();
        addInternalFrameListener(new InternalFrameAdapter(){
            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                // do something  
                TelaPrincipal.gerenciaTela(6);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        boxGrau = new javax.swing.JComboBox<>();
        txtCurso = new javax.swing.JTextField();
        boxAno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boxInstituicao = new javax.swing.JComboBox<>();
        Insti = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boxEstado = new javax.swing.JComboBox<>();
        bntAvancar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnADD = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Titulação");

        jLabel9.setText("Ano de conclusão:");

        boxGrau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bacharel", "Licenciado", "Tecnólogo" }));

        boxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));

        jLabel1.setText("em");

        jLabel2.setText("Instituição:");

        boxInstituicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UEPB - Universidade Estadual da Paraíba", "IFPB - Instituto Federal da Paraíba", "UFPB - Universidade Federal da Paraíba", "UFCG - Universidade Federal de Campina Grande", "UNIPÊ - Centro Universitário de João Pessoa", "FPB - Faculdade Internacional da Paraíba", "LUMEN FAC - Faculdade de Ciências Contábeis Luiz Mendes", "LUMEN FAC - Faculdade de Ciências Médicas da Paraíba", "FACENE - Faculdade de Enfermagem Nova Esperança", "Outra (Especificar)" }));
        boxInstituicao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxInstituicaoItemStateChanged(evt);
            }
        });

        Insti.setEnabled(false);

        jLabel3.setText("UF:");

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        bntAvancar.setText("Avançar");
        bntAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAvancarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnADD.setText("Adicionar Outro");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        jLabel4.setText("Cidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(btnADD)
                .addGap(138, 138, 138)
                .addComponent(bntAvancar)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxGrau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCurso)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(txtCidade)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxInstituicao, 0, 1, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Insti, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(boxGrau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bntAvancar)
                    .addComponent(btnADD)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipal.gerenciaTela(1);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void bntAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAvancarActionPerformed

            if(boxInstituicao.getSelectedItem().toString().equals("Outra (Especificar)")){
                escola = txtCurso.getText();
            } else{
                escola = boxInstituicao.getSelectedItem().toString();
            }
            // Montando String caso só queira adicionar uma titulação       
                      

        if(montaTitulacao()){
            dados.setTitulacao(titulacao);
            TelaPrincipal.recebeTitulacao(dados); // Metodo que recebe titulacao
            TelaPrincipal.gerenciaTela(3);
        }
    }//GEN-LAST:event_bntAvancarActionPerformed

    private void boxInstituicaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxInstituicaoItemStateChanged
        if(boxInstituicao.getSelectedItem().toString().equals("Outra (Especificar)")){
        Insti.setEnabled(true);
        } else Insti.setEnabled(false);
    }//GEN-LAST:event_boxInstituicaoItemStateChanged

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
       // ADICIONAR TODOS OS CAMPOS A STRING E DEPOIS LIMPAR OS CAMPOS
      // outraTitulacao = false; //Variavel para informar que existe mais de uma titulacao
       
       if(boxInstituicao.getSelectedItem().toString().equals("Outra (Especificar)")){
           escola = txtCurso.getText();
       } else{
           escola = boxInstituicao.getSelectedItem().toString();
       }
       // Montando String para mais de uma titulação
       
            
       if(montaTitulacao()){
        limpaTela();    
       }
       
       
    }//GEN-LAST:event_btnADDActionPerformed
    
    private boolean isFilled(){
    boolean checking = true;
        for(int i = 0; i<getContentPane().getComponentCount();i++){
            Component c = getContentPane().getComponent(i);
            if(c instanceof JTextField){
                JTextField txtField = (JTextField) c;
                if(txtField.isEnabled()){
                    if(Utils.isEmptyOrNUll(txtField)){
                        checking = false;
                        txtField.setBackground(Color.red);
                    }else{
                        txtField.setBackground(Color.white);
                    }
                    
                }// second if
            }// first if        
            
        }//for statement    
              
        return checking;
     
    }
    private boolean montaTitulacao(){
       
        if(isFilled()){
            titulacao += boxAno.getSelectedItem().toString()+ " - " +
                    boxGrau.getSelectedItem().toString()+ " em " + txtCurso.getText().trim() +
                    " - " + escola + " - "
                    + boxEstado.getSelectedItem().toString() + " - " 
                    + txtCidade.getText()+ "\n";
            return true;
        }else{
            Utils.verifyField(this);
            return false;
        }
        
    }
    
    private void limpaTela(){
        txtCidade.setText("");
        txtCurso.setText("");
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JTextField Insti;
    private javax.swing.JButton bntAvancar;
    private static javax.swing.JComboBox<String> boxAno;
    private javax.swing.JComboBox<String> boxEstado;
    private static javax.swing.JComboBox<String> boxGrau;
    private static javax.swing.JComboBox<String> boxInstituicao;
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCidade;
    static javax.swing.JTextField txtCurso;
    // End of variables declaration//GEN-END:variables
    private ClasseTitulacao dados = new ClasseTitulacao();
    private String titulacao = "";
   
    private String escola = "";
    
}

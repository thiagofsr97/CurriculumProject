/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoLp1.Interface;

import java.awt.Color;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import projetoLp1.Interface.Model.ClasseExpRelevante;
import projetoLp1.Interface.Model.Utils;

/**
 *
 * @author João
 */
public class ExpRelevante extends javax.swing.JInternalFrame {

    /**
     * Creates new form ExpDocente
     */
    public ExpRelevante() {
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

        boxInicio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        boxFim = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        Instituicao = new javax.swing.JComboBox<>();
        OutraInsti = new javax.swing.JTextField();
        boxEstado = new javax.swing.JComboBox<>();
        txtCidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAvancar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnADD = new javax.swing.JButton();

        setClosable(true);
        setTitle("Experiência Profissional Relevante");

        boxInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));

        jLabel1.setText("-");

        boxFim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        Instituicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UEPB - Universidade Estadual da Paraíba", "IFPB - Instituto Federal da Paraíba", "UFPB - Universidade Federal da Paraíba", "UFCG - Universidade Federal de Campina Grande", "UNIPÊ - Centro Universitário de João Pessoa", "FPB - Faculdade Internacional da Paraíba", "LUMEN FAC - Faculdade de Ciências Contábeis Luiz Mendes", "LUMEN FAC - Faculdade de Ciências Médicas da Paraíba", "FACENE - Faculdade de Enfermagem Nova Esperança", "Outra (Especificar)" }));
        Instituicao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                InstituicaoItemStateChanged(evt);
            }
        });

        OutraInsti.setEnabled(false);

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        txtCidade.setName(""); // NOI18N

        jLabel3.setText("UF:");

        jLabel4.setText("Cidade:");

        jLabel2.setText("Instituição:");

        jLabel5.setText("Início");

        jLabel6.setText("Fim");

        jLabel7.setText("Descrição da Atividade");

        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnADD)
                        .addGap(165, 165, 165)
                        .addComponent(btnAvancar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Instituicao, 0, 1, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OutraInsti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxInicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxFim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(boxFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Instituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutraInsti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvancar)
                    .addComponent(btnVoltar)
                    .addComponent(btnADD))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       TelaPrincipal.gerenciaTela(3);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        
        instituicao = Instituicao.getSelectedItem().toString();
            if(Instituicao.getSelectedItem().toString().equals("Outra (Especificar)")){
                instituicao = OutraInsti.getText();
            }
            // Monta String
            montaExpRelevante();
       // }
        if(checked){
            TelaPrincipal.recebeExpRelevante(new ClasseExpRelevante(expRelevante));//Cria obj e chama metodo da tela principal
            TelaPrincipal.gerenciaTela(5);    
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void InstituicaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_InstituicaoItemStateChanged
        if(Instituicao.getSelectedItem().toString().equals("Outra (Especificar)")){
        OutraInsti.setEnabled(true);
        } else OutraInsti.setEnabled(false);
    }//GEN-LAST:event_InstituicaoItemStateChanged

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        // Montar String com todos os campos
        // Criar OBJ ClasseExpRelevante
        // Chamar metodo TelaPrincipal.recebeExpRelevante(Passando Obj criado)
        // Limpar Campos
        
        instituicao = Instituicao.getSelectedItem().toString();
        if(Instituicao.getSelectedItem().toString().equals("Outra (Especificar)")){
            instituicao = OutraInsti.getText();
        }
        
        montaExpRelevante();
        
//        menosDeUm = false;
        if(checked){
            limpaTela();
        }
    }//GEN-LAST:event_btnADDActionPerformed

     private void limpaTela(){
        txtDescricao.setText("");
        txtCidade.setText("");
        OutraInsti.setText("");
    }
     
    private void montaExpRelevante(){
        checked = true;
        if(Instituicao.getSelectedItem().toString().equals("Outra (Especificar)")){
            if(Utils.isEmptyOrNUll(OutraInsti)){
                OutraInsti.setBackground(Color.red);
                checked = false;
            }
            else{
                OutraInsti.setBackground(Color.white);
            }
        }
        if(Utils.isEmptyOrNUll(txtCidade)){
            txtCidade.setBackground(Color.red);
            checked = false;
        }else{
            txtCidade.setBackground(Color.white);
        }
        if(txtDescricao.getText().isEmpty()){
            txtDescricao.setBackground(Color.red);
            checked = false;
        }else{
            txtDescricao.setBackground(Color.white);
        }
        
        if(checked){
            expRelevante += boxInicio.getSelectedItem().toString() + "-"
                       +  boxFim.getSelectedItem().toString() + "-"
                       +  txtDescricao.getText() + "-"
                       +  instituicao + "-" + boxEstado.getSelectedItem().toString() + "-" 
                       +  txtCidade.getText() + "\n";
        }else{
            Utils.verifyField(this);
        }
        
        System.out.println(expRelevante);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> Instituicao;
    static javax.swing.JTextField OutraInsti;
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JComboBox<String> boxFim;
    private javax.swing.JComboBox<String> boxInicio;
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextArea txtDescricao;
    // End of variables declaration//GEN-END:variables
    private String expRelevante = "";
    private boolean checked = true;
    private String instituicao = "";


}


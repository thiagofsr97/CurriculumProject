
package projetoLp1.Interface;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import static java.awt.image.ImageObserver.WIDTH;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import projetoLp1.Interface.Model.ClasseExpRelevante;
import projetoLp1.Interface.Model.Utils;

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
        boxInicio = new com.toedter.calendar.JDateChooser();
        boxFim = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setTitle("Experiência Profissional Relevante");

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

        jLabel5.setText("Início:");

        jLabel6.setText("Fim:");

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
                        .addGap(190, 190, 190)
                        .addComponent(btnAvancar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OutraInsti)
                            .addComponent(Instituicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(boxFim, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(boxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(boxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
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
            
       // }
        if(montaExpRelevante()){
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
        
        
//        menosDeUm = false;
        if(montaExpRelevante()){
            limpaTela();
        }
    }//GEN-LAST:event_btnADDActionPerformed

     private void limpaTela(){
        txtDescricao.setText("");
        txtCidade.setText("");
        OutraInsti.setText("");
    }
     
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
            
            if(c instanceof JScrollPane){
                JScrollPane scroll = (JScrollPane) c;
                if(scroll.getViewport().getView() instanceof JTextArea){
                    JTextArea txtArea = (JTextArea) scroll.getViewport().getView();
                    if(txtArea.getText().isEmpty()){
                        txtArea.setBackground(Color.red);
                        checking = false;
                    }else{
                        txtArea.setBackground(Color.white);
                    }
                }
            }
            
            if(c instanceof JDateChooser){
                if(c.getName().equals("boxInicio")){
                    JDateChooser boxInicio1 = (JDateChooser) c;
                }else{
                    JDateChooser boxFim1 = (JDateChooser) c;
                }
            
        }
        }//for statement
        
        try{
            dataInicio = formatador.format(boxInicio.getDate());
            dataFim = formatador.format(boxFim.getDate());
        }catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this, "Verifique os campos de Datas e tente novamente!", "Atenção", WIDTH);
            checking = false;
        }
        
        return checking;
     
    }
    private boolean montaExpRelevante(){       
        if(isFilled()){
            expRelevante += dataInicio + " - "
                       +  dataFim + " - "
                       +  txtDescricao.getText().trim() + " - "
                       +  instituicao.trim() + " - " + boxEstado.getSelectedItem().toString() + " - " 
                       +  txtCidade.getText().trim() + "\n";
            return true;
        }else{
            Utils.verifyField(this);
            return false;
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> Instituicao;
    static javax.swing.JTextField OutraInsti;
    private javax.swing.JComboBox<String> boxEstado;
    private com.toedter.calendar.JDateChooser boxFim;
    private com.toedter.calendar.JDateChooser boxInicio;
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnVoltar;
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
    
    private String instituicao = "";
    
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    String dataInicio, dataFim;


}


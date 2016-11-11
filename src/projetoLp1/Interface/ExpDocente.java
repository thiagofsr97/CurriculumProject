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
import projetoLp1.Interface.Model.ClasseExpDocente;
import projetoLp1.Interface.Model.Utils;

public class ExpDocente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ExpDocente
     */
    public ExpDocente() {
        initComponents();
        addInternalFrameListener(new InternalFrameAdapter(){
            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
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
        boxInsti = new javax.swing.JComboBox<>();
        Insti = new javax.swing.JTextField();
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
        setTitle("Experiência Profissional Docente");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        boxInsti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UEPB - Universidade Estadual da Paraíba", "IFPB - Instituto Federal da Paraíba", "UFPB - Universidade Federal da Paraíba", "UFCG - Universidade Federal de Campina Grande", "UNIPÊ - Centro Universitário de João Pessoa", "FPB - Faculdade Internacional da Paraíba", "LUMEN FAC - Faculdade de Ciências Contábeis Luiz Mendes", "LUMEN FAC - Faculdade de Ciências Médicas da Paraíba", "FACENE - Faculdade de Enfermagem Nova Esperança", "Outra (Especificar)" }));
        boxInsti.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxInstiItemStateChanged(evt);
            }
        });

        Insti.setEnabled(false);

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

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
                        .addGap(185, 185, 185)
                        .addComponent(btnAvancar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxInsti, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Insti, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(boxFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxInsti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvancar)
                    .addComponent(btnVoltar)
                    .addComponent(btnADD))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipal.gerenciaTela(2);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
       
            instituicao = boxInsti.getSelectedItem().toString();
            if(boxInsti.getSelectedItem().toString().equals("Outra (Especificar)")){
                instituicao = Insti.getText().trim();
            }
            // Monta String
            
        if(montaExpDocente()){
            TelaPrincipal.recebeExpDocente(new ClasseExpDocente(expDocente));//Cria obj e chama metodo da tela principal
            TelaPrincipal.gerenciaTela(4);    
        }
        
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void boxInstiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxInstiItemStateChanged
        if(boxInsti.getSelectedItem().toString().equals("Outra (Especificar)")){
        Insti.setEnabled(true);
        } else Insti.setEnabled(false);
    }//GEN-LAST:event_boxInstiItemStateChanged

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        
        instituicao = boxInsti.getSelectedItem().toString();
        if(boxInsti.getSelectedItem().toString().equals("Outra (Especificar)")){
            instituicao = Insti.getText().trim();
        }
          
        if(montaExpDocente()){
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
    
    private boolean montaExpDocente(){
        if(isFilled()){
            expDocente += dataInicio + " - "
                       +  dataFim  + " - "
                       +  txtDescricao.getText().trim() + " - "
                       +  instituicao + " - " + boxEstado.getSelectedItem().toString() + " - " 
                       +  txtCidade.getText().trim() + "\n";
            return true;
        }else{
            Utils.verifyField(this);
            return false;
        }       
    }
    
    private void limpaTela(){
        txtDescricao.setText("");
        txtCidade.setText("");
        Insti.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JTextField Insti;
    private javax.swing.JComboBox<String> boxEstado;
    private com.toedter.calendar.JDateChooser boxFim;
    private com.toedter.calendar.JDateChooser boxInicio;
    private static javax.swing.JComboBox<String> boxInsti;
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
    private String instituicao = "";   
    private String expDocente = "";   
    private SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    private String dataInicio, dataFim;
}

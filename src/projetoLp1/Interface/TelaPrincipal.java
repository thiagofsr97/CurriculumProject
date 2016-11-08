package projetoLp1.Interface;

import java.util.LinkedList;
import projetoLp1.Interface.Model.*;


public class TelaPrincipal extends javax.swing.JFrame {
    
    

    public TelaPrincipal() {
        initComponents();
        if(p.isFile(fileName)){
            p.setupLer(fileName);
            if (p.getContinua()== true){
                p.readRecords();
                p.cleanupLer();
                curriculos = p.getCadcel();
                
            }
            System.out.println("Open file sucessful!");
            this.setLocationRelativeTo(null);
        }
        
    
    }
    
    public static void criaTela(Curriculo a, int index){
        TelaConsulta tc = new TelaConsulta(a,index);
        Painel.add(tc);
        tc.setVisible(true);
    }
    
    public static void recebeDados(ClasseDados e){
        TelaPrincipal.cd = e;
    }
    
    public static void recebeTitulacao(ClasseTitulacao e){
        TelaPrincipal.ct = e;
    }
    
    public static void recebeExpDocente(ClasseExpDocente e){
        TelaPrincipal.ced = e;
    }
    
    public static void recebeExpRelevante(ClasseExpRelevante e){
        TelaPrincipal.cer = e;
    }
    
    public static void recebePublicacao(ClassePublicacao e){
        TelaPrincipal.cp = e;
        montaObj();
    }
    
    public static void montaObj(){
        Curriculo x = new Curriculo(cd, ct, ced, cer, cp);
        curriculos.add(x); 
        
    }
    public static void alteraCurriculo(int index,Curriculo curriculo){
        curriculos.set(index, curriculo);
    }
    
    public static void gerenciaTela(int x){
 
        switch (x) {
            case 1:
                tela1.setVisible(true);
                tela2.setVisible(false);
                break;
            case 2:
                tela1.setVisible(false);
                tela2.setVisible(true);
                tela3.setVisible(false);
                break;
            case 3:
                tela2.setVisible(false);
                tela3.setVisible(true);
                tela4.setVisible(false);
                break;
            case 4:
                
                tela3.setVisible(false);
                tela4.setVisible(true);
                tela5.setVisible(false);
                break;
            case 5:
                tela4.setVisible(false);
                tela5.setVisible(true);
                break;
            case 6:
                tela1.dispose();
                tela2.dispose();
                tela3.dispose();
                tela4.dispose();
                tela5.dispose();              
                break;
            default:
                break;
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

        Painel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Cadastrar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel.setBackground(new java.awt.Color(255, 255, 255));
        Painel.setPreferredSize(new java.awt.Dimension(805, 750));

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );

        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setName(""); // NOI18N

        jMenu1.setText("Cadastro");

        Cadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        Cadastrar.setText("Cadastrar Currículo");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(Cadastrar);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Pesquisar Currículo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu1.add(Sair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        tela1 = new DadosPessoais();
        tela2 = new Titulacao();
        tela3 = new ExpDocente();
        tela4 = new ExpRelevante();
        tela5 = new Publicacao();
        pack();
        Painel.add(tela1);
        Painel.add(tela2);
        Painel.add(tela3);
        Painel.add(tela4);
        Painel.add(tela5);
        tela1.setVisible(true);
        tela2.setVisible(false);
        tela3.setVisible(false);
        tela4.setVisible(false);
        tela5.setVisible(false);
        
        
    }//GEN-LAST:event_CadastrarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        p.setupGravar("Curriculo.ser");
        p.addRecords(curriculos);
        p.cleanupGravar();
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        Consulta tela6 = new Consulta(curriculos);
        pack();
        Painel.add(tela6);
        tela6.setVisible(true);
    
    }//GEN-LAST:event_ConsultarActionPerformed
    
    
   
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cadastrar;
    private static javax.swing.JDesktopPane Painel;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
    
    public static DadosPessoais tela1;
    public static Titulacao tela2;
    public static ExpDocente tela3;
    public static ExpRelevante tela4;
    public static Publicacao tela5;
    public static ClasseDados cd;
    public static ClasseTitulacao ct;
    public static ClasseExpDocente ced;
    public static ClasseExpRelevante cer;
    public static ClassePublicacao cp;

    public static LinkedList<Curriculo> curriculos = new LinkedList<Curriculo>();
    
    private static final int pos = 0;
    private final Persistencia p = new Persistencia ();
    private final String fileName = "Curriculo.ser";
}
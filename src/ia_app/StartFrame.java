/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_app;

import java.awt.BorderLayout;

/**
 *
 * @author jinjar17
 */
public class StartFrame extends javax.swing.JFrame {
    
    private WelcomePanel p;
    private javax.swing.JPanel panels[] = new javax.swing.JPanel[2];
    private int WIDTH = 400;
    /**
     * Creates new form StartFrame
     */
    public StartFrame() {
        initComponents();
        this.p = new WelcomePanel();
        p.setParent(this);
        p.setSize(WIDTH, WIDTH);
        /*createPanel(p);
        this.g = new GamePanel();
        g.setParent(this);
        g.setSize(WIDTH, WIDTH);
        createPanel(g);
        this.panels[0] = p;
        this.panels[1] = g;*/
        this.setLayout(new BorderLayout());
        this.add(p, BorderLayout.CENTER);
        p.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        }); 
    }
    
    /*
    public void showPanel(int i){
        this.add(panels[i], BorderLayout.CENTER);
        panels[i].setVisible(true);
    }
    
    public void createPanel(javax.swing.JPanel a){
        a.setSize(400, 400);
        this.add(a, BorderLayout.CENTER);
    }
    */
    public WelcomePanel getHome(){
        return p;
    }
    
    public void createGame(){
        GamePanel g = new GamePanel();
        g.setSize(400, 400);
        this.add(g, BorderLayout.CENTER);
        g.setVisible(true);
        g.setParent(this);
    }
    
    public void createStats(){
        StatsPanel s = new StatsPanel();
        s.setSize(400, 400);
        this.add(s, BorderLayout.CENTER);
        s.setVisible(true);
        s.setParent(this);
    }
    
    public void createAnalysis(){
        AnalysisPanel a = new AnalysisPanel();
        a.setSize(400, 400);
        this.add(a, BorderLayout.CENTER);
        a.setVisible(true);
        a.setParent(this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

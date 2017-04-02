/*
 * Chris and Gijs 2016
 * No copy without permision!
 */
package galgje_gc;

/**
 *
 * @author chris & Gijs
 */
public class GalgjeStart extends javax.swing.JFrame {

    /**
     * Creates new form GalgjeStart
     */
    public GalgjeStart() {
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

        engGalgje = new javax.swing.JButton();
        nedGalgje = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(642, 460));
        getContentPane().setLayout(null);

        engGalgje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galgje_gc/galgje foto's/engVlag.png"))); // NOI18N
        engGalgje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engGalgjeActionPerformed(evt);
            }
        });
        getContentPane().add(engGalgje);
        engGalgje.setBounds(460, 290, 100, 100);

        nedGalgje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galgje_gc/galgje foto's/nedVlag.png"))); // NOI18N
        nedGalgje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nedGalgjeActionPerformed(evt);
            }
        });
        getContentPane().add(nedGalgje);
        nedGalgje.setBounds(130, 290, 100, 100);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("<--- Choose your language --->");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 320, 227, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/galgje_gc/galgje foto's/Welkom.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void engGalgjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engGalgjeActionPerformed
        setVisible(false);
        GalgjeEnglish s = new GalgjeEnglish();
        s.setVisible(true);
    }//GEN-LAST:event_engGalgjeActionPerformed

    private void nedGalgjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nedGalgjeActionPerformed
        setVisible(false);
        GalgjeNederlands s = new GalgjeNederlands();
        s.setVisible(true);
    }//GEN-LAST:event_nedGalgjeActionPerformed

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
            java.util.logging.Logger.getLogger(GalgjeStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GalgjeStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GalgjeStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GalgjeStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GalgjeStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton engGalgje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nedGalgje;
    // End of variables declaration//GEN-END:variables
}

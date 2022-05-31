
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Seccion Nocturna
 */
public class Clima extends javax.swing.JFrame {

    /**
     * Creates new form Clima
     */
    public Clima() {
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

        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        lluv1 = new javax.swing.JRadioButton();
        lluv2 = new javax.swing.JRadioButton();
        lluv3 = new javax.swing.JRadioButton();
        lluv4 = new javax.swing.JRadioButton();
        nub1 = new javax.swing.JRadioButton();
        nub2 = new javax.swing.JRadioButton();
        nub3 = new javax.swing.JRadioButton();
        nub4 = new javax.swing.JRadioButton();
        cal1 = new javax.swing.JRadioButton();
        cal2 = new javax.swing.JRadioButton();
        cal3 = new javax.swing.JRadioButton();
        cal4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rlluv = new javax.swing.JLabel();
        rnub = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rsec = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("El tiempo del mañana");

        jToggleButton1.setText("T.LLuviosa");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("T.Seca");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel16.setText("Elije la Temporada ");

        lluv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lluv2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Hoy");

        jLabel3.setText("Ayer");

        jLabel4.setText("Ante-anteayer");

        jLabel7.setText("Anteayer");

        jLabel5.setText("LLuvia");

        jLabel6.setText("Nubes");

        jLabel8.setText("Soleado");

        jLabel9.setText("Estadisticas del mañana");

        rlluv.setText("0%");

        rnub.setText("0%");

        jLabel12.setText("Probabilidad de dia nublado");

        rsec.setText("0%");

        jLabel14.setText("Probabilidad de dia soleado");

        jLabel10.setText("Probabilidad de dia lluvioso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rsec))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(70, 70, 70)
                                        .addComponent(rnub))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rlluv))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(22, 22, 22)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7))
                                    .addGap(62, 62, 62)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lluv1)
                                        .addComponent(lluv2)
                                        .addComponent(lluv3)
                                        .addComponent(lluv4))
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nub1)
                                        .addComponent(nub2)
                                        .addComponent(nub3)
                                        .addComponent(nub4))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cal1)
                                        .addComponent(cal2)
                                        .addComponent(cal3)
                                        .addComponent(cal4))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1)))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(113, 113, 113)
                        .addComponent(jToggleButton2)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lluv1)
                            .addComponent(cal1)
                            .addComponent(nub1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lluv2)
                            .addComponent(cal2)
                            .addComponent(nub2))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lluv3)
                            .addComponent(cal3)
                            .addComponent(nub3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lluv4)
                            .addComponent(cal4)
                            .addComponent(nub4))))
                .addGap(47, 47, 47)
                .addComponent(jLabel16)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2))
                .addGap(35, 35, 35)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rlluv)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rnub))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(rsec))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
     
       double soleado=-2; 
       double lluvia =4;
       double nublado =1;
       
   
        if(lluv1.isSelected()){
            
            lluvia=lluvia+45;
            nublado=nublado+30;
            soleado=soleado+10;
                   
            }
       
        if (lluv2.isSelected()){
            
             lluvia=lluvia+33;
            nublado=nublado+22;
            soleado=soleado+9;
            }
        if (lluv3.isSelected()){
            
            lluvia=lluvia+25;
            nublado=nublado+19;
            soleado=soleado+7;
        }
        if (lluv4.isSelected()){
            
            lluvia=lluvia+10;
            nublado=nublado+5;
            soleado=soleado+3;
        }
        
        
        
        if (nub1.isSelected()){
            
            lluvia=lluvia+27;
            nublado=nublado+46;
            soleado=soleado+25;
        }
        if (nub2.isSelected()){
              
            lluvia=lluvia+15;
            nublado=nublado+32;
            soleado=soleado+21;
        }
        if (nub3.isSelected()){
              
            lluvia=lluvia+13;
            nublado=nublado+25;
            soleado=soleado+17;
        }
        if (nub4.isSelected()){
             
            lluvia=lluvia+6;
            nublado=nublado+10;
            soleado=soleado+7;
        }
        
        
        if (cal1.isSelected()){
              
            lluvia=lluvia+27;
            nublado=nublado+31;
            soleado=soleado+45;
        }
        if (cal2.isSelected()){
              
            lluvia=lluvia+19;
            nublado=nublado+28;
             soleado=soleado+33;
        }
        if (cal3.isSelected()){
              
            lluvia=lluvia+7;
            nublado=nublado+9;
             soleado=soleado+15;
        }
        if (cal4.isSelected()){
              
            lluvia=lluvia+3;
            nublado=nublado+7;
             soleado=soleado+10;
        }
        
        
        
        if (lluvia<=0){
        lluvia=1;
    }
        if (nublado<=0){
        nublado=3;
    }
        if (soleado<=0){
        soleado=5;
    }
        
        
        if (lluvia>=100){
        lluvia=95;
    }
        if (nublado>=100){
        nublado=97;
    }
        if (soleado>=100){
        nublado=98;
    }
        
       rlluv.setText(""+lluvia+"%");
       rnub.setText(""+nublado+"%"); 
       rsec.setText(""+soleado+"%"); 
        
       
        
    
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        double soleado=5; 
       double lluvia =-4;
       double nublado =2;
       
   
        if(lluv1.isSelected()){
            
            lluvia=lluvia+45;
            nublado=nublado+32;
            soleado=soleado+11;
                   
            }
       
        if (lluv2.isSelected()){
            
             lluvia=lluvia+32;
            nublado=nublado+22;
            soleado=soleado+9;
            }
        if (lluv3.isSelected()){
            
            lluvia=lluvia+25;
            nublado=nublado+19;
            soleado=soleado+8;
        }
        if (lluv4.isSelected()){
            
            lluvia=lluvia+10;
            nublado=nublado+6;
            soleado=soleado+3;
        }
         
        if (nub1.isSelected()){
            
            lluvia=lluvia+30;
            nublado=nublado+41;
            soleado=soleado+23;
        }
        if (nub2.isSelected()){
              
            lluvia=lluvia+15;
            nublado=nublado+31;
            soleado=soleado+22;
        }
        if (nub3.isSelected()){
              
            lluvia=lluvia+13;
            nublado=nublado+25;
            soleado=soleado+17;
        }
        if (nub4.isSelected()){
             
            lluvia=lluvia+6;
            nublado=nublado+11;
            soleado=soleado+7;
        }
        
        
        if (cal1.isSelected()){
              
            lluvia=lluvia+27;
            nublado=nublado+31;
            soleado=soleado+43;
        }
        if (cal2.isSelected()){
              
            lluvia=lluvia+19;
            nublado=nublado+27;
             soleado=soleado+31;
        }
        if (cal3.isSelected()){
              
            lluvia=lluvia+7;
            nublado=nublado+9;
             soleado=soleado+14;
        }
        if (cal4.isSelected()){
              
            lluvia=lluvia+4;
            nublado=nublado+7;
             soleado=soleado+10;
        }
        
        
        
        if (lluvia<=0){
        lluvia=1;
    }
        if (nublado<=0){
        nublado=3;
    }
        if (soleado<=0){
        soleado=5;
    }
        
        
        if (lluvia>=100){
        lluvia=95;
    }
        if (nublado>=100){
        nublado=97;
    }
        if (soleado>=100){
        nublado=98;}
        
       rlluv.setText(""+lluvia+"%");
       rnub.setText(""+nublado+"%"); 
       rsec.setText(""+soleado+"%"); 
        
        
        /*
     
        e=Integer.parseInt(b5.getText());    }//GEN-LAST:event_jToggleButton2ActionPerformed
*/}
    private void lluv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lluv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lluv2ActionPerformed

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
            java.util.logging.Logger.getLogger(Clima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cal1;
    private javax.swing.JRadioButton cal2;
    private javax.swing.JRadioButton cal3;
    private javax.swing.JRadioButton cal4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JRadioButton lluv1;
    private javax.swing.JRadioButton lluv2;
    private javax.swing.JRadioButton lluv3;
    private javax.swing.JRadioButton lluv4;
    private javax.swing.JRadioButton nub1;
    private javax.swing.JRadioButton nub2;
    private javax.swing.JRadioButton nub3;
    private javax.swing.JRadioButton nub4;
    private javax.swing.JLabel rlluv;
    private javax.swing.JLabel rnub;
    private javax.swing.JLabel rsec;
    // End of variables declaration//GEN-END:variables
}

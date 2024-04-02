/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pedrapapeltesoura;

/**
 *
 * @author pc
 */
public class Jokenpo extends javax.swing.JFrame {

    /**
     * Creates new form Jokenpo
     */
    public Jokenpo() {
        initComponents();
    }
     public static int randInt(int min, int max) {
        java.util.Random rand = new java.util.Random();
        return rand.nextInt((max - min) + 1) + min;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escolhaPc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pedra = new javax.swing.JButton();
        papel = new javax.swing.JButton();
        tesoura = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        vencedor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escolhaPc.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        escolhaPc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("JOKENPO");

        pedra.setText("Pedra");
        pedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedraActionPerformed(evt);
            }
        });

        papel.setText("Papel");
        papel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papelActionPerformed(evt);
            }
        });

        tesoura.setText("Tesoura");
        tesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tesouraActionPerformed(evt);
            }
        });

        jLabel2.setText("Escolha uma opção para jogar:");

        vencedor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        vencedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RESULTADO:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pc jogou:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(pedra, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(papel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tesoura, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escolhaPc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(vencedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedra, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(papel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tesoura, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(escolhaPc, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(vencedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedraActionPerformed
        // TODO add your handling code here:
        int x = randInt(1,3);
        String escolhaPC = null;
        
        if (x == 1){
            escolhaPC = "Pedra";
        }
        else if( x == 2){
            escolhaPC = "Papel";
        }
        else {
            escolhaPC = "Tesoura";
        }
        

        escolhaPc.setText(escolhaPC);
        String strResultado = null;
        
        if(x == 1){
            strResultado = "EMPATE!";
        }
        else if(x ==2){
            strResultado = "PERDEU!";
            
        }else{
            strResultado = "GANHOU!";
            
        }
        
        
        
        vencedor.setText(strResultado);
       
        
    }//GEN-LAST:event_pedraActionPerformed

    private void papelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papelActionPerformed
        // TODO add your handling code here:
        int x = randInt(1,3);
        String escolhaPC = null;
       
        if (x == 1){
            escolhaPC = "Pedra";
        }
        else if( x == 2){
            escolhaPC = "Papel";
        }
        else {
            escolhaPC = "Tesoura";
        }
        

        escolhaPc.setText(escolhaPC);
        String strResultado = null;
        
        if(x == 1){
            strResultado = "GANHOU!";
           
        }
        else if(x ==2){
            strResultado = "EMPATOU!";
        }else{
            strResultado = "PERDEU!";
            
        }
        
        vencedor.setText(strResultado);
        
    }//GEN-LAST:event_papelActionPerformed

    private void tesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tesouraActionPerformed
        // TODO add your handling code here:
        int x = randInt(1,3);
        String escolhaPC = null;
        
        
        if (x == 1){
            escolhaPC = "Pedra";
        }
        else if( x == 2){
            escolhaPC = "Papel";
        }
        else {
            escolhaPC = "Tesoura";
        }
        

        escolhaPc.setText(escolhaPC);
        String strResultado = null;
        
        if(x == 1){
            strResultado = "PERDEU!";
            
        }
        else if(x ==2){
            strResultado = "GANHOU!";
            
        }else{
            strResultado = "EMPATOU!";
        }
        
        vencedor.setText(strResultado);
        
        
        
        
        
    }//GEN-LAST:event_tesouraActionPerformed

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
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
         
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jokenpo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel escolhaPc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton papel;
    private javax.swing.JButton pedra;
    private javax.swing.JButton tesoura;
    private javax.swing.JLabel vencedor;
    // End of variables declaration//GEN-END:variables
}

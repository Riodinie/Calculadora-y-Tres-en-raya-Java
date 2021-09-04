package Parcial;

//LIBRERIAS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//IMPLEMENTAMOS ACCION DEL USUARIO 
public class Prim extends javax.swing.JFrame implements ActionListener{
    
    //Instancias 
    calc panel1 = new calc();
    game panel2 = new game();
    Inicio panel =  new Inicio();
    
    public Prim() {
        
        initComponents();
        
        setSize(420,450);
        //Coloca a la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        //Llamar al metodo
        one.addActionListener(this);
        two.addActionListener(this);
        
        //Se agrega el panel inicio al subpanel c en el principal
        c.add(panel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        a = new javax.swing.JPanel();
        b = new javax.swing.JPanel();
        one = new javax.swing.JRadioButton();
        two = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        c = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 238, 238));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setBackground(new java.awt.Color(238, 238, 238));
        a.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b.setBackground(new java.awt.Color(238, 238, 238));
        b.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(one);
        one.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        one.setText("Calculadora");
        one.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        one.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        one.setOpaque(false);
        one.setPreferredSize(new java.awt.Dimension(140, 25));
        b.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        buttonGroup1.add(two);
        two.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        two.setText("Tres en Raya");
        two.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        two.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        two.setOpaque(false);
        two.setPreferredSize(new java.awt.Dimension(140, 25));
        b.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 140, -1));

        jLabel2.setBackground(new java.awt.Color(253, 126, 168));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(140, 25));
        b.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setBackground(new java.awt.Color(158, 127, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 25));
        b.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        a.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 420, 40));

        jLabel1.setBackground(new java.awt.Color(200, 200, 200));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" PARCIAL FINAL PROGRAMACION II ");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(320, 24));
        jLabel1.setMinimumSize(new java.awt.Dimension(3120, 24));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(320, 24));
        a.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 30));

        c.setBackground(new java.awt.Color(238, 238, 238));
        c.setPreferredSize(new java.awt.Dimension(200, 208));
        c.setLayout(new java.awt.BorderLayout());
        a.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 420, 360));

        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Prim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel a;
    private javax.swing.JPanel b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton one;
    private javax.swing.JRadioButton two;
    // End of variables declaration//GEN-END:variables

    //Eventos de los RadioBoton
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        //Comprueba boton a sido presionado
        Object evt = ae.getSource();
        
        //Seleccion del primer RadioBoton
        if(evt.equals(one)){
            
            c.add(panel1);
            panel.setVisible(false);
            panel1.setVisible(true);
            panel2.setVisible(false);
            //Para que la ventana se actualize y haga el cambio
            c.validate();
               
        //Seleccion del segundo RadioBoton
        }else if(evt.equals(two)){
        
            c.add(panel2);
            panel.setVisible(false);
            panel2.setVisible(true);
            panel1.setVisible(false);
            c.validate();
        }
    }
}

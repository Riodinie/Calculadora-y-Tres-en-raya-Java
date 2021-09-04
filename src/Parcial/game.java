package Parcial;

//LIBRERIAS
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class game extends javax.swing.JPanel {

    //VARIABLES
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    
    public game() {
        initComponents();
    }
    
    //Conteo jugadores
    private void gameScore()
    {
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }
    
    //JUGADORES TURNOS
    private void choose_a_Player()
            
    {   //Compara dos strings para ver si son iguales ignorando las diferencias entre mayúsculas y minúsculas
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }

   
    //Jugadas de gamer 1 y gamer 2
    private void winningGame()
    {   //Guarda los datos del boton
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
       
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        
        // Jugadas Gamer 1
        //Compara los valores y por medio de ello las jugas posibles del jugardor 1
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {   //mensaje de ganador
            JOptionPane.showMessageDialog(this,  "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 1  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            xCount++; // suma un punto a jugador 1
            //puntos ganados
            gameScore();
            //color de los botones al ganar
            txtbtn1.setBackground(new Color(101,255,108));
            txtbtn2.setBackground(new Color(101,255,108));
            txtbtn3.setBackground(new Color(101,255,108));
            
        }
        
        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 1  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            xCount++;
            gameScore();
            
            txtbtn4.setBackground(new Color(101,255,108));
            txtbtn5.setBackground(new Color(101,255,108));
            txtbtn6.setBackground(new Color(101,255,108));           
        }
         
        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,   "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 1  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            xCount++;
            gameScore();
            
            txtbtn7.setBackground(new Color(101,255,108));
            txtbtn8.setBackground(new Color(101,255,108));
            txtbtn9.setBackground(new Color(101,255,108));           
        }
        
        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 1  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(new Color(101,255,108));
            txtbtn4.setBackground(new Color(101,255,108));
            txtbtn7.setBackground(new Color(101,255,108));          
        }
        
        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this,  "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 1  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            xCount++;
            gameScore();
            
            txtbtn2.setBackground(new Color(101,255,108));
            txtbtn5.setBackground(new Color(101,255,108));
            txtbtn8.setBackground(new Color(101,255,108));        
        }
        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 1  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(new Color(101,255,108));
            txtbtn6.setBackground(new Color(101,255,108));
            txtbtn9.setBackground(new Color(101,255,108));          
        }
        
        
        if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,  "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 1  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(new Color(101,255,108));
            txtbtn5.setBackground(new Color(101,255,108));
            txtbtn9.setBackground(new Color(101,255,108));         
        }
        
        if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 1  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(new Color(101,255,108));
            txtbtn5.setBackground(new Color(101,255,108));
            txtbtn7.setBackground(new Color(101,255,108));          
        }
        
        
        
        // Juagdas Gamer 2
        
        if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {   //mensaje de gano
            JOptionPane.showMessageDialog(this, "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 2  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            oCount++;// se le suma un punto al jugador 2
            gameScore(); 
            //color de los botones al ganar
            txtbtn1.setBackground(new Color(255,140,140)); 
            txtbtn2.setBackground(new Color(255,140,140)); 
            txtbtn3.setBackground(new Color(255,140,140)); 
            
        }
        
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 2  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            oCount++;
            gameScore();
            
            txtbtn4.setBackground(new Color(255,140,140)); 
            txtbtn5.setBackground(new Color(255,140,140)); 
            txtbtn6.setBackground(new Color(255,140,140));      
        }
         
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,  "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 2  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            oCount++;
            gameScore();
            
            txtbtn7.setBackground(new Color(255,140,140)); 
            txtbtn8.setBackground(new Color(255,140,140)); 
            txtbtn9.setBackground(new Color(255,140,140));           
        }
        
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,  "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 2  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(new Color(255,140,140)); 
            txtbtn4.setBackground(new Color(255,140,140)); 
            txtbtn7.setBackground(new Color(255,140,140));         
        }
        
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 2  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            oCount++;
            gameScore();
            
            txtbtn2.setBackground(new Color(255,140,140)); 
            txtbtn5.setBackground(new Color(255,140,140)); 
            txtbtn8.setBackground(new Color(255,140,140));   
        }
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 2  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(new Color(255,140,140)); 
            txtbtn6.setBackground(new Color(255,140,140)); 
            txtbtn9.setBackground(new Color(255,140,140));           
        }
        
        
        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,  "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 2  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(new Color(255,140,140)); 
            txtbtn5.setBackground(new Color(255,140,140));  
            txtbtn9.setBackground(new Color(255,140,140));       
        }
        
        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "                         ♚GANADOR♚"+"\n\n        ✧(๑✪д✪)۶  GAMER 2  ٩(✪д✪๑)✧"+"\n\n     ☆;:*:;☆;:*:;☆;:*:;☆;:*:;☆☆;:*:;☆;:*:;☆;:*"," Tres en Raya◇⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒♥⌒♡⌒◇", JOptionPane.DEFAULT_OPTION);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(new Color(255,140,140)); 
            txtbtn5.setBackground(new Color(255,140,140)); 
            txtbtn7.setBackground(new Color(255,140,140));          
        }
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(145, 116, 237));

        txtbtn1.setBackground(new java.awt.Color(164, 157, 173));
        txtbtn1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setBackground(new java.awt.Color(164, 157, 173));
        txtbtn2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setBackground(new java.awt.Color(164, 157, 173));
        txtbtn3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.setBackground(new java.awt.Color(164, 157, 173));
        txtbtn4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setBackground(new java.awt.Color(164, 157, 173));
        txtbtn5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setBackground(new java.awt.Color(164, 157, 173));
        txtbtn6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn7.setBackground(new java.awt.Color(164, 157, 173));
        txtbtn7.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setBackground(new java.awt.Color(164, 157, 173));
        txtbtn8.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setBackground(new java.awt.Color(164, 157, 173));
        txtbtn9.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(217, 208, 229));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Gamer 1:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Gamer 2:");

        playerx.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        playerx.setForeground(new java.awt.Color(44, 191, 177));
        playerx.setText("x");

        playero.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        playero.setForeground(new java.awt.Color(191, 45, 76));
        playero.setText("x");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playero))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playerx)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(playerx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero)
                    .addComponent(jLabel3))
                .addGap(55, 55, 55))
        );

        Limpiar.setBackground(new java.awt.Color(190, 182, 201));
        Limpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Limpiar.setText("REINICAR");
        Limpiar.setBorder(null);
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Jugada en las casillas
    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed

        txtbtn1.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {   //color x
            txtbtn1.setForeground(new Color(44,191,177));
        }
        else
        {   //color o
            txtbtn1.setForeground(new Color(191,45,76));
        }
        //compruba el simbolo del jugador
        choose_a_Player();
        //comprobar jugadas
        winningGame();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed

        txtbtn2.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn2.setForeground(new Color(44,191,177));
        }
        else
        {
            txtbtn2.setForeground(new Color(191,45,76));
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed

        txtbtn3.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn3.setForeground(new Color(44,191,177));
        }
        else
        {
            txtbtn3.setForeground(new Color(191,45,76));
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed

        txtbtn4.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn4.setForeground(new Color(44,191,177));
        }
        else
        {
            txtbtn4.setForeground(new Color(191,45,76));
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed

        txtbtn5.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn5.setForeground(new Color(44,191,177));
        }
        else
        {
            txtbtn5.setForeground(new Color(191,45,76));
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed

        txtbtn6.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn6.setForeground(new Color(44,191,177));
        }
        else
        {
            txtbtn6.setForeground(new Color(191,45,76));
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed

        txtbtn7.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn7.setForeground(new Color(44,191,177));
        }
        else
        {
            txtbtn7.setForeground(new Color(191,45,76));
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed

        txtbtn8.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn8.setForeground(new Color(44,191,177));
        }
        else
        {
            txtbtn8.setForeground(new Color(191,45,76));
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed

        txtbtn9.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn9.setForeground(new Color(44,191,177));
        }
        else
        {
            txtbtn9.setForeground(new Color(191,45,76));
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // Reiniciar casillas

        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);

        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);

        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        // reestablecer color base
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);

        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);

        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_LimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    // End of variables declaration//GEN-END:variables
}

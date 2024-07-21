package Parcial;

public class calc extends javax.swing.JPanel {
    
    //VARIABLES
    String memoria1;
    String signo;
    String memoria2;
    
    public calc() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        borratodo = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        inverso = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        opuesto = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        division = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();

        setBackground(new java.awt.Color(239, 117, 157));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uno.setBackground(new java.awt.Color(173, 157, 157));
        uno.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        uno.setForeground(new java.awt.Color(37, 0, 12));
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 60, 40));

        dos.setBackground(new java.awt.Color(173, 157, 157));
        dos.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        dos.setForeground(new java.awt.Color(37, 0, 12));
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 60, 40));

        tres.setBackground(new java.awt.Color(173, 157, 157));
        tres.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        tres.setForeground(new java.awt.Color(37, 0, 12));
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 60, 40));

        resta.setBackground(new java.awt.Color(173, 157, 157));
        resta.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        resta.setForeground(new java.awt.Color(37, 0, 12));
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 60, 40));

        borrar.setBackground(new java.awt.Color(173, 157, 157));
        borrar.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        borrar.setForeground(new java.awt.Color(37, 0, 12));
        borrar.setText("C");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 60, 40));

        cuatro.setBackground(new java.awt.Color(173, 157, 157));
        cuatro.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        cuatro.setForeground(new java.awt.Color(37, 0, 12));
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 60, 40));

        cinco.setBackground(new java.awt.Color(173, 157, 157));
        cinco.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        cinco.setForeground(new java.awt.Color(37, 0, 12));
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 60, 40));

        seis.setBackground(new java.awt.Color(173, 157, 157));
        seis.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        seis.setForeground(new java.awt.Color(37, 0, 12));
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 60, 40));

        suma.setBackground(new java.awt.Color(173, 157, 157));
        suma.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        suma.setForeground(new java.awt.Color(37, 0, 12));
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 60, 40));

        borratodo.setBackground(new java.awt.Color(173, 157, 157));
        borratodo.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        borratodo.setForeground(new java.awt.Color(37, 0, 12));
        borratodo.setText("CE");
        borratodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borratodoActionPerformed(evt);
            }
        });
        add(borratodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 60, 40));

        siete.setBackground(new java.awt.Color(173, 157, 157));
        siete.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        siete.setForeground(new java.awt.Color(37, 0, 12));
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 60, 40));

        ocho.setBackground(new java.awt.Color(173, 157, 157));
        ocho.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        ocho.setForeground(new java.awt.Color(37, 0, 12));
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 60, 40));

        nueve.setBackground(new java.awt.Color(173, 157, 157));
        nueve.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        nueve.setForeground(new java.awt.Color(37, 0, 12));
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 60, 40));

        multiplicacion.setBackground(new java.awt.Color(173, 157, 157));
        multiplicacion.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        multiplicacion.setForeground(new java.awt.Color(37, 0, 12));
        multiplicacion.setText("*");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });
        add(multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, 40));

        inverso.setBackground(new java.awt.Color(173, 157, 157));
        inverso.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        inverso.setForeground(new java.awt.Color(37, 0, 12));
        inverso.setText("1/x");
        inverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inversoActionPerformed(evt);
            }
        });
        add(inverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 60, 40));

        cero.setBackground(new java.awt.Color(173, 157, 157));
        cero.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        cero.setForeground(new java.awt.Color(37, 0, 12));
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 60, 40));

        opuesto.setBackground(new java.awt.Color(173, 157, 157));
        opuesto.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        opuesto.setForeground(new java.awt.Color(37, 0, 12));
        opuesto.setText("+/-");
        opuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opuestoActionPerformed(evt);
            }
        });
        add(opuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 60, 40));

        punto.setBackground(new java.awt.Color(173, 157, 157));
        punto.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        punto.setForeground(new java.awt.Color(37, 0, 12));
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 60, 40));

        division.setBackground(new java.awt.Color(173, 157, 157));
        division.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        division.setForeground(new java.awt.Color(37, 0, 12));
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 60, 40));

        igual.setBackground(new java.awt.Color(173, 157, 157));
        igual.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        igual.setForeground(new java.awt.Color(37, 0, 12));
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 60, 40));

        pantalla.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });
        add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 3, 310, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        // numero 1
        pantalla.setText(pantalla.getText()+"1");
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        //numero 2
        pantalla.setText(pantalla.getText()+"2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
       //numero 3
        pantalla.setText(pantalla.getText()+"3");
    }//GEN-LAST:event_tresActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        //operacion resta
        //comprobar que no este en blanco la pantalla
        if (!pantalla.getText().equals("")) {
            //guardar lo que esta en pantalla
            memoria1=pantalla.getText();
            signo="-";
            pantalla.setText("");
        }

    }//GEN-LAST:event_restaActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // borrar 
        String cadena;
        cadena=pantalla.getText();
        //comprobar que cadena no este en blanco
        if (cadena.length()>0) {
            //Borrar caracteres
            cadena=cadena.substring(0, cadena.length()-1);
            pantalla.setText(cadena);
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        //numero 4
        pantalla.setText(pantalla.getText()+"4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        //numero 5
        pantalla.setText(pantalla.getText()+"5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        //numero 6
        pantalla.setText(pantalla.getText()+"6");
    }//GEN-LAST:event_seisActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        //operacion suma
        if (!pantalla.getText().equals("")) {
            memoria1=pantalla.getText();
            signo="+";
            pantalla.setText("");
        }
    }//GEN-LAST:event_sumaActionPerformed

    private void borratodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borratodoActionPerformed
        //operacion borrar todo
        pantalla.setText("");
    }//GEN-LAST:event_borratodoActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        //numero 7
        pantalla.setText(pantalla.getText()+"7");
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        //numero 8
        pantalla.setText(pantalla.getText()+"8");
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        //numero 9
        pantalla.setText(pantalla.getText()+"9");
    }//GEN-LAST:event_nueveActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        //operacion multiplicacion
        if (!pantalla.getText().equals("")) {
            memoria1=pantalla.getText();
            signo="*";
            pantalla.setText("");
        }
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void inversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inversoActionPerformed
        //operacion inverso
        String cadena;
        Double num;
        //almacenar lo que hay en pantalla
        cadena=pantalla.getText();
        //comparar que no este vacia
        if (cadena.length()>0) {
            //Devuelve un nuevo doble inicializado al valor representado por la Cadena
            num=1/(Double.parseDouble(cadena));
            //vuelve a su valor de string
            pantalla.setText(num.toString());

        }
    }//GEN-LAST:event_inversoActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        //numero 0
        pantalla.setText(pantalla.getText()+"0");
    }//GEN-LAST:event_ceroActionPerformed

    private void opuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opuestoActionPerformed
        //operacion opuesto
        Double num;
        String cadena;
        cadena=pantalla.getText();
        //comprobar que cadena no este en blanco
        if (cadena.length()>0) {
            num=(-1)*Double.parseDouble(cadena);
            //valor del numero pero a string
            pantalla.setText(num.toString());
        }
    }//GEN-LAST:event_opuestoActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        //punto/decimal
        String cadena;
        //guarda los valores de toda la pantalla
        cadena=pantalla.getText();
        
        //si la cadena esta vacia
        if (cadena.length()<=0) {
            pantalla.setText("0.");

        }
        //Para saber si no esta el punto
        else{if (!existepunto(pantalla.getText())) {
                pantalla.setText(pantalla.getText()+".");

            }
        }

    }//GEN-LAST:event_puntoActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        //operacion division
        if (!pantalla.getText().equals("")) {
            memoria1=pantalla.getText();
            signo="/";
            pantalla.setText("");
        }
    }//GEN-LAST:event_divisionActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        //igual
        String resultado;
        
        memoria2=pantalla.getText();
        //que no este vacio la caja
        if (!memoria2.equals("")) {
            resultado=calculadora(memoria1,memoria2,signo);
            pantalla.setText(resultado);
        }

    }//GEN-LAST:event_igualActionPerformed

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pantallaActionPerformed
    
    //Operaciones de la calculadora
    public static String calculadora(String memoria1,String memoria2,String signo){
        
    Double resultado=0.0;
    String respuesta;
    
     //comparar el signo que hemos pulsado
     //compara signo para saber que operacion hacer
     //convertir en double los valores y realiza la operacion
    if (signo.equals("-")) {
       
        resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
        
    }
    if (signo.equals("+")) {
        resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
        
    }
    if (signo.equals("*")) {
        resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
        
    }
    if (signo.equals("/")) {
        resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
        
    }
    
    respuesta=resultado.toString();
    return respuesta;
}
    
 //Para comprobar si esta el punto en la caja   
public static boolean existepunto(String cadena){
    
        boolean resultado;
        resultado=false;
        //compara todos los carecteres de cadena
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(".")) {
                resultado=true;
                break;
              
            }           
        }
        return resultado;          
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton borratodo;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton division;
    private javax.swing.JButton dos;
    private javax.swing.JButton igual;
    private javax.swing.JButton inverso;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton opuesto;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton punto;
    private javax.swing.JButton resta;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton suma;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}

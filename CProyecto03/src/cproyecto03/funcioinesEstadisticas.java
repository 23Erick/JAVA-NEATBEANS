package cproyecto03;

import java.awt.Color;
import java.awt.Dimension;

public class funcioinesEstadisticas extends javax.swing.JFrame {
    Funciones objOpera = new Funciones();
    
    public funcioinesEstadisticas() {
        initComponents();
        formulario();
    }
    private void formulario(){
        this.setTitle("FUNCIONES ESTADISTICAS");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(255 ,255, 255));
        this.nNumeros.requestFocus();
    }
    private void limpiarCampos() {
    nNumeros.setText("");
    Salida.setText("");
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextArea();
        btnCalcular = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        nNumeros = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCalcular1 = new javax.swing.JButton();
        btnCalcular2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(102, 255, 51));

        Salida.setColumns(20);
        Salida.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        Salida.setRows(5);
        jScrollPane2.setViewportView(Salida);

        btnCalcular.setBackground(new java.awt.Color(255, 51, 51));
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("CALCULAR ");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        nNumeros.setColumns(20);
        nNumeros.setRows(5);
        jScrollPane3.setViewportView(nNumeros);

        jLabel1.setBackground(new java.awt.Color(255, 102, 0));
        jLabel1.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("FUNCIONES ESTADISTICAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        jLabel2.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 0));
        jLabel2.setText("INGRESE LOS NUMEROS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        btnCalcular1.setBackground(new java.awt.Color(255, 255, 204));
        btnCalcular1.setText("NUEVO");
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });

        btnCalcular2.setBackground(new java.awt.Color(255, 255, 204));
        btnCalcular2.setText("SALIR");
        btnCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addGap(20, 20, 20)
                        .addComponent(btnCalcular1)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnCalcular1)
                    .addComponent(btnCalcular2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
      
         String[] datosStr = nNumeros.getText().split(",");
    float[] datos = new float[datosStr.length];
    for (int i = 0; i < datosStr.length; i++) {
        datos[i] = Float.parseFloat(datosStr[i].trim());
    }

    this.Salida.setText("\t Resultado\n");
    this.Salida.setText("======================================================================================================\n");

    // Calcular media
    float media = Funciones.calcularMedia(datos);
    Salida.append("Media: " + media + "\n");

    float moda = Funciones.calcularModa(datos);
    Salida.append("Moda: " + moda + "\n");

    // Calcular mediana
    float mediana = Funciones.calcularMediana(datos);
    Salida.append("Mediana: " + mediana + "\n");

    // Calcular desviación estándar
    float desviacionEstandar = Funciones.calcularDesviacionEstandar(datos);
    Salida.append("Desviación Estándar: " + desviacionEstandar + "\n");

    // Calcular varianza
    float varianza = Funciones.calcularVarianza(datos);
    Salida.append("Varianza: " + varianza + "\n");
        
   
       
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
       limpiarCampos();
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void btnCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular2ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_btnCalcular2ActionPerformed

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
            java.util.logging.Logger.getLogger(funcioinesEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(funcioinesEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(funcioinesEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(funcioinesEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new funcioinesEstadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Salida;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcular1;
    private javax.swing.JButton btnCalcular2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea nNumeros;
    // End of variables declaration//GEN-END:variables
}

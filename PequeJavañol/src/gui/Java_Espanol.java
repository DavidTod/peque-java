/*
 * Java_Espanol.java
 *
 * Created on 4 de enero de 2010, 06:40 PM
 */
package gui;

import clases.*;
import javax.swing.ImageIcon;

/**
 *
 * @author  christmo
 */
public class Java_Espanol extends javax.swing.JFrame {

    /** Creates new form Java_Espanol */
    public Java_Espanol() {
        initComponents();
        jbVerificar.setIcon(new ImageIcon("iconos/Run.png"));
        jbLimpiar.setIcon(new ImageIcon("iconos/limpiar.png"));
        jbSalir.setIcon(new ImageIcon("iconos/salir.png"));

        //Carga de Archivos
        Analizador.cargarArchivos();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtTxt = new javax.swing.JTextArea();
        jbVerificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlIndicador2 = new javax.swing.JLabel();
        jlIndicador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Javañol");

        jtTxt.setColumns(20);
        jtTxt.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtTxt.setRows(5);
        jtTxt.setTabSize(5);
        jtTxt.setText("[Esto deberia ser un comentario]\nVARIABLES \n\tVAR _iden12 ENTERO;\n\tVAR _id2cad CADENA;\n\tVAR _contador ENTERO;\nINICIO\n\t_iden12 = 34;\n\t\n\tSI ( _iden12 == 34 ) {\n\t\tESCRIBIR('Es correcto');\n\t}SINO{\n\t\tLEER(_den12);\n\t}\n\t\n\tOPCION (_den12) {\n\t\tCASO 1 :\n\t\t\tESCRIBIR('Es correcto');\n\t\tCASO 2 :\n\t\t\tLEER(_id2cad);\n\t\tSINO :\n\t\t\tESCRIBIR('Equivocado ');\n\t}\n\t\n\tREPETIR (_den12 <= 15){\n\t\tESCRIBIR('Dentro');\n\t\t_den12 = _den12 + 1;\n\t}\n\t\n\tPARA (_contador = 15 , _contador >= 5 , -1){\n\t\tESCRIBIR('Ciclo Repetitivo');\n\t}\n\t\nFIN");
        jtTxt.setToolTipText("Ingrese el Código...");
        jtTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtTxt.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jtTxt.setMinimumSize(new java.awt.Dimension(100, 100));
        jtTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtTxtKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtTxt);

        jbVerificar.setText("Verificar Código");
        jbVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerificarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel2.setText("pequeJavañol - Analizador Léxico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlIndicador)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jbVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlIndicador2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbVerificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlIndicador2)
                            .addComponent(jlIndicador)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

private void jbVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerificarActionPerformed
    String texto = jtTxt.getText();

    //En este vector se encuentra las lienas del codigo fuente codificadas
    //con los codigos del archivo de codigos.csv
    //a esta variable se deberia hacer el proceso de validación de las palablas
    String[] codigo = Analizador.quitarEspaciosLineas(texto);
    
    //Inicio de Analisis
    int catErrores = Analizador.analizar(codigo);
    
    if (catErrores==0){
        setIconoIndicador(true);
    }else{
        setIconoIndicador(false);
    }

//    System.out.println("----");
//    for(String d: Analizador.getSalida()){
//        System.out.println(""+d);
//    }
//    System.out.println("----");
    Analizador.setResetSalida();
    
}//GEN-LAST:event_jbVerificarActionPerformed

private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
    System.exit(0);
}//GEN-LAST:event_jbSalirActionPerformed

private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
    jtTxt.setText("VARIABLES \n\nINICIO \n\nFIN \n");
    LimpiarIconos();
}//GEN-LAST:event_jbLimpiarActionPerformed

private void jtTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTxtKeyPressed
    
    String txtCodigo = jtTxt.getText();
    String txtFomato;
    //jtTxt.setText(txtFomato);
}//GEN-LAST:event_jtTxtKeyPressed

/**
 * Formatear el codigo para evitar errores de analisis
 * @param txtCodigo
 * @return String
 * Trabajando---christmo
 */
    private String FormatearCodigo(String txtCodigo){
        String txtPalabra;
        /*for(int i=0; i<=txtCodigo.length(); i++){
            txtPalabra+= txtCodigo.charAt(i);
            if(){

            }
        }*/
        return txtCodigo;
    }

    /**
     * Pone el icono de codigo valido si es correcto, caso contrario pone un 
     * icono que representa la invalides del codigo...
     * @param op    opcion de la validacion del codigo
     */
    private void setIconoIndicador(boolean op) {
        if (op) {
            jlIndicador.setIcon(new ImageIcon("iconos/up.png"));
            jlIndicador2.setIcon(new ImageIcon("iconos/bien.png"));
        } else {
            jlIndicador.setIcon(new ImageIcon("iconos/down.png"));
            jlIndicador2.setIcon(new ImageIcon("iconos/mal.png"));
        }
    }

    /**
     * Quita los Iconos que esten en la pantalla en la opcion indicador
     */
    private void LimpiarIconos() {
        jlIndicador.setText("");
        jlIndicador.setIcon(null);
        jlIndicador2.setText("");
        jlIndicador2.setIcon(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Java_Espanol().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVerificar;
    private javax.swing.JLabel jlIndicador;
    private javax.swing.JLabel jlIndicador2;
    private javax.swing.JTextArea jtTxt;
    // End of variables declaration//GEN-END:variables
}

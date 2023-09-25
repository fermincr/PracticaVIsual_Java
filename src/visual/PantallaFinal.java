/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Fermin Covarrubias Ramos - 4k - 20110309
 */
public class PantallaFinal extends javax.swing.JFrame {

public static ArrayList array= new ArrayList();
public static ArrayList array1= new ArrayList();
public static ArrayList array2= new ArrayList();
public static ArrayList array3= new ArrayList();
public static ArrayList array4= new ArrayList();
public static ArrayList array5= new ArrayList();
public static ArrayList array6= new ArrayList();
public static ArrayList array7= new ArrayList();
public static ArrayList array8= new ArrayList();
public static ArrayList array9= new ArrayList();
public static ArrayList array10= new ArrayList();
public static ArrayList array11= new ArrayList();
public static ArrayList array12= new ArrayList();
public static ArrayList array13= new ArrayList();
public static ArrayList array14= new ArrayList();
public static ArrayList array15= new ArrayList();
public static ArrayList array16= new ArrayList();
public static ArrayList array17= new ArrayList();
public static ArrayList array18= new ArrayList();
public static ArrayList array19= new ArrayList();
public static ArrayList array20= new ArrayList();
public static ArrayList array21= new ArrayList();
public static ArrayList array22= new ArrayList();
public static ArrayList array23= new ArrayList();
public static ArrayList array24= new ArrayList();
public static ArrayList array25= new ArrayList();
public static ArrayList array26= new ArrayList();
public static ArrayList array27= new ArrayList();
public static ArrayList array28= new ArrayList();
public static ArrayList array29= new ArrayList();
public static ArrayList array30= new ArrayList();
public static ArrayList array31= new ArrayList();
public static ArrayList array32= new ArrayList();
public static ArrayList array33= new ArrayList();
public static ArrayList array34= new ArrayList();
public static ArrayList array35= new ArrayList();
public static ArrayList array36= new ArrayList();
public static ArrayList array37= new ArrayList();
public static ArrayList array38= new ArrayList();
public static ArrayList array39= new ArrayList();
public static ArrayList array40= new ArrayList();
public static ArrayList array41= new ArrayList();
public static ArrayList array42= new ArrayList();
public static ArrayList array43= new ArrayList();
public static ArrayList array44= new ArrayList();
public static DefaultListModel modelo = new DefaultListModel();
    /**
     * Creates new form PantallaFinal
     */
    public PantallaFinal() {
        initComponents();
        
        Pedidos ped = new Pedidos();
        recibo.setModel(modelo);
        
        array1.add("Su Pan Elegido:");
        array2.add(ped.panFinal);
        array3.add("Su Carne Elegida:");
        array4.add(ped.carneFinal);        
        array5.add("Quitó de su Hamburguesa los ingredientes:");
        array6.add(ped.nocebollaFinal);
        array7.add(ped.nojitomateFinal);
        array8.add(ped.nolechugaFinal);
        array9.add(ped.noquesoameAparteFinal);
        array10.add(ped.nomayonesaFinal);
        array11.add(ped.nopepinillosFinal);
        array12.add(ped.nosalsaespecialFinal);
        array13.add("Agrego de Extras:");
        array14.add(ped.salsaportobelloextraFinal);
        array15.add(ped.salsadequesoextraFinal);
        array16.add(ped.mostazadulceextraFinal);
        array17.add(ped.pepinillosextraFinal);
        array18.add(ped.jalapeñosextraFinal);
        array19.add(ped.salsaranchextraFinal);
        array20.add(ped.salsabbqextraFinal);
        array21.add(ped.salsabuffaloextraFinal);
        array22.add(ped.mostazaextraFinal);
        array23.add(ped.mayonesaextraFinal);
        array24.add(ped.ketchupextraFinal);
        array25.add(ped.carneextraAparteFinal);
        array26.add(ped.carneangusextraFinal);
        array27.add(ped.tocinoextraFinal);        
        array28.add(ped.pollobbqextraFinal);
        array29.add(ped.pechugaempaextraFinal);
        array30.add(ped.quesoameextraFinal);
        array31.add(ped.quesosuiextraFinal);
        array32.add(ped.guacamoleextraFinal);
        array33.add(ped.chilesantafeextraFinal);
        array34.add(ped.jitomateextraFinal);
        array35.add(ped.piñaextraFinal);
        array36.add(ped.chiliextraFinal);
        array37.add("Sus acompañamientos son:");
        array38.add(ped.papasmedFinal);
        array39.add(ped.cocaoriginalFinal);
        array40.add(ped.cocasinazucarFinal);
        array41.add(ped.aroscebollaAparteFinal);
        array42.add(ped.cielFinal);
        array43.add("Su respuesta de querer aparte la salsa:");        
        array44.add(ped.salsaAparteFinal);
        
        modelo.removeAllElements();
        modelo.addElement(array1);
        modelo.addElement(array2);
        modelo.addElement(array3);
        modelo.addElement(array4);
        modelo.addElement(array5);
        modelo.addElement(array6);
        modelo.addElement(array7);
        modelo.addElement(array8);
        modelo.addElement(array9);
        modelo.addElement(array10);
        modelo.addElement(array11);
        modelo.addElement(array12);
        modelo.addElement(array13);
        modelo.addElement(array14);
        modelo.addElement(array15);
        modelo.addElement(array16);
        modelo.addElement(array17);
        modelo.addElement(array18);
        modelo.addElement(array19);
        modelo.addElement(array20);
        modelo.addElement(array21);
        modelo.addElement(array22);
        modelo.addElement(array23);
        modelo.addElement(array24);
        modelo.addElement(array25);
        modelo.addElement(array26);
        modelo.addElement(array27);
        modelo.addElement(array28);
        modelo.addElement(array29);
        modelo.addElement(array30);
        modelo.addElement(array31);
        modelo.addElement(array32);
        modelo.addElement(array33);
        modelo.addElement(array34);
        modelo.addElement(array35);
        modelo.addElement(array36);
        modelo.addElement(array37);
        modelo.addElement(array38);
        modelo.addElement(array39);
        modelo.addElement(array40);
        modelo.addElement(array41);
        modelo.addElement(array42);
        modelo.addElement(array43);
        modelo.addElement(array44);

        String str = ComentariosFinales.getText();
        ComentariosFinales.setText(ped.comentarioFinal);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        recibo = new javax.swing.JList<>();
        textorecibo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ComentariosFinales = new javax.swing.JTextArea();
        BotonExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        HaveANiceDayfoto = new javax.swing.JLabel();
        LogoEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("¡Gracias por consumir en Carls Jr.!");

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        jLabel1.setText("Gracias por su Preferencia");

        jScrollPane1.setViewportView(recibo);

        textorecibo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        textorecibo.setText("Este es su recibo");

        ComentariosFinales.setColumns(20);
        ComentariosFinales.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComentariosFinales.setRows(5);
        jScrollPane2.setViewportView(ComentariosFinales);

        BotonExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonExit.setText("Salir");
        BotonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonExitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        jLabel2.setText("Estos son sus comentarios:");

        HaveANiceDayfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/fotos/hand_205x205-000000-transparent_7359e211-842f-4919-91eb-b78b63251043_205x.png"))); // NOI18N

        LogoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/fotos/OkOMoafq_400x400.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HaveANiceDayfoto)
                .addGap(139, 139, 139)
                .addComponent(BotonExit)
                .addGap(133, 133, 133)
                .addComponent(LogoEmpresa)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(textorecibo)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textorecibo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonExit)
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LogoEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HaveANiceDayfoto)
                                .addGap(49, 49, 49))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonExitActionPerformed
   
        System.out.println("Presionaste Salir");
        System.exit(0);
        
    }//GEN-LAST:event_BotonExitActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonExit;
    private javax.swing.JTextArea ComentariosFinales;
    private javax.swing.JLabel HaveANiceDayfoto;
    private javax.swing.JLabel LogoEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> recibo;
    private javax.swing.JLabel textorecibo;
    // End of variables declaration//GEN-END:variables
}

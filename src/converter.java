import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Getsata
 */
public class converter extends javax.swing.JFrame {

    /**
     * Creates new form converter
     */
    public converter() {
        resize();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Converter");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setAutoscrolls(true);
        jPanel2.setMinimumSize(new java.awt.Dimension(270, 306));
        jPanel2.setPreferredSize(new java.awt.Dimension(260, 306));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Centimeter");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inch");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 53, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Meter");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 53, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kilometer");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 53, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mile");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 53, -1));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                centimeter(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 119, -1));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inch(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 119, -1));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                meter(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 119, -1));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kilometer(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 119, -1));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mile(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 119, -1));

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 283, 70, -1));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 283, 56, -1));

        jButton3.setText("Clear History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 283, 105, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resize()
    {
        this.setResizable(false);
    }
    
    
    private void centimeter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_centimeter
     
         String val = jTextField1.getText();
         
            if (!val.equals(""))
            {   
                if(isInteger(val))
                {
                double cm = Double.parseDouble(val);
                double tempVal = cm*0.39;
                DecimalFormat df = new DecimalFormat("#.###");
                jTextField2.setText(df.format(tempVal));

                double m = Double.parseDouble(val);
                tempVal = m*0.001;
                jTextField3.setText(df.format(tempVal));

                double km = Double.parseDouble(val);
                tempVal = km*0.000001;
                jTextField4.setText(df.format(tempVal));

                double mile = Double.parseDouble(val);
                tempVal = mile*0.0000006;
                jTextField5.setText(df.format(tempVal));
                }   
                else
                {
                    JPanel messagePanel = new JPanel();
                    JOptionPane.showMessageDialog(messagePanel, "Illegal symbol");
                }
            }
          
          
    }//GEN-LAST:event_centimeter

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inch(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inch
       
        String val = jTextField2.getText();
        if (!val.equals(""))
        {
            if(isInteger(val))
                {
                double cm = Double.parseDouble(val);
                double tempVal = cm*2.54;
                DecimalFormat df = new DecimalFormat("#.##");
                jTextField1.setText(df.format(tempVal));

                double m = Double.parseDouble(val);
                tempVal = m*0.0254;
                jTextField3.setText(df.format(tempVal));

                double km = Double.parseDouble(val);
                tempVal = km*0.0000025;
                jTextField4.setText(df.format(tempVal));

                double mile = Double.parseDouble(val);
                tempVal = mile*0.0000016;
                jTextField5.setText(df.format(tempVal));
                }
            else
                {
                JPanel messagePanel = new JPanel();
                JOptionPane.showMessageDialog(messagePanel, "Illegal symbol");
                }
        } 
        
    }//GEN-LAST:event_inch

    private void meter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_meter
           
        String val = jTextField3.getText();
        if (!val.equals(""))
        {
            if(isInteger(val))
            {
            double cm = Double.parseDouble(val);
            double tempVal = cm*100;
            DecimalFormat df = new DecimalFormat("#.##");
            jTextField1.setText(df.format(tempVal));
       
            double inch = Double.parseDouble(val);
            tempVal = inch*39.37;
            jTextField2.setText(df.format(tempVal));
      
            double km = Double.parseDouble(val);
            tempVal = km*0.001;
            jTextField4.setText(df.format(tempVal));
        
            double mile = Double.parseDouble(val);
            tempVal = mile*0.000621;
            jTextField5.setText(df.format(tempVal));
            }
            else
            {
                JPanel messagePanel = new JPanel();
                JOptionPane.showMessageDialog(messagePanel, "Illegal symbol");
            }
        } 
         
    }//GEN-LAST:event_meter

    private void kilometer(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kilometer
        
        String val = jTextField4.getText();
        if (!val.equals(""))
        {
            if(isInteger(val))
            {
            double cm = Double.parseDouble(val);
            double tempVal = cm*100000;
            DecimalFormat df = new DecimalFormat("#.##");
            jTextField1.setText(df.format(tempVal));
        
            double inch = Double.parseDouble(val);
            tempVal = inch*39370.0787;
            jTextField2.setText(df.format(tempVal));
        
            double km = Double.parseDouble(val);
            tempVal = km*1000;
            jTextField3.setText(df.format(tempVal));
       
            double mile = Double.parseDouble(val);
            tempVal = mile*0.62137;
            jTextField5.setText(df.format(tempVal));
            }
            else
            {
                JPanel messagePanel = new JPanel();
                JOptionPane.showMessageDialog(messagePanel, "Illegal symbol");
            }
        } 
    }//GEN-LAST:event_kilometer

    private void mile(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mile
        
        String val = jTextField5.getText();
        if (!val.equals(""))
        {
            if(isInteger(val))
            {
            double cm = Double.parseDouble(val);
            double tempVal = cm*160934.4;
            DecimalFormat df = new DecimalFormat("#.##");
            jTextField1.setText(df.format(tempVal));
        
            double inch = Double.parseDouble(val);
            tempVal = inch*63360;
            jTextField2.setText(df.format(tempVal));
        
            double km = Double.parseDouble(val);
            tempVal = km*1609.344;
            jTextField3.setText(df.format(tempVal));
       
            double mile = Double.parseDouble(val);
            tempVal = mile*1.609344;
            jTextField4.setText(df.format(tempVal));
            }
            else
            {
                JPanel messagePanel = new JPanel();
                JOptionPane.showMessageDialog(messagePanel, "Illegal symbol");
            }
        } 
    }//GEN-LAST:event_mile

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FileWriter fstr = null;
        try {
            fstr = new FileWriter("calc.txt", true);
            BufferedWriter buffer = new BufferedWriter(fstr);
            buffer.write(new Date().toString() + "\r\n");
            buffer.write("Centimeter: " + jTextField1.getText()+"\r\n");
            buffer.write("Inch: " + jTextField2.getText()+"\r\n");
            buffer.write("Meter: " + jTextField3.getText()+"\r\n");
            buffer.write("Kilometer: " + jTextField4.getText()+"\r\n");
            buffer.write("Mile: " + jTextField5.getText()+"\r\n");
            buffer.write("\r\n");
            buffer.close();
        } catch (IOException ex) {
            Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fstr.close();
            } catch (IOException ex) {
                Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        JOptionPane.showMessageDialog(this, "Saved");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            FileWriter fstr = new FileWriter("calc.txt");
        } catch (IOException ex) {
            Logger.getLogger(converter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(this, "History cleared");
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new converter().setVisible(true);
            }
        });
    }
    
    public static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    }
    // only got here if we didn't return false
    return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}

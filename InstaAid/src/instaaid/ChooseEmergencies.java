/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instaaid;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author HP
 */
public class ChooseEmergencies extends javax.swing.JFrame {

    /**
     * Creates new form ChooseEmergencies
     */
    
    
    
    public ChooseEmergencies() {
        initComponents();
        
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setViewportBorder(null);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        showbutton = new javax.swing.JButton();
        cb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        l = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InstaAid");
        setBackground(new java.awt.Color(255, 51, 0));
        setLocation(new java.awt.Point(200, 30));
        setSize(new java.awt.Dimension(1200, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(null);

        showbutton.setBackground(new java.awt.Color(0, 51, 255));
        showbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showbutton.setForeground(new java.awt.Color(255, 255, 255));
        showbutton.setText("Show");
        showbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(showbutton);
        showbutton.setBounds(680, 100, 120, 40);

        cb.setBackground(new java.awt.Color(240, 240, 240));
        cb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cb.setForeground(new java.awt.Color(51, 51, 51));
        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Burn", "Snake Bite", "Electric Shock", "Fracture", "Stroke", "Sprain", "Asthma", "Anaphylaxis", "Abdominal Pain", "Angina", "Choking", "Concussion", "Cramps", "Cardiac Arrest", "Convulsion", "Crush Injury", "Dislocation", "Drowning", "Dehydration", "Fainting", "Food Poisoning", "Gas Poisoning", "High Blood Pressure", "Hyperglycemia", "Internal Bleeding", "Low Blood Pressure", "Low Blood Sugar", "Nausea", "Poison Ivy" }));
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        jPanel1.add(cb);
        cb.setBounds(430, 100, 190, 40);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        ta.setBackground(new java.awt.Color(44, 135, 206, 250));
        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ta.setForeground(new java.awt.Color(255, 255, 255));
        ta.setRows(5);
        ta.setBorder(null);
        ta.setOpaque(false);
        jScrollPane1.setViewportView(ta);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 180, 760, 400);

        l.setBackground(new java.awt.Color(0, 0, 255));
        l.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l.setText("What seems to be the Emergency?");
        jPanel1.add(l);
        l.setBounds(180, 10, 860, 90);

        backbutton.setBackground(new java.awt.Color(255, 255, 255));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instaaid/Back-Arrow-Icon-PNG-715x715.png"))); // NOI18N
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton);
        backbutton.setBounds(20, 20, 50, 40);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Want to inform someone about your situation?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(620, 600, 430, 40);

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Yes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1050, 600, 100, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instaaid/doctor4.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1200, 700));
        jLabel3.setMinimumSize(new java.awt.Dimension(1200, 700));
        jLabel3.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1200, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
        ta.setText("");
    }//GEN-LAST:event_cbActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:new homeframe().setVisible(true);
       new homeframe().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void showbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbuttonActionPerformed
        // TODO add your handling code here:
        String str = cb.getSelectedItem().toString();
        if (str.equals("Burn")) {
            try {
                FileReader fr = new FileReader("First Aid\\Burn.txt");
                BufferedReader br = new BufferedReader(fr);
                String s, t = "";
                s = br.readLine();
                while (s != null) {
                    t += s + "\n\n";
                    s = br.readLine();
                }
                ta.setText(t);
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
    }                                         
    if (str.equals ( 
        "Snake Bite")) {
            try {
            FileReader fr = new FileReader("First Aid\\Snake Bite.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Electric Shock")) {
            try {
            FileReader fr = new FileReader("First Aid\\Electric Shock.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Fracture")) {
            try {
            FileReader fr = new FileReader("First Aid\\Fracture.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Stroke")) {
            try {
            FileReader fr = new FileReader("First Aid\\Stroke.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Sprain")) {
            try {
            FileReader fr = new FileReader("First Aid\\Sprain.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Asthma")) {
            try {
            FileReader fr = new FileReader("First Aid\\Asthma.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Anaphylaxis")) {
            try {
            FileReader fr = new FileReader("First Aid\\Anaphylaxis.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Abdominal Pain")) {
            try {
            FileReader fr = new FileReader("First Aid\\Abdominal Pain.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Angina")) {
            try {
            FileReader fr = new FileReader("First Aid\\Angina.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Choking")) {
            try {
            FileReader fr = new FileReader("First Aid\\Choking.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Concussion")) {
            try {
            FileReader fr = new FileReader("First Aid\\Concussion.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Cramps")) {
            try {
            FileReader fr = new FileReader("First Aid\\Cramps.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Cardiac Arrest")) {
            try {
            FileReader fr = new FileReader("First Aid\\Cardiac Arrest.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Convulsion")) {
            try {
            FileReader fr = new FileReader("First Aid\\Convulsion.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

   

    if (str.equals ( 
        "Crush Injury")) {
            try {
            FileReader fr = new FileReader("First Aid\\Crush Injury.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Dislocation")) {
            try {
            FileReader fr = new FileReader("First Aid\\Dislocation.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Drowning")) {
            try {
            FileReader fr = new FileReader("First Aid\\Drowning.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Dehydration")) {
            try {
            FileReader fr = new FileReader("First Aid\\Dehydration.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Fainting")) {
            try {
            FileReader fr = new FileReader("First Aid\\Fainting.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Food Poisoning")) {
            try {
            FileReader fr = new FileReader("First Aid\\Food Poisoning.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Gas Poisoning")) {
            try {
            FileReader fr = new FileReader("First Aid\\Gas Poisoning.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "High Blood Pressure")) {
            try {
            FileReader fr = new FileReader("First Aid\\High Blood Pressure.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Hyperglycemia")) {
            try {
            FileReader fr = new FileReader("First Aid\\Hyperglycemia.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Internal Bleeding")) {
            try {
            FileReader fr = new FileReader("First Aid\\Internal Bleeding.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Low Blood Pressure")) {
            try {
            FileReader fr = new FileReader("First Aid\\Low Blood Pressure.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Low Blood Sugar")) {
            try {
            FileReader fr = new FileReader("First Aid\\Low Blood Sugar.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Nausea")) {
            try {
            FileReader fr = new FileReader("First Aid\\Nausea.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    if (str.equals ( 
        "Poison Ivy")) {
            try {
            FileReader fr = new FileReader("First Aid\\Poison Ivy.txt");
            BufferedReader br = new BufferedReader(fr);
            String s, t = "";
            s = br.readLine();
            while (s != null) {
                t += s + "\n\n";
                s = br.readLine();
            }
            ta.setText(t);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }
    }//GEN-LAST:event_showbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new EmailForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
       
  
  
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
            java.util.logging.Logger.getLogger(ChooseEmergencies.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseEmergencies.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseEmergencies.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseEmergencies.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseEmergencies().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l;
    private javax.swing.JButton showbutton;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
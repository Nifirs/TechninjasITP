/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promotion;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Kavinga
 */
public class eventpromotion extends javax.swing.JFrame {

    /**
     * Creates new form eventpromotion
     */
    public eventpromotion() {
        initComponents();
           setExtendedState(JFrame.MAXIMIZED_BOTH);
        
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        eventarea = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        eventtype = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Biscuitf = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        eventdate = new com.toedter.calendar.JDateChooser();
        jButton7 = new javax.swing.JButton();
        eventid = new javax.swing.JTextField();
        eventname = new javax.swing.JTextField();
        biscuitpacket = new javax.swing.JTextField();
        foods = new javax.swing.JTextField();
        transport = new javax.swing.JTextField();
        subbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 1100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2006, 13, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setMaximumSize(new java.awt.Dimension(1930, 1100));
        jPanel4.setPreferredSize(new java.awt.Dimension(2400, 1100));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("2.Event Promotion");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Event Name ");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Event Date");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        eventarea.setBackground(new java.awt.Color(0, 51, 51));
        eventarea.setFont(new java.awt.Font("Century Gothic", 0, 32)); // NOI18N
        eventarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Area", "Kurunegala", "Mawathagama", "Nikawaretiya", "Narammala", "Galewela", "Wellawa", "Maho", "Giriulla", "Polghawela" }));
        eventarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventareaActionPerformed(evt);
            }
        });
        jPanel4.add(eventarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 340, 440, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Event Type");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        eventtype.setBackground(new java.awt.Color(0, 51, 51));
        eventtype.setFont(new java.awt.Font("Century Gothic", 0, 32)); // NOI18N
        eventtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Event Type", "Street Promotion", "School Events", "Charity Promotion" }));
        eventtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventtypeActionPerformed(evt);
            }
        });
        jPanel4.add(eventtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 430, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Event Area");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("How Many Biscuit Packet RS: ");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Event Costs(Upload Budget)");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, -1, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Transport & Etc. Rs:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, -1, 37));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Foods Rs:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, 37));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Biscuit Flavors");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        Biscuitf.setBackground(new java.awt.Color(0, 51, 51));
        Biscuitf.setFont(new java.awt.Font("Century Gothic", 0, 32)); // NOI18N
        Biscuitf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Biscuit Flavour", "Choclate Puff", "Lemon Puff", "Marie", "Nice", "Coockies" }));
        Biscuitf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiscuitfActionPerformed(evt);
            }
        });
        jPanel4.add(Biscuitf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 430, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Sub Total RS:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 790, -1, 51));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 880, 150, 50));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 880, 150, 50));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 880, 150, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Event ID");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        eventdate.setForeground(new java.awt.Color(51, 51, 51));
        eventdate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel4.add(eventdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 430, 53));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("View");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 880, 150, 50));

        eventid.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        eventid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eventidKeyReleased(evt);
            }
        });
        jPanel4.add(eventid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 430, 54));

        eventname.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jPanel4.add(eventname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 430, 53));

        biscuitpacket.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        biscuitpacket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                biscuitpacketKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                biscuitpacketKeyTyped(evt);
            }
        });
        jPanel4.add(biscuitpacket, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 634, 296, -1));

        foods.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        foods.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                foodsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                foodsKeyTyped(evt);
            }
        });
        jPanel4.add(foods, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 680, 296, -1));

        transport.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        transport.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                transportKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transportKeyTyped(evt);
            }
        });
        jPanel4.add(transport, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 730, 296, -1));

        subbox.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jPanel4.add(subbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 790, 296, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kkk\\Desktop\\Back.png")); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, -1));

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/promotion/Photos/Home.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 50, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 0, -1, 1050));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventareaActionPerformed

    private void eventtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventtypeActionPerformed

    private void BiscuitfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiscuitfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BiscuitfActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed





  eventdelete s1=new eventdelete();
                s1.setVisible(true);
                     this.dispose();










        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

            boolean valiReturntype=valiDate();
        
        if(valiReturntype){
        
        
        
        
        
        String ename = eventname.getText();
        String etype = String.valueOf(eventtype.getSelectedItem());
        String earea = String.valueOf(eventarea.getSelectedItem());

        Date date = eventdate.getDate();
        String strDate = DateFormat.getDateInstance().format(date);

        String bis = String.valueOf(Biscuitf.getSelectedItem());
        int ebsip = Integer.valueOf(biscuitpacket.getText());
        double efood = Double.valueOf(foods.getText());
        double etrans = Double.valueOf(transport.getText());
        int sub = Integer.valueOf(subbox.getText());
        try {

            DatabaseConnection getCon = new DatabaseConnection();
            Connection con = getCon.getConnection();

            String q = "INSERT INTO eventpromotion(ename,etype,earea,edate,bfalv,hmbpackets,food,trans,subt) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, ename);
            ps.setString(2, etype);
            ps.setString(3, earea);
            ps.setString(4, strDate);
            ps.setString(5, bis);
            ps.setInt(6, ebsip);
            ps.setDouble(7, efood);
            ps.setDouble(8, etrans);
            ps.setInt(9, sub);
            

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Ok");
            } else {
                System.out.println("No");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    
         boolean valiReturnType = valiDate();

        if (valiReturnType) {
        
         int eve = Integer.valueOf(eventid.getText());
        String ename = eventname.getText();
        String etype = String.valueOf(eventtype.getSelectedItem());
        String earea = String.valueOf(eventarea.getSelectedItem());

        Date date = eventdate.getDate();
        String strDate = DateFormat.getDateInstance().format(date);

        String bis = String.valueOf(Biscuitf.getSelectedItem());
        int ebsip = Integer.valueOf(biscuitpacket.getText());
        double efood = Double.valueOf(foods.getText());
        double etrans = Double.valueOf(transport.getText());
        int sub = Integer.valueOf(subbox.getText());
        try {

            DatabaseConnection getCon = new DatabaseConnection();
            Connection con = getCon.getConnection();

            String q = "Update eventpromotion set ename=?,etype=?,earea=?,edate=?,bfalv=?,hmbpackets=?,food=?,trans=?,subt=?  WHERE eid=?";
            PreparedStatement ps = con.prepareStatement(q);
            
            
            ps.setString(1, ename);
            ps.setString(2, etype);
            ps.setString(3, earea);
            ps.setString(4, strDate);
            ps.setString(5, bis);
            ps.setInt(6, ebsip);
            ps.setDouble(7, efood);
            ps.setDouble(8, etrans);
            ps.setInt(9, sub);
             ps.setInt(10, eve);

            int i = ps.executeUpdate();
                 if (i > 0) {
                JOptionPane.showMessageDialog(null, "Data Updated");
                
                 jDesktopPane1.removeAll();
        vieweventd v1= new vieweventd();
        jDesktopPane1.add(v1).setVisible(true);
        
                
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
      
    

        }




        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed



                select s1=new select();
                s1.setVisible(true);
                     this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        
        
        
        
        
        
        
        

 jDesktopPane1.removeAll();
        vieweventd v1= new vieweventd();
        jDesktopPane1.add(v1).setVisible(true);
        
                


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void biscuitpacketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_biscuitpacketKeyTyped

        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            
            getToolkit().beep();
            evt.consume();
        }







        // TODO add your handling code here:
    }//GEN-LAST:event_biscuitpacketKeyTyped

    private void foodsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_foodsKeyTyped

  char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            
            getToolkit().beep();
            evt.consume();
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_foodsKeyTyped

    private void transportKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transportKeyTyped



          char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            
            getToolkit().beep();
            evt.consume();
        }










        // TODO add your handling code here:
    }//GEN-LAST:event_transportKeyTyped

    private void biscuitpacketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_biscuitpacketKeyReleased


if (biscuitpacket.getText().trim().length() != 0) {
            double bannerQuantity = Double.valueOf(biscuitpacket.getText());
              double fp = Double.valueOf(foods.getText());
              double tp = Double.valueOf(transport.getText());
            
         
                subbox.setText(String.valueOf(fp + bannerQuantity+tp));

                
                
                
                
                
                
                
                
                
                
                
                } else {
            subbox.setText("");
        }





















        // TODO add your handling code here:
    }//GEN-LAST:event_biscuitpacketKeyReleased

    private void foodsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_foodsKeyReleased

if (biscuitpacket.getText().trim().length() != 0) {
            double bannerQuantity = Double.valueOf(biscuitpacket.getText());
              double fp = Double.valueOf(foods.getText());
              double tp = Double.valueOf(transport.getText());
            
         
                subbox.setText(String.valueOf(fp + bannerQuantity+tp));

                
                
                
                
                
                
                
                
                
                
                
                } else {
            subbox.setText("");
        }



















        // TODO add your handling code here:
    }//GEN-LAST:event_foodsKeyReleased

    private void transportKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transportKeyReleased
if (biscuitpacket.getText().trim().length() != 0) {
            double bannerQuantity = Double.valueOf(biscuitpacket.getText());
              double fp = Double.valueOf(foods.getText());
              double tp = Double.valueOf(transport.getText());
            
         
                subbox.setText(String.valueOf(fp + bannerQuantity+tp));

                
                
                
                
                
                
                
                
                
                
                
                } else {
            subbox.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_transportKeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        




                select s1=new select();
                s1.setVisible(true);
                     this.dispose();














        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void eventidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eventidKeyReleased

        try {
            viewDetails();
            
            
            
            
            
            
            // TODO add your handling code here:
        } catch (ParseException ex) {
            Logger.getLogger(eventpromotion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eventidKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
           
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new eventpromotion().setVisible(true);
                }
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(eventpromotion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(eventpromotion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(eventpromotion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(eventpromotion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Biscuitf;
    private javax.swing.JTextField biscuitpacket;
    private javax.swing.JComboBox<String> eventarea;
    private com.toedter.calendar.JDateChooser eventdate;
    private javax.swing.JTextField eventid;
    private javax.swing.JTextField eventname;
    private javax.swing.JComboBox<String> eventtype;
    private javax.swing.JTextField foods;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField subbox;
    private javax.swing.JTextField transport;
    // End of variables declaration//GEN-END:variables



private boolean valiDate() {
        JTextField textFields[] = new JTextField[]{eventname, biscuitpacket,foods,transport,subbox};
       
        boolean flag = true;

        if (eventtype.getSelectedIndex() == 0) {
            eventtype.setBorder(BorderFactory.createLineBorder(Color.red));
            flag = false;

        } else {
           eventtype.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            flag = true;

        }

        
        
        
         if (eventarea.getSelectedIndex() == 0) {
            eventarea.setBorder(BorderFactory.createLineBorder(Color.red));
            flag = false;

        } else {
           eventarea.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            flag = true;

        }

            if (Biscuitf.getSelectedIndex() == 0) {
            Biscuitf.setBorder(BorderFactory.createLineBorder(Color.red));
            flag = false;

        } else {
          Biscuitf.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            flag = true;

        }
         
         
         
         
         
         
         
         
         if (eventdate.getDate()== null) {
            eventdate.setBorder(BorderFactory.createLineBorder(Color.red));
            flag = false;

        } else {
     eventdate.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            flag = true;

        }

        
        
        
        
        
        for (JTextField field : textFields) {
            if (field.getText().trim().length() == 0) {
                field.setBackground(Color.red);
                System.out.println("empty");
                flag = false;

            } else {
                field.setBackground(Color.white);
                field.setForeground(Color.black);
                System.out.println("not empty");
                flag = true;
            }
        }

       
        if (flag == true) {
            return true;
        } else {
            return false;
        }
    }


public void viewDetails() throws ParseException {
        try {
           DatabaseConnection getCon = new DatabaseConnection();
                Connection con = getCon.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT ename,etype,earea,edate,bfalv,hmbpackets,food,trans,subt FROM eventpromotion WHERE eid LIKE ?");
           ps.setString(1, "%" + eventid.getText() + "%");
            ResultSet result = ps.executeQuery();

            while (result.next()) {
               
             eventname.setText(result.getString("ename"));
                eventtype.setSelectedItem(result.getString("etype"));
               eventarea.setSelectedItem(result.getString("earea"));
                String dateValue = result.getString("edate");
                 
                java.util.Date date = new SimpleDateFormat("MMM d, yyyy").parse(dateValue);
               eventdate.setDate(date);
                 
                 
             Biscuitf.setSelectedItem(result.getString("bfalv"));
               biscuitpacket.setText(result.getString("hmbpackets"));
               foods.setText(result.getString("food")); 
                  transport.setText(result.getString("trans")); 
                   subbox.setText(result.getString("subt")); 
                  
              
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        
        }
    }

}
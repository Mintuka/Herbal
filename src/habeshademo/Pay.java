
package habeshademo;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Pay extends HabeshaDemo {
    
    public Pay() {
        initComponents();
    }
    
    public int intamount = 0;
    public String strValue = "";
    public int intValue = 0;
    public String stringPrice = "";
    public String stringSum = "";
    

    public int currentItem(){
            int price1 = Integer.parseInt(jComboBox1.getSelectedItem().toString()) ;
            int price2 = Integer.parseInt(jComboBox2.getSelectedItem().toString()) ;
            int price3 = Integer.parseInt(jComboBox3.getSelectedItem().toString()) ;
            int price4 = Integer.parseInt(jComboBox4.getSelectedItem().toString()) ;
            int price5 = Integer.parseInt(jComboBox5.getSelectedItem().toString()) ;
            int price6 = Integer.parseInt(jComboBox6.getSelectedItem().toString()) ;
            int price7 = Integer.parseInt(jComboBox7.getSelectedItem().toString()) ;
            int price8 = Integer.parseInt(jComboBox8.getSelectedItem().toString()) ;
            int price9 = Integer.parseInt(jComboBox9.getSelectedItem().toString()) ;
            int price10 = Integer.parseInt(jComboBox10.getSelectedItem().toString()) ;
            int price11 = Integer.parseInt(jComboBox11.getSelectedItem().toString()) ;
            int price12 = Integer.parseInt(jComboBox12.getSelectedItem().toString()) ;
            int price13 = Integer.parseInt(jComboBox13.getSelectedItem().toString()) ;
            int price14 = Integer.parseInt(jComboBox14.getSelectedItem().toString()) ;
            int price15 = Integer.parseInt(jComboBox15.getSelectedItem().toString()) ;
            int price16 = Integer.parseInt(jComboBox16.getSelectedItem().toString()) ;
            int price17 = Integer.parseInt(jComboBox17.getSelectedItem().toString()) ;
            int price18 = Integer.parseInt(jComboBox18.getSelectedItem().toString()) ;
            
            int price = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9 +
                        price10 + price11 + price12 + price13 + price14 + price15 + price16 + price17 + price18 ;
    return price;
    }
    
    public int currentPrice(){
            int price1 = Integer.parseInt(jComboBox1.getSelectedItem().toString()) * 65;
            int price2 = Integer.parseInt(jComboBox2.getSelectedItem().toString()) * 130;
            int price3 = Integer.parseInt(jComboBox3.getSelectedItem().toString()) * 65;
            int price4 = Integer.parseInt(jComboBox4.getSelectedItem().toString()) * 130;
            int price5 = Integer.parseInt(jComboBox5.getSelectedItem().toString()) * 65;
            int price6 = Integer.parseInt(jComboBox6.getSelectedItem().toString()) * 130;
            int price7 = Integer.parseInt(jComboBox7.getSelectedItem().toString()) * 40;
            int price8 = Integer.parseInt(jComboBox8.getSelectedItem().toString()) * 40;
            int price9 = Integer.parseInt(jComboBox9.getSelectedItem().toString()) * 40;
            int price10 = Integer.parseInt(jComboBox10.getSelectedItem().toString()) * 60;
            int price11 = Integer.parseInt(jComboBox11.getSelectedItem().toString()) * 50;
            int price12 = Integer.parseInt(jComboBox12.getSelectedItem().toString()) * 65;
            int price13 = Integer.parseInt(jComboBox13.getSelectedItem().toString()) * 50;
            int price14 = Integer.parseInt(jComboBox14.getSelectedItem().toString()) * 65;
            int price15 = Integer.parseInt(jComboBox15.getSelectedItem().toString()) * 50;
            int price16 = Integer.parseInt(jComboBox16.getSelectedItem().toString()) * 65;
            int price17 = Integer.parseInt(jComboBox17.getSelectedItem().toString()) * 50;
            int price18 = Integer.parseInt(jComboBox18.getSelectedItem().toString()) * 65;
            
            int price = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9 +
                        price10 + price11 + price12 + price13 + price14 + price15 + price16 + price17 + price18 ;
    return price;
    }

        public void Submmit(String item, String NewAmount, String DBphone) throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBC","root","");
        Statement statement =  connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT "+item+" FROM Habesha WHERE phone = " + DBphone);
        int intvalue = 0;
        while(result.next()){
             intvalue= result.getInt(item);
                            }
        intamount = Integer.parseInt(NewAmount);
        int Total = intvalue - intamount;
        NewAmount = Integer.toString(Total);
        statement.executeUpdate( "UPDATE Habesha SET " + item + " = " + NewAmount + " WHERE phone = " + DBphone); //stringPhone=0910
        
    }
            public void Return(String item, String NewAmount, String DBphone) throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBC","root","");
        Statement statement =  connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT "+item+" FROM Habesha WHERE phone = " + DBphone);
        int intvalue = 0;
        while(result.next()){
             intvalue= result.getInt(item);
                            }
        int intamount = Integer.parseInt(NewAmount);
        int Total = intvalue - intamount;
        String HabeshaAmount = Integer.toString(Total);
        statement.executeUpdate( "UPDATE Habesha SET " + item + " = " + HabeshaAmount + " WHERE phone = " + DBphone); //stringPhone=0910
        
        ResultSet resultStore = statement.executeQuery("SELECT "+item+" FROM Store WHERE password = 19283746");
        int value = 0;
        while(resultStore.next()){
             value= resultStore.getInt(item);
                            }
        intamount = Integer.parseInt(NewAmount);
        int total = value + intamount;
        String StoreAmount = Integer.toString(total);
        statement.executeUpdate( "UPDATE Store SET " + item + " = " + StoreAmount + " WHERE password = 19283746");        
    }
    //checks not to accept payment above the sales have taken
            public int Check(String item, String DBphone) throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBC","root","");
        Statement statement =  connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT "+item+" FROM Habesha WHERE phone = " + DBphone);
        int intvalue = 0;
        while(result.next()){
             intvalue= result.getInt(item);
                            }            
            return intvalue;
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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
        setTitle("PAYMENT ");
        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(0, 153, 153));

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel29.setText("Phone");

        jPanel4.setBackground(new java.awt.Color(51, 0, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oils", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(null);
        jPanel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox5.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Castor (65ml)");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Castor (130ml)");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Black-Seed (65ml)");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Black-Seed (130ml)");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aloevera (65ml)");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Aloevera (130ml)");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel51.setBackground(new java.awt.Color(255, 51, 51));
        jLabel51.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("0");
        jLabel51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel52.setBackground(new java.awt.Color(255, 51, 51));
        jLabel52.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("0");
        jLabel52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel53.setBackground(new java.awt.Color(255, 51, 51));
        jLabel53.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("0");
        jLabel53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel54.setBackground(new java.awt.Color(255, 51, 51));
        jLabel54.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("0");
        jLabel54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel55.setBackground(new java.awt.Color(255, 51, 51));
        jLabel55.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("0");
        jLabel55.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel56.setBackground(new java.awt.Color(255, 51, 51));
        jLabel56.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("0");
        jLabel56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel52))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel54))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel55))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel56))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shampoos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jComboBox11.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        jComboBox13.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });

        jComboBox12.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });

        jComboBox14.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Aloevera (400ml)");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Aloevera (500ml)");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Lemon (400ml)");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Lemon (500ml)");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel65.setBackground(new java.awt.Color(255, 51, 51));
        jLabel65.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("0");
        jLabel65.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel66.setBackground(new java.awt.Color(255, 51, 51));
        jLabel66.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("0");
        jLabel66.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel67.setBackground(new java.awt.Color(255, 51, 51));
        jLabel67.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("0");
        jLabel67.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel68.setBackground(new java.awt.Color(255, 51, 51));
        jLabel68.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("0");
        jLabel68.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel65))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel66))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel67))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel68))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 0, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Soaps", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jComboBox7.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jComboBox8.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jComboBox9.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jComboBox10.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Black-Seed ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tumer ");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Aloevera ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Scrap");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel57.setBackground(new java.awt.Color(255, 51, 51));
        jLabel57.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("0");
        jLabel57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel58.setBackground(new java.awt.Color(255, 51, 51));
        jLabel58.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("0");
        jLabel58.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel59.setBackground(new java.awt.Color(255, 51, 51));
        jLabel59.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("0");
        jLabel59.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel60.setBackground(new java.awt.Color(255, 51, 51));
        jLabel60.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("0");
        jLabel60.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel58))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel59))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel60))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 0, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conditioners", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jComboBox15.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox15ActionPerformed(evt);
            }
        });

        jComboBox16.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jComboBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox16ActionPerformed(evt);
            }
        });

        jComboBox17.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox17ActionPerformed(evt);
            }
        });

        jComboBox18.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jComboBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox18ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Aloevera (400ml)");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Aloevera (500ml)");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Lemon (400ml)");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Lemon (500ml)");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel61.setBackground(new java.awt.Color(255, 51, 51));
        jLabel61.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("0");
        jLabel61.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel62.setBackground(new java.awt.Color(255, 51, 51));
        jLabel62.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("0");
        jLabel62.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel63.setBackground(new java.awt.Color(255, 51, 51));
        jLabel63.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("0");
        jLabel63.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel64.setBackground(new java.awt.Color(255, 51, 51));
        jLabel64.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("0");
        jLabel64.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel27.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(252, 252, 252));
        jLabel27.setText("0");

        jLabel26.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(252, 252, 252));
        jLabel26.setText("Price");

        jLabel24.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(252, 252, 252));
        jLabel24.setText("Items");

        jLabel25.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(252, 252, 252));
        jLabel25.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jButton1.setText("Check");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("return");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("pay");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("show");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton2)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            if(combo <= Check("castorOilOne",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox1.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox2.getSelectedItem().toString());
            if(combo <= Check("castorOilTwo",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox2.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox3.getSelectedItem().toString());
            if(combo <= Check("blackseedOilOne",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox3.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox4.getSelectedItem().toString());
            if(combo <= Check("blackseedOilTwo",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox4.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox5.getSelectedItem().toString());
            if(combo <= Check("aloeveraOilOne",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox5.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox6.getSelectedItem().toString());
            if(combo <= Check("aloeveraOilTwo",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox6.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox7.getSelectedItem().toString());
            if(combo <= Check("tumerSoap",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox7.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox8.getSelectedItem().toString());
            if(combo <= Check("aloeveraSoap",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox8.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox9.getSelectedItem().toString());
            if(combo <= Check("blackseedSoap",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox9.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox10.getSelectedItem().toString());
            if(combo <= Check("scrap",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox10.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox11.getSelectedItem().toString());
            if(combo <= Check("aloeveraShampooOne",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox11.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox12.getSelectedItem().toString());
            if(combo <= Check("aloeveraShampooTwo",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox12.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox13.getSelectedItem().toString());
            if(combo <= Check("lemonShampooOne",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox13.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox14.getSelectedItem().toString());
            if(combo <= Check("lemonShampooTwo",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox14.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jComboBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox15ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox15.getSelectedItem().toString());
            if(combo <= Check("aloeveraConditionerOne",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox15.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox15ActionPerformed

    private void jComboBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox16ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox16.getSelectedItem().toString());
            if(combo <= Check("aloeveraConditionerTwo",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox16.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox16ActionPerformed

    private void jComboBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox17ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox17.getSelectedItem().toString());
            if(combo <= Check("lemonConditionerOne",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox17.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox17ActionPerformed

    private void jComboBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox18ActionPerformed


        try {
            String phone = jTextField1.getText().toString();
            int combo = Integer.parseInt(jComboBox18.getSelectedItem().toString());
            if(combo <= Check("lemonConditionerTwo",phone)){
                jLabel27.setText(Integer.toString(currentPrice()));
                jLabel25.setText(Integer.toString(currentItem()));
            }else{
                JOptionPane.showMessageDialog(null, "You must not pay above you have taken");
                jComboBox18.setSelectedIndex(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBox18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String phone = jTextField1.getText().toString();
        //combo 1
        String value1 = jComboBox1.getSelectedItem().toString();
        try {
            Submmit("castorOilOne",value1,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 2
        String value2 = jComboBox2.getSelectedItem().toString();
        try {
            Submmit("castorOilTwo",value2,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 3
        String value3 = jComboBox3.getSelectedItem().toString();
        try {
            Submmit("blackseedOilOne",value3,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 4
        String value4 = jComboBox4.getSelectedItem().toString();
        try {
            Submmit("blackseedOilTwo",value4,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 5
        String value5 = jComboBox5.getSelectedItem().toString();
        try {
            Submmit("aloeveraOilOne",value5,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 6
        String value6 = jComboBox6.getSelectedItem().toString();
        try {
            Submmit("aloeveraOilTwo",value6,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 7
        String value7 = jComboBox7.getSelectedItem().toString();
        try {
            Submmit("tumerSoap",value7,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 8
        String value8 = jComboBox8.getSelectedItem().toString();
        try {
            Submmit("aloeveraSoap",value8,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 9
        String value9 = jComboBox9.getSelectedItem().toString();
        try {
            Submmit("blackseedSoap",value9,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 10
        String value10 = jComboBox10.getSelectedItem().toString();
        try {
            Submmit("scrap",value10,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 11
        String value11 = jComboBox11.getSelectedItem().toString();
        try {
            Submmit("aloeveraShampooOne",value11,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 12
        String value12 = jComboBox12.getSelectedItem().toString();
        try {
            Submmit("aloeveraShampooTwo",value12,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 13
        String value13 = jComboBox13.getSelectedItem().toString();
        try {
            Submmit("lemonShampooOne",value13,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 14
        String value14 = jComboBox14.getSelectedItem().toString();
        try {
            Submmit("lemonShampooTwo",value14,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 15
        String value15 = jComboBox15.getSelectedItem().toString();
        try {
            Submmit("aloeveraConditionerOne",value15,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 16
        String value16 = jComboBox16.getSelectedItem().toString();
        try {
            Submmit("aloeveraConditionerTwo",value16,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 17
        String value17 = jComboBox17.getSelectedItem().toString();
        try {
            Submmit("lemonConditionerOne",value17,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        //combo 18
        String value18 = jComboBox18.getSelectedItem().toString();
        try {
            Submmit("lemonConditionerTwo",value18,phone);
        } catch (SQLException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }

        //alarms if payment is done
        JOptionPane.showMessageDialog(null, "PAYED!!!");
        //return to '0' all integer values
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
        jComboBox7.setSelectedIndex(0);
        jComboBox8.setSelectedIndex(0);
        jComboBox9.setSelectedIndex(0);
        jComboBox10.setSelectedIndex(0);
        jComboBox11.setSelectedIndex(0);
        jComboBox12.setSelectedIndex(0);
        jComboBox13.setSelectedIndex(0);
        jComboBox14.setSelectedIndex(0);
        jComboBox15.setSelectedIndex(0);
        jComboBox16.setSelectedIndex(0);
        jComboBox17.setSelectedIndex(0);
        jComboBox18.setSelectedIndex(0);

        jLabel25.setText("0");
        jLabel27.setText("0");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                        String phone = jTextField1.getText().toString();
                //combo 1
                String value1 = jComboBox1.getSelectedItem().toString();
                try {
                    Return("castorOilOne",value1,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
               //combo 2 
                String value2 = jComboBox2.getSelectedItem().toString();
                try {
                    Return("castorOilTwo",value2,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
               //combo 3 
                 String value3 = jComboBox3.getSelectedItem().toString();
                try {
                    Return("blackseedOilOne",value3,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
               //combo 4 
                 String value4 = jComboBox4.getSelectedItem().toString();
                try {
                    Return("blackseedOilTwo",value4,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
               //combo 5 
                 String value5 = jComboBox5.getSelectedItem().toString();
                try {
                    Return("aloeveraOilOne",value5,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 6 
                 String value6 = jComboBox6.getSelectedItem().toString();
                try {
                    Return("aloeveraOilTwo",value6,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 7 
                 String value7 = jComboBox7.getSelectedItem().toString();
                try {
                    Return("tumerSoap",value7,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 8 
                 String value8 = jComboBox8.getSelectedItem().toString();
                try {
                    Return("aloeveraSoap",value8,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 9 
                 String value9 = jComboBox9.getSelectedItem().toString();
                try {
                    Return("blackseedSoap",value9,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 10 
                 String value10 = jComboBox10.getSelectedItem().toString();
                try {
                    Return("scrap",value10,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 11 
                 String value11 = jComboBox11.getSelectedItem().toString();
                try {
                    Return("aloeveraShampooOne",value11,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 12 
                 String value12 = jComboBox12.getSelectedItem().toString();
                try {
                    Return("aloeveraShampooTwo",value12,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 13 
                 String value13 = jComboBox13.getSelectedItem().toString();
                try {
                    Return("lemonShampooOne",value13,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 14 
                 String value14 = jComboBox14.getSelectedItem().toString();
                try {
                    Return("lemonShampooTwo",value14,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 15 
                 String value15 = jComboBox15.getSelectedItem().toString();
                try {
                    Return("aloeveraConditionerOne",value15,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 16 
                 String value16 = jComboBox16.getSelectedItem().toString();
                try {
                    Return("aloeveraConditionerTwo",value16,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 17 
                 String value17 = jComboBox17.getSelectedItem().toString();
                try {
                    Return("lemonConditionerOne",value17,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 18 
                 String value18 = jComboBox18.getSelectedItem().toString();
                try {
                    Return("lemonConditionerTwo",value18,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String phoneno = jTextField1.getText();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBC","root","");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM habesha WHERE phone = " + phoneno);
            
            int value1 = 0,value2 = 0,value3 = 0,value4 = 0,value5 = 0,value6 = 0,value7 = 0,value8 = 0,value9 = 0,
                value10 = 0,value11 = 0,value12 = 0,value13 = 0,value14 = 0,value15 = 0,value16 = 0,value17 = 0,value18 = 0;
            
            while(result.next()){
                 value1 = result.getInt("castorOilOne");
                 value2 = result.getInt("castorOilTwo");
                 value3 = result.getInt("blackseedOilOne");
                 value4 = result.getInt("blackseedOilTwo");
                 value5 = result.getInt("aloeveraOilOne");
                 value6 = result.getInt("aloeveraOilTwo");
                 value7 = result.getInt("tumerSoap");
                 value8 = result.getInt("aloeveraSoap");
                 value9 = result.getInt("blackseedSoap");
                 value10 = result.getInt("scrap");
                 value11 = result.getInt("aloeveraShampooOne");
                 value12 = result.getInt("aloeveraShampooTwo");
                 value13 = result.getInt("lemonShampooOne");
                 value14 = result.getInt("lemonShampooTwo");
                 value15 = result.getInt("aloeveraConditionerOne");
                 value16 = result.getInt("aloeveraConditionerTwo");
                 value17 = result.getInt("lemonConditionerOne");
                 value18 = result.getInt("lemonConditionerTwo");                
            }
        if (value1 > 0){    
            jLabel51.setText(Integer.toString(value1));
            jLabel51.setBackground(Color.red);
      
        }
            jLabel52.setText(Integer.toString(value2));
            jLabel53.setText(Integer.toString(value3));
            jLabel54.setText(Integer.toString(value4));
            jLabel55.setText(Integer.toString(value5));
            jLabel56.setText(Integer.toString(value6));
            jLabel57.setText(Integer.toString(value7));
            jLabel58.setText(Integer.toString(value8));
            jLabel59.setText(Integer.toString(value9));
            jLabel60.setText(Integer.toString(value10));
            jLabel65.setText(Integer.toString(value11));
            jLabel66.setText(Integer.toString(value12));
            jLabel67.setText(Integer.toString(value13));
            jLabel68.setText(Integer.toString(value14));
            jLabel61.setText(Integer.toString(value15));
            jLabel62.setText(Integer.toString(value16));
            jLabel63.setText(Integer.toString(value17));
            jLabel64.setText(Integer.toString(value18));
        } catch (SQLException ex) {
            Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jButton4ActionPerformed
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

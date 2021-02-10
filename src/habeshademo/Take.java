
package habeshademo;

import java.awt.Color;
import static java.awt.Font.BOLD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Take extends HabeshaDemo {

    public String strValue = "";
    public int intValue = 0;
    
    public Take(){
        initComponents();

    }
    
    public int currentItem() throws SQLException{
            
            int value1 = 0,value2 = 0,value3 = 0,value4 = 0,value5 = 0,value6 = 0,value7 = 0,value8 = 0,value9 = 0,
                value10 = 0,value11 = 0,value12 = 0,value13 = 0,value14 = 0,value15 = 0,value16 = 0,value17 = 0,value18 = 0;
        
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBC","root","");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM Store WHERE password = 19283746");
            
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
            int item1 = Integer.parseInt(jComboBox1.getSelectedItem().toString()) ;
                if(value1 < item1){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox1.setSelectedIndex(0);
                    item1 = 0;
                }
            int item2 = Integer.parseInt(jComboBox2.getSelectedItem().toString()) ;
                if(value2 < item2){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox2.setSelectedIndex(0);
                    item2 = 0;
                }
            int item3 = Integer.parseInt(jComboBox3.getSelectedItem().toString()) ;
                if(value3 < item3){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox3.setSelectedIndex(0);
                    item3 = 0;
                }
            int item4 = Integer.parseInt(jComboBox4.getSelectedItem().toString()) ;
                                if(value4 < item4){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox4.setSelectedIndex(0);
                    item4 = 0;
                                }
            int item5 = Integer.parseInt(jComboBox5.getSelectedItem().toString()) ;
                                if(value5 < item5){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox5.setSelectedIndex(0);
                    item5 = 0;
                                }
            int item6 = Integer.parseInt(jComboBox6.getSelectedItem().toString()) ;
                                if(value6 < item6){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox6.setSelectedIndex(0);
                    item6 = 0;
                                }
            int item7 = Integer.parseInt(jComboBox7.getSelectedItem().toString()) ;
                                if(value7 < item7){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox7.setSelectedIndex(0);
                    item7 = 0;
                                }
            int item8 = Integer.parseInt(jComboBox8.getSelectedItem().toString()) ;
                                if(value8 < item8){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox8.setSelectedIndex(0);
                    item8 = 0;
                                }
            int item9 = Integer.parseInt(jComboBox9.getSelectedItem().toString()) ;
                                if(value9 < item9){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox9.setSelectedIndex(0);
                    item9 = 0;
                                }
            int item10 = Integer.parseInt(jComboBox10.getSelectedItem().toString()) ;
                                if(value10 < item10){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox10.setSelectedIndex(0);
                    item10 = 0;
                                }
            int item11 = Integer.parseInt(jComboBox11.getSelectedItem().toString()) ;
                                if(value11 < item11){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox11.setSelectedIndex(0);
                    item11 = 0;
                                }
            int item12 = Integer.parseInt(jComboBox12.getSelectedItem().toString()) ;
                                if(value12 < item12){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox12.setSelectedIndex(0);
                    item12 = 0;
                                }
            int item13 = Integer.parseInt(jComboBox13.getSelectedItem().toString()) ;
                                if(value13 < item13){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox13.setSelectedIndex(0);
                    item13 = 0;
                                }
            int item14 = Integer.parseInt(jComboBox14.getSelectedItem().toString()) ;
                                if(value14 < item14){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox14.setSelectedIndex(0);
                    item14 = 0;
                                }
            int item15 = Integer.parseInt(jComboBox15.getSelectedItem().toString()) ;
                                if(value15 < item15){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox15.setSelectedIndex(0);
                    item15 = 0;
                                }
            int item16 = Integer.parseInt(jComboBox16.getSelectedItem().toString()) ;
                                if(value16 < item16){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox16.setSelectedIndex(0);
                    item16 = 0;
                                }
            int item17 = Integer.parseInt(jComboBox17.getSelectedItem().toString()) ;
                                if(value17 < item17){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox17.setSelectedIndex(0);
                    item17 = 0;
                                }
            int item18 = Integer.parseInt(jComboBox18.getSelectedItem().toString()) ;
                                if(value18 < item18){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox18.setSelectedIndex(0);
                    item18 = 0;
                                }
                                
            int item = item1 + item2 + item3 + item4 + item5 + item6 + item7 + item8 + item9 +
                        item10 + item11 + item12 + item13 + item14 + item15 + item16 + item17 + item18 ;
    return item;
    }
    
    public int currentPrice() throws SQLException{
        
                int value1 = 0,value2 = 0,value3 = 0,value4 = 0,value5 = 0,value6 = 0,value7 = 0,value8 = 0,value9 = 0,
                value10 = 0,value11 = 0,value12 = 0,value13 = 0,value14 = 0,value15 = 0,value16 = 0,value17 = 0,value18 = 0;
        
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBC","root","");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM Store WHERE password = 19283746");
            
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
            int item1 = Integer.parseInt(jComboBox1.getSelectedItem().toString()) ;
                if(value1 < item1){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox1.setSelectedIndex(0);
                    item1 = 0;
                }
            int item2 = Integer.parseInt(jComboBox2.getSelectedItem().toString()) ;
                if(value2 < item2){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox2.setSelectedIndex(0);
                    item2 = 0;
                }
            int item3 = Integer.parseInt(jComboBox3.getSelectedItem().toString()) ;
                if(value3 < item3){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox3.setSelectedIndex(0);
                    item3 = 0;
                }
            int item4 = Integer.parseInt(jComboBox4.getSelectedItem().toString()) ;
                                if(value4 < item4){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox4.setSelectedIndex(0);
                    item4 = 0;
                                }
            int item5 = Integer.parseInt(jComboBox5.getSelectedItem().toString()) ;
                                if(value5 < item5){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox5.setSelectedIndex(0);
                    item5 = 0;
                                }
            int item6 = Integer.parseInt(jComboBox6.getSelectedItem().toString()) ;
                                if(value6 < item6){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox6.setSelectedIndex(0);
                    item6 = 0;
                                }
            int item7 = Integer.parseInt(jComboBox7.getSelectedItem().toString()) ;
                                if(value7 < item7){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox7.setSelectedIndex(0);
                    item7 = 0;
                                }
            int item8 = Integer.parseInt(jComboBox8.getSelectedItem().toString()) ;
                                if(value8 < item8){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox8.setSelectedIndex(0);
                    item8 = 0;
                                }
            int item9 = Integer.parseInt(jComboBox9.getSelectedItem().toString()) ;
                                if(value9 < item9){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox9.setSelectedIndex(0);
                    item9 = 0;
                                }
            int item10 = Integer.parseInt(jComboBox10.getSelectedItem().toString()) ;
                                if(value10 < item10){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox10.setSelectedIndex(0);
                    item10 = 0;
                                }
            int item11 = Integer.parseInt(jComboBox11.getSelectedItem().toString()) ;
                                if(value11 < item11){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox11.setSelectedIndex(0);
                    item11 = 0;
                                }
            int item12 = Integer.parseInt(jComboBox12.getSelectedItem().toString()) ;
                                if(value12 < item12){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox12.setSelectedIndex(0);
                    item12 = 0;
                                }
            int item13 = Integer.parseInt(jComboBox13.getSelectedItem().toString()) ;
                                if(value13 < item13){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox13.setSelectedIndex(0);
                    item13 = 0;
                                }
            int item14 = Integer.parseInt(jComboBox14.getSelectedItem().toString()) ;
                                if(value14 < item14){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox14.setSelectedIndex(0);
                    item14 = 0;
                                }
            int item15 = Integer.parseInt(jComboBox15.getSelectedItem().toString()) ;
                                if(value15 < item15){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox15.setSelectedIndex(0);
                    item15 = 0;
                                }
            int item16 = Integer.parseInt(jComboBox16.getSelectedItem().toString()) ;
                                if(value16 < item16){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox16.setSelectedIndex(0);
                    item16 = 0;
                                }
            int item17 = Integer.parseInt(jComboBox17.getSelectedItem().toString()) ;
                                if(value17 < item17){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox17.setSelectedIndex(0);
                    item17 = 0;
                                }
            int item18 = Integer.parseInt(jComboBox18.getSelectedItem().toString()) ;
                                if(value18 < item18){
                    JOptionPane.showMessageDialog(null, "Have no this amount in store");
                    jComboBox18.setSelectedIndex(0);
                    item18 = 0;
                                }
        
            int price1 = item1 * 65;
            int price2 = item2 * 130;
            int price3 = item3 * 65;
            int price4 = item4 * 130;
            int price5 = item5 * 65;
            int price6 = item6 * 130;
            int price7 = item7 * 40;
            int price8 = item8 * 40;
            int price9 = item9 * 40;
            int price10 = item10 * 60;
            int price11 = item11 * 50;
            int price12 = item12 * 65;
            int price13 = item13 * 50;
            int price14 = item14 * 65;
            int price15 = item15 * 50;
            int price16 = item16 * 65;
            int price17 = item17 * 50;
            int price18 = item18 * 65;
            
            int price = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9 +
                        price10 + price11 + price12 + price13 + price14 + price15 + price16 + price17 + price18 ;
    return price;
    }
    
    public int limitTake(String DBphone) throws SQLException{
        int DBTotal = 0;
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBC","root","");
        Statement statement =  connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM Habesha WHERE phone = " + DBphone);
        
        while(result.next()){
        int item1 = result.getInt("castorOilOne");
            
        int item2 = result.getInt("castorOilTwo");
            
        int item3 = result.getInt("blackseedOilOne");
            
        int item4 = result.getInt("blackseedOilTwo");
            
        int item5 = result.getInt("aloeveraOilOne");
            
        int item6 = result.getInt("aloeveraOilTwo");
            
        int item7 = result.getInt("tumerSoap");
            
        int item8 = result.getInt("aloeveraSoap");
            
        int item9 = result.getInt("blackseedSoap");
           
        int item10 = result.getInt("scrap");
            
        int item11 = result.getInt("aloeveraShampooOne");
            
        int item12 = result.getInt("aloeveraShampooTwo");
            
        int item13 = result.getInt("lemonShampooOne");
            
        int item14 = result.getInt("lemonShampooTwo");
            
        int item15 = result.getInt("aloeveraConditionerOne");
            
        int item16 = result.getInt("aloeveraConditionerTwo");
            
        int item17 = result.getInt("lemonConditionerOne");
            
        int item18 = result.getInt("lemonConditionerTwo");
        
        
            int price1 = item1 * 65;
            int price2 = item2 * 130;
            int price3 = item3 * 65;
            int price4 = item4 * 130;
            int price5 = item5 * 65;
            int price6 = item6 * 130;
            int price7 = item7 * 40;
            int price8 = item8 * 40;
            int price9 = item9 * 40;
            int price10 = item10 * 60;
            int price11 = item11 * 50;
            int price12 = item12 * 65;
            int price13 = item13 * 50;
            int price14 = item14 * 65;
            int price15 = item15 * 50;
            int price16 = item16 * 65;
            int price17 = item17 * 50;
            int price18 = item18 * 65;
                        
        DBTotal = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9 +
                  price10 + price11 + price12 + price13 + price14 + price15 + price16 + price17 + price18 ;
        }
        return DBTotal;
    }
    
    public void Submmit(String item, String NewAmount, String DBphone) throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBC","root","");
        Statement statement =  connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT "+item+" FROM Habesha WHERE phone = " + DBphone);
        int intvalue = 0;
        while(result.next()){
             intvalue= result.getInt(item);
                            }
        int intamount = Integer.parseInt(NewAmount);
        int Total = intvalue + intamount;
        String HabeshaAmount = Integer.toString(Total);
        statement.executeUpdate( "UPDATE Habesha SET " + item + " = " + HabeshaAmount + " WHERE phone = " + DBphone); //stringPhone=0910
        
        ResultSet resultStore = statement.executeQuery("SELECT "+item+" FROM Store WHERE password = 19283746");
        int value = 0;
        while(resultStore.next()){
             value= resultStore.getInt(item);
                            }
        intamount = Integer.parseInt(NewAmount);
        int total = value - intamount;
        String StoreAmount = Integer.toString(total);
        statement.executeUpdate( "UPDATE Store SET " + item + " = " + StoreAmount + " WHERE password = 19283746");        
    }
    public void combo(JComboBox box){
                try {
            
            String phone = jTextField1.getText().toString();
            int Total = limitTake(phone) + currentPrice();

            if(Total <= 1500){
                String stringPrice = Integer.toString(currentPrice());
                    jLabel27.setText(stringPrice);
                String stringSum = Integer.toString(currentItem());
                    jLabel25.setText(stringSum);                // TODO add your handling code here:
            }
            else{
                JOptionPane.showMessageDialog(null, "You can't take more items with out payment");
                box.setSelectedIndex(0);
            }        // TODO add your handling code here:
                    } catch (SQLException ex) {
                        Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TAKE ITEMS");
        setBackground(new java.awt.Color(0, 102, 255));
        setForeground(new java.awt.Color(0, 102, 255));

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel29.setText("Phone");

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oils", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

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

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Castor (65ml)");

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Castor (130ml)");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Black-Seed (65ml)");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Black-Seed (130ml)");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aloevera (65ml)");

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Aloevera (130ml)");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("0");
        jLabel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("0");
        jLabel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("0");
        jLabel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("0");
        jLabel23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("0");
        jLabel28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("0");
        jLabel30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel15))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shampoos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jComboBox11.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        jComboBox12.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });

        jComboBox13.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
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

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Aloevera (500ml)");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Lemon (400ml)");

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Lemon (500ml)");

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("0");
        jLabel35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("0");
        jLabel36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("0");
        jLabel37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("0");
        jLabel38.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel38))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Soaps", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

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

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tumer ");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Aloevera ");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Scrap");

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("0");
        jLabel31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("0");
        jLabel32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("0");
        jLabel33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("0");
        jLabel34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel31)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel34))
                .addGap(23, 23, 23))
        );

        jPanel4.setBackground(new java.awt.Color(51, 0, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conditioners", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Aloevera (400ml)");

        jComboBox15.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox15ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Aloevera (500ml)");

        jComboBox16.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jComboBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox16ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Lemon (400ml)");

        jComboBox17.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox17ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Lemon (500ml)");

        jComboBox18.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jComboBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox18ActionPerformed(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("0");
        jLabel39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("0");
        jLabel40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("0");
        jLabel41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("0");
        jLabel42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel19)
                            .addComponent(jLabel11))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(55, 55, 55)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Items");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("0");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Price");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel24)
                        .addComponent(jLabel25))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jButton1.setText("Check");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("TAKE");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Show");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55))))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        combo(jComboBox1);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
               
                String phone = jTextField1.getText().toString();
                //combo 1
                String value1 = jComboBox1.getSelectedItem().toString();
                try {
                    Submmit("castorOilOne",value1,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
               //combo 2 
                String value2 = jComboBox2.getSelectedItem().toString();
                try {
                    Submmit("castorOilTwo",value2,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
               //combo 3 
                 String value3 = jComboBox3.getSelectedItem().toString();
                try {
                    Submmit("blackseedOilOne",value3,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
               //combo 4 
                 String value4 = jComboBox4.getSelectedItem().toString();
                try {
                    Submmit("blackseedOilTwo",value4,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
               //combo 5 
                 String value5 = jComboBox5.getSelectedItem().toString();
                try {
                    Submmit("aloeveraOilOne",value5,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 6 
                 String value6 = jComboBox6.getSelectedItem().toString();
                try {
                    Submmit("aloeveraOilTwo",value6,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 7 
                 String value7 = jComboBox7.getSelectedItem().toString();
                try {
                    Submmit("tumerSoap",value7,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 8 
                 String value8 = jComboBox8.getSelectedItem().toString();
                try {
                    Submmit("aloeveraSoap",value8,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 9 
                 String value9 = jComboBox9.getSelectedItem().toString();
                try {
                    Submmit("blackseedSoap",value9,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 10 
                 String value10 = jComboBox10.getSelectedItem().toString();
                try {
                    Submmit("scrap",value10,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 11 
                 String value11 = jComboBox11.getSelectedItem().toString();
                try {
                    Submmit("aloeveraShampooOne",value11,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 12 
                 String value12 = jComboBox12.getSelectedItem().toString();
                try {
                    Submmit("aloeveraShampooTwo",value12,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 13 
                 String value13 = jComboBox13.getSelectedItem().toString();
                try {
                    Submmit("lemonShampooOne",value13,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 14 
                 String value14 = jComboBox14.getSelectedItem().toString();
                try {
                    Submmit("lemonShampooTwo",value14,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 15 
                 String value15 = jComboBox15.getSelectedItem().toString();
                try {
                    Submmit("aloeveraConditionerOne",value15,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 16 
                 String value16 = jComboBox16.getSelectedItem().toString();
                try {
                    Submmit("aloeveraConditionerTwo",value16,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 17 
                 String value17 = jComboBox17.getSelectedItem().toString();
                try {
                    Submmit("lemonConditionerOne",value17,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                //combo 18 
                 String value18 = jComboBox18.getSelectedItem().toString();
                try {
                    Submmit("lemonConditionerTwo",value18,phone);
                } catch (SQLException ex) {
                    Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //alarms if payment is done
//         if(jComboBox1.getItemAt(0)!= "0"       jComboBox2.getItemAt(1)!= "0"       jComboBox3.getItemAt(2)!= "0"       jComboBox4.getItemAt(3)!= "0"
//            jComboBox5.getItemAt(4)!= "0"       jComboBox6.getItemAt(5)!= "0"       jComboBox7.getItemAt(6)!= "0"       jComboBox8.getItemAt(7)!= "0"
//            jComboBox9.getItemAt(8)!= "0"       jComboBox10.getItemAt(9)!= "0"      jComboBox11.getItemAt(10)!= "0"     jComboBox12.getItemAt(11)!= "0"
//            jComboBox13.getItemAt(12)!= "0"     jComboBox14.getItemAt(13)!= "0"     jComboBox15.getItemAt(14)!= "0"     jComboBox16.getItemAt(15)!= "0"
//            jComboBox17.getItemAt(16)!= "0"     jComboBox18.getItemAt(17)!= "0") {     
//                JOptionPane.showMessageDialog(null, "TAKEN!!!");
//                                            }
//           else {
//                JOptionPane.showMessageDialog(null,"None Selected");
//                }
//return to '0' all integer values
        JOptionPane.showMessageDialog(null, "TAKEN!!!");
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
   
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        combo(jComboBox2);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        combo(jComboBox3);
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        combo(jComboBox4);
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        combo(jComboBox5);
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        combo(jComboBox6);
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        combo(jComboBox7);
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        combo(jComboBox8);
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        combo(jComboBox9);
    }//GEN-LAST:event_jComboBox9ActionPerformed
            
    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        combo(jComboBox10);
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        combo(jComboBox11);
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        combo(jComboBox12);
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        combo(jComboBox13);
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        combo(jComboBox14);
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jComboBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox15ActionPerformed
        combo(jComboBox15);
    }//GEN-LAST:event_jComboBox15ActionPerformed

    private void jComboBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox16ActionPerformed
        combo(jComboBox16);
    }//GEN-LAST:event_jComboBox16ActionPerformed

    private void jComboBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox17ActionPerformed
        combo(jComboBox17);
    }//GEN-LAST:event_jComboBox17ActionPerformed

    private void jComboBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox18ActionPerformed
        combo(jComboBox18);
    }//GEN-LAST:event_jComboBox18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

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
                jLabel20.setText(Integer.toString(value1));
                jLabel20.setBackground(Color.red);

            }

            if (value2 > 0){
                jLabel21.setText(Integer.toString(value2));
                jLabel21.setBackground(Color.red);

            }

            if (value3 > 0){
                jLabel22.setText(Integer.toString(value3));
                jLabel22.setBackground(Color.red);

            }

            if (value4 > 0){
                jLabel23.setText(Integer.toString(value4));
                jLabel23.setBackground(Color.red);

            }

            if (value5 > 0){
                jLabel28.setText(Integer.toString(value5));
                jLabel28.setBackground(Color.red);

            }

            if (value6 > 0){
                jLabel30.setText(Integer.toString(value6));
                jLabel30.setBackground(Color.red);

            }

            if (value7 > 0){
                jLabel31.setText(Integer.toString(value7));
                jLabel31.setBackground(Color.red);

            }

            if (value8 > 0){
                jLabel32.setText(Integer.toString(value8));
                jLabel32.setBackground(Color.red);

            }

            if (value9 > 0){
                jLabel33.setText(Integer.toString(value9));
                jLabel33.setBackground(Color.red);

            }

            if (value10 > 0){
                jLabel34.setText(Integer.toString(value10));
                jLabel34.setBackground(Color.red);

            }

            if (value11 > 0){
                jLabel35.setText(Integer.toString(value11));
                jLabel35.setBackground(Color.red);

            }

            if (value12 > 0){
                jLabel36.setText(Integer.toString(value12));
                jLabel36.setBackground(Color.red);

            }

            if (value13 > 0){
                jLabel37.setText(Integer.toString(value13));
                jLabel37.setBackground(Color.red);

            }

            if (value14 > 0){
                jLabel38.setText(Integer.toString(value14));
                jLabel38.setBackground(Color.red);

            }

            if (value15 > 0){
                jLabel39.setText(Integer.toString(value15));
                jLabel39.setBackground(Color.red);

            }

            if (value16 > 0){
                jLabel40.setText(Integer.toString(value16));
                jLabel40.setBackground(Color.red);

            }

            if (value17 > 0){
                jLabel41.setText(Integer.toString(value17));
                jLabel41.setBackground(Color.red);

            }

            if (value18 > 0){
                jLabel42.setText(Integer.toString(value18));
                jLabel42.setBackground(Color.red);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Take.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

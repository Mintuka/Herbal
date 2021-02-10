package habeshademo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class HabeshaDemo extends javax.swing.JFrame {

    public static void main(String[] args) throws SQLException {
        
        habeshaFrame ref = new habeshaFrame();
        ref.setVisible(true);
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBC","root","");
        Statement statement =  connection.createStatement();      
    
//        statement.executeUpdate("CREATE TABLE Store"+
//                                "(password INT(8),"+
//                                "castorOilOne INT, "+
//                                "castorOilTwo INT,"+
//                                "blackseedOilOne INT,"+
//                                "blackseedOilTwo INT,"+                
//                                "aloeveraOilOne INT, "+
//                                "aloeveraOilTwo INT,"+
//                                "tumerSoap INT,"+
//                                "aloeveraSoap INT,"+
//                                "blackseedSoap INT,"+
//                                "scrap INT,"+  
//                                "aloeveraShampooOne INT,"+
//                                "aloeveraShampooTwo INT,"+
//                                "lemonShampooOne INT,"+
//                                "lemonShampooTwo INT,"+                
//                                "aloeveraConditionerOne INT,"+
//                                "aloeveraConditionerTwo INT,"+
//                                "lemonConditionerOne INT,"+
//                                "lemonConditionerTwo INT)");
//            //       
//        statement.executeUpdate("INSERT INTO Store" + " VALUES (    '"+19283746+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"',"
//                                                                    + "'"+0+"')");
    }  
}

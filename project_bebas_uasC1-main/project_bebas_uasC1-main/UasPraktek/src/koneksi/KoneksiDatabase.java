/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author asril
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class KoneksiDatabase {
   Connection cn;
   public static Connection BukaKoneksi (){
       try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/uaspbo", "root", "");
          return cn;
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        return null;
       }
   }
}

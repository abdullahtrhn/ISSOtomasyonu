/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VeriTabaniBaglanti {
        static String url = "jdbc:sqlite:C://VeriTabaniDosyalari/ISSotomasyonu.db";
        static Connection conn=null;
        
        public static boolean baglan(){
            try {
                conn=DriverManager.getConnection(url);
                System.out.println("Veritabanına Bağlantı Sağlandı!");
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
        
        public static ResultSet listele(String query){
            Statement myStatement;
            ResultSet myResultSet;
            
            try {
                myStatement=conn.createStatement();
                myResultSet=myStatement.executeQuery(query);
                return myResultSet;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            
        }
        
        public static void veriGuncelle(String query){
            Statement statement;
            try {
                statement=conn.createStatement();
                statement.executeUpdate(query);
                System.out.println("İşlem Başarılı");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
}
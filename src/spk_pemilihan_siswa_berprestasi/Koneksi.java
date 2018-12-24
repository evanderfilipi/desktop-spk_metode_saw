/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spk_pemilihan_siswa_berprestasi;

import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Evander Filipi
 */
public class Koneksi {
    private static Connection konek;
    
    public static Connection getConnection() throws SQLException {
        if(konek==null) {
            new Driver();
            
            konek=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_siswa_berprestasi","root","");
             
        }
        return konek;
    } 
}

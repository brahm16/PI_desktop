/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Ordre;
import entities.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ibrahim
 */
public class OrdreService implements IService<Ordre> ,IServiceOrdre<Ordre> {
    private Connection cnx;
    private Statement stmt;
    private PreparedStatement pst;
    private ResultSet res;
    
    public OrdreService(){
        this.cnx = DataSource.getInstance().getCnx();
    }

    @Override
    public boolean insert(Ordre t) {
        return false;
    }

    @Override
    public boolean update(Ordre t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ordre> displayAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean createOrdre(Ordre ordre) {
        String sql ="insert into ordre (reference,client_name,totalHT,totalTTC,nbrProduct,date) values (?,?,?,?,?,?)";
        try {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            pst=cnx.prepareCall(sql);
            pst.setString(1,this.getReference(ordre.getClient_name()));
            pst.setString(2,ordre.getClient_name());
            pst.setFloat(3,0);
            pst.setFloat(4,0);
            pst.setInt(5,0);
            pst.setString(6,formatter.format(date));
            pst.executeUpdate();
            System.out.println("ordre added successfully");

            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        } 
    }
    private int countOrdres(){
        String sql="Select* from ordre";
        int count=0;
         try {
            stmt=cnx.createStatement();
            res=stmt.executeQuery(sql);
            while(res.next())
            {
                count++;
            }
            return count;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductService.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        
        } 
    }
    private String getReference(String nameClient){
        int numOrdre=this.countOrdres();
        String ref="CLI"+nameClient.substring(0,3)+numOrdre;
        return ref;
    }
    
}

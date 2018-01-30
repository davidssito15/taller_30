/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unach.trabajogrupal.rnegocio.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import unach.trabajogrupal.accesodatos.Conexion;
import unach.trabajogrupal.accesodatos.Parametro;
import unach.trabajogrupal.rnegocio.dao.IAutobus;
import unach.trabajogrupal.rnegocio.entidades.Autobus;

/**
 *
 * @author Segovia
 */
public class AutobusImpl implements IAutobus {
     @Override
    public int insertar(Autobus autobus) throws Exception{
        int numFilasAfectadas=0;
       
        String sql = "Insert into Autobus Values (?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, autobus.getCod_bus()));
        lstPar.add(new Parametro(2, autobus.getNombreCompania()));
        lstPar.add(new Parametro(3, autobus.getN_placa()));
        lstPar.add(new Parametro(4, autobus.getNom_Chofer()));
        
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            numFilasAfectadas=con.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return numFilasAfectadas;
    }
        @Override
    public List<Autobus> obtener() throws Exception{
        List<Autobus> lista = new ArrayList<>();
        
        String sql="SELECT * FROM AutoBus;";
        Conexion con = null;
        try{
            Autobus autobus = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                autobus = new Autobus();
                autobus.setCod_bus(rst.getInt(1));
                autobus.setNombreCompania(rst.getString(2));
                autobus.setN_placa(rst.getString(3));
                autobus.setNom_Chofer(rst.getString(4));         
                lista.add(autobus);
           }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return lista;
    }  
    
    @Override
    public Autobus obtener(int Cod_bus) throws Exception{
        Autobus autobus = null;
        String sql="SELECT * FROM autobus where Cod_bus=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, Cod_bus));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()){
                autobus = new Autobus();
                autobus.setCod_bus(rst.getInt(1));
                autobus.setNombreCompania(rst.getString(2));
                autobus.setN_placa(rst.getString(3));
                autobus.setNom_Chofer(rst.getString(4));
            }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return autobus;
    }}
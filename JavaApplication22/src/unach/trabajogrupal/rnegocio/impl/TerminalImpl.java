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
import unach.trabajogrupal.rnegocio.dao.ITerminal;
import unach.trabajogrupal.rnegocio.entidades.Terminal;

/**
 *
 * @author Segovia
 */
public class TerminalImpl implements ITerminal {
    @Override
    public int insertar(Terminal terminal) throws Exception{
        int numFilasAfectadas=0;
       
        String sql = "Insert into Terminal  Values (?,?,?,?,?)";
        ArrayList<Parametro> lstP = new ArrayList<>();
        lstP.add(new Parametro(1, terminal.getCod_terminal()));
        lstP.add(new Parametro(2, terminal.getNombre()));
        lstP.add(new Parametro(3, terminal.getDireccion()));
        lstP.add(new Parametro(4, terminal.getCiudad()));
        lstP.add(new Parametro(5, terminal.getTelefono()));
   
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            numFilasAfectadas=con.ejecutaComando(sql, lstP);
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return numFilasAfectadas;
    }
        @Override
    public List<Terminal> obtener() throws Exception{
        List<Terminal> lista = new ArrayList<>();
        
        String sql="SELECT * FROM terminal;";
        Conexion con = null;
        try{
            Terminal terminal = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                terminal = new Terminal();
                terminal.setCod_terminal(rst.getInt(1));
                terminal.setNombre(rst.getString(2));
                terminal.setDireccion(rst.getString(3));
                terminal.setCiudad(rst.getString(4)); 
                terminal.setTelefono(rst.getString(5)); 
                lista.add(terminal);
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
    public Terminal obtener(int codigo) throws Exception{
        Terminal terminal = null;
        String sql="SELECT * FROM terminal where cod_terminal=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()){
                terminal = new Terminal();
                terminal.setCod_terminal(rst.getInt(1));
                terminal.setNombre(rst.getString(2));
                terminal.setDireccion(rst.getString(3));
                terminal.setCiudad(rst.getString(4)); 
                terminal.setTelefono(rst.getString(5));
               
            }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return terminal;
    }}
    


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
import unach.trabajogrupal.rnegocio.dao.IRegistro;
import unach.trabajogrupal.rnegocio.dao.ITerminal;
import unach.trabajogrupal.rnegocio.entidades.Autobus;
import unach.trabajogrupal.rnegocio.entidades.Registro;
import unach.trabajogrupal.rnegocio.entidades.Terminal;

/**
 *
 * @author Segovia
 */
public class RegistroImpl implements IRegistro{
    @Override
    public int insertar(Registro registro ) throws Exception{
        int numFilasAfectadas=0;
        String sql="insert into registro values(?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, registro.getAutobus().getCod_bus()));
        lstPar.add(new Parametro(2, registro.getTerminal().getCod_terminal()));
        lstPar.add(new Parametro(3, registro.getFecha()));
        lstPar.add(new Parametro(4, registro.getHora()));
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
    public List<Registro> obtener() throws Exception{
        List<Registro> lista = new ArrayList<>();
        
        String sql="SELECT * FROM registro;";
        Conexion con = null;
        try{
            Registro registro = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                registro = new Registro();
                IAutobus autobusdao = new AutobusImpl();
                Autobus autobus = autobusdao.obtener(rst.getInt(1));
                registro.setAutobus(autobus);
                
                ITerminal terminaldao = new TerminalImpl();
                Terminal terminal = terminaldao.obtener(rst.getInt(2));
                registro.setTerminal(terminal);
                registro.setFecha(rst.getString(3));
                registro.setHora(rst.getString(4));
                
                lista.add(registro);
           }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return lista;
    }     
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unach.trabajogrupal.rnegocio.entidades;

/**
 *
 * @author Segovia
 */
public class Registro {
    private Autobus autobus;
    private Terminal terminal;
    private String Fecha;
    private String Hora;  

    public Registro() {
    }

    public Registro(Autobus autobus, Terminal terminal, String Fecha, String Hora) {
        this.autobus = autobus;
        this.terminal = terminal;
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public Registro(Autobus autobus, Terminal terminal, String tRiobamba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }
}
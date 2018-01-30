
package unach.trabajogrupal.rnegocio.entidades;

public class Terminal {
    private int Cod_terminal;
    private String Nombre;
    private String Direccion;
    private String Ciudad;
    private String Telefono;

    public Terminal() {
    }

    public Terminal(int Cod_terminal, String Nombre, String Direccion, String Ciudad, String Telefono) {
        this.Cod_terminal = Cod_terminal;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.Telefono = Telefono;
    }

    public int getCod_terminal() {
        return Cod_terminal;
    }

    public void setCod_terminal(int Cod_terminal) {
        this.Cod_terminal = Cod_terminal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

}
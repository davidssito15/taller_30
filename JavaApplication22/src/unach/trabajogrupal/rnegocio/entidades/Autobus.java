
package unach.trabajogrupal.rnegocio.entidades;

public class Autobus {
    private int Cod_bus;
    private String NombreCompania; 
    private String N_placa;
    private String Nom_Chofer;

    public Autobus() {
    }

    public Autobus(int Cod_bus, String NombreCompania, String N_placa, String Nom_Chofer) {
        this.Cod_bus = Cod_bus;
        this.NombreCompania = NombreCompania;
        this.N_placa = N_placa;
        this.Nom_Chofer = Nom_Chofer;
    }

    public int getCod_bus() {
        return Cod_bus;
    }

    public void setCod_bus(int Cod_bus) {
        this.Cod_bus = Cod_bus;
    }

    public String getNombreCompania() {
        return NombreCompania;
    }

    public void setNombreCompania(String NombreCompania) {
        this.NombreCompania = NombreCompania;
    }

    public String getN_placa() {
        return N_placa;
    }

    public void setN_placa(String N_placa) {
        this.N_placa = N_placa;
    }

    public String getNom_Chofer() {
        return Nom_Chofer;
    }

    public void setNom_Chofer(String Nom_Chofer) {
        this.Nom_Chofer = Nom_Chofer;
    }
    @Override
    public String toString(){
        return NombreCompania;
    }
   
}
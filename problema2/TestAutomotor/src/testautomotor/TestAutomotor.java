
package testautomotor;

class Automotor{
    private String cedula;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    private Fabricante fabricante;

    public Automotor() {
    }

    public Automotor(String cedula, String marcaVehiculo, int anioFabricacion, double valorVehiculo, Fabricante fabricante) {
        this.cedula = cedula;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
        this.fabricante = fabricante;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public double getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void calcularValorMatricula() {
        this.valorMatricula = 2023-this.anioFabricacion;
        this.valorMatricula = this.valorMatricula*0.0002;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Automotor{" + "cedula=" + cedula + ", marcaVehiculo=" + marcaVehiculo + ", anioFabricacion=" + anioFabricacion + ", valorVehiculo=" + valorVehiculo + ", valorMatricula=" + valorMatricula + ", fabricante=" + fabricante + '}';
    }
    
}
class Fabricante{
    private String nombre;
    private String ciudadO;

    public Fabricante() {
    }

    public Fabricante(String nombre, String ciudadO) {
        this.nombre = nombre;
        this.ciudadO = ciudadO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadO() {
        return ciudadO;
    }

    public void setCiudadO(String ciudadO) {
        this.ciudadO = ciudadO;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "nombre=" + nombre + ", ciudadO=" + ciudadO + '}';
    }
    
}
public class TestAutomotor {
    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante("Roberto","Quito");
        Automotor automotor1 = new Automotor("1104641657","Hyundai",2007,22500,fabricante1);
        automotor1.calcularValorMatricula();
        System.out.println(automotor1);
    }
    
}

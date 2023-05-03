package testprofesores;
class Profesores{
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoT;
    private String cedula;
    private ProvinciaNacimiento provinciaNacimiento;

    public Profesores() {
    }

    public Profesores(String nombre, String apellido, double sueldoBasico, String cedula, ProvinciaNacimiento provinciaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        this.provinciaNacimiento = provinciaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoT() {
        return sueldoT;
    }

    public void CalcularSueldoT() {
        this.sueldoT = sueldoBasico + (sueldoBasico*0.2);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ProvinciaNacimiento getProvinciaNacimiento() {
        return provinciaNacimiento;
    }

    public void setProvinciaNacimiento(ProvinciaNacimiento provinciaNacimiento) {
        this.provinciaNacimiento = provinciaNacimiento;
    }

    @Override
    public String toString() {
        return "Profesores{" + "nombre=" + nombre + ", apellido=" + apellido + ", sueldoBasico=" + sueldoBasico + ", sueldoT=" + sueldoT + ", cedula=" + cedula + ", provinciaNacimiento=" + provinciaNacimiento + '}';
    }
    
}
class ProvinciaNacimiento{
    private String nombreProvincia;
    private int numeroHabitantes;

    public ProvinciaNacimiento() {
    }

    public ProvinciaNacimiento(String nombreProvincia, int numeroHabitantes) {
        this.nombreProvincia = nombreProvincia;
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    @Override
    public String toString() {
        return "ProvinciaNacimiento{" + "nombreProvincia=" + nombreProvincia + ", numeroHabitantes=" + numeroHabitantes + '}';
    }
    
}
public class TestProfesores {

    public static void main(String[] args) {
        ProvinciaNacimiento Provincia1 = new ProvinciaNacimiento("Ambato",2500);
       Profesores profesor1 = new Profesores("Ana","Vega",700,"1104641327",Provincia1);
       profesor1.CalcularSueldoT();
        System.out.println(profesor1);
    }
    
}

package Citas;

public class Paciente extends Persona {
    private String direccion; 
    private Fecha fecha; 
    public Paciente(String nombre, int id, String direccion, Fecha fecha) {
        super(nombre, id); 
        this.direccion = direccion;
        this.fecha = fecha;
    }
    public String getDireccion() {
        return direccion;
    }
    public Fecha getFecha() {
        return fecha;
    }
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Paciente: " + super.toString() + " direccion: " + direccion + " fecha de nacimiento: " + fecha; 
    }
}

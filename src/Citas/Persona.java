package Citas;

public class Persona {
    public String nombre;
    public int id; 
    public Persona(String nombre, int id) {
        this.id = id; 
        this.nombre = nombre; 
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " id: " + id; 
    }
}

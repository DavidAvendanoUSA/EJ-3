package Citas;

public class Medico extends Persona{
    private Disponibilidad horario; 
    private String especialidad; 
    public Medico(Disponibilidad horario, String especialidad, int id, String nombre) {
        super(nombre, id);
        this.especialidad = especialidad; 
        this.horario = horario; 
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public Disponibilidad getHorario() {
        return horario;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void setHorario(Disponibilidad horario) {
        this.horario = horario;
    }
    @Override
    public String toString() {
        return "Medico: " + super.toString() + " horario: " + horario + " especialidad: " + especialidad;
    }

}

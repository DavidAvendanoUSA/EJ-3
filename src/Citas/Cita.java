package Citas;

public class Cita {
    private Paciente paciente; 
    private Medico medico; 
    private Fecha fecha; 
    private int hora; 
    private String motivo; 
    public Cita(Paciente paciente, Medico medico, Fecha fecha, int hora, String motivo) {
        this.fecha = fecha; 
        this.hora = hora;
        this.medico = medico; 
        this.motivo = motivo; 
        this.paciente = paciente; 
    }
    public Fecha getFecha() {
        return fecha;
    }
    public int getHora() {
        return hora;
    }
    public Medico getMedico() {
        return medico;
    }
    public String getMotivo() {
        return motivo;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    @Override
    public String toString() {
        return "Cita con " + paciente + medico + "a las: " + hora + " con motivo: " + motivo;
    }
}

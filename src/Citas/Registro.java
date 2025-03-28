package Citas;

public class Registro {
    private String diagnostico; 
    private String tratamiento; 
    private String notasDoctor; 
    public Registro(String dianostico, String tratamiento, String notasDocotor) {

        this.tratamiento = tratamiento;
        this.diagnostico = dianostico;
        this.notasDoctor = notasDocotor;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public String getNotasDoctor() {
        return notasDoctor;
    }
    public String getTratamiento() {
        return tratamiento;
    }public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public void setNotasDoctor(String notasDoctor) {
        this.notasDoctor = notasDoctor;
    }
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    @Override
    public String toString() {
        return "El diagnostico es: " +  diagnostico + " su trtatamiento es: " + tratamiento + " y las notas del doctor son: " + notasDoctor; 
    }
}

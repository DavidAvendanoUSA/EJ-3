package Citas;
import java.time.LocalTime;

public class Disponibilidad {
    private int dia; 
    private int mes;
    private LocalTime hora; 
    public Disponibilidad(int dia, int mes, int hora) {
        this.dia = dia; 
        this.mes = mes; 
        this.hora = LocalTime.of(hora, 0); 
    }
    public int getDia() {
        return dia;
    }
    public LocalTime getHora() {
        return hora;
    }
    public int getMes() {
        return mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    @Override
    public String toString() {
        return mes + "-" + dia + " " + hora.getHour() + ":00";
    }

}

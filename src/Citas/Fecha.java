package Citas;
import java.time.LocalDate;
public class Fecha {
    private LocalDate fecha; 
    public Fecha(int dia, int mes, int anio) {
        this.fecha = LocalDate.of(anio, mes,dia);

    }
    @Override
    public String toString() {
        return fecha.getMonthValue() + "/" + fecha.getDayOfMonth() + "/" + fecha.getYear(); 
    }
}

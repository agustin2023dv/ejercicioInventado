import java.util.ArrayList;

public class ObraSocial {

    private String nombre;
    private int cuotaMensual;
    private ArrayList<Persona> asociados;

    public ObraSocial(String nombre, int cuotaMensual) {
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        setAsociados(new ArrayList<Persona>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(int cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public ArrayList<Persona> getAsociados() {
        return asociados;
    }

    public void setAsociados(ArrayList<Persona> asociados) {
        this.asociados = asociados;
    }

    public void agregarAsociado(Persona asociado){
        this.asociados.add(asociado);
    }

}

import java.util.ArrayList;

public class Medico extends Persona{

    private String matricula;
    private ArrayList<Especialidad> especialidades;

    public Medico(String nombre, int dni, String matricula) {
        super(nombre, dni);
        this.matricula = matricula;
        setEspecialidades(new ArrayList<Especialidad>());

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public void agregarEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
    }


}

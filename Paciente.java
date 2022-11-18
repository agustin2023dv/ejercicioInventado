import java.util.ArrayList;
import java.util.Date;
public class Paciente extends Persona{

    private ArrayList<ObraSocial> obrasSociales;


    public Paciente(String nombre, int dni) {
        super(nombre, dni);
        setObrasSociales(new ArrayList<ObraSocial>());
    }

    public ArrayList<ObraSocial> getObrasSociales() {
        return obrasSociales;
    }

    public void setObrasSociales(ArrayList<ObraSocial> obrasSociales) {
        this.obrasSociales = obrasSociales;
    }

    public void inscripcionObraSocial(ObraSocial obraSocial){
        this.obrasSociales.add(obraSocial);
        obraSocial.agregarAsociado(this);
    }

    public void sacarTurno(String motivoConsulta, Date horario){

        new Turno(motivoConsulta,this,horario);

    }
}

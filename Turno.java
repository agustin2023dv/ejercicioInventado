import java.util.Date;

public class Turno {

    private String idTurno, motivoConsulta;

    private Paciente paciente;
    private Medico medico;
    private Date horario;

    public Turno(String idTurno, String motivoConsulta, Paciente paciente, Medico medico, Date horario) {
        this.idTurno = idTurno;
        this.motivoConsulta = motivoConsulta;
        this.paciente = paciente;
        this.medico = medico;
        this.horario = horario;
    }

    public Turno(String motivoConsulta, Paciente paciente, Date horario) {
        this.motivoConsulta = motivoConsulta;
        this.paciente = paciente;
        this.horario = horario;
        setIdTurno("turno aleatorio");
    }




    public String getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(String idTurno) {
        this.idTurno = idTurno;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "idTurno='" + idTurno + '\'' +
                ", motivoConsulta='" + motivoConsulta + '\'' +
                ", paciente=" + paciente +
                ", medico=" + medico +
                ", horario=" + horario +
                '}';
    }
}

import javax.swing.*;
import java.util.Date;
public class Main {

    public static void main(String[]args){

       Paciente pablo = new Paciente("pablo",40027274);

Medico pedro = new Medico("pedro",4000,"MP2090");

Especialidad pediatria = new Especialidad("pediatria");
Especialidad oftalmologia = new Especialidad("oftalmologia");

pedro.agregarEspecialidad(pediatria);
pedro.agregarEspecialidad(oftalmologia);



        pablo.sacarTurno("dolor de cabeza",new Date(2023,02,02));
    }
}

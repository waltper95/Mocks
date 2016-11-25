package pe.edu.ulima.pruebasmock;
import static org.mockito.Mockito.*;
import pe.edu.ulima.pruebasmock.dao.Alumno;
import pe.edu.ulima.pruebasmock.dao.AlumnoDAO;

public class Main {
    
    public static void main(String[] args){
        AlumnoDAO alumnoDAO = mock(AlumnoDAO.class);
        Alumno alumno = new Alumno("20122323", "Pepito");
        when(alumnoDAO.obtener("20122323")).thenReturn(alumno);
        Alumno al = alumnoDAO.obtener("20122323");
        System.out.println("Nombre : " + al.getNombre());
    }
    
    
}

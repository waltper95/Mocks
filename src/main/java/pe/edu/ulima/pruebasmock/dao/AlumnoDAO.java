package pe.edu.ulima.pruebasmock.dao;
public abstract class AlumnoDAO {
    public abstract void registrar(Alumno alumno);
    public abstract Alumno obtener(String codigo);
    
}

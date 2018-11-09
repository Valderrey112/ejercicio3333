public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno){
            nombre = nombreCompleto;
            numeroMatricula = numeroMatriculaAlumno;
            edad = edadAlumno;
            
        if (nombre.length() < 3) {
             System.out.println("El nombre tiene menos de 3 caracteres");
        }
        if (numeroMatricula.length() < 4) {
            System.out.println("El numero de matricula tiene menos de 4 caracteres");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
         return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String nombreCorto;
        String numeroCorto;
        nombreCorto = nombre;
        numeroCorto = numeroMatricula;
        if (nombre.length() > 2) {
             nombreCorto = nombre.substring(0 ,3);
        }
        if (numeroMatricula.length() > 3) {
             numeroCorto = numeroMatricula.substring(0 ,4);
        }
        return nombreCorto.substring(0 ,3) + numeroCorto.substring(0, 4);
    }
}



public class Numeral1 {
    public static void main(String[] args) {
        Catedratico catedratico1 = new Catedratico("Catedrático 1");
        Catedratico catedratico2 = new Catedratico("Catedrático 2");
        Catedratico catedratico3 = new Catedratico("Catedrático 3");

        Curso curso1 = new Curso("Curso 1", 5);
        Curso curso2 = new Curso("Curso 2", 5);
        Curso curso3 = new Curso("Curso 3", 2);

        Alumno alumno1 = new Alumno("Alumno 1");
        Alumno alumno2 = new Alumno("Alumno 2");
        Alumno alumno3 = new Alumno("Alumno 3");

        Asignacion asignacion1 = new Asignacion(alumno1);
        Asignacion asignacion2 = new Asignacion(alumno2);
        Asignacion asignacion3 = new Asignacion(alumno3);

        asignacion1.addCurso(curso1);
        asignacion1.addCurso(curso2);
        asignacion1.addCurso(curso3);

        asignacion2.addCurso(curso1);
        asignacion2.addCurso(curso2);

        asignacion3.addCurso(curso1);
    }
}
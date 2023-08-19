class Asignacion {
    private Alumno alumno;
    private List<Curso> cursosAsignados;

    public Asignacion(Alumno alumno) {
        this.alumno = alumno;
        this.cursosAsignados = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        cursosAsignados.add(curso);
        curso.agregarAlumno(alumno);
    }
}

class Curso {
    private String nombre;
    private int cupoMaximo;
    private List<Alumno> alumnosInscritos;

    public Curso(String nombre, int cupoMaximo) {
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        this.alumnosInscritos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        if (alumnosInscritos.size() < cupoMaximo) {
            alumnosInscritos.add(alumno);
            System.out.println("Alumno #" + alumno.getCarnet() + " inscrito en " + nombre);
        } else {
            System.out.println("No hay cupo disponible en " + nombre);
        }
    }
    }
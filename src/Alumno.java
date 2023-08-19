class Alumno {
    private static int nextCarnet = 10000;
    private int carnet;
    private String nombre;

    public Alumno(String nombre) {
        this.carnet = nextCarnet++;
        this.nombre = nombre;
    }

    public void imprimirDatos() {
        System.out.println("Alumno #" + carnet);
        System.out.println("Nombre: " + nombre);
    }
}

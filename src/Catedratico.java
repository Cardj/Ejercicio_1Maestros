class Catedratico {
    private static int nextCatedraticoNumber = 1;
    private int numeroCatedratico;
    private String nombre;

    public Catedratico(String nombre) {
        this.numeroCatedratico = nextCatedraticoNumber++;
        this.nombre = nombre;
    }

    public void imprimirDatos() {
        System.out.println("Catedrático #" + numeroCatedratico);
        System.out.println("Nombre: " + nombre);
    }
}

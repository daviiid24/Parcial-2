package model;

// Decorador concreto: aplica compresión (reduce tamaño 40 %)
public class CompresionDecorador extends RecursoDecorador {

    public CompresionDecorador(RecursoAcademico recurso) { super(recurso); }

    @Override
    public double getTamano() { return recurso.getTamano() * 0.6; }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.printf("    + [Compresión] Tamaño comprimido: %.2f MB%n", getTamano());
    }
}

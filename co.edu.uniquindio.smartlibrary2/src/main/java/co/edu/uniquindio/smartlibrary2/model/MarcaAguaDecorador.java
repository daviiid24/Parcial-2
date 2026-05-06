package model;

// Decorador concreto: agrega marca de agua institucional
public class MarcaAguaDecorador extends RecursoDecorador {

    private final String institucion;

    public MarcaAguaDecorador(RecursoAcademico recurso, String institucion) {
        super(recurso);
        this.institucion = institucion;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("    + [Marca de agua] © " + institucion);
    }
}

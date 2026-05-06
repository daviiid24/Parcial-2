package model;

// Decorador base abstracto
public abstract class RecursoDecorador implements RecursoAcademico {

    protected final RecursoAcademico recurso;

    public RecursoDecorador(RecursoAcademico recurso) { this.recurso = recurso; }

    @Override public String getNombre()  { return recurso.getNombre();  }
    @Override public double getTamano() { return recurso.getTamano(); }
    @Override public void   mostrar()    { recurso.mostrar();           }
}

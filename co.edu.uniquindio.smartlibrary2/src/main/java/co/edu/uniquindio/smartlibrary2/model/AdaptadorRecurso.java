package model;

public class AdaptadorRecurso implements RecursoAcademico {

    private final RecursoExterno externo;

    public AdaptadorRecurso(RecursoExterno externo) { this.externo = externo; }

    @Override public String getNombre()  { return externo.getFullTitle(); }

    @Override public double getTamano() { return externo.getSizeBytes() / (1024.0 * 1024.0); }

    @Override
    public void mostrar() {
        System.out.printf("  [Adaptador] %s | Autor: %s | %.2f MB%n",
                getNombre(), externo.getAuthorName(), getTamano());
    }
}

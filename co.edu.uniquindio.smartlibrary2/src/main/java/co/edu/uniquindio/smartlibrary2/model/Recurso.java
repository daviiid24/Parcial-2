package model;

// Leaf del Composite + target del Builder
public class Recurso implements RecursoAcademico {

    // campos obligatorios
    private final String codigo;
    private final String titulo;
    private final String autor;
    private final String editorial;
    private final int    anio;
    private final String isbn;
    private final String formato;
    private final double tamanio;
    private final String licencia;

    // campos opcionales
    private final String   descripcion;
    private final String[] palabrasClave;

    private boolean disponible = true;

    private Recurso(Builder b) {
        this.codigo        = b.codigo;
        this.titulo        = b.titulo;
        this.autor         = b.autor;
        this.editorial     = b.editorial;
        this.anio          = b.anio;
        this.isbn          = b.isbn;
        this.formato       = b.formato;
        this.tamanio       = b.tamanio;
        this.licencia      = b.licencia;
        this.descripcion   = b.descripcion;
        this.palabrasClave = b.palabrasClave;
    }

    public String  getLicencia()    { return licencia;   }
    public boolean isDisponible()   { return disponible; }
    public void    setDisponible(boolean d) { this.disponible = d; }

    @Override public String getNombre()  { return titulo;  }
    @Override public double getTamano() { return tamanio; }

    @Override
    public void mostrar() {
        System.out.println("  [Recurso] " + titulo + " | " + autor
                + " | " + formato + " | " + tamanio + " MB | Licencia: " + licencia);
    }

    // ─────────────────────────── BUILDER ───────────────────────────
    public static class Builder {
        // obligatorios
        private final String codigo;
        private final String titulo;
        private final String autor;
        private String editorial = "Sin editorial";
        private int    anio      = 0;
        private String isbn      = "";
        private String formato   = "PDF";
        private double tamanio   = 0.0;
        private String licencia  = "LIBRE";
        // opcionales
        private String   descripcion   = "";
        private String[] palabrasClave = {};

        public Builder(String codigo, String titulo, String autor) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.autor  = autor;
        }

        public Builder editorial(String v)      { this.editorial     = v; return this; }
        public Builder anio(int v)              { this.anio          = v; return this; }
        public Builder isbn(String v)           { this.isbn          = v; return this; }
        public Builder formato(String v)        { this.formato       = v; return this; }
        public Builder tamanio(double v)        { this.tamanio       = v; return this; }
        public Builder licencia(String v)       { this.licencia      = v; return this; }
        public Builder descripcion(String v)    { this.descripcion   = v; return this; }
        public Builder palabrasClave(String... v){ this.palabrasClave = v; return this; }

        public Recurso build() { return new Recurso(this); }
    }
}

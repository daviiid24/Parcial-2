package model;

// Proxy: controla acceso al recurso real según permisos del usuario
public class RecursoProxy implements RecursoAcademico {

    private final Recurso recurso;
    private final Usuario usuario;

    public RecursoProxy(Recurso recurso, Usuario usuario) {
        this.recurso  = recurso;
        this.usuario  = usuario;
    }

    @Override public String getNombre()  { return recurso.getNombre();  }
    @Override public double getTamano() { return recurso.getTamano(); }

    // Carga diferida: solo accede al recurso real si el usuario tiene permiso
    @Override
    public void mostrar() {
        if (usuario.puedeAcceder(recurso)) {
            System.out.println("  [Proxy] Acceso concedido → " + usuario.getNombre());
            recurso.mostrar();
        } else {
            System.out.println("  [Proxy] Acceso DENEGADO para "
                    + usuario.getNombre() + " → " + recurso.getNombre());
        }
    }
}

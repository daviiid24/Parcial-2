package model;

public class Usuario {

    public enum Rol { ESTUDIANTE, DOCENTE }

    private final String nombre;
    private final Rol    rol;

    public Usuario(String nombre, Rol rol) {
        this.nombre = nombre;
        this.rol    = rol;
    }

    public String getNombre() { return nombre; }
    public Rol    getRol()    { return rol;    }

    // Determina acceso según disponibilidad del recurso, rol y licencia
    public boolean puedeAcceder(Recurso recurso) {
        if (!recurso.isDisponible()) {
            System.out.println("  Recurso no disponible.");
            return false;
        }
        switch (recurso.getLicencia()) {
            case "LIBRE":        return true;
            case "RESTRINGIDA":  return rol == Rol.DOCENTE;
            case "DOCENTE_SOLO": return rol == Rol.DOCENTE;
            default:             return false;
        }
    }
}

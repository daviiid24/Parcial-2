package model;

import java.util.ArrayList;
import java.util.List;

public class Coleccion implements RecursoAcademico {

    private final String nombre;
    private final ArrayList<RecursoAcademico> listaElementos = new ArrayList<>();

    public Coleccion(String nombre) { this.nombre = nombre; }

    public void agregar(RecursoAcademico r)  { listaElementos.add(r);    }
    public void eliminar(RecursoAcademico r) { listaElementos.remove(r); }

    @Override public String getNombre() { return nombre; }

    @Override
    public double getTamano() {
        return listaElementos.stream().mapToDouble(RecursoAcademico::getTamano).sum();
    }

    @Override
    public void mostrar() {
        System.out.printf("[Colección] %s — %.2f MB totales%n", nombre, getTamano());
        listaElementos.forEach(RecursoAcademico::mostrar);
    }
}

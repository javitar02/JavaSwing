/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAVI
 */
public class Equipo {
    public String nombre;
    public String pais;
    public String grupo;
    public String clasificacion;

    public Equipo(String nombre, String pais, String grupo, String clasificacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.grupo = grupo;
        this.clasificacion = clasificacion;
    }
    
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", pais=" + pais + ", grupo=" + grupo + ", clasificacion=" + clasificacion + '}';
    }
    
    
}

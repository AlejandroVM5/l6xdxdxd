package com.example.pupiletras.entity;
import jakarta.persistence.*;

@Entity
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer filas;
    private Integer columnas;
    private Boolean terminado;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getFilas() { return filas; }
    public void setFilas(Integer filas) { this.filas = filas; }
    public Integer getColumnas() { return columnas; }
    public void setColumnas(Integer columnas) { this.columnas = columnas; }
    public Boolean getTerminado() { return terminado; }
    public void setTerminado(Boolean terminado) { this.terminado = terminado; }
}

package com.example.pupiletras.entity;
import jakarta.persistence.*;

@Entity
public class Celda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer fila;
    private Integer columna;
    private String letra;
    private Boolean resaltada;

    @ManyToOne
    @JoinColumn(name = "juego_id")
    private Juego juego;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getFila() { return fila; }
    public void setFila(Integer fila) { this.fila = fila; }
    public Integer getColumna() { return columna; }
    public void setColumna(Integer columna) { this.columna = columna; }
    public String getLetra() { return letra; }
    public void setLetra(String letra) { this.letra = letra; }
    public Boolean getResaltada() { return resaltada; }
    public void setResaltada(Boolean resaltada) { this.resaltada = resaltada; }
    public Juego getJuego() { return juego; }
    public void setJuego(Juego juego) { this.juego = juego; }
}

package com.example.pupiletras.entity;
import jakarta.persistence.*;

@Entity
public class Palabra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String texto;
    private Boolean encontrada;
    private Integer inicioFila;
    private Integer inicioCol;
    private Integer finFila;
    private Integer finCol;

    @ManyToOne
    @JoinColumn(name = "juego_id")
    private Juego juego;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }
    public Boolean getEncontrada() { return encontrada; }
    public void setEncontrada(Boolean encontrada) { this.encontrada = encontrada; }
    public Integer getInicioFila() { return inicioFila; }
    public void setInicioFila(Integer inicioFila) { this.inicioFila = inicioFila; }
    public Integer getInicioCol() { return inicioCol; }
    public void setInicioCol(Integer inicioCol) { this.inicioCol = inicioCol; }
    public Integer getFinFila() { return finFila; }
    public void setFinFila(Integer finFila) { this.finFila = finFila; }
    public Integer getFinCol() { return finCol; }
    public void setFinCol(Integer finCol) { this.finCol = finCol; }
    public Juego getJuego() { return juego; }
    public void setJuego(Juego juego) { this.juego = juego; }
}

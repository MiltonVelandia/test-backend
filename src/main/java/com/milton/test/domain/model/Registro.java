package com.milton.test.domain.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cpf_registro")
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_numproceso")
    private Long id;

    @Column(nullable = false)
    private String nit;

    @Column(nullable = false)
    private String aportante;

    @Column(nullable = false)
    private String expediente;

    @Column(nullable = false)
    private String etapa;

    @Column(name = "fecha_carga", nullable = false)
    private Timestamp fechaCarga;

    @Lob
    private byte[] contenido;

    @Column(nullable = false)
    private String origen;

    @Column(name = "archivo_original", nullable = false)
    private String archivoOriginal;

    @Column(name = "archivo_ensamblar", nullable = false)
    private String archivoEnsamblar;

    public Registro() {
    }

    public Registro(Long id, String nit, String aportante, String expediente, String etapa, Timestamp fechaCarga, byte[] contenido, String origen, String archivoOriginal, String archivoEnsamblar) {
        this.id = id;
        this.nit = nit;
        this.aportante = aportante;
        this.expediente = expediente;
        this.etapa = etapa;
        this.fechaCarga = fechaCarga;
        this.contenido = contenido;
        this.origen = origen;
        this.archivoOriginal = archivoOriginal;
        this.archivoEnsamblar = archivoEnsamblar;
    }

    // getters y setters...
    public Long getId() {
        return id;
    }

    public String getNit() {
        return nit;
    }

    public String getAportante() {
        return aportante;
    }

    public String getExpediente() {
        return expediente;
    }

    public String getEtapa() {
        return etapa;
    }

    public Timestamp getFechaCarga() {
        return fechaCarga;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public String getOrigen() {
        return origen;
    }

    public String getArchivoOriginal() {
        return archivoOriginal;
    }

    public String getArchivoEnsamblar() {
        return archivoEnsamblar;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setAportante(String aportante) {
        this.aportante = aportante;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public void setFechaCarga(Timestamp fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setArchivoOriginal(String archivoOriginal) {
        this.archivoOriginal = archivoOriginal;
    }

    public void setArchivoEnsamblar(String archivoEnsamblar) {
        this.archivoEnsamblar = archivoEnsamblar;
    }
}

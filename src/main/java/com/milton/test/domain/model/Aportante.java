package com.milton.test.domain.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cpf_aportantes")
public class Aportante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_cabeceraaportante")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "num_proceso", unique = true)
    private Registro registro;

    @Column(nullable = false)
    private String nit;

    @Column(name = "razon_social", nullable = false)
    private String razonSocial;

    @Column(name = "tipo_persona", nullable = false)
    private String tipoPersona;

    @Column(nullable = false)
    private String expediente;

    @Column(name = "anio_fiscalizado", nullable = false)
    private Timestamp anioFiscalizado;

    public Aportante() {
    }

    public Aportante(Long id, Registro registro, String nit, String razonSocial, String tipoPersona, String expediente, Timestamp anioFiscalizado) {
        this.id = id;
        this.registro = registro;
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.tipoPersona = tipoPersona;
        this.expediente = expediente;
        this.anioFiscalizado = anioFiscalizado;
    }

    // Getters y setters...
    public Long getId() {
        return id;
    }

    public Registro getRegistro() {
        return registro;
    }

    public String getNit() {
        return nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public String getExpediente() {
        return expediente;
    }

    public Timestamp getAnioFiscalizado() {
        return anioFiscalizado;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public void setAnioFiscalizado(Timestamp anioFiscalizado) {
        this.anioFiscalizado = anioFiscalizado;
    }
}
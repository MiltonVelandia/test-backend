package com.milton.test.domain.model;

import jakarta.persistence.*;
@Entity
@Table(name = "cpf_cotizantes")
public class Cotizante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_detallecotizante")
    @SequenceGenerator(name = "sq_detallecotizante", sequenceName = "sq_detallecotizante", allocationSize = 1)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "num_proceso", unique = true)
    private Registro registro;

    @Column(name = "tipo_cotizante", nullable = false)
    private Integer tipoCotizante;

    @Column(name = "subtipo_cotizante", nullable = false)
    private Integer subtipoCotizante;

    @Column(name = "tipo_documento", nullable = false)
    private String tipoDocumento;

    @Column(name = "subtipo_documento", nullable = false)
    private Integer subtipoDocumento;

    @Column(name = "nombre_cotizante", nullable = false)
    private String nombreCotizante;

    @Column(nullable = true)
    private String cargo;

    @Column(nullable = false)
    private Integer anio;

    @Column(nullable = false)
    private Integer mes;

    @Column(name = "total_dias_reportados", nullable = false)
    private Integer totalDiasReportados;

    public Cotizante() {
    }

    public Cotizante(Long id, Registro registro, Integer tipoCotizante, Integer subtipoCotizante, String tipoDocumento, Integer subtipoDocumento, String nombreCotizante, String cargo, Integer anio, Integer mes, Integer totalDiasReportados) {
        this.id = id;
        this.registro = registro;
        this.tipoCotizante = tipoCotizante;
        this.subtipoCotizante = subtipoCotizante;
        this.tipoDocumento = tipoDocumento;
        this.subtipoDocumento = subtipoDocumento;
        this.nombreCotizante = nombreCotizante;
        this.cargo = cargo;
        this.anio = anio;
        this.mes = mes;
        this.totalDiasReportados = totalDiasReportados;
    }

    // getters y setters...

    public Long getId() {
        return id;
    }

    public Registro getRegistro() {
        return registro;
    }

    public Integer getTipoCotizante() {
        return tipoCotizante;
    }

    public Integer getSubtipoCotizante() {
        return subtipoCotizante;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public Integer getSubtipoDocumento() {
        return subtipoDocumento;
    }

    public String getNombreCotizante() {
        return nombreCotizante;
    }

    public String getCargo() {
        return cargo;
    }

    public Integer getAnio() {
        return anio;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getTotalDiasReportados() {
        return totalDiasReportados;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public void setTipoCotizante(Integer tipoCotizante) {
        this.tipoCotizante = tipoCotizante;
    }

    public void setSubtipoCotizante(Integer subtipoCotizante) {
        this.subtipoCotizante = subtipoCotizante;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setSubtipoDocumento(Integer subtipoDocumento) {
        this.subtipoDocumento = subtipoDocumento;
    }

    public void setNombreCotizante(String nombreCotizante) {
        this.nombreCotizante = nombreCotizante;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public void setTotalDiasReportados(Integer totalDiasReportados) {
        this.totalDiasReportados = totalDiasReportados;
    }
}
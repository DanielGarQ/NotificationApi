package com.notificationapi.notificationapi.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "notificacion")
public class NotificacionEntity {
    @Id
    @Column(name = "identificador")
    private UUID identificador;

    @OneToOne
    @JoinColumn(name = "persona")
    private PersonaEntity autor;

    @Column(name = "titulo", length = 50)
    private String titulo;

    @Column(name = "contenido", length = 250)
    private String contenido;

    @Column(name = "fechacreacion")
    private Date fechaCreacion;

    @Column(name = "estado", length = 30)
    private String estado;

    @Column(name = "fechaprogramada")
    private Date fechaProgramada;

    @Column(name = "tipoEntrega", length = 30)
    private String tipoEntrega;

    @OneToMany
    @Column(name = "destinatario")
    private List<PersonaEntity> destinatario;

    public NotificacionEntity(UUID identificador, PersonaEntity autor, String titulo, String contenido, Date fechaCreacion, String estado, Date fechaProgramada, String tipoEntrega, List<PersonaEntity> destinatario) {
        this.identificador = identificador;
        this.autor = autor;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.fechaProgramada = fechaProgramada;
        this.tipoEntrega = tipoEntrega;
        this.destinatario = destinatario;
    }

    public NotificacionEntity() {
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaEntity getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    public void setAutor(PersonaEntity autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public List<PersonaEntity> getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(List<PersonaEntity> destinatario) {
        this.destinatario = destinatario;
    }
}

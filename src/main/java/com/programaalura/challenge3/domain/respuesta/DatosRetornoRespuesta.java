package com.programaalura.challenge3.domain.respuesta;

import com.programaalura.challenge3.domain.topico.DatosListadoTopico;

import java.time.LocalDateTime;

public record DatosRetornoRespuesta(
        Long id,
        String mensaje,
        LocalDateTime fecha_creacion,
        DatosListadoTopico topico,
        String autor,
        Boolean solucion
) {
    @Override
    public Long id() {
        return id;
    }

    @Override
    public String mensaje() {
        return mensaje;
    }

    @Override
    public LocalDateTime fecha_creacion() {
        return fecha_creacion;
    }

    @Override
    public DatosListadoTopico topico() {
        return topico;
    }

    @Override
    public String autor() {
        return autor;
    }

    @Override
    public Boolean solucion() {
        return solucion;
    }
}

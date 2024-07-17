package com.programaalura.challenge3.domain.respuesta;

import com.programaalura.challenge3.domain.topico.DatosListadoTopico;

import java.time.LocalDateTime;

public record DatosListadoRespuesta(
        Long id,
        String mensaje,
        LocalDateTime fecha_creacion,
        String autor,
        Boolean solucion,
        DatosListadoTopico topico
) {
    public DatosListadoRespuesta(Respuesta respuesta){
        this(respuesta.getId(), respuesta.getMensaje(), respuesta.getFecha_creacion(),
                respuesta.getAutor().getNombre(), respuesta.getSolucion(),
                new DatosListadoTopico(respuesta.getTopico()));
    }
}

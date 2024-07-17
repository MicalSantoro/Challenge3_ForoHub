package com.programaalura.challenge3.domain.topico.validaciones;


import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.programaalura.challenge3.domain.topico.DatosRegistroTopico;
import com.programaalura.challenge3.domain.topico.Topico;
import com.programaalura.challenge3.domain.topico.ITopicoRepository;

import java.util.List;

@Component
public class TopicosNoDuplicados implements IValidadorDeTopicos {

    @Autowired
    public ITopicoRepository topicoRepository;

    public void validar(DatosRegistroTopico datosRegistroTopico){

        List<Topico> topicos = topicoRepository.findByTitulo(datosRegistroTopico.titulo());
        topicos.stream()
                .filter(t -> t.getMensaje().equalsIgnoreCase(datosRegistroTopico.mensaje()))
                .findFirst()
                .ifPresent(t -> {
                    throw new ValidationException("No se pueden crear tópicos duplicados");
                });

    }

}

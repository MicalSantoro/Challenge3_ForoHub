package com.programaalura.challenge3.domain.usuario.validaciones;


import com.programaalura.challenge3.domain.topico.DatosRegistroTopico;
import com.programaalura.challenge3.domain.usuario.DatosRegistroUsuario;
import com.programaalura.challenge3.domain.usuario.DatosRespuestaUsuario;

public interface IValidadorDeUsuarios {

    public void validar(DatosRegistroUsuario datosRegistroUsuario);
}


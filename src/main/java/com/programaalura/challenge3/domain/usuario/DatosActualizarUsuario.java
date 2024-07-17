package com.programaalura.challenge3.domain.usuario;

public record DatosActualizarUsuario(
        String nombre,
        String email,
        String clave,
        String perfil
) {
}

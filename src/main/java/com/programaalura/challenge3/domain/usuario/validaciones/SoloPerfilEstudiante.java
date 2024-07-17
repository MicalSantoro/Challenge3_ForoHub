package com.programaalura.challenge3.domain.usuario.validaciones;

import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;
import com.programaalura.challenge3.domain.usuario.DatosRegistroUsuario;
import com.programaalura.challenge3.domain.usuario.Perfil;

@Component
public class SoloPerfilEstudiante implements IValidadorDeUsuarios {

    @Override
    public void validar(DatosRegistroUsuario datosRegistroUsuario) {

        if (!datosRegistroUsuario.perfil().equalsIgnoreCase(String.valueOf(Perfil.ESTUDIANTE))){
            throw new ValidationException("Sólo se puede registrar como Estudiante");
        }
    }
}

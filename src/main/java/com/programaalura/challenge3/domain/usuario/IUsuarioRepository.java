package com.programaalura.challenge3.domain.usuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findById(Long aLong);

    UserDetails findByEmail(String username);

    @Query("SELECT u FROM Usuario u ORDER BY u.id ASC")
    Page<Usuario> listarUsuarios(Pageable paginacion);
}

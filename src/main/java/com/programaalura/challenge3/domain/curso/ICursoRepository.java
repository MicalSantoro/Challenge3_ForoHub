package com.programaalura.challenge3.domain.curso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {


    Optional<Curso> findByNombreContainsIgnoreCase(String s);
}

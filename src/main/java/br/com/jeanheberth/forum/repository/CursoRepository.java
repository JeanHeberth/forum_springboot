package br.com.jeanheberth.forum.repository;

import br.com.jeanheberth.forum.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository<Curso, Long> {
    Curso findByNome(String nome);
}

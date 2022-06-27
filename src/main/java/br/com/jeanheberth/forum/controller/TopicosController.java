package br.com.jeanheberth.forum.controller;

import br.com.jeanheberth.forum.dto.TopicoDto;
import br.com.jeanheberth.forum.modelo.Curso;
import br.com.jeanheberth.forum.modelo.Topico;
import br.com.jeanheberth.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {
    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(String nomeCurso) {
        if (nomeCurso == null) {
            List<Topico> topicos = topicoRepository.findAll();
            return TopicoDto.converter(topicos);
        } else {
            List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
            return TopicoDto.converter(topicos);
        }
    }
}

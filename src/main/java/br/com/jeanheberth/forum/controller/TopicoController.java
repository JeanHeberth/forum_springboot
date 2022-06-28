package br.com.jeanheberth.forum.controller;


import br.com.jeanheberth.forum.dto.TopicoDto;
import br.com.jeanheberth.forum.modelo.Curso;
import br.com.jeanheberth.forum.modelo.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicoController {

    @RequestMapping("/topicos")
      public List<TopicoDto> lista(){
        Topico topico = new Topico("Dúvida", "Duvida Spring", new Curso("Spring", "Programação"));
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}

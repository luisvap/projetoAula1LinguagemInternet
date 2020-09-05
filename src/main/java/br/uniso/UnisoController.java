package br.uniso;

// eh a nossa classe de controller
// ela pega a requisicao http vinda do browser
// e processa pra devolver uma resposta


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class UnisoController {


    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    @PostMapping("/criarAluno")
    public boolean criarAluno(@RequestBody Aluno aluno){

        alunos.add(aluno);
        return true;
    }


    @GetMapping("/hello")
    public String hello(@RequestParam("nome") String xxx, @RequestParam("idade") String yyyy){

        return "Hello " + xxx + " idade de " + yyyy;
    }

    @GetMapping("/alunos")
    public ArrayList<Aluno> getAlunos(){



        return alunos;

    }

}



package dev.joaomarcos.controller;

import dev.joaomarcos.model.Aluno;
import dev.joaomarcos.repository.AlunoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final AlunoRepository repo;

    public AlunoController(AlunoRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Aluno adicionar(@RequestBody Aluno aluno) {
        return repo.adicionar(aluno);
    }

    @GetMapping
    public List<Aluno> listar() {
        return repo.listar();
    }

    @GetMapping("/{matricula}")
    public Aluno buscar(@PathVariable int matricula) {
        return repo.buscarPorMatricula(matricula);
    }

    @DeleteMapping
    public void limpar() {
        repo.limpar();
    }

    @GetMapping("/estrutura")
    public String estruturaAtual() {
        return repo.getClass().getSimpleName();  // Ex: "ListMapAlunoRepository"
    }
}
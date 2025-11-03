package dev.joaomarcos.repository;

import dev.joaomarcos.model.Aluno;
import java.util.List;
public interface AlunoRepository {
    Aluno adicionar(Aluno aluno);
    List<Aluno> listar();
    Aluno buscarPorMatricula(int matricula);
    void limpar();
}
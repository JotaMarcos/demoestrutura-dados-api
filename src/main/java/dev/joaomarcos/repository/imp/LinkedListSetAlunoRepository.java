package dev.joaomarcos.repository.impl;

import dev.joaomarcos.model.Aluno;
import dev.joaomarcos.repository.AlunoRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Profile("linked")
@Primary
public class LinkedListSetAlunoRepository implements AlunoRepository {

    private final LinkedList<Aluno> lista = new LinkedList<>();

    @Override
    public Aluno adicionar(Aluno aluno) {
        lista.add(aluno);
        return aluno;
    }

    @Override
    public List<Aluno> listar() {
        return new ArrayList<>(lista);
    }

    @Override
    public Aluno buscarPorMatricula(int matricula) {
        return lista.stream()
                .filter(a -> a.getMatricula() == matricula)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void limpar() {
        lista.clear();
    }

}
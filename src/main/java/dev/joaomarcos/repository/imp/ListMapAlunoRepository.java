package dev.joaomarcos.repository.impl;

import dev.joaomarcos.model.Aluno;
import dev.joaomarcos.repository.AlunoRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Profile("list")
@Primary
public class ListMapAlunoRepository implements AlunoRepository {

    private final List<Aluno> lista = new ArrayList<>();
    private final Map<Integer, Aluno> mapa = new HashMap<>();

    @Override
    public Aluno adicionar(Aluno aluno) {
        lista.add(aluno);
        mapa.put(aluno.getMatricula(), aluno);
        return aluno;
    }

    @Override
    public List<Aluno> listar() {
        return new ArrayList<>(lista);
    }

    @Override
    public Aluno buscarPorMatricula(int matricula) {
        return mapa.get(matricula);
    }

    @Override
    public void limpar() {
        lista.clear();
        mapa.clear();
    }
}
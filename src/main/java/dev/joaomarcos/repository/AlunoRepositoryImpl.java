package dev.joaomarcos.repository;

import dev.joaomarcos.model.Aluno;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {

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
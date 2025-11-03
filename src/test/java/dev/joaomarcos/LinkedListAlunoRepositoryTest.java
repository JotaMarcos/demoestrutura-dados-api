package dev.joaomarcos;

import dev.joaomarcos.DemoestruturaDadosApiApplication;
import dev.joaomarcos.model.Aluno;
import dev.joaomarcos.repository.AlunoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = dev.joaomarcos.DemoestruturaDadosApiApplication.class)
@ActiveProfiles("linked")
class LinkedListAlunoRepositoryTest {

    @Autowired
    AlunoRepository repo;

    @Test
    void deveAdicionarEListar() {
        Aluno a = Aluno.builder()
                .matricula(1)
                .nome("Maria")
                .build();

        repo.adicionar(a);
        assertEquals(1, repo.listar().size());
    }
}
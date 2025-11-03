package dev.joaomarcos.model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Aluno {
    private int matricula;
    private String nome;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}

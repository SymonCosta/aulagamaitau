package br.gama.itau.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica que essa classe sera armazenada no BD
@Table(name = "professor")

public class Professor {
    @Id // indica que e chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indica que sera gerado pelo BD SEQUENCIALMENTE 1, 2, 3...
    @Column(name = "cod") // troca o nome da coluna na tabela
    private long codigo;

    @Column(length = 200, nullable = false) // tamanho maximo do nome e nome é obrigatorio
    private String nome;

    @Column(length = 100, nullable = false, unique = true) // nao pode ter repeticao de email
    private String email;

    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}

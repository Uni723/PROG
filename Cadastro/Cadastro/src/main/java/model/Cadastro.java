package model;

import jakarta.persistence.*;

@Entity
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private String genero;

    @Column(name = "t_email", nullable = false, length = 512)
    private String email;

    private String telefone;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String observacoes;

    public Cadastro() {
    }

    public Cadastro(String nome, String cpf, String rg, String dataNascimento, String genero, String email,
            String telefone, String endereco, String cidade, String estado, String cep, String observacoes) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.observacoes = observacoes;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getRg() {return rg;}
    public void setRg(String rg) {this.rg = rg;}

    public String getDataNascimento() {return dataNascimento;}
    public void setDataNascimento(String dataNascimento) {this.dataNascimento = dataNascimento;}

    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}

    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}

    public String getCep() {return cep;}
    public void setCep(String cep) {this.cep = cep;}

    public String getObservacoes() {return observacoes;}
    public void setObservacoes(String observacoes) {this.observacoes = observacoes;}

    @Override
    public String toString() {
        return "--- Dados do Cliente ---\n" +
               "ID: " + id + "\n" +
               "Nome: " + nome + "\n" +
               "CPF: " + cpf + "\n" +
               "RG: " + rg + "\n" +
               "Data de Nascimento: " + dataNascimento + "\n" +
               "Gênero: " + genero + "\n" +
               "E-mail: " + email + "\n" +
               "Telefone: " + telefone + "\n" +
               "Endereço: " + endereco + "\n" +
               "Cidade: " + cidade + "\n" +
               "Estado: " + estado + "\n" +
               "CEP: " + cep + "\n" +
               "Observações: " + observacoes + "\n" +
               "-------------------------";
    }
}
package br.com.dobackaofront;

public abstract class Personagem {

    //Modificador de acesso; Private, public ... -> para criação dos atributos
    private String nome;
    private char sexo;
    private int idade;
    private int vitalidade;

    //Construtores - vazio ( PERMITINDO 1 OU MAIS)
    public Personagem() {
    }
    //Construtor - completo ( obrigando tudo)
    public Personagem(String nome, int idade, char sexo, int vitalidade){
        this.nome = nome;
        this.idade =idade;
        this.sexo = sexo;
        this.vitalidade = vitalidade;

    }


    //Métodos - get / set = alterar
    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }
}

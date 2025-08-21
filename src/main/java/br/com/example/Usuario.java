package main.java.br.com.example;

public class Usuario {
    private int id;        // primitivo
    private String nome;   // referência

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Usuário{id=" + id + ", nome='" + nome + "'}";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objeto Usuario com id=" + id + " foi destruído pelo Garbage Collector.");
    }
}

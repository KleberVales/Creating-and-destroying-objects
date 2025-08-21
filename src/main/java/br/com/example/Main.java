package main.java.br.com.example;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Kleber");

        System.out.println("ID: " + usuario.getId());
        System.out.println("Nome: " + usuario.getNome());
        System.out.println(usuario);

        usuario = null;
        System.gc();

        System.out.println("Fim do programa!");
    }
}

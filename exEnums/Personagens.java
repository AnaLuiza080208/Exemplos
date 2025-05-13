package exEnums;

import java.util.Date;

public class Personagens {

    private String nome;
    private int nivel;
    private int vida;
    private Tipo tipo;
    private Date dataCriacao;

    enum Tipo {
        GUERREIRO,
        MAGO,
        FEITICEIRO,
        LADINO
    }

    public Personagens(String nome, int nivel, int vida, Tipo tipo, Date dataCriacao) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.tipo = tipo;
        this.dataCriacao = dataCriacao;
    }

    public static void main(String[] args) {
        Date dataCriacao = new Date(); 
        Personagens p1 = new Personagens("Arthur", 10, 100, Tipo.GUERREIRO, dataCriacao);

        System.out.println("Nome: " + p1.nome);
        System.out.println("Nível: " + p1.nivel);
        System.out.println("Vida: " + p1.vida);
        System.out.println("Tipo: " + p1.tipo);
        System.out.println("Data de Criação: " + p1.dataCriacao);
    }
}

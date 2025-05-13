package exTodos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Personagens {
    private String nome;
    private Integer nivel;
    private Double vida;
    private Ativo ativo;
    private LocalDateTime dataCriacao;

    enum Ativo {
        ATIVO,
        INATIVO,
    }

    public Personagens(String nome, Integer nivel, Double vida, Ativo ativo, LocalDateTime dataCriacao) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.ativo = ativo;
        this.dataCriacao = dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Ativo getAtivo() {
        return ativo;
    }

    public void setAtivo(Ativo ativo) {
        this.ativo = ativo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void receberDano(Double dano) {
        if (dano < 0) {
            throw new IllegalArgumentException("Dano não pode ser negativo!");
        }

        vida -= dano;

        if (vida < 0) {
            throw new IllegalArgumentException("Vida não pode ser negativa!");
        }
    }

    public static void main(String[] args) {
        LocalDateTime dataCriacao = LocalDateTime.now(); 
        Personagens p1 = new Personagens("Shadow", 10, 50.0, Ativo.ATIVO, dataCriacao);

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormatada = p1.getDataCriacao().format(formatar);
        
        try {
            p1.receberDano(60.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
       
        p1.exibirStatus(dataFormatada);
    }

    public void exibirStatus(String dataFormatada) {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Ativo: " + ativo);
        System.out.println("Data de criação: " + dataFormatada); 
    }
}

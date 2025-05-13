package exEnums;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Personagens {

    private String nome;
    private int nivel;
    private int vida;
    private Tipo tipo;
    private LocalDateTime dataCriacao;

    enum Tipo {
        GUERREIRO,
        MAGO,
        FEITICEIRO,
        LADINO
    }

    public Personagens(String nome, int nivel, int vida, Tipo tipo, LocalDateTime dataCriacao) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.tipo = tipo;
        this.dataCriacao = dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public static void main(String[] args) {
        LocalDateTime dataCriacao = LocalDateTime.now(); 
        Personagens p1 = new Personagens("Shadow", 10, 100, Tipo.LADINO, dataCriacao);

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataFormatada = p1.getDataCriacao().format(formatar);
       
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Nível: " + p1.getNivel());
        System.out.println("Vida: " + p1.getVida());
        System.out.println("Tipo: " + p1.getTipo());
        System.out.println("Data de Criação: " + dataFormatada); 
    }
}

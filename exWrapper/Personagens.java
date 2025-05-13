package exWrapper;

public class Personagens {
    private String nome;
    private Integer nivel;
    private Double vida;
    private Boolean ativo;

    public Personagens(String nome, Integer nivel, Double vida, Boolean ativo) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.ativo = ativo;
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

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public static void main(String[] args) {
        Personagens personagem1 = new Personagens("Shadow", 89, 100.0, true);
        personagem1.exibirStatus();
        personagem1.setNivel(-5);
        personagem1.setVida(-10.0);
        System.out.println("Dados atualizados:" );
        personagem1.exibirStatus();
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Ativo: " + ativo);
    }

}
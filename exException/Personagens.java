package exException;

public class Personagens {
    private String nome;
    private int nivel;
    private double vida;
    private boolean ativo;

    public Personagens(String nome, int nivel, double vida, boolean ativo) {
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void receberDano(double dano) {
        if (dano < 0) {
            throw new IllegalArgumentException("Dano não pode ser negativo!");
        }

        vida -= dano;

        if (vida < 0) {
            throw new IllegalArgumentException("Vida não pode ser negativa!");
        }
    }

    public static void main(String[] args) {
        Personagens p1 = new Personagens("Shadow", 100, 50.0, true);
        try {
            p1.receberDano(60.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        p1.exibirStatus();
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Ativo: " + ativo);
    } 
}

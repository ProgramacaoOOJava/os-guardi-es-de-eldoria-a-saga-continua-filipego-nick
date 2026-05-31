package eldoria;

import java.util.Objects;

/**
 * Classe base para representar personagens do reino de Eldoria.
 * Aplica conceitos de encapsulamento, herança e polimorfismo.
 */
public class abstract Personagem {
    private String nome, classe;
    private int nivel, pontosDeVida;
    private double poderBase; // Atributos privados (encapsulamento)


    public Personagem(String nome, String classe, int nivel, int pontosdevida, double poderbase){
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosdevida;
        this.poderBase = poderbase;
    }        // * Construtor que inicializa todos os atributos do personagem.

    public String getNome(){return nome;}
    public String getClasse(){return classe;}
    public int getNivel(){return nivel;}
    public int getPontosDeVida(){return pontosDeVida;}
    public double getPoderBase(){return poderBase;}
    // Getters

    public void setNome(String nome){this.nome=nome;}
    public void setClasse(String classe){this.classe=classe;}
    public void setNivel(int nivel){this.nivel=nivel;}
    public void setPontosDeVida(int pontosdevida){this.pontosDeVida=pontosdevida;}
    public void setPoderBase(double poder){this.poderBase=poder;}
    // Setters com validações

    // * Criar métodos que define os pontos de vida do personagem.


    /**
     * Criar método que define a habilidade do personagem.
     * Deve ser sobrescrito pelas subclasses para implementar comportamentos específicos.
     */



    /**
     * Sobrescrita do método toString() para exibir informações do personagem.
     * @return String formatada com todos os atributos do personagem
     */
    @Override
    public String toString() {

    }

    /**
     * Sobrescrita do método equals() para comparar personagens.
     * Dois personagens são considerados iguais se tiverem o mesmo nome e classe.
     * @param obj Objeto a ser comparado
     * @return true se os personagens forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object obj) {

    }

    /**
     * Sobrescrita do método hashCode() para ser consistente com equals().
     * @return Código hash baseado no nome e classe
     */
    @Override
    public int hashCode() {

    }
}


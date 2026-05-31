package eldoria;

/**
 * Classe que representa um Guerreiro no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de combate.
 */
public class Guerreiro extends Personagem {

        public Guerreiro(String nome, String classe, int nivel, int poderbase, double pontosdevida){
        super(nome, classe, nivel, nivel, poderbase); // * Construtor para criar um Guerreiro.
    }


    /**
     * Sobrescrita do método usarHabilidade() específica para Guerreiros.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
             System.out.println("Guerreiro usa golpe Titânico!");
    }
}


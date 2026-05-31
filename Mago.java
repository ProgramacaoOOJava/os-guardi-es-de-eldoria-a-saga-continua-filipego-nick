package eldoria;

/**
 * Classe que representa um Mago no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de magia.
 */
public class Mago extends Personagem {

    
      public Mago(String nome, String classe, int nivel, int poderbase, double pontosdevida){ /*Construtor da classe */
        super(nome, classe, nivel, nivel, poderbase);
    }    // * Construtor para criar um Mago.



    /**
     * Sobrescrita do método usarHabilidade() específica para Magos.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
          System.out.println("Mago Conjura chuva de meteoro!");
    }
}


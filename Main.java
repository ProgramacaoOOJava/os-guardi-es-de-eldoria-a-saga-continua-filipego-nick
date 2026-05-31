package eldoria;

import java.util.ArrayList;

/**
 * Classe principal que demonstra os conceitos de POO aplicados no sistema de personagens de Eldoria.
 * Demonstra: herança, polimorfismo, encapsulamento, instanceof, equals() e hashCode().
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!\n");
        
        ArrayList<Personagem> personagens = new ArrayList<>(); // Criando uma lista polimórfica de personagens
        
        personagens.add(new Mago("Arkanis","bruxo" , 4, 6, 7));
        personagens.add(new Mago("Thaunis","ilusionista" , 3, 5, 8));// Adicionando Magos à lista
        
        personagens.add(new Guerreiro("Oman","Soldado" , 5, 4, 6));
        personagens.add(new Guerreiro("Naufal","Coronel" , 8, 5, 5));
        // Adicionando Guerreiros à lista
        
        for(Personagem personagem : personagens){   /*Execução do jogo e percorrimento da lista */
            personagem.exibirStatus();
            personagem.usarHabilidade();
            System.out.println("\n-----------------------------\n");// Percorrendo a lista e demonstrando polimorfismo
        }
    }
}


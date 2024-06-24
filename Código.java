import java.util.Random;

public class SimuladorDados {
    public static void main(String[] args) {
        // Criar um objeto Random para simular a jogada do dado
        Random random = new Random();

        // Simular a jogada do dado três vezes
        int resultado1 = random.nextInt(6) + 1;
        int resultado2 = random.nextInt(6) + 1;
        int resultado3 = random.nextInt(6) + 1;

        // Calcular a soma dos valores obtidos
        int soma = resultado1 + resultado2 + resultado3;

        // Apresentar o resultado final
        System.out.println("Jogada 1: " + resultado1);
        System.out.println("Jogada 2: " + resultado2);
        System.out.println("Jogada 3: " + resultado3);
        System.out.println("Soma dos valores: " + soma);
    }
}

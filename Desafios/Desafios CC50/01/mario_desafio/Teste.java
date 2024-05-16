import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int number;

        do {
            System.out.println("Digite a altura da coluna: ");
            number = entrada.nextInt();
        } while (number <= 1 || number > 9);

        // Criar matriz com padrão inicial
        char[][] matriz = new char[number][2 * number - 1];

        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                if(j + 1 < number - i){
                    matriz[i][j] = '.';
                }else {
                    matriz[i][j] = '#';
                }
            }
            System.out.print("\n");
        }

        // Adicionar coluna com valor '0' à matriz
        for (int i = 0; i < number; i++) {
            matriz[i][number] = '0';
        }

        // Espelhar o padrão criado inicialmente
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (2 * number - 1); j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        entrada.close();
    }
}

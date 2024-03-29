import java.util.Scanner;

public class Mario{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int number;

        do{
            System.out.println("Digite a altura da coluna: ");
            number = entrada.nextInt();
        }while(number > 1 && number >= 9);

        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                if(j + 1 < number - i){
                    System.out.print("[.]");
                }else {
                    System.out.print("[#]");
                }
            }
            System.out.print("\n");
        }

        entrada.close();
    }
}
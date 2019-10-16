package auladofor;

import java.util.Scanner;

public class AuladoFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int n = entrada.nextInt();
        for (int i=0; i < n ; i++){
            int x = entrada.nextInt();
            soma  = soma + x;
        }
        System.out.println(soma);
    }
    
}

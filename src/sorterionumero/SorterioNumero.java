package sorterionumero;

import java.util.Random;
import java.util.Scanner;

public class SorterioNumero {

    public static void main(String[] args) {
        Scanner lg = new Scanner(System.in);
        Random rng = new Random();
        
        int sorteado = rng.nextInt(10);
        
        System.out.println(sorteado);
    }
    
}

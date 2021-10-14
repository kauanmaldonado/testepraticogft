package exercicio02.dominio02;

import java.util.Scanner;

public class ScannerTempoDeCasa {
    public void scannerTempo (TempoDeCasa tempoDeCasa){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Em qual ano voce entrou na GFT? ");
        tempoDeCasa.entrada = entrada.nextInt();
        tempoDeCasa.periodo = tempoDeCasa.atual-tempoDeCasa.entrada;
    }
}

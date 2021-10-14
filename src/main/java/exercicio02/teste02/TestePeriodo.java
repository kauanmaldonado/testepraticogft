package exercicio02.teste02;

import exercicio02.dominio02.DefineQualPresente;
import exercicio02.dominio02.ScannerTempoDeCasa;
import exercicio02.dominio02.TempoDeCasa;

import java.util.Scanner;

public class TestePeriodo {
    public static void main(String[] args) {
        TempoDeCasa funcionario01 = new TempoDeCasa();
        ScannerTempoDeCasa scannerTempoDeCasa = new ScannerTempoDeCasa();
        DefineQualPresente defineQualPresente = new DefineQualPresente();

        scannerTempoDeCasa.scannerTempo(funcionario01);
        defineQualPresente.tempoDeGft(funcionario01);


    }
}

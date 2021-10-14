package exercicio02.dominio02;

public class DefineQualPresente {
    public void tempoDeGft(TempoDeCasa tempoDeCasa) {
        switch (tempoDeCasa.periodo) {
            case 1:
                System.out.println("Vale Presente");
                break;
            case 2:
                System.out.println("Smart Watch");
                break;
            case 5:
                System.out.println("Fone Bluetooth");
                break;
            case 10:
                System.out.println("Vale Jantar");
                break;
            case 15:
                System.out.println("Vale Jantar Top");
                break;
            default:
                System.out.println("Esse ano não vai ter presente");
                break;

        }
    }
}
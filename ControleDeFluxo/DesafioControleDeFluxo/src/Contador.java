import java.util.Locale;
import java.util.Scanner;

public class Contador {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        Scanner parametros = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira o primeiro numero:");
        int parametroUm = parametros.nextInt();
        System.out.println("\nInsira o segundo numero:");
        int parametroDois = parametros.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } 
        catch (ParametroInvalidoException exception) {
            System.out.println("O primero parametro deve ser maior que o segundo");
        }
        parametros.close();

    }
    static void contar(int primeiroNumero, int segundonumero) throws ParametroInvalidoException{
        if(primeiroNumero>segundonumero){
            for (int i = 0; i < primeiroNumero-segundonumero; i++){
                System.out.println("Imprimindo o número "+(i+1));
            }
        }
        else{
            throw new ParametroInvalidoException();
        }
        
    }
}

package dados.service;

import java.util.Locale;
import  java.util.Scanner;
import  java.util.concurrent.ThreadLocalRandom;

public class LancadorDeDadosRPG{
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        Scanner pergunta = new Scanner(System.in);
        boolean sairDoJogo = false;
        
    do {
        try{
        System.out.println("Insira qual dado você quer usar: ");
        String resposta = pergunta.nextLine();
        
        if("d20".equals(resposta.toLowerCase(Locale.getDefault()))){
        d20();
        }
        else if("d12".equals(resposta.toLowerCase(Locale.getDefault()))){
        d12();
        }
        else if("d10".equals(resposta.toLowerCase(Locale.getDefault()))){
        d10();
        }
        else if("d8".equalsIgnoreCase(resposta.toLowerCase(Locale.getDefault()))){
        d8();
        }
        else if("d6".equalsIgnoreCase(resposta.toLowerCase(Locale.getDefault()))){
        d6();
        }
        else if("d4".equalsIgnoreCase(resposta.toLowerCase(Locale.getDefault()))){
        d4();
        }
        else{
            throw new ValorDeDadoInvalidoException();
        }
    }
    catch(ValorDeDadoInvalidoException exception){
        System.out.println("Valor invalido\nInsira um valor no formato d<numero>, com 'd' representando o dado e <numero representando seu valor, como d20> ou insira um valor de dado existente da lista [d20, d12, d10, d8, d6, d4]");
    }
        
        System.out.println("Voce quer jogar mais algum dado? Sim ou não? ");
        String respostaSimNão = pergunta.nextLine();
        
        if ("sim".equalsIgnoreCase(respostaSimNão.toLowerCase())){
            System.out.println("Continue jogando!!\n");
            sairDoJogo = false;
        }
        else{
            sairDoJogo = true;
        }
    
    } while (!sairDoJogo);
    System.out.println("Voce saiu do jogo.");

        pergunta.close();
    }

    static void d20() throws ValorDeDadoInvalidoException{
        int dado = ThreadLocalRandom.current().nextInt(1,21);
        System.out.println("Seu valor obtido no d20 foi "+dado);   
    }
    
    static void d12() throws ValorDeDadoInvalidoException{
        int dado = ThreadLocalRandom.current().nextInt(1,13);
        System.out.println("Seu valor obtido d12 foi "+dado);
    }
    
    static void d10() throws ValorDeDadoInvalidoException{
        int dado = ThreadLocalRandom.current().nextInt(1,11);
        System.out.println("Seu valor obtido no d10 foi "+dado);
    }
    
    static void d8() throws ValorDeDadoInvalidoException{
        int dado = ThreadLocalRandom.current().nextInt(1,9);
        System.out.println("Seu valor obtido no d6 foi "+dado);
    }
    
    static void d6() throws ValorDeDadoInvalidoException{
        int dado = ThreadLocalRandom.current().nextInt(1,7);
        System.out.println("Seu valor obtido no d6 foi "+dado);
    }
    
    static void d4() throws ValorDeDadoInvalidoException{
        int dado = ThreadLocalRandom.current().nextInt(1,5);
        System.out.println("Seu valor obtido no d4 foi "+dado);
    }
}

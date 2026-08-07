//Faça funções recursivas em Java para resolver os problemas abaixo:
//
//1-Somar todos os números pares até um limite n (escolhido pelo usuário).
//2-Somar todos os elementos de um vetor de números double.
//3-Contar a quantidade de repetições, em um vetor, de um número (escolhido pelo usuário).
//
//Crie um menu principal que permita ao usuário escolher qual algoritmo deseja executar e faça a leitura
//dos dados necessários para cada algoritmo.

import java.util.Scanner;
public class MenuRecursao {
    public static void main(String[] args){

    }

    public static int somaPares(int n){
        if(n == 0){
            return 0;
        }
        if(n % 2 == 0){
            return n + somaPares(n - 1);
        }
        else{
            return somaPares(n - 1);
        }
    }

    public static double somaVetor(double[] vetor, int contador){
        if(vetor.length == contador){
            return 0;
        }
        return vetor[contador] + somaVetor(vetor, contador + 1);
    }

    public static int repeticaoVetor(int[] repVetor, int rep, int num){
        if(repVetor.length == rep){
            return 0;
        }

        if(repVetor[rep] == num){
            return 1 + repeticaoVetor(repVetor, rep + 1, num);
        }

        return repeticaoVetor(repVetor, rep + 1, num);
    }

}
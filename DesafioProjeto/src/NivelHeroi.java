/*
# 1️⃣ Desafio Classificador de nível de Herói

**O Que deve ser utilizado**

- Variáveis
- Operadores
- Laços de repetição
- Estruturas de decisões

## Objetivo

Crie uma variável para armazenar o nome e a quantidade de experiência (XP) de um herói, depois utilize uma estrutura de decisão para apresentar alguma das mensagens abaixo:

Se XP for menor do que 1.000 = Ferro
Se XP for entre 1.001 e 2.000 = Bronze
Se XP for entre 2.001 e 5.000 = Prata
Se XP for entre 5.001 e 7.000 = Ouro
Se XP for entre 7.001 e 8.000 = Platina
Se XP for entre 8.001 e 9.000 = Ascendente
Se XP for entre 9.001 e 10.000= Imortal
Se XP for maior ou igual a 10.001 = Radiante

## Saída

Ao final deve se exibir uma mensagem:
"O Herói de nome **{nome}** está no nível de **{nivel}**"
*/
import java.util.Scanner;

public class NivelHeroi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-> Qual é o nome do herói? ");
        String nome = sc.nextLine();
        System.out.println("-> Quanto de experiência o herói possui? ");
        int experiencia = sc.nextInt();

       if(experiencia <= 1000){
           System.out.println("O herói " + nome + " está no nível de Ferro.");
       }else if(experiencia <= 2000){
            System.out.println("O herói " + nome + " está no nível Bronze.");
       }else if(experiencia < 5000){
           System.out.println("O herói " + nome + " está no nível Prata.");
       }else if(experiencia <= 7000){
           System.out.println("O herói " + nome + " está no nível Ouro.");
       }else if(experiencia <= 8000){
           System.out.println("O herói " + nome + " está no nível Platina.");
       }else if(experiencia <= 9000){
           System.out.println("O herói " + nome + " está no nível Ascendente.");
       }else if(experiencia <= 1000){
           System.out.println("O herói " + nome + " está no nível Imortal.");
       } else{
           System.out.println("O herói " + nome + " está no nível Radiante.");
       }
        sc.close();
    }
}
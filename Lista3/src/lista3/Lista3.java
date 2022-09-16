
package lista3;

import java.util.Scanner;

/*  Faça um programa que lê o saldo de uma conta corrente e as movimentações feitas nela 
(valores positivos e negativos). Quando uma
movimentação com valor zero for inserida, o programa deverá exibir o saldo final.*/
public class Lista3 {


    public static void main(String[] args) {
        
      Scanner leia = new Scanner(System.in);
      
        
        
        int resp = 1 ;
        
       
        while (resp !=0){
            
             System.out.println("Entre com o saldo:");
        double saldo = leia.nextDouble();
        System.out.println("Entre com a movimentação:");
        double mov = leia.nextDouble();
      
        double saldoFinal = saldo + mov;
       
        if(mov < 0){
         System.out.println("Movimentação: " + saldoFinal);
         
         }else{
         System.out.println("Movimentação" + saldoFinal);
         
         }
            System.out.println("Digite 0 para parar ou qualquer outro para continuar :");
         resp = leia.nextInt();
        
        }
        
        
       
        
        }
               
               
        

    }
    


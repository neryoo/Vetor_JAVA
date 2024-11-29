/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor_par_impar;

/**
 *
 * @author sabri
 */

import java.util.Scanner;

public class Vetor_Par_Impar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int par = 0;
        int impar = 0;
        int N [] = new int[15];
        
        for(int i = 0; i<15; i++){
            System.out.println("Insira um número inteiro: ");
            N[i] = scanner.nextInt();
            if(N[i]%2 == 0){
                par++;
            } else{impar++;
        } 
            System.out.println("Dentre os números digitados " + par + " são números pares e " + impar + "são núemeros ímpares.");
            scanner.close();
        }
    }
}

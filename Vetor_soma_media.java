/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_soma_media;

/**
 *
 * @author sabri
 */

import java.util.Scanner;

public class Java_soma_media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N[] = new int [10];
        int soma = 0;
        
        
           
        for(int i = 0; i<10; i++){
            System.out.println("Insira o " + i + "° número (somente números inteiros): ");
            N[i] = scanner.nextInt();
            soma += N[i];
        }
        double media = soma/10;
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A média dos números digitados é: " + media);
        
        scanner.close();
    }
}

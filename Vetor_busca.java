/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor_busca;

/**
 *
 * @author sabri
 */

import java.util.Scanner;

public class Vetor_busca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome[] = new String[10];
        
        for(int i = 0; i<10; i++){
            System.out.println("Informe o nome de 10 pessoas: ");
            nome[i] = scanner.next();
        }
        System.out.println("Dentre os 10 nomes digitados, informe um nome para buscar sua posição: ");
        String buscar = scanner.next();
        
        if(buscar.equals(nome[0])){
            System.out.println("Dentre ps 10 nomes digitados, o nome" + buscar + "está presente na posição 1");
        } else if(buscar.equals(nome[1])){
            System.out.println("O Nome está presente no vetor, na posição 2");
        } else if(buscar.equals(nome[2])){
            System.out.println("O Nome está presente no vetor, na posição 3");
        } else if(buscar.equals(nome[3])){
            System.out.println("O Nome está presente no vetor, na posição 4");
        } else if(buscar.equals(nome[4])){
            System.out.println("O Nome está presente no vetor, na posição 5");
        } else if(buscar.equals(nome[5])){
            System.out.println("O Nome está presente no vetor, na posição 6");
        } else if(buscar.equals(nome[6])){
            System.out.println("O Nome está presente no vetor, na posição 7");
        } else if(buscar.equals(nome[7])){
            System.out.println("O Nome está presente no vetor, na posição 8");
        } else if(buscar.equals(nome[8])){
            System.out.println("O Nome está presente no vetor, na posição 9");
        }else if(buscar.equals(nome[9])){
            System.out.println("O Nome está presente no vetor, na posição 10");}
        scanner.close();
    }
}

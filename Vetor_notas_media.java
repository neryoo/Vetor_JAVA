/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor_notas_media;

/**
 *
 * @author sabri
 */

import java.util.Scanner;

public class Vetor_notas_media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int aluno[] = new int[5];
        int soma = 0;
        int acima = 0;
        int abaixo = 0;
        int namedia = 0;
        
        for(int i=0;i<5;i++)
        {System.out.println("Digite a nota do aluno: ");
         aluno[i] = scanner.nextInt();
         soma+=aluno[i];
         }
        double media = soma/5;
        
        for (int N =0;N<5;N++)
        {if(aluno[N]< media)
        {abaixo++;}
        else if(aluno[N] >media)
        {acima++;}
        else
        {namedia++;}
        }
        System.out.println("Aluno(s) abaixo da média: " + abaixo);
        System.out.println("Aluno(s) acima da média: " + acima);
        System.out.println("Alunos exatamnete na média: " + namedia);
        scanner.close();
        
    }
}

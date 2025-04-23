/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.NotaAluno.teste;

import br.edu.etec.NotaAluno.model.Aluno;

/**
 *
 * @author madpais
 */
public class Exerc_11_12 {

    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.setNota1(10);
        a.setNota2(0);
        
        if (a.calcularMedia() >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Metodo_Public_Private.model;

/**
 *
 * @author madpais
 */
public class TesteEmpresa extends Empresa{
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        emp.exibirInfo();          // permitido
        emp.gerarRelatorio();   // ERRO: método privado. Para dar Ok tem de tornar public
    }
}

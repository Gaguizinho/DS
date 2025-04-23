/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Protected_Heranca.Model;

/**
 *
 * @author madpais
 */
public class SubSistema extends ConfiguracaoSistema {
    public void mostrarVersao() {
        System.out.println("Versão: " + versaoSistema); // acesso direto permitido
    }
}
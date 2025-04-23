/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.Metodo_Public_Private.teste;

import br.edu.etec.Metodo_Public_Private.model.TesteEmpresa;

/**
 *
 * @author madpais
 */
public class Exerc_14 {

    public static void main(String[] args) {
        TesteEmpresa t = new TesteEmpresa();
        
        t.exibirInfo();
        t.gerarRelatorio(); // ERRO: método privado. Para dar Ok tem de tornar public
    }
}

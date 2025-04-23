/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.relogio.model;

/**
 *
 * @author madpais
 */
public class Relogio {
    private int minuto;

    public Relogio(int minuto) {
        this.minuto = minuto;
    }

    
    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido!");
        }
    }
}

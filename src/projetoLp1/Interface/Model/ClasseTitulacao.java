/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoLp1.Interface.Model;
import java.io.Serializable;

import java.util.ArrayList;

/**
 *
 * @author thiagofsr
 */
public class ClasseTitulacao implements Serializable {
    private String titulacao;

    public ClasseTitulacao() {
    }

    public ClasseTitulacao(String titulacao) {
       this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    
}

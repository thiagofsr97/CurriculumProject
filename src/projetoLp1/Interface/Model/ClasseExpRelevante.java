/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoLp1.Interface.Model;
import java.io.Serializable;

/**
 *
 * @author thiagofsr
 */
public class ClasseExpRelevante implements Serializable {
    private String expRelevante;

    
    public ClasseExpRelevante(String expRelevante) {
        this.expRelevante = expRelevante;
    }

    public String getExpRelevante() {
        return expRelevante;
    }

    public void setExpRelevante(String expRelevante) {
        this.expRelevante = expRelevante;
    }
 
}

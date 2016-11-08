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
public class ClasseExpDocente implements Serializable {
    private String expDocente;

    public ClasseExpDocente(String expDocente) {
        this.expDocente = expDocente;
    }
    

    public String getExpDocente() {
        return expDocente;
    }

    public void setExpDocente(String expDocente) {
        this.expDocente = expDocente;
    }
    
}

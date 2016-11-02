/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoLp1.Interface.Model;

/**
 *
 * @author thiagofsr
 */
public class ClassePublicacao {
    private String publicacao;

    public ClassePublicacao(String publicacao) {
        this.publicacao = publicacao;
    }

    
    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }
}

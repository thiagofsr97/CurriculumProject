
package projetoLp1.Interface.Model;

import java.io.Serializable;

public class Curriculo implements Serializable {
    private ClasseDados dados;
    private ClassePublicacao publicacao;
    private ClasseExpDocente expDocente;
    private ClasseExpRelevante expRelevante;
    private ClasseTitulacao titulacao;

    public Curriculo(ClasseDados dados, ClasseTitulacao titulacao, ClasseExpDocente expDocente, ClasseExpRelevante expRelevante, ClassePublicacao publicacao) {
        this.dados = dados;
        this.publicacao = publicacao;
        this.expDocente = expDocente;
        this.expRelevante = expRelevante;
        this.titulacao = titulacao;
    }

    public ClasseDados getDados() {
        return dados;
    }

    public void setDados(ClasseDados dados) {
        this.dados = dados;
    }

    public ClassePublicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(ClassePublicacao publicacao) {
        this.publicacao = publicacao;
    }

    public ClasseExpDocente getExpDocente() {
        return expDocente;
    }

    public void setExpDocente(ClasseExpDocente expDocente) {
        this.expDocente = expDocente;
    }

    public ClasseExpRelevante getExpRelevante() {
        return expRelevante;
    }

    public void setExpRelevante(ClasseExpRelevante expRelevante) {
        this.expRelevante = expRelevante;
    }

    public ClasseTitulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(ClasseTitulacao titulacao) {
        this.titulacao = titulacao;
    }
    
    public String getDadosText(){
        
        return dados.getNome() + "\n"
               + dados.getEndereço() + "\n"
                + dados.getTelefone() + "\n"
                + dados.getCpf() + "\n"
                + dados.getRegistro() + "\n"
                + dados.getEmail();
    }
    
}

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
public class ClasseDados {
    private String nome;
    private String endereço;
    private String email;
    private String cpf;
    private String registro;
    private String telefone;

//    public ClasseDados(String nome, String endereço, String email, String cpf, String registro, String telefone) {
//        this.nome = nome;
//        this.endereço = endereço;
//        this.email = email;
//        this.cpf = cpf;
//        this.registro = registro;
//        this.telefone = telefone;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}

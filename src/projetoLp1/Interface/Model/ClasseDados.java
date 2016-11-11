
package projetoLp1.Interface.Model;
import java.io.Serializable;

public class ClasseDados implements Serializable{
    private String nome;
    private String endereço;
    private String email;
    private String cpf;
    private String registro;
    private String telefone;

    public ClasseDados(){
        
    }
    
    public ClasseDados(String nome, String endereço, String email, String cpf, String registro, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.email = email;
        this.cpf = cpf;
        this.registro = registro;
        this.telefone = telefone;
    }
    
    public void setDados(String nome, String endereço, String email, String cpf, String registro, String telefone){
        this.nome = nome;
        this.endereço = endereço;
        this.email = email;
        this.cpf = cpf;
        this.registro = registro;
        this.telefone = telefone;
    }

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

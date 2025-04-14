package nubank.dto;

import java.math.BigDecimal;

public class UsuarioCadastroDTO {

    private String nome;
    private String email;
    private String senha;
    private BigDecimal saldo;

    public UsuarioCadastroDTO() {}

    public UsuarioCadastroDTO(String nome, String email, String senha, BigDecimal saldo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Governo {
    private int codigo;
    private String secretaria;
    private int n_funcionarios;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public int getN_funcionarios() {
        return n_funcionarios;
    }

    public void setN_funcionarios(int n_funcionarios) {
        this.n_funcionarios = n_funcionarios;
    }

    @Override
    public String toString() {
        return "Governo{" + "secretaria=" + secretaria + '}';
    }
}

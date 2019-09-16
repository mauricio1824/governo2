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
    private String secetaria;
    private int n_funcionários;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSecetaria() {
        return secetaria;
    }

    public void setSecetaria(String secetaria) {
        this.secetaria = secetaria;
    }

    public int getN_funcionários() {
        return n_funcionários;
    }

    public void setN_funcionários(int n_funcionários) {
        this.n_funcionários = n_funcionários;
    }

    @Override
    public String toString() {
        return "Governo{" + "secetaria=" + secetaria + '}';
    }
}

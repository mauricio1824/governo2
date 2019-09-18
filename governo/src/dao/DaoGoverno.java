/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Governo;

public class DaoGoverno {
    
    public static boolean inserir(Governo objeto) {
        String sql = "INSERT INTO governo (secretaria, n_funcionarios) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getSecretaria());
            ps.setInt(2, objeto.getN_funcionarios());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        Governo objeto = new Governo();
        objeto.setSecretaria("Secretaria da Educação");
        objeto.setN_funcionarios(50);
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    public static boolean alterar(Governo objeto) {
        String sql = "UPDATE governo SET secretaria = ?, n_funcionarios = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getSecretaria()); 
            ps.setInt(2, objeto.getN_funcionarios());
            ps.setInt(3, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static boolean excluir(Governo objeto) {
        String sql = "DELETE FROM governo WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}

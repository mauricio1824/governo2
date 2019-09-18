/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoGoverno;
import javax.swing.JOptionPane;
import modelo.Governo;
import tela.manutencao.ManutencaoGoverno;

public class ControladorGoverno {

     public static void inserir(ManutencaoGoverno man){
        Governo objeto = new Governo();
        objeto.setSecretaria(man.jtfSecretaria.getText());
        objeto.setN_funcionarios(Integer.parseInt(man.jtfN_funcionarios.getText()));
        boolean resultado = DaoGoverno.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
      public static void alterar(ManutencaoGoverno man){
        Governo objeto = new Governo();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setSecretaria(man.jtfSecretaria.getText());
        objeto.setN_funcionarios(Integer.parseInt(man.jtfN_funcionarios.getText()));
        boolean resultado = DaoGoverno.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void excluir(ManutencaoGoverno man){
        Governo objeto = new Governo();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        boolean resultado = DaoGoverno.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }


    
}

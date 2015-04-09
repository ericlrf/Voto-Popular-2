/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author zmax
 */
public enum Opcoes {

    OPCAO1("Alunos"), OPCAO2("Professores");
    
    public String valor;

    private Opcoes(String valor) {
        this.valor = valor;
    }
    
    public String getValor() {
        return valor;
    }
}

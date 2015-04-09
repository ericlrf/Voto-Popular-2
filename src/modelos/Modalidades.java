/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author zmax
 */
public enum Modalidades {

    MODALIDADE1("Afiliado sem despesas custeadas"),
    MODALIDADE2("Afiliado com despesas custeadas"),
    MODALIDADE3("Convidado sem concorrer às premiações"),
    MODALIDADE4("Voltado para educação especial");
    
    public String valor;

    private Modalidades(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

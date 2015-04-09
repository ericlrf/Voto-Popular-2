/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author zmax
 */
public enum Categorias {

    CATEGORIA1("Iniciação à Pesquisa", Opcoes.OPCAO1), 
    CATEGORIA2("Divulgação Científica", Opcoes.OPCAO1),
    CATEGORIA3("Incentivo à Pesquisa", Opcoes.OPCAO1), 
    CATEGORIA4("Desenvolvimento Tecnológico", Opcoes.OPCAO1),
    CATEGORIA5("Educação Científica", Opcoes.OPCAO2);

    public String valor;
    public Opcoes opcao;

    private Categorias(String valor, Opcoes opcao) {
        this.valor = valor;
        this.opcao = opcao;
    }

    public String getValor() {
        return valor;
    }
    
    public Opcoes getOpcao() {
        return opcao;
    }
}

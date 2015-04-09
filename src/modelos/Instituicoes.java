/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author zmax
 */
public enum Instituicoes {
    

    public String valor;
    public Estados estado;

    private Instituicoes(String valor, Estados estado) {
        this.valor = valor;
        this.estado = estado;
    }
    
    public String getValor() {
        return valor;
    }
    
    public Estados getEstado() {
        return estado;
    }
}

/**
 * A sequencia dos trabalhos segue a ordem das tabelas em .PDF disponiveis 
 * no site: http://www.espacociencia.pe.gov.br/noticias/trabalhos-ciencia-jovem-2014/
 * conforme a disposição dos documentos abaixo: 
 * 
 * Iniciação à Pesquisa
 * Iniciação à Pesquisa – Com Custeio
 * Divulgação Científica
 * Divulgação Científica – Com Custeio
 * Incentivo à Pesquisa
 * Incentivo à Pesquisa – Com Custeio
 * Desenvolvimento Tecnológico
 * Desenvolvimento Tecnológico – Com Custeio
 * Educação Científica
 * 
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author zmax
 */
public enum Trabalhos {


    public String valor;
    public Categorias categoria;
    public Modalidades modalidade;
    public Instituicoes instituicao;

    private Trabalhos(String valor, Categorias categoria, Modalidades modalidade, Instituicoes instituicao) {
        this.valor = valor;
        this.categoria = categoria;
        this.modalidade = modalidade;
        this.instituicao = instituicao;
    }

    public String getValor() {
        return valor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public Modalidades getModalidade() {
        return modalidade;
    }

    public Instituicoes getInstituicao() {
        return instituicao;
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

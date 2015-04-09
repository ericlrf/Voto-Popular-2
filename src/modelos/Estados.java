/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author zmax
 */
public enum Estados {

    AC("Acre"), AL("Alagoas"), AM("Amazonas"), AP("Amapá"), BA("Bahia"), 
    CE("Ceará"), DF("Distrito Federal"), ES("Espírito Santo"), GO("Goiás"),
    MA("Maranhão"), MG("Minas Gerais"), MS("Mato Grosso do Sul"), MT("Mato Grosso"), 
    PA("Pará"), PB("Paraíba"), PE("Pernambuco"), PI("Piauí"), PR("Paraná"),
    RJ("Rio de Janeiro"), RN("Rio Grande do Norte"), RO("Rondônia"), RR("Roraima"), 
    RS("Rio Grande do Sul"), SC("Santa Catarina"), SE("Sergipe"), SP("São Paulo"), 
    TO("Tocantins");
    
    public String valor;

    private Estados(String valor) {
        this.valor = valor;
    }
    
    public String getValor() {
        return valor;
    }

}

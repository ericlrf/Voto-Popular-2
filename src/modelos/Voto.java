/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author zmax
 */
public class Voto implements Comparable<Voto>{
    
    Trabalhos nome;
    int quantidade;

    public Voto(Trabalhos nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Trabalhos getNome() {
        return nome;
    }

    public void setNome(Trabalhos nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome.valor + " - " + quantidade + "\n";
    }

    @Override
    public int compareTo(Voto outroVoto) {
        if (this.quantidade > outroVoto.quantidade) {
            return -1;
        }
        if (this.quantidade < outroVoto.quantidade) {
            return 1;
        }
        return 0;
    }
}

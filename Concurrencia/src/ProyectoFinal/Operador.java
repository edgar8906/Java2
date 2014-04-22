package ProyectoFinal;

import java.io.Serializable;

/**
 *
 * @author edgar
 */
public class Operador implements Serializable{
private String compania;
private long numero;
private int recarga;

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }
    
    @Override
    public String toString() {
        return "Operardor" + "compania=" + compania + ", numero=" + numero + ", recarga=" + recarga;
    }
    public Operador(String compania, long numero, int recarga) {
        this.compania = compania;
        this.numero = numero;
        this.recarga = recarga;
    }
    
}

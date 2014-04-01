package Collections;

public class Opcion {
    private String titulo;
    private boolean valor;
    private int id;

    public Opcion(String titulo, boolean valor, int id) {
        this.titulo = titulo;
        this.valor = valor;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

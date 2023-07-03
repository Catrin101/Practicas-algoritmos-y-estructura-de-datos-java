package ventanilla;

public class Cliente {
    private int id;
    private int llegada;

    public Cliente(int id, int llegada) {
        this.id = id;
        this.llegada = llegada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLlegada() {
        return llegada;
    }

    public void setLlegada(int llegada) {
        this.llegada = llegada;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Id = " + id + ", Llegada = " + llegada + '}';
    }
}

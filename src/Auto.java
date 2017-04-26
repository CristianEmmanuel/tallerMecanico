/**
 * Created by cristian on 25/04/17.
 */
public class Auto {

    private String marca, modelo, color;
    private int valor, acelerar, frenar;

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setValor(int valor) { this.valor = valor; }
    public int getValor() { return valor; }
}

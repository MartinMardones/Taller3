package org.example;

public class Notebook extends ObjetoTecnologico{
    private String resolucionPantalla;

    private String tipoTeclado;

    private String bateria;

    public Notebook(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, int año, String precio, int stock , String resolucionPantalla, String tipoTeclado, String bateria) {
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, año, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.tipoTeclado = tipoTeclado;
        this.bateria = bateria;
    }

    public String toString() {
        return super.marca + "," + super.memoriaRam + "," + super.memoriaAlmacenamiento + "," + super.procesador + "," + super.modelo + "," + super.año + "," + super.precio + "," + super.stock + "," + this.resolucionPantalla + "," + this.tipoTeclado + "," + this.bateria;
    }
}

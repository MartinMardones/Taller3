package org.example;

public class Tablet extends ObjetoTecnologico {
    private String resolucionPantalla;

    private String accesorios;

    public Tablet(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, int año, String precio, int stock , String resolucionPantalla, String accesorios) {
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, año, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.accesorios = accesorios;
    }

    public String toString() {
        return super.marca + "," + super.memoriaRam + "," + super.memoriaAlmacenamiento + "," + super.procesador + "," + super.modelo + "," + super.año + "," + super.precio + "," + super.stock + "," + this.resolucionPantalla + "," + this.accesorios;
    }
}

package org.example;

public class PcEscritorio extends ObjetoTecnologico {
    private String tarjetaVideo;

    private String fuentePoder;

    private String chasis;

    private Pantalla pantalla;

    public PcEscritorio(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, int año, String precio, int stock , String tarjetaVideo, String fuentePoder, String chasis) {
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, año, precio, stock);
        this.tarjetaVideo = tarjetaVideo;
        this.fuentePoder = fuentePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }

    public String toString() {
        return super.marca + "," + super.memoriaRam + "," + super.memoriaAlmacenamiento + "," + super.procesador + "," + super.modelo + "," + super.año + "," + super.precio + "," + super.stock + "," + this.tarjetaVideo + "," + this.fuentePoder + "," + this.chasis + "," +this.pantalla;
    }
}

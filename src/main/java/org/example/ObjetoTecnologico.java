package org.example;

public class ObjetoTecnologico {

    protected String marca;
    protected String memoriaRam;

    protected String memoriaAlmacenamiento;
    protected String procesador;

    protected String modelo;

    protected int año;

    protected String precio;

    protected int stock;


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoriaRam() {
        return this.memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getMemoriaAlmacenamiento() {
        return this.memoriaAlmacenamiento;
    }

    public void setMemoriaAlmacenamiento(String memoriaAlmacenamiento) {
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
    }

    public String getProcesador() {
        return this.procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getPrecio() {
        return this.precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ObjetoTecnologico(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, int año, String precio, int stock) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.memoriaAlmacenamiento = this.memoriaAlmacenamiento;
        this.procesador = this.procesador;
        this.modelo = this.modelo;
        this.año = año;
        this.precio = this.precio;
        this.stock = this.stock;
    }

    public String toString(){
        return "Especificaciones: "+this.marca+" "+this.memoriaRam+" "+this.memoriaAlmacenamiento+" "+this.procesador+" "+this.modelo+" "+this.modelo+" "+this.año+", precio: "+this.precio+", stock: "+this.stock;
    }


}

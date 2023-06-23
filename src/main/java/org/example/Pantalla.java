package org.example;

public class Pantalla extends ObjetoTecnologico{
    public Pantalla(String marca,  String modelo, int año) {
        super(marca,modelo, memoriaAlmacenamiento, procesador, modelo, año, precio, stock);
    }

    public String toString() {
        return super.marca + "," + super.modelo + "," + super.año;
    }


}

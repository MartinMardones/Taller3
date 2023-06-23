package org.example;

public class Ejecucion {
    public static void main{
        Ejecucion ejecucion= new ejecucion();
        ejecucion.inicializar();
    }
    public void inicializar(){
        TiendaTecnologica tiendaTecnologica = new tiendaTecnologica();

        tiendaTecnologica.agregarCliente("Alexis","Sanchez");

        tiendaTecnologica.agregarCliente("Mario","Mario","10.031.111-1","10031111121");

        Cliente cliente1 = new Cliente("Arturo","Prat","10.000.000-0","10000000021");
        tiendaTecnologica.agregarCliente(cliente11);

        Cliente cliente2 = new Cliente("Lebron", "James", "20.200.200-0", "20200200021");
        tiendaTecnologica.agregarCliente(cliente22);



    }


}

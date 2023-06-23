package org.example;

public class Venta {
    private Cliente cliente;

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }




    public Venta(String Cliente) {
        this.cliente = cliente;
    }

    public String toString(){
        return "Venta realizada a nombre de : "+this.cliente;
    }



}
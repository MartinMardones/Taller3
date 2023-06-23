package org.example;
import java.util.List;
import java.util.ArrayList;
public class TiendaTecnologica {
    public String direccion;
    public String catalogoDispositivos;

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCatalogoDispositivos() {
        return this.catalogoDispositivos;
    }

    public void setCatalogoDispositivos(String catalogoDispositivos) {
        this.catalogoDispositivos = catalogoDispositivos;
    }

    public TiendaTecnologica(String direccion, String catalogoDispositivos) {
        this.direccion = direccion;
        this.catalogoDispositivos = catalogoDispositivos;
    }

    public String toString(){
        return "Direccion: "+this.direccion+", catalogo de dispositivos: "+this.catalogoDispositivos;
    }

    private List<Cliente> clientes;
    private List<ObjetoTecnologico> objetoTecnologicos;

    public TiendaTecnologica(){
        this.objetoTecnologicos = new ArrayList<>();
    }

    public boolean agregarCliente(String nombre, String apellido, String correoElectronico, String numeroTelefonico, String estadoCivil, String ciudad){
        if(buscarCliente(nombre, apellido) == null) {
            Cliente cliente = new Cliente (nombre, apellido, correoElectronico, numeroTelefonico, estadoCivil, ciudad);
            this.clientes.add(cliente);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean agregarCliente(Cliente cliente){
        if(buscarCliente(cliente.getApellido(),cliente.getNombre()) == null){
            this.clientes.add(cliente);
            return true;
        }
        else{
            return false;
        }
    }

    public Cliente buscarCliente(String apellido, String nombre){
        for(Cliente cliente : this.clientes){
            if(cliente.getNombre().equals(nombre) && cliente.getApellido().equals(apellido)){
                return cliente;
            }
        }
        return null;
    }
    public List buscarCliente(String nombre, String alexis, String raul){
        ArrayList<Cliente> clientes = new ArrayList<>();
        for(Cliente cliente : this.clientes){
            if(cliente.getNombre().equals(nombre)){
                clientes.add(cliente);
            }
        }
        return clientes;
    }

    public boolean agregarObjetoTecnologico(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, int año, String precio, int stock){
        if(buscarObjetoTecnologico(marca, precio) == null) {
            ObjetoTecnologico objetoTecnologico = new ObjetoTecnologico (marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, año, precio, stock);
            this.objetoTecnologicos.add(objetoTecnologico);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean agregarObjetoTecnologico(ObjetoTecnologico objetoTecnologico){
        if(buscarObjetoTecnologico(objetoTecnologico.getMarca(),objetoTecnologico.getModelo()) == null){
            this.objetoTecnologicos.add(objetoTecnologico);
            return true;
        }
        else{
            return false;
        }
    }

    public ObjetoTecnologico buscarObjetoTecnologico(String marca, String modelo){
        for(ObjetoTecnologico objetoTecnologico : this.objetoTecnologicos){
            if(objetoTecnologico.getMarca().equals(marca) && objetoTecnologico.getPrecio().equals(modelo)){
                return objetoTecnologico;
            }
        }
        return null;
    }
    public List buscarObjetoTecnologicoMarca(String marca, String Samsung, String Nokia){
        ArrayList<ObjetoTecnologico> objetoTecnologicos = new ArrayList<>();
        for(ObjetoTecnologico objetoTecnologico : this.objetoTecnologicos){
            if(objetoTecnologico.getMarca().equals(objetoTecnologico)){
                objetoTecnologicos.add(objetoTecnologico);
            }
        }
        return objetoTecnologicos;
    }

    public List buscarObjetoTecnologicoModelo(String modelo, String P400, String Tuf15){
        ArrayList<ObjetoTecnologico> objetoTecnologicos = new ArrayList<>();
        for(ObjetoTecnologico objetoTecnologico : this.objetoTecnologicos){
            if(objetoTecnologico.getModelo().equals(objetoTecnologico)){
                objetoTecnologicos.add(objetoTecnologico);
            }
        }
        return objetoTecnologicos;
    }



}

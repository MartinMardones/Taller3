package org.example;

public class Cliente {
public String nombre;
public String apellido;
public String correoElectronico;
public String numeroTelefonico;
public String estadoCivil;
public String ciudad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Cliente(String nombre, String apellido,String correoElectronico, String numeroTelefonico, String estadoCivil, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonico = numeroTelefonico;
        this.estadoCivil = estadoCivil;
        this.ciudad = ciudad;
    }

    public String toString(){
        return "Nombre: "+this.nombre+" "+this.apellido+ "Contacto:"+this.correoElectronico+ " "+this.numeroTelefonico+ "Datos Personales:"+this.estadoCivil+" "+this.ciudad;
    }
}

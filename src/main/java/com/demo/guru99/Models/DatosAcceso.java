package com.demo.guru99.Models;

public class DatosAcceso {

    String usuario;
    String clave;

    public DatosAcceso(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}

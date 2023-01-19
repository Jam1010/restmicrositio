package com.microempresa.rest.dto;

import java.io.Serializable;
import java.util.List;

public class EmpresaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
  
    private Long id; 
    private String nombre;  
    private byte[] imagen; 
    private String descripcion;
    private String emailContacto;
    private String telefonoContacto;
    private String nombreContacto;
    private String condicionesEntrega;
    private List<CategoriaDTO> categoriaList;

    public EmpresaDTO() {
    }

    public EmpresaDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getCondicionesEntrega() {
        return condicionesEntrega;
    }

    public void setCondicionesEntrega(String condicionesEntrega) {
        this.condicionesEntrega = condicionesEntrega;
    }

    public List<CategoriaDTO> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<CategoriaDTO> categoriaList) {
        this.categoriaList = categoriaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof EmpresaDTO)) {
            return false;
        }
        EmpresaDTO other = (EmpresaDTO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmpresaDTO[ id=" + id + " ]";
    }
    
}

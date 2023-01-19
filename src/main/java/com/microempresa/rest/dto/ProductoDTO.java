package com.microempresa.rest.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProductoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String nombre;
    private String descripcion;
    @JsonIgnore
    private byte[] imagen;
    private Long precio;
    private CategoriaDTO idCategoria;

    public ProductoDTO() {
    }

    public ProductoDTO(Long id) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public CategoriaDTO getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(CategoriaDTO idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ProductoDTO)) {
            return false;
        }
        ProductoDTO other = (ProductoDTO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductoDTO[ id=" + id + " ]";
    }
    
}


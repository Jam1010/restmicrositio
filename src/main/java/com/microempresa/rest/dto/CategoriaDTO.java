package com.microempresa.rest.dto;

import java.io.Serializable;
import java.util.List;




public class CategoriaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String nombre;
    private String descripcion;
    private EmpresaDTO idEmpresa;
    private List<ProductoDTO> productoList;

    public CategoriaDTO() {
    }

    public CategoriaDTO(Long id) {
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

    public EmpresaDTO getIdEmpresaDTO() {
        return idEmpresa;
    }

    public void setIdEmpresaDTO(EmpresaDTO idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public List<ProductoDTO> getProductoDTOList() {
        return productoList;
    }

    public void setProductoDTOList(List<ProductoDTO> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CategoriaDTO)) {
            return false;
        }
        CategoriaDTO other = (CategoriaDTO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategoriaDTO[ id=" + id + " ]";
    }
    
}


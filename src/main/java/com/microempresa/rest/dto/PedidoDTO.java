package com.microempresa.rest.dto;

import java.io.Serializable;
import java.util.Date;


public class PedidoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Long id;
    private Long cantidad;
    private Date fechaEntrega;
    private Long valorPedido;
    private ProductoDTO idProducto;
    private ClienteDTO idCliente;

    public PedidoDTO() {
    }

    public PedidoDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Long getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(Long valorPedido) {
        this.valorPedido = valorPedido;
    }

    public ProductoDTO getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(ProductoDTO idProducto) {
        this.idProducto = idProducto;
    }

    public ClienteDTO getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(ClienteDTO idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PedidoDTO)) {
            return false;
        }
        PedidoDTO other = (PedidoDTO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PedidoDTO[ id=" + id + " ]";
    }
    
}

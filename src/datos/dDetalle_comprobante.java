/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author BeltariT
 */
@Entity
@Table(name = "dDetalle_comprobante")
public class dDetalle_comprobante implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDetalleComprobante")
    Long idDetalleComprobante;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    Date fecha;
    @Column(name = "precio")
    double precio;
    @Column(name = "cantidad")
    int cantidad;
    @Column(name = "comprobante")
    int comprobante;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_idComprobantes")
    public dComprobantes comprobantes;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_idProductos")
    public dProductos productos;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "detalleComprobante")
    public List<dStock> stock;

    public dDetalle_comprobante(Date fecha, double precio, int cantidad, int comprobante, dComprobantes comprobantes, dProductos productos, List<dStock> stock) {
        this.fecha = fecha;
        this.precio = precio;
        this.cantidad = cantidad;
        this.comprobante = comprobante;
        this.comprobantes = comprobantes;
        this.productos = productos;
        this.stock = stock;
    }

    public dDetalle_comprobante() {
    }

    public Long getIdDetalleComprobante() {
        return idDetalleComprobante;
    }

    public void setIdDetalleComprobante(Long idDetalleComprobante) {
        this.idDetalleComprobante = idDetalleComprobante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getComprobante() {
        return comprobante;
    }

    public void setComprobante(int comprobante) {
        this.comprobante = comprobante;
    }

    public dComprobantes getComprobantes() {
        return comprobantes;
    }

    public void setComprobantes(dComprobantes comprobantes) {
        this.comprobantes = comprobantes;
    }

    public dProductos getProductos() {
        return productos;
    }

    public void setProductos(dProductos productos) {
        this.productos = productos;
    }

    public List<dStock> getStock() {
        return stock;
    }

    public void setStock(List<dStock> stock) {
        this.stock = stock;
    }
    
    
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author BeltariT
 */
@Entity
@Table(name = "dStock")
public class dStock implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idStock")        
    Long idStock;
    @Column(name = "cantidad")
    int cantidad;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    Date fecha;
    @Column(name = "salida")
    int salida;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_idProductos")
    public dProductos productos;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_idDetalleComprobante")
    public dDetalle_comprobante detalleComprobante;

    public dStock(int cantidad, Date fecha, int salida, dProductos productos, dDetalle_comprobante detalleComprobante) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.salida = salida;
        this.productos = productos;
        this.detalleComprobante = detalleComprobante;
    }

    public dStock() {
    }

    public Long getIdStock() {
        return idStock;
    }

    public void setIdStock(Long idStock) {
        this.idStock = idStock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public dProductos getProductos() {
        return productos;
    }

    public void setProductos(dProductos productos) {
        this.productos = productos;
    }

    public dDetalle_comprobante getDetalleComprobante() {
        return detalleComprobante;
    }

    public void setDetalleComprobante(dDetalle_comprobante detalleComprobante) {
        this.detalleComprobante = detalleComprobante;
    }

    
    
}

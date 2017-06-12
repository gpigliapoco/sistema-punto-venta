/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.Serializable;
import java.util.List;
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

/**
 *
 * @author BeltariT
 */

@Entity
@Table(name = "productos")
public class dProductos implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idProductos")        
    Long idProductos;
    @Column(name = "nombre")
    String nombre;
    @Column(name = "peso")
    Double peso;
    @Column(name = "descripcion")
    String descripcion;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "productos")
    public List<dDetalle_comprobante> detalle_comprobante;
   @OneToMany(fetch = FetchType.LAZY,mappedBy = "productos")
    public List<dStock> stock;

    public dProductos(String nombre, Double peso, String descripcion, List<dDetalle_comprobante> detalle_comprobante, List<dStock> stock) {
        this.nombre = nombre;
        this.peso = peso;
        this.descripcion = descripcion;
        this.detalle_comprobante = detalle_comprobante;
        this.stock = stock;
    }

    public dProductos() {
    }

    public Long getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Long idProductos) {
        this.idProductos = idProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<dDetalle_comprobante> getDetalle_comprobante() {
        return detalle_comprobante;
    }

    public void setDetalle_comprobante(List<dDetalle_comprobante> detalle_comprobante) {
        this.detalle_comprobante = detalle_comprobante;
    }

    public List<dStock> getStock() {
        return stock;
    }

    public void setStock(List<dStock> stock) {
        this.stock = stock;
    }

  
    
}

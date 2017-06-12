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
@Table(name = "comprobantes")
public class dComprobantes implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idComprobantes")        
    Long idComprobantes;
    @Column(name = "comprobante")
    int comprobante;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    Date fecha;
    @Column(name = "descripcion")
    String descripcion;
    @Column(name = "tipoDeComprobante")
    String tipoDeComprobante;
    @Column(name = "importe")
    double importe;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_idOperadores")
    public dOperadores operadores;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "comprobantes")
    public List<dDetalle_comprobante> detalleComprobante;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "comprobantes")
    public List<dContabilidad> contabilidad;

    public dComprobantes(int comprobante, Date fecha, String descripcion, String tipoDeComprobante, double importe, dOperadores operadores, List<dDetalle_comprobante> detalleComprobante, List<dContabilidad> contabilidad) {
        this.comprobante = comprobante;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipoDeComprobante = tipoDeComprobante;
        this.importe = importe;
        this.operadores = operadores;
        this.detalleComprobante = detalleComprobante;
        this.contabilidad = contabilidad;
    }

    public dComprobantes() {
    }

    public Long getIdComprobantes() {
        return idComprobantes;
    }

    public void setIdComprobantes(Long idComprobantes) {
        this.idComprobantes = idComprobantes;
    }

    public int getComprobante() {
        return comprobante;
    }

    public void setComprobante(int comprobante) {
        this.comprobante = comprobante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    public void setTipoDeComprobante(String tipoDeComprobante) {
        this.tipoDeComprobante = tipoDeComprobante;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public dOperadores getOperadores() {
        return operadores;
    }

    public void setOperadores(dOperadores operadores) {
        this.operadores = operadores;
    }

    public List<dDetalle_comprobante> getDetalleComprobante() {
        return detalleComprobante;
    }

    public void setDetalleComprobante(List<dDetalle_comprobante> detalleComprobante) {
        this.detalleComprobante = detalleComprobante;
    }

    public List<dContabilidad> getContabilidad() {
        return contabilidad;
    }

    public void setContabilidad(List<dContabilidad> contabilidad) {
        this.contabilidad = contabilidad;
    }
    
    
   
}

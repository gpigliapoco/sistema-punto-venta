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
@Table(name = "dContabilidad")
public class dContabilidad implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinColumn(name = "idContabilidad")        
    Long idContabilidad;
    @Column(name = "flete")
    int flete;
    @Column(name = "descarga")
    int descarga;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    Date fecha;
    @Column(name = "importe")
    double importe;
    @Column(name = "comprobante")
    int comprobante;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_idComprobante")
    public dComprobantes comprobantes;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_idOperadores")
    public dOperadores operadores;

    public dContabilidad(int flete, int descarga, Date fecha, double importe, int comprobante, dComprobantes comprobantes, dOperadores operadores) {
        this.flete = flete;
        this.descarga = descarga;
        this.fecha = fecha;
        this.importe = importe;
        this.comprobante = comprobante;
        this.comprobantes = comprobantes;
        this.operadores = operadores;
    }

    public dContabilidad() {
    }

    public Long getIdContabilidad() {
        return idContabilidad;
    }

    public void setIdContabilidad(Long idContabilidad) {
        this.idContabilidad = idContabilidad;
    }

    public int getFlete() {
        return flete;
    }

    public void setFlete(int flete) {
        this.flete = flete;
    }

    public int getDescarga() {
        return descarga;
    }

    public void setDescarga(int descarga) {
        this.descarga = descarga;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
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

    public dOperadores getOperadores() {
        return operadores;
    }

    public void setOperadores(dOperadores operadores) {
        this.operadores = operadores;
    }

   
}

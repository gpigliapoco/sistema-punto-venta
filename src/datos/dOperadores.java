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
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 *
 * @author BeltariT
 */
@Entity
@Table(name = "operadores")
public class dOperadores implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idOperadores")        
    long idOperadores;
    @Column(name = "nombre")
    String nombre;
    @Column(name = "direccion")
    String direccion;
    @Column(name = "cuit")
    String cuit;
    @Column(name = "ciudad")
    String ciudad;
    @Column(name = "provincia")
    String provincia;
    @Column(name = "tel")
    String tel;
    @Column(name = "observacion")
    String observacion;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "operadores")
    public List<dComprobantes> comprobantes;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "operadores")
    public List<dContabilidad> contabilidad;

    public dOperadores(String nombre, String direccion, String cuit, String ciudad, String provincia, String tel, String observacion, List<dComprobantes> comprobantes, List<dContabilidad> contabilidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuit = cuit;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.tel = tel;
        this.observacion = observacion;
        this.comprobantes = comprobantes;
        this.contabilidad = contabilidad;
    }

    public dOperadores() {
    }

    public long getIdOperadores() {
        return idOperadores;
    }

    public void setIdOperadores(long idOperadores) {
        this.idOperadores = idOperadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public List<dComprobantes> getComprobantes() {
        return comprobantes;
    }

    public void setComprobantes(List<dComprobantes> comprobantes) {
        this.comprobantes = comprobantes;
    }

    public List<dContabilidad> getContabilidad() {
        return contabilidad;
    }

    public void setContabilidad(List<dContabilidad> contabilidad) {
        this.contabilidad = contabilidad;
    }

    
            
    
}

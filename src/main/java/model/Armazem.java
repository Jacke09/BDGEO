/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "armazens_2014")
public class Armazem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String objetoId;
    @Column(name = "uf")
    private String uf;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "cap_ton")
    private double cap_ton;
    @Column(name = "gepcodigo")
    private int gepcodigo;
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getObjetoId() {
        return objetoId;
    }

    public void setObjetoId(String objetoId) {
        this.objetoId = objetoId;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public double getCap_ton() {
        return cap_ton;
    }

    public void setCap_ton(double cap_ton) {
        this.cap_ton = cap_ton;
    }

    public int getGepcodigo() {
        return gepcodigo;
    }

    public void setGepcodigo(int gepcodigo) {
        this.gepcodigo = gepcodigo;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Armazem{" + "gid=" + gid + ", objetoId=" + objetoId + ", uf=" + uf + ", municipio=" + municipio + ", cap_ton=" + cap_ton + ", gepcodigo=" + gepcodigo + ", geometria=" + geometria + '}';
    }
    
    
    
}

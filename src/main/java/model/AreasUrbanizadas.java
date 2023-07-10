/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "areasurbanizadasdobrasil")
public class AreasUrbanizadas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String objetoId;
    @Column(name = "fid_1")
    private int fid_1;
    @Column(name = "densidade")
    private String densidade;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "codconcurb")
    private String codconcurb;
    @Column(name = "nomeconcur")
    private String nomeconcur;
    @Column(name = "area_geo")
    private int area_geo;
    @Column(name = "shape_leng")
    private int shape_leng;
    @Column(name = "shape_area")
    private int shape_area;
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

    public int getFid_1() {
        return fid_1;
    }

    public void setFid_1(int fid_1) {
        this.fid_1 = fid_1;
    }

    public String getDensidade() {
        return densidade;
    }

    public void setDensidade(String densidade) {
        this.densidade = densidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodconcurb() {
        return codconcurb;
    }

    public void setCodconcurb(String codconcurb) {
        this.codconcurb = codconcurb;
    }

    public String getNomeconcur() {
        return nomeconcur;
    }

    public void setNomeconcur(String nomeconcur) {
        this.nomeconcur = nomeconcur;
    }

    public int getArea_geo() {
        return area_geo;
    }

    public void setArea_geo(int area_geo) {
        this.area_geo = area_geo;
    }

    public int getShape_leng() {
        return shape_leng;
    }

    public void setShape_leng(int shape_leng) {
        this.shape_leng = shape_leng;
    }

    public int getShape_area() {
        return shape_area;
    }

    public void setShape_area(int shape_area) {
        this.shape_area = shape_area;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "AreasUrabanizadas{" + "gid=" + gid + ", objetoId=" + objetoId + ", fid_1=" + fid_1 + ", densidade=" + densidade + ", tipo=" + tipo + ", codconcurb=" + codconcurb + ", nomeconcur=" + nomeconcur + ", area_geo=" + area_geo + ", shape_leng=" + shape_leng + ", shape_area=" + shape_area + ", geometria=" + geometria + '}';
    }
    
    
    
}

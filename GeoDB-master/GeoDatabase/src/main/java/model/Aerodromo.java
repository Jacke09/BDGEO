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

//Indica que a classe é uma entidade JPA e está associada a uma tabela no banco de dados.
@Entity
//Especifica o nome da tabela no banco de dados que está mapeada para essa entidade.
@Table(name = "outros_aerodromos_2014")
public class Aerodromo {
    //Indica que a variável gid é a chave primária da tabela.
    @Id
    //Especifica que o valor da chave primária será gerado automaticamente pelo banco de dados.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    //Indica o mapeamento para uma coluna na tabela do banco de dados.
    @Column(name = "objectid")
    private String objetoId;
    @Column(name = "nm_municip")
    private String municipio;
    @Column(name = "tipoaero")
    private String tipoaero;
    @Column(name = "nome")
    private String nome;
    @Column(name = "uf")
    private String uf;
    @Column(name = "cod_uso")
    private String cod_uso;
    @Column(name = "cod_icao")
    private String cod_icao;
    @Column(name = "geocodigo")
    private int geocodigo;
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

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipoaero() {
        return tipoaero;
    }

    public void setTipoaero(String tipoaero) {
        this.tipoaero = tipoaero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCod_uso() {
        return cod_uso;
    }

    public void setCod_uso(String cod_uso) {
        this.cod_uso = cod_uso;
    }

    public String getCod_icao() {
        return cod_icao;
    }

    public void setCod_icao(String cod_icao) {
        this.cod_icao = cod_icao;
    }

    public int getGeocodigo() {
        return geocodigo;
    }

    public void setGeocodigo(int geocodigo) {
        this.geocodigo = geocodigo;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Aerodromo{" + "gid=" + gid + ", objetoId=" + objetoId + ", municipio=" + municipio + ", tipoaero=" + tipoaero + ", nome=" + nome + ", uf=" + uf + ", cod_uso=" + cod_uso + ", cod_icao=" + cod_icao + ", geocodigo=" + geocodigo + ", geometria=" + geometria + '}';
    }
    
    
     
    
    
}

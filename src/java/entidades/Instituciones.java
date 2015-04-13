/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Soporte
 */
@Entity
@Table(name = "instituciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instituciones.findAll", query = "SELECT i FROM Instituciones i"),
    @NamedQuery(name = "Instituciones.findByInstId", query = "SELECT i FROM Instituciones i WHERE i.instId = :instId"),
    @NamedQuery(name = "Instituciones.findByInstNombre", query = "SELECT i FROM Instituciones i WHERE i.instNombre = :instNombre"),
    @NamedQuery(name = "Instituciones.findByInstDireccion", query = "SELECT i FROM Instituciones i WHERE i.instDireccion = :instDireccion"),
    @NamedQuery(name = "Instituciones.findByInstTelefono", query = "SELECT i FROM Instituciones i WHERE i.instTelefono = :instTelefono"),
    @NamedQuery(name = "Instituciones.findByInstDescripcion", query = "SELECT i FROM Instituciones i WHERE i.instDescripcion = :instDescripcion"),
    @NamedQuery(name = "Instituciones.findByInstNit", query = "SELECT i FROM Instituciones i WHERE i.instNit = :instNit"),
    @NamedQuery(name = "Instituciones.findByInstRegFiscal", query = "SELECT i FROM Instituciones i WHERE i.instRegFiscal = :instRegFiscal")})
public class Instituciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "inst_id")
    private Integer instId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "inst_nombre")
    private String instNombre;
    @Size(max = 500)
    @Column(name = "inst_direccion")
    private String instDireccion;
    @Size(max = 10)
    @Column(name = "inst_telefono")
    private String instTelefono;
    @Size(max = 1024)
    @Column(name = "inst_descripcion")
    private String instDescripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "inst_nit")
    private String instNit;
    @Size(max = 20)
    @Column(name = "inst_reg_fiscal")
    private String instRegFiscal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "instId")
    private Collection<Proyectos> proyectosCollection;
    @JoinColumn(name = "pais_id", referencedColumnName = "pais_id")
    @ManyToOne(optional = false)
    private Paises paisId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "instId")
    private Collection<Representantes> representantesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "instId")
    private Collection<Historicos> historicosCollection;
    @OneToMany(mappedBy = "instId")
    private Collection<FacilitadoresTecnicos> facilitadoresTecnicosCollection;

    public Instituciones() {
    }

    public Instituciones(Integer instId) {
        this.instId = instId;
    }

    public Instituciones(Integer instId, String instNombre, String instNit) {
        this.instId = instId;
        this.instNombre = instNombre;
        this.instNit = instNit;
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public String getInstNombre() {
        return instNombre;
    }

    public void setInstNombre(String instNombre) {
        this.instNombre = instNombre;
    }

    public String getInstDireccion() {
        return instDireccion;
    }

    public void setInstDireccion(String instDireccion) {
        this.instDireccion = instDireccion;
    }

    public String getInstTelefono() {
        return instTelefono;
    }

    public void setInstTelefono(String instTelefono) {
        this.instTelefono = instTelefono;
    }

    public String getInstDescripcion() {
        return instDescripcion;
    }

    public void setInstDescripcion(String instDescripcion) {
        this.instDescripcion = instDescripcion;
    }

    public String getInstNit() {
        return instNit;
    }

    public void setInstNit(String instNit) {
        this.instNit = instNit;
    }

    public String getInstRegFiscal() {
        return instRegFiscal;
    }

    public void setInstRegFiscal(String instRegFiscal) {
        this.instRegFiscal = instRegFiscal;
    }

    @XmlTransient
    public Collection<Proyectos> getProyectosCollection() {
        return proyectosCollection;
    }

    public void setProyectosCollection(Collection<Proyectos> proyectosCollection) {
        this.proyectosCollection = proyectosCollection;
    }

    public Paises getPaisId() {
        return paisId;
    }

    public void setPaisId(Paises paisId) {
        this.paisId = paisId;
    }

    @XmlTransient
    public Collection<Representantes> getRepresentantesCollection() {
        return representantesCollection;
    }

    public void setRepresentantesCollection(Collection<Representantes> representantesCollection) {
        this.representantesCollection = representantesCollection;
    }

    @XmlTransient
    public Collection<Historicos> getHistoricosCollection() {
        return historicosCollection;
    }

    public void setHistoricosCollection(Collection<Historicos> historicosCollection) {
        this.historicosCollection = historicosCollection;
    }

    @XmlTransient
    public Collection<FacilitadoresTecnicos> getFacilitadoresTecnicosCollection() {
        return facilitadoresTecnicosCollection;
    }

    public void setFacilitadoresTecnicosCollection(Collection<FacilitadoresTecnicos> facilitadoresTecnicosCollection) {
        this.facilitadoresTecnicosCollection = facilitadoresTecnicosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (instId != null ? instId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instituciones)) {
            return false;
        }
        Instituciones other = (Instituciones) object;
        if ((this.instId == null && other.instId != null) || (this.instId != null && !this.instId.equals(other.instId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Instituciones[ instId=" + instId + " ]";
    }
    
}

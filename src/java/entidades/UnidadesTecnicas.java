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
@Table(name = "unidades_tecnicas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadesTecnicas.findAll", query = "SELECT u FROM UnidadesTecnicas u"),
    @NamedQuery(name = "UnidadesTecnicas.findByUtecId", query = "SELECT u FROM UnidadesTecnicas u WHERE u.utecId = :utecId"),
    @NamedQuery(name = "UnidadesTecnicas.findByUtecNombre", query = "SELECT u FROM UnidadesTecnicas u WHERE u.utecNombre = :utecNombre"),
    @NamedQuery(name = "UnidadesTecnicas.findByUtecDescripcion", query = "SELECT u FROM UnidadesTecnicas u WHERE u.utecDescripcion = :utecDescripcion"),
    @NamedQuery(name = "UnidadesTecnicas.findByUtecUbicacion", query = "SELECT u FROM UnidadesTecnicas u WHERE u.utecUbicacion = :utecUbicacion"),
    @NamedQuery(name = "UnidadesTecnicas.findByUtecTelefono", query = "SELECT u FROM UnidadesTecnicas u WHERE u.utecTelefono = :utecTelefono")})
public class UnidadesTecnicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "utec_id")
    private Integer utecId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "utec_nombre")
    private String utecNombre;
    @Size(max = 500)
    @Column(name = "utec_descripcion")
    private String utecDescripcion;
    @Size(max = 200)
    @Column(name = "utec_ubicacion")
    private String utecUbicacion;
    @Size(max = 10)
    @Column(name = "utec_telefono")
    private String utecTelefono;
    @JoinColumn(name = "dnac_id", referencedColumnName = "dnac_id")
    @ManyToOne(optional = false)
    private DireccionesNacionales dnacId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "utecId")
    private Collection<FacilitadoresTecnicos> facilitadoresTecnicosCollection;
    @OneToMany(mappedBy = "utecId")
    private Collection<Usuarios> usuariosCollection;

    public UnidadesTecnicas() {
    }

    public UnidadesTecnicas(Integer utecId) {
        this.utecId = utecId;
    }

    public UnidadesTecnicas(Integer utecId, String utecNombre) {
        this.utecId = utecId;
        this.utecNombre = utecNombre;
    }

    public Integer getUtecId() {
        return utecId;
    }

    public void setUtecId(Integer utecId) {
        this.utecId = utecId;
    }

    public String getUtecNombre() {
        return utecNombre;
    }

    public void setUtecNombre(String utecNombre) {
        this.utecNombre = utecNombre;
    }

    public String getUtecDescripcion() {
        return utecDescripcion;
    }

    public void setUtecDescripcion(String utecDescripcion) {
        this.utecDescripcion = utecDescripcion;
    }

    public String getUtecUbicacion() {
        return utecUbicacion;
    }

    public void setUtecUbicacion(String utecUbicacion) {
        this.utecUbicacion = utecUbicacion;
    }

    public String getUtecTelefono() {
        return utecTelefono;
    }

    public void setUtecTelefono(String utecTelefono) {
        this.utecTelefono = utecTelefono;
    }

    public DireccionesNacionales getDnacId() {
        return dnacId;
    }

    public void setDnacId(DireccionesNacionales dnacId) {
        this.dnacId = dnacId;
    }

    @XmlTransient
    public Collection<FacilitadoresTecnicos> getFacilitadoresTecnicosCollection() {
        return facilitadoresTecnicosCollection;
    }

    public void setFacilitadoresTecnicosCollection(Collection<FacilitadoresTecnicos> facilitadoresTecnicosCollection) {
        this.facilitadoresTecnicosCollection = facilitadoresTecnicosCollection;
    }

    @XmlTransient
    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (utecId != null ? utecId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadesTecnicas)) {
            return false;
        }
        UnidadesTecnicas other = (UnidadesTecnicas) object;
        if ((this.utecId == null && other.utecId != null) || (this.utecId != null && !this.utecId.equals(other.utecId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.UnidadesTecnicas[ utecId=" + utecId + " ]";
    }
    
}

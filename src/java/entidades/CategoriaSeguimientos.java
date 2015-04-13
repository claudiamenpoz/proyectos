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
@Table(name = "categoria_seguimientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaSeguimientos.findAll", query = "SELECT c FROM CategoriaSeguimientos c"),
    @NamedQuery(name = "CategoriaSeguimientos.findByCatsegId", query = "SELECT c FROM CategoriaSeguimientos c WHERE c.catsegId = :catsegId"),
    @NamedQuery(name = "CategoriaSeguimientos.findByCatsegNombre", query = "SELECT c FROM CategoriaSeguimientos c WHERE c.catsegNombre = :catsegNombre"),
    @NamedQuery(name = "CategoriaSeguimientos.findByCatsegDescripcion", query = "SELECT c FROM CategoriaSeguimientos c WHERE c.catsegDescripcion = :catsegDescripcion")})
public class CategoriaSeguimientos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "catseg_id")
    private Integer catsegId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "catseg_nombre")
    private String catsegNombre;
    @Size(max = 2147483647)
    @Column(name = "catseg_descripcion")
    private String catsegDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catsegId")
    private Collection<Seguimientos> seguimientosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catsegId")
    private Collection<SubCatseguimientos> subCatseguimientosCollection;

    public CategoriaSeguimientos() {
    }

    public CategoriaSeguimientos(Integer catsegId) {
        this.catsegId = catsegId;
    }

    public CategoriaSeguimientos(Integer catsegId, String catsegNombre) {
        this.catsegId = catsegId;
        this.catsegNombre = catsegNombre;
    }

    public Integer getCatsegId() {
        return catsegId;
    }

    public void setCatsegId(Integer catsegId) {
        this.catsegId = catsegId;
    }

    public String getCatsegNombre() {
        return catsegNombre;
    }

    public void setCatsegNombre(String catsegNombre) {
        this.catsegNombre = catsegNombre;
    }

    public String getCatsegDescripcion() {
        return catsegDescripcion;
    }

    public void setCatsegDescripcion(String catsegDescripcion) {
        this.catsegDescripcion = catsegDescripcion;
    }

    @XmlTransient
    public Collection<Seguimientos> getSeguimientosCollection() {
        return seguimientosCollection;
    }

    public void setSeguimientosCollection(Collection<Seguimientos> seguimientosCollection) {
        this.seguimientosCollection = seguimientosCollection;
    }

    @XmlTransient
    public Collection<SubCatseguimientos> getSubCatseguimientosCollection() {
        return subCatseguimientosCollection;
    }

    public void setSubCatseguimientosCollection(Collection<SubCatseguimientos> subCatseguimientosCollection) {
        this.subCatseguimientosCollection = subCatseguimientosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catsegId != null ? catsegId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaSeguimientos)) {
            return false;
        }
        CategoriaSeguimientos other = (CategoriaSeguimientos) object;
        if ((this.catsegId == null && other.catsegId != null) || (this.catsegId != null && !this.catsegId.equals(other.catsegId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CategoriaSeguimientos[ catsegId=" + catsegId + " ]";
    }
    
}

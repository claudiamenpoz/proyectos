package controladores;

import dao.MetasFacadeLocal;
import entidades.Metas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.NamingException;
import util.FacesUtil;

@ManagedBean
@SessionScoped
public class metasBean {

    //Declaro estas cuatro variables
    protected Integer tabIndex = 1;
    protected Boolean edit = false;
    private String desc, nombre;
    
    //Variables para tabla proyectos
    private List<Metas> metas = new ArrayList<>();
    private Metas meta;
    private Metas nuevaMeta = new Metas();
    private Metas metaSeleccionada = new Metas();
    
    /**
     * Creates a new instance of metasBean
     */
    public metasBean() {
        metas = getDaoMeta().getList();
    }
    
    //Métodos para gestión de tabla metas
    public String buscarMe() throws NamingException {
        metas = getDaoMeta().busqueda(desc);
        return null;
    }
    public String guardarMe() throws NamingException {
        getDaoMeta().create(nuevaMeta);
        FacesUtil.addMensaje("Datos de Meta Guardados");
        nuevaMeta = new Metas();
        metas = getDaoMeta().getList();
        return null;
    }
    public String actualMe() throws NamingException {
        getDaoMeta().edit(metaSeleccionada);
        FacesUtil.addMensaje("Datos de Meta Actualizados");
        return null;
    }
    public String borrarAc() throws NamingException {
        return null;
    }
    
    private MetasFacadeLocal getDaoMeta() {
        return (MetasFacadeLocal) FacesUtil.getEjb("java:global/proyectos2/MetasFacade!dao.MetasFacadeLocal");
    }
    
    public Boolean getEdit() {
        return edit;
    }

    public void setEdit(Boolean edit) {
        this.edit = edit;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
    
    
    //metas
    public List<Metas> getMetas() {
        return metas;
    }

    public void setMetas(List<Metas> metas) {
        this.metas = metas;
    }
    
    
    
    
    
    public Metas getMetaSeleccionada() {
        return metaSeleccionada;
    }

    public void setMetaSeleccionada(Metas metaSeleccionada) {
        this.metaSeleccionada = metaSeleccionada;
    }
    
}

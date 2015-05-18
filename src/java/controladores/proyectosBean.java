package controladores;

import dao.ProyectosFacadeLocal;
import entidades.Proyectos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.NamingException;
import util.FacesUtil;
        
@ManagedBean
@SessionScoped
public class proyectosBean implements Serializable{
        
    //Variables para tabla proyectos
    private List<Proyectos> proyectos = new ArrayList<>();
    private Proyectos proyectoSeleccionado = new Proyectos();
    //private Integer zonSeleccionada;
        
    /**
     * Creates a new instance of proyectosBean
     */
    //Creo instancias para cada tabla
    public proyectosBean() {
        proyectos = getDaoProyecto().getList();
    }
    
    private ProyectosFacadeLocal getDaoProyecto() {
        return (ProyectosFacadeLocal) FacesUtil.getEjb("java:global/proyectos2/ProyectosFacade!dao.ProyectosFacadeLocal");
    }

    
    //proyecto
    public List<Proyectos> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyectos> proyectos) {
        this.proyectos = proyectos;
    }
/*
    public Proyectos getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyectos proyecto) {
        this.proyecto = proyecto;
    }
/*
    public Proyectos getNuevoProyecto() {
        return nuevoProyecto;
    }

    public void setNuevoProyecto(Proyectos nuevoProyecto) {
        this.nuevoProyecto = nuevoProyecto;
    }*/

    public Proyectos getProyectoSeleccionado() {
        return proyectoSeleccionado;
    }

    public void setProyectoSeleccionado(Proyectos proyectoSeleccionado) {
        this.proyectoSeleccionado = proyectoSeleccionado;
    }

    
    
}

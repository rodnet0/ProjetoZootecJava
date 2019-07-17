/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufra.edu.br.projeto_nap2_poo.bean;

import ufra.edu.br.projeto_nap2_poo.entity.Ovos;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import ufra.edu.br.projeto_nap2_poo.dao.OvosDAO;

/**
 *
 * @author RODRIGO
 */
@SessionScoped
@ManagedBean
public class OvosBean {

    private Ovos ovo = new Ovos();
    private List<Ovos> ovos = new ArrayList<>();
    
    
    public void adicionarOvo(){
        ovos.add(ovo);
        new OvosDAO().save(ovo);
        ovo = new Ovos();
    }

    public Ovos getOvo() {
        return ovo;
    }

    public void setOvo(Ovos ovo) {
        this.ovo = ovo;
    }

    public List<Ovos> getOvos() {
        return ovos;
    }

    public void setOvos(List<Ovos> ovos) {
        this.ovos = ovos;
    }
    
    public void listarOvos(){
        ovos = new OvosDAO().search();
    }
    
    public void modificarOvos(Ovos o){
        ovo = o;
    }
}

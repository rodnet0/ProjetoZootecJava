/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufra.edu.br.projeto_nap2_poo.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import ufra.edu.br.projeto_nap2_poo.entity.Fileira;

/**
 *
 * @author RODRIGO
 */
@ManagedBean
@SessionScoped
public class FileiraBean {
    private Fileira fileira = new Fileira();
    private List<Fileira> fileiras = new ArrayList<>();
    
    public void adicionar(){
        fileiras.add(fileira);
        fileira = new Fileira();
    }

    public Fileira getFileira() {
        return fileira;
    }

    public void setFileira(Fileira fileira) {
        this.fileira = fileira;
    }

    public List<Fileira> getFileiras() {
        return fileiras;
    }

    public void setFileiras(List<Fileira> fileiras) {
        this.fileiras = fileiras;
    }
    
    
}

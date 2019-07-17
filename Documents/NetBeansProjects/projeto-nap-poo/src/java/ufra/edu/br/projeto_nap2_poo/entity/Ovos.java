/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufra.edu.br.projeto_nap2_poo.entity;

import java.util.Objects;

/**
 *
 * @author RODRIGO
 */
public class Ovos {
    private Integer id;
    private Integer quantidadeovos;
    private Double pesototal;
    private Integer quantidadeovospequeno;
    private Integer quantidadeovosjumbo;
    private Integer quantidadeovossujo;
    private Integer quantidadeovostrincado;
    private Integer quantidadeovoscomsangue;
    private Integer quantidadeovosestranho;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getQuantidadeovos() {
        return quantidadeovos;
    }

    public void setQuantidadeovos(Integer quantidadeovos) {
        this.quantidadeovos = quantidadeovos;
    }

    public Double getPesototal() {
        return pesototal;
    }

    public void setPesototal(Double pesototal) {
        this.pesototal = pesototal;
    }

    public Integer getQuantidadeovospequeno() {
        return quantidadeovospequeno;
    }

    public void setQuantidadeovospequeno(Integer quantidadeovospequeno) {
        this.quantidadeovospequeno = quantidadeovospequeno;
    }

    public Integer getQuantidadeovosjumbo() {
        return quantidadeovosjumbo;
    }

    public void setQuantidadeovosjumbo(Integer quantidadeovosjumbo) {
        this.quantidadeovosjumbo = quantidadeovosjumbo;
    }

    public Integer getQuantidadeovossujo() {
        return quantidadeovossujo;
    }

    public void setQuantidadeovossujo(Integer quantidadeovossujo) {
        this.quantidadeovossujo = quantidadeovossujo;
    }

    public Integer getQuantidadeovostrincado() {
        return quantidadeovostrincado;
    }

    public void setQuantidadeovostrincado(Integer quantidadeovostrincado) {
        this.quantidadeovostrincado = quantidadeovostrincado;
    }

    public Integer getQuantidadeovoscomsangue() {
        return quantidadeovoscomsangue;
    }

    public void setQuantidadeovoscomsangue(Integer quantidadeovoscomsangue) {
        this.quantidadeovoscomsangue = quantidadeovoscomsangue;
    }

    public Integer getQuantidadeovosestranho() {
        return quantidadeovosestranho;
    }

    public void setQuantidadeovosestranho(Integer quantidadeovosestranho) {
        this.quantidadeovosestranho = quantidadeovosestranho;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ovos other = (Ovos) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}

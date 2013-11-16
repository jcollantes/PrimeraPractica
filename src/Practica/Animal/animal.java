package Practica.Animal;

import Practica.Especie.EspecieAnimal;
import Practica.dieta.Dietas;
import java.util.Date;

public class animal extends EspecieAnimal {

    private String codigoAnimal;
    private String nombre;
    private double peso;
    private Date fecNacimieto;
    private EspecieAnimal Especie;
    private Dietas dieta;

    @Override
    public void setCodigo(String codigo) {
        this.Especie.setCodigo(codigo);
    }

    @Override
    public String getCodigo() {
        return super.getCodigo();
    }

    @Override
    public String getNomEspecie() {
        return super.getNomEspecie();
    }

    @Override
    public void setNomEspecie(String nomEspecie) {
        this.Especie.setNomEspecie(nomEspecie);
    }

    public String getCodigoAnimal() {
        return codigoAnimal;
    }

    public void setCodigoAnimal(String codigoAnimal) {
        this.codigoAnimal = codigoAnimal;
    }

    public Dietas getDieta() {
        return dieta;
    }

    public void setDieta(Dietas dieta) {
        this.dieta = dieta;
    }

    public void setNomEspecie(EspecieAnimal nomEspecie) {
        this.Especie = nomEspecie;
    }

    public Date getFecNacimieto() {
        return fecNacimieto;
    }

    public void setFecNacimieto(Date fecNacimieto) {
        this.fecNacimieto = fecNacimieto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

package Practica.alimento;

import java.util.ArrayList;

public class alimentos extends nutriente {

    private String codigo;
    private String descripcionalimento;
    private String nomAlimento;
    private String tipoAlimento;
    private String unidadMedida;
    private double precioUnidad;
    private ArrayList<nutriente> nutrientes;
    private ArrayList<Integer> cantNutriente;

    public ArrayList<Integer> getCantNutriente() {
        return cantNutriente;
    }

    public void setCantNutriente(ArrayList<Integer> cantNutriente) {
        this.cantNutriente = cantNutriente;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcionalimento() {
        return descripcionalimento;
    }

    public void setDescripcionalimento(String descripcionalimento) {
        this.descripcionalimento = descripcionalimento;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomAlimento() {
        return nomAlimento;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setNomAlimento(String nomAlimento) {
        this.nomAlimento = nomAlimento;
    }

    public ArrayList<nutriente> getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(ArrayList<nutriente> nutrientes) {
        this.nutrientes = nutrientes;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
}

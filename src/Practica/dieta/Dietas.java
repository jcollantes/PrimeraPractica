package Practica.dieta;

import Practica.alimento.alimentos;
import java.util.ArrayList;

public class Dietas extends alimentos {

    private ArrayList<Double> cantidadAlimento;
    private ArrayList<Double> cantidadAgua;
    private ArrayList<alimentos> alimentoDieta;
    private int horaAplicar;

    public int getHoraAplicar() {
        return horaAplicar;
    }

    public ArrayList<Double> getCantidadAlimento() {
        return cantidadAlimento;
    }

    public void setCantidadAlimento(ArrayList<Double> cantidadAlimento) {
        this.cantidadAlimento = cantidadAlimento;
    }

    public void setHoraAplicar(int horaAplicar) {
        this.horaAplicar = horaAplicar;
    }

    public ArrayList<alimentos> getAlimentoDieta() {
        return alimentoDieta;
    }

    public void setAlimentoDieta(ArrayList<alimentos> alimentoDieta) {
        this.alimentoDieta = alimentoDieta;
    }

    public ArrayList<Double> getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(ArrayList<Double> cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

}

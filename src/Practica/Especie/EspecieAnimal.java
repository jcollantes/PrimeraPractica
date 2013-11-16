package Practica.Especie;

public abstract class EspecieAnimal {

    private String codigo;
    private String nomEspecie;
    private String descripcion;

    public String getNomEspecie() {
        return nomEspecie;
    }

    public String getCodigo(){
        return nomEspecie;
    }

    public abstract void setCodigo(String codigo);

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract void setNomEspecie(String nomEspecie);
}

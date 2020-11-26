package modelo;

public class Pais {
    private int idpais;
    private String nombre;
    private String estado;

    public Pais() {
    }

    public Pais(int idpais, String nombre, String estado) {
        this.idpais = idpais;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

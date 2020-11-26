package interfaces;
import java.util.List;
import modelo.Pais;

public interface CRUD4 {
    public List listarpais();
    public Pais buscarpais(int pais);
    public boolean agregarpais(Pais pais);
    public boolean editarpais(Pais pais);
    public boolean eliminarpais(int pais);  
}

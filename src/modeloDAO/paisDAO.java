package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD4;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Autor;
import modelo.Pais;


public class paisDAO implements CRUD4 {
  ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Pais e = new Pais();
    @Override
    public List listarpais() {
         ArrayList<Pais> paises = new ArrayList<>();
        String consulta = " select * from pais ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Pais pais = new Pais();
                pais.setIdpais(rs.getInt("idautor"));
                pais.setNombre(rs.getString("nombre"));
                pais.setEstado(rs.getString("estado"));
                
                paises.add(pais);
            }
        } catch (SQLException e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return paises;
    }

    @Override
    public Pais buscarpais(int idpais) {
          String consulta = " select *  "
                        + " from pais  "
                        + " where idpais = " + idpais ;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                e.setIdpais(rs.getInt("idapais"));
                e.setNombre(rs.getString("nombre"));
                e.setEstado(rs.getString("estado"));
            }
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        
        return e;
    }

    @Override
    public boolean agregarpais(Pais pais) {
         Boolean agregado = false;
    	
    	String consulta = "INSERT INTO pais (nombre ,estado) values( '" + pais.getNombre() +
    			pais.getEstado()	+ "' );";
    	
    	try {
    		
    	con = cn.getConnection();
        pst = con.prepareStatement(consulta);
        pst.executeUpdate();
    	con.close();
        pst.close();
            agregado = true;
    		
		} catch (Exception e) {
			System.out.println("Something were wrong in Insert");
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
    	return agregado;
    }

    @Override
    public boolean editarpais(Pais pais) {
         String consulta = " update pais "
                        + " set "
                        + " nombre = '"+ pais.getNombre() +"', "
                        + " estado = '"+ pais.getEstado() +"' "
                        + " where "
                        + " idpais = " + pais.getIdpais() + "; ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception error) {
            System.out.println("Error con el Lsitar");
            System.out.println(error.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean eliminarpais(int idpais) {
        String consulta = " delete from pais "
                        + " where "
                        + " idpais = " + idpais + "; ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
}

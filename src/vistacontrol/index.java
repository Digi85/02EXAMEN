package vistacontrol;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Libro;
import modelo.Autor;
import modeloDAO.autorDAO;
import modeloDAO.editorialDAO;
import modeloDAO.libroDAO;
import utils.leer;
import modelo.Editorial;
import modeloDAO.paisDAO;
import modelo.Pais;


public class index {
    
    public static void listarpais()
{
    paisDAO paisDAO = new paisDAO();
        List<Pais> paises = paisDAO.listarpais();
        System.out.println("Lsiatado de paises");
        for (Pais pais : paises) {
            System.out.println(pais.getIdpais()+ "\t"+
                               pais.getNombre()+ "\t"+
                               pais.getEstado()
                    );
        }
}
    public static void agregarpais()
    {
        String nombre;
        String estado;
        System.out.println("Agregar Pais");
        System.out.print("Nombre: ");
        nombre = leer.cadena();
        System.out.print("Estado: ");
        estado = leer.cadena();
        Pais pais = new Pais(0, nombre, estado);
        paisDAO paisDAO = new paisDAO();
        paisDAO.agregarpais(pais);
    }
    
    public static void editarpais()
    {
    listarpais();
        System.out.print("Ingrese el ID del pais a Editar: ");
        int id = leer.entero();   
        String nombre;
        String estado;
        System.out.println("Editar Pais");
        System.out.print("Nombre: ");
        nombre = leer.cadena();
        System.out.print("Estado: ");
        estado = leer.cadena();
        Pais pais = new Pais(id, nombre,estado);
        paisDAO paisDAO = new paisDAO();
        paisDAO.editarpais(pais);
    }
    
      public static void eliminarpais()
    {
        listarpais();
        System.out.print("Ingrese el ID del pais a Eliminar: ");
        int id = leer.entero();
        paisDAO paisDAO = new paisDAO();
        paisDAO.eliminarpais(id);
    }
    
   public static void listareditorial()
   {
     editorialDAO editorialDAO = new editorialDAO();
        List<Editorial> editoriales = editorialDAO.listareditoriales();
        System.out.println("Lsiatado de editoriales");
        for (Editorial editorial : editoriales) {
            System.out.println(editorial.getIdeditorial()+ "\t"+
                               editorial.getNombre()+ "\t"+
                               editorial.getEstado()
                    );
        }
   }
    public static void agregareditorial()
    {
        String nombre;
        String estado;
        System.out.println("Agregar Editorial");
        System.out.print("Nombre: ");
        nombre = leer.cadena();
        System.out.print("Estado: ");
        estado = leer.cadena();
        Editorial editorial = new Editorial(0, nombre, estado);
        editorialDAO editorialDAO = new editorialDAO();
        editorialDAO.agregareditorial(editorial);
    }
    public static void editareditorial()
    {
    listareditorial();
        System.out.print("Ingrese el ID de la editorial a Editar: ");
        int id = leer.entero();   
        String nombre;
        String estado;
        System.out.println("Editar Edotoriales");
        System.out.print("Nombre: ");
        nombre = leer.cadena();
        System.out.print("Estado: ");
        estado = leer.cadena();
        Editorial editorial = new Editorial(id, nombre,estado);
        editorialDAO editorialDAO = new editorialDAO();
        editorialDAO.editareditorial(editorial);
    }
    public static void eliminareditorial()
    {
        listarlibro();
        System.out.print("Ingrese el ID de la editorial a Eliminar: ");
        int id = leer.entero();
        editorialDAO editorialDAO = new editorialDAO();
        editorialDAO.eliminareditorial(id);
    }
    
    public static void eliminarlibro()
    {
        listarlibro();
        System.out.print("Ingrese el ID de la editorial a Eliminar: ");
        int id = leer.entero();
        libroDAO libroDAO = new libroDAO();
        libroDAO.eliminarlibro(id);
    }
    public static void editarlibro()
    {
        listarlibro();
        System.out.print("Ingrese el ID de la editorial a Editar: ");
        int id = leer.entero();   
        String nombre;
        String codigo;
        String ISBN;
        String fecha_publicacion;
        int stock;
        double precio_compra;
        String estado;
        System.out.println("Editar libro");
        System.out.print("Nombre: ");
        nombre = leer.cadena();
        System.out.print("Codigo: ");
        codigo = leer.cadena();
        System.out.print("ISBN: ");
        ISBN = leer.cadena();
        System.out.print("fecha_publicacion: ");
        fecha_publicacion = leer.cadena();
        System.out.print("stock: ");
        stock = leer.entero();
        System.out.print("precio_compra: ");
        precio_compra = leer.decimal();
        System.out.print("estado: ");
        estado = leer.cadena();
        Libro libro = new Libro(id, nombre, codigo, ISBN, fecha_publicacion, stock, precio_compra, estado);
        libroDAO libroDAO = new libroDAO();
        libroDAO.editarlibro(libro);
    }
    public static void agregarlibros()
    {
        String nombre;
        String codigo;
        String ISBN;
        String fecha_publicacion;
        int stock;
        double precio_compra;
        String estado;
        System.out.println("Agregar Libro");
        System.out.print("Nombre: ");
        nombre = leer.cadena();
        System.out.print("Codigo: ");
        codigo = leer.cadena();
        System.out.print("ISBN: ");
        ISBN = leer.cadena();
        System.out.print("fecha_publicacion: ");
        fecha_publicacion = leer.cadena();
        System.out.print("stock: ");
        stock = leer.entero();
        System.out.print("precio_compra: ");
        precio_compra = leer.decimal();
        System.out.print("estado: ");
        estado = leer.cadena();
 
        Libro libro = new Libro(0, nombre, codigo, ISBN, fecha_publicacion, stock, precio_compra, estado);
        libroDAO libroDAO = new libroDAO();
        libroDAO.agregarlibro(libro);
    }
    public static void eliminarautor()
     {
        listarautor();
        System.out.print("Ingrese el ID del autor a Eliminar: ");
        int id = leer.entero();
        autorDAO autorDAO = new autorDAO();
        autorDAO.eliminarautor(id);
     }   
       public static void editarautor()
      {
        listarautor();
        System.out.print("Ingrese el ID del autor a Editar: ");
        int id = leer.entero();   
        String nombre;
        String apellidos;
        String nacionalidad;
        String dni;
        String estado;
        System.out.println("Editar autor");
        System.out.print("Nombre: ");
        nombre = leer.cadena();
        System.out.print("Apellidos: ");
        apellidos = leer.cadena();
        System.out.print("nacionalidad: ");
        nacionalidad = leer.cadena();
        System.out.print("DNI: ");
        dni = leer.cadena();
        System.out.print("Estado: ");
        estado = leer.cadena();
        Autor autor = new Autor(id, nombre, apellidos, nacionalidad, dni, estado);
        autorDAO autorDAO = new autorDAO();
        autorDAO.editarautor(autor);
       }
       public static void agregarautor()
       {
       String nombre;
        String apellidos;
        String nacionalidad;
        String dni;
        String estado;
        System.out.println("Agregar Autor");
        System.out.print("Nombre: ");
        nombre = leer.cadena();
        System.out.print("Apellidos: ");
        apellidos = leer.cadena();
        System.out.print("nacionalidad: ");
        nacionalidad = leer.cadena();
        System.out.print("dni: ");
        dni = leer.cadena();
        System.out.print("Estado: ");
        estado = leer.cadena();
        Autor autor = new Autor(0, nombre, apellidos, nacionalidad, dni, estado);
        autorDAO autorDAO = new autorDAO();
        autorDAO.agregarautor(autor);
       }
     public static void listarlibro()
    {
        libroDAO libroDAO = new libroDAO();
        List<Libro>libros = libroDAO.listarlibro();
        System.out.println("Listado de libros");
          System.out.println("id libro\tnombre\t\t  autor\t\t\t editorial\t\t fecha de publicaion\t\t pais\t\t codigo");
        for (Libro libro : libros) {
            System.out.println(libro.getIdlibro()+ "\t"+
                               darFormato(libro.getNombre(), 20)+ "\t"+
                               darFormato(libro.getAutorapellidos(), 20)+"\t"+
                               darFormato(libro.getAutorapellidos(), 20)+
                               darFormato(libro.getEditorialnombre(), 20)+"\t"+
                               darFormato(libro.getPaisnombre(), 10)+"\t"+
                               libro.getCodigo()
                    );
        }
    }
     public static void listarautor()
     {
         autorDAO autorDAO = new autorDAO();
        List<Autor>autores = autorDAO.listarautor();
        System.out.println("Listado de autores");
       
        for (Autor autor : autores) {
            System.out.println(autor.getIdautor()+ "\t"+
                               darFormato(autor.getNombre())+ "\t"+
                               darFormato(autor.getApellidos())+"\t"+
                               darFormato(autor.getNacionalidad())+"\t"+
                               (autor.getDni())+"\t"+
                               (autor.getEstado())
                    );
     }
     }
     
     
     public static String darFormato(String cadena){
        if (cadena.length()>=15) {
            cadena = cadena.substring(0,12) + "  "+" ";
        }else if (cadena.length()>=8) {
        	cadena = cadena + "";
        }else if (cadena.length()>=4) {
            cadena = cadena + "\t";
        }else if (cadena.length()>=2){
            cadena = cadena + "\t\t";
        }
        else if (cadena.length()==7) {
        	cadena = cadena + "\t";
        }
         else {
            cadena = cadena + "\t";
        }
        
        return cadena;
    }
     public static void salir()
     {
         System.out.println("Gracias por visitarnos ");
     }
      public static String darFormato(String cadena, int v){
        if (cadena.length()>v) {
        cadena = cadena.substring(0,v-3) + "...";
        }
        if (cadena.length()<v) {
            while(cadena.length()!=v){
        cadena = cadena + " ";
        }}
        
        return cadena;
    }
     
     public static void menu()
     {
        System.out.println("Menu Principal");
        System.out.println("1.Listar Pais");
        System.out.println("2. Eliminar Pais");
        System.out.println("3. Editar Pais");
        System.out.println("4. agregar Pais");
        System.out.println("5. Listar Libros");
        System.out.println("6. Eliminar Libros");
        System.out.println("7. Editar Libros");
        System.out.println("8. Agregar Libros");
        System.out.println("9. Listar Autor");
        System.out.println("10. Eliminar Autor");
        System.out.println("11. Editar Autor");
        System.out.println("12. Agregar Autor");
        System.out.println("13. Listar Editorial");
        System.out.println("14. Eliminar Editorial");
        System.out.println("15. Editar Editorial");
        System.out.println("16. Agregar Editorial");         
        System.out.println("17. Salir");
        System.out.print("Escoja opción [1-17]: ");
        
     }
    public static void inicio()
     {
          int opcion;
        do {            
            menu();
            opcion = leer.entero();
            switch(opcion){
                case 1:
                    listarpais();
                    break;
                case 2:
                    eliminarpais();
                    break;
                case 3:
                    editarpais();
                    break;
                case 4:
                    agregarpais();
                    break;
                case 5:
                    listarlibro();
                    break;
                case 6:
                    eliminarlibro();
                    break;
                case 7:
                    editarlibro();
                    break;
                case 8:
                    agregarlibros();
                    break;
                    case 9:
                    listarautor();
                    break;
                    case 10:
                    eliminarautor();
                    break;
                    case 11:
                    editarautor();
                    break;
                    case 12:
                    agregarautor();
                    break;
                    case 13:
                    listareditorial();
                    break;
                    case 14:
                    eliminareditorial();
                    break;
                    case 15:
                    editareditorial();
                    break;
                    case 16:
                    agregareditorial();
                    break;
                case 17:
                    salir();
                    break;
            }
        } while (opcion!=17);
     }
     public static void main(String[] args) {
         inicio();
        
    }
}

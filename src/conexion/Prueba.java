
package conexion;
import java.sql.*;
/*
 *
 * @author DanKuzo
 */
public class Prueba {
    public static void main(String[] args) throws ClassNotFoundException {
        Conectar cc = new Conectar();
        Connection cn =cc.conexion();
        
        if (cn==null) {
            System.out.println("no conectado");
        }else{
            System.out.println("conectado ");
        }
    }
}

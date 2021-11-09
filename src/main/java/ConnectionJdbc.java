import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJdbc {
    public static void main(String[] args) {

        String url ="jdbc:mysql://localhost:3306/despesasdb?useTimezone=true&serverTimezone=GMT";

        try {
            Connection conn = DriverManager.getConnection(url,"root"," ");
            System.out.println("Exito");
        } catch (SQLException e) {
            System.out.println("Falha");
            e.printStackTrace();
        }
    }
}

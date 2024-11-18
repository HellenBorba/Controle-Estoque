import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMysql implements Conexao{

    private Connection connection;
    private final String URL = "jdbc:mysql://localhost:3306/controle_estoque?useTimezone=true&serverTimezone=America/Sao_Paulo";
    private final String USER = "root";
    private final String PASSWORD = "Hellen0507";
    //jdbc:mysql://localhost:3306/?user=root


    public Connection obterConexao() throws SQLException {
        if(connection == null) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }
    public void fecharConexao() throws SQLException {
        if(connection != null)
            connection.close();
    }
}
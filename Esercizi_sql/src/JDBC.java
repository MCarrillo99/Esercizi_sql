import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "developer");

        Statement statement = conn.createStatement();

            /*statement.executeUpdate("CREATE TABLE IF NOT EXISTS `persone` (" +
                    "  `student_id` int NOT NULL AUTO_INCREMENT," +
                    "  `last_name` varchar(30) NOT NULL," +
                    "  `first_name` varchar(30) DEFAULT NULL," +
                    "  PRIMARY KEY (`student_id`)" +
                    ") ;");*/
        statement.executeUpdate("INSERT INTO `newdb`.`persone`" +
                "(`last_name`, `first_name`)" +
                "VALUES" +
                "(\"Iorio\", \"Maria\");");

    } catch (SQLException exception) {
        exception.printStackTrace();

    }
}
}

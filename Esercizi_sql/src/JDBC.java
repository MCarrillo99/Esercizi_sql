import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
    public static void main(String[] args) {

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "developer");

        Statement statement = conn.createStatement();

        /**
         * esercizio 2
         */
            /*statement.executeUpdate("CREATE TABLE IF NOT EXISTS `persone` (" +
                    "  `student_id` int NOT NULL AUTO_INCREMENT," +
                    "  `last_name` varchar(30) NOT NULL," +
                    "  `first_name` varchar(30) DEFAULT NULL," +
                    "  PRIMARY KEY (`student_id`)" +
                    ") ;");*/
        /*statement.executeUpdate("INSERT INTO `newdb`.`persone`" +
                "(`last_name`, `first_name`)" +
                "VALUES" +
                "(\"Iorio\", \"Maria\");");*/

        /**
         * esercizio 3
         */
        /*ResultSet res = statement.executeQuery("SELECT * FROM `newdb`.`persone`");

        List<String> surnames = new ArrayList<>();

        while (res.next()) {
            System.out.println(res.getInt("student_id"));
            System.out.println(res.getString("last_name"));
            System.out.println(res.getString("first_name"));
            System.out.println("------------------");
            String surname = res.getString("last_name");
            surnames.add(surname);
        }

        System.out.println(surnames);*/

        //statement.executeUpdate("ALTER TABLE `persone` \n" +
                //"ADD country VARCHAR(30) NULL ;");

        /**
         * esercizio 4
         */
        statement.executeUpdate("UPDATE `newdb`.`persone`\n" +
                "SET\n" +
                "`country` = \"Italy\"\n" +
                "WHERE `student_id` = 1 OR `student_id` = 3 OR `student_id` = 5 ;");

        statement.executeUpdate("UPDATE `newdb`.`persone`\n" +
                "SET\n" +
                "`country` = \"Germany\"\n" +
                "WHERE `student_id` = 2 OR `student_id` = 4 ;");
    } catch (SQLException exception) {
        exception.printStackTrace();

    }
}
}

import java.sql.*;

public class ManMapper implements ManDB {

    Connection connection;
    private static Statement stmt;
    PreparedStatement preparedStatement = null;
    Statement statement = null;


    public ManMapper() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:usersDB1.db");
            stmt = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Man findById(int idPerson) throws SQLException{

        preparedStatement = connection.prepareStatement(
                "SELECT id, name, surname FROM [man ] where id = ?");
        preparedStatement.setInt(1, idPerson);
        Man man = new Man();


        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            man.setId(resultSet.getInt(1));
            man.setName(resultSet.getString(2));
            man.setSurname(resultSet.getString(3));
            return man;
        }

        return man;
    }

    public void insert(Man man) throws SQLException {
        preparedStatement = connection.prepareStatement(
                "INSERT INTO [man ] (id, name, surname) values(?, ?, ?)");
        preparedStatement.setInt(1, man.getId());
        preparedStatement.setString(2, man.getName());
        preparedStatement.setString(3, man.getSurname());
        preparedStatement.executeUpdate();
    }

    public void update(Man man) throws SQLException {
        man.setId(3);
        preparedStatement = connection.prepareStatement(
                "UPDATE [man ]  SET id = ?  WHERE name = ? AND surname = ?");
        preparedStatement.setInt(1,man.getId());
        preparedStatement.setString(2, man.getName());
        preparedStatement.setString(3, man.getSurname());
        preparedStatement.executeUpdate();
    }

    public void delete(Man man) throws SQLException {
        preparedStatement = connection.prepareStatement(
                "DELETE FROM [man ] WHERE id = ?");
        preparedStatement.setInt(1,man.getId());
        preparedStatement.executeUpdate();
    }
}

import java.sql.SQLException;

public interface ManDB {

    static Man findById(int idPerson) throws SQLException {
        return null;
    }

    void insert(Man man) throws SQLException;
    void update(Man man) throws SQLException;
    void delete(Man man) throws SQLException;
}

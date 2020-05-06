import java.sql.SQLException;

public interface ManDB {

    Man findById(int idPerson) throws SQLException;
    void insert(Man man) throws SQLException;
    void update(Man man) throws SQLException;
    void delete(Man man) throws SQLException;
}

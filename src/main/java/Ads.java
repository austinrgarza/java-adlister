import java.sql.SQLException;
import java.util.List;

public interface Ads {
    // get a list of all the ads
    static List<Ad> all() throws SQLException{
        return null;
    }

    void insert(Ad ad);
}

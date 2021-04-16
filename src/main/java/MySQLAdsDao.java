import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;
    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }
    //    @Override
//    public List<Ad> all() {
//        Statement stmt = null;
//        try {
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
//            return createAdsFromResults(rs);
//        } catch (SQLException e) {
//            throw new RuntimeException("Error retrieving all ads.", e);
//        }
//    }
//    @Override
//    public Long insert(Ad ad) {
//        try {
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = stmt.getGeneratedKeys();
//            rs.next();
//            return rs.getLong(1);
//        } catch (SQLException e) {
//            throw new RuntimeException("Error creating a new ad.", e);
//        }
//    }
//    private String createInsertQuery(Ad ad) {
//        return "INSERT INTO ads(user_id, title, description) VALUES "
//                + "(" + ad.getUserId() + ", "
//                + "'" + ad.getTitle() + "', "
//                + "'" + ad.getDescription() + "')";
//    }
//    private Ad extractAd(ResultSet rs) throws SQLException {
//        return new Ad(
//                rs.getLong("id"),
//                rs.getLong("user_id"),
//                rs.getString("title"),
//                rs.getString("description")
//        );
//    }
//    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
//        List<Ad> ads = new ArrayList<>();
//        while (rs.next()) {
//            ads.add(extractAd(rs));
//        }
//        return ads;
//    }
    @Override
    public List<Ad> all() {
        List<Ad> output = new ArrayList<>();
        String query = "Select * FROM ads;";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                output.add(
                        new Ad(
                                rs.getLong("id"), // id
                                rs.getLong("user_id"),// user id
                                rs.getString("title"),// ad title
                                rs.getString("description")// ad description
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }


    @Override
    public Long insert(Ad newAd) {
        Long lastInsertedId = 0L;
        String insertQuery = "INSERT INTO ads (user_id, title, description) VALUES (" + newAd.getUserId() + ",'" + newAd.getTitle() + "','" + newAd.getDescription() + "')";

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedId = rs.getLong(1);
                System.out.println("Inserted id is: " + rs.getLong(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lastInsertedId;
    }

    @Override
    public boolean delete(long id) {
        try {
            Statement statement = connection.createStatement();
            String query = "DELETE FROM ads WHERE id="+ id;
            int val = statement.executeUpdate(query);
            return val > 0;
        }catch (SQLException ex){
            System.out.println("Error deleting ad");
            return false;
        }

    }

}

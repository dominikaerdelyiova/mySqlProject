package sk.kosickaakademia.erdelyiovad.mysql;

public class Database {

import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;

        private String url = "";
        private String username = "";
        private String password = "";

    public void showCities(String country){
        String query = "SELECT city.Name, city.CountryCode " +
                "FROM city " +
                "INNER JOIN country ON country.code = city.CountryCode " +
                " WHERE country.name LIKE ?";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);
            if(conn!=null){
                System.out.println(("Success"));


}
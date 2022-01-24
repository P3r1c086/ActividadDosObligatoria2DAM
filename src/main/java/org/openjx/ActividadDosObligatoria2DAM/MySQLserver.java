package org.openjx.ActividadDosObligatoria2DAM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLserver {
	
	private String url;
	private String dataBase;
	
    private static MySQLserver miBD;

    // OJO!! El constructor es privado, no permite que se genere un objeto constructor por defecto.
    private MySQLserver(String url, String dataBase) {
        this.url = url;
        this.dataBase = dataBase;
    }

    public static MySQLserver getSingletonInstance(String url, String dataBase) {
        if (miBD == null){
        	miBD = new MySQLserver(url, dataBase);
        }else{
            System.out.println("No se puede crear el objeto en "+ url + " porque ya existe");
        }
        
        return miBD;
    }
    
    //Sobreescribimos el método clone, para que no se pueda clonar un objeto de esta clase
    @Override
    public MySQLserver clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase BaseDatos");
        }
        return null; 
    }
    
    public void conection() {
    	 String connectionUrl =
//                 "jdbc:sqlserver://localhost:1434;"
//                         + "database=Academia;"
//                         + "user=sa;"
//                         + "password=123;"
//                         + "encrypt=true;"
//                         + "trustServerCertificate=true;"
//                         + "loginTimeout=30;";
               "jdbc:sqlserver://"+miBD.url+";"
               + "database="+miBD.dataBase+";"
               + "user=sa;"
               + "password=123;"
               + "encrypt=true;"
               + "trustServerCertificate=true;"
               + "loginTimeout=30;";

         try (Connection connection = DriverManager.getConnection(connectionUrl);) {
             // Code here.
        	 System.out.println("Conexión establecida");
        	 connection.close();
         }
         // Handle any errors that may have occurred.
         catch (SQLException e) {
             e.printStackTrace();
         }
    }
    //TODO: implementar estod métodos
    public void insert() {
    	
    }
    public void update() {
    	
    }
    public void delete() {
    	
    }
}

package com.tiburcio.example.pruebas;

import javax.sql.DataSource;
import com.querydsl.sql.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration configuration = Configuracion.crearConfiguracion();
        DataSource dataSource = MyDataSourceFactory.getMySQLDataSource();
        
        CrearQueryTypes.crearQueryTypes(dataSource);
        
        MisQueries misQueries = new MisQueries(configuration, dataSource);
        System.out.println(misQueries.getAbreviaturaCiclos());
    }
    
    
    
    
//    private static void testDataSource(String dbType) {
//		DataSource ds = null;
//		if("mysql".equals(dbType)){
//			ds = MyDataSourceFactory.getMySQLDataSource();
////		}else if("oracle".equals(dbType)){
////			ds = MyDataSourceFactory.getOracleDataSource();
//		}else{
//			System.out.println("invalid db type");
//			return;
//		}
//		
//		Connection con = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {
//			con = ds.getConnection();
//			stmt = con.createStatement();
//			rs = stmt.executeQuery("select empid, name from Employee");
//			while(rs.next()){
//				System.out.println("Employee ID="+rs.getInt("empid")+", Name="+rs.getString("name"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally{
//				try {
//					if(rs != null) rs.close();
//					if(stmt != null) stmt.close();
//					if(con != null) con.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//		}
//	}
}

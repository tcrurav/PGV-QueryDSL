package com.tiburcio.example.pruebas;

import java.io.File;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.querydsl.sql.codegen.MetaDataExporter;

public class CrearQueryTypes {
	
	static void crearQueryTypes(DataSource dataSource){
		java.sql.Connection conn;
		
		try {
			
			conn = dataSource.getConnection();
			MetaDataExporter exporter = new MetaDataExporter();
			exporter.setPackageName("com.tiburcio.example");
			exporter.setTargetFolder(new File("target/generated-sources/java"));
			exporter.export(conn.getMetaData());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}

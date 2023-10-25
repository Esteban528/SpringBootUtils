package com.bytecode.core.beans;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.bytecode.core.model.Usuario;

@Configuration
@ComponentScan("com.baeldung.jdbc")
public class CreandoConexion {

	@Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://10.0.0.56:3306/blog");
        dataSource.setUsername("admin");
        dataSource.setPassword("admin");

        return dataSource;
    }
	
}

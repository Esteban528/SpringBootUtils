package com.bytecode.core.component;

import com.bytecode.core.model.GrupoPermiso;
import com.bytecode.core.model.UsuarioMetadata;
import com.bytecode.core.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

//@Configuration
public class TestDatabaseConfiguration {
    @Bean
    public DataSource getDataSource () {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test_blog?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("este5ban9");
        return dataSource;
    }

    @Bean
    public CategoriaRepository categoriaRepository() {
        return new CategoriaRepository();
    }

    @Bean
    public UsuarioRepository usuarioRepository() {
        return new UsuarioRepository();
    }

    @Bean
    public ComentarioRepository comentarioRepository() {
        return new ComentarioRepository();
    }
    @Bean
    public ContenidoRepository contenidoRepository() {
        return new ContenidoRepository();
    }

    @Bean
    public GrupoPermisoRepository grupoPermisoRepository () {
        return new GrupoPermisoRepository();
    }

    @Bean
    public PermisoRepository permisoRepository() {
        return new PermisoRepository();
    }

    @Bean
    public PostRepository postRepository() {
        return new PostRepository();
    }

    @Bean
    public PostMetadataRepository postMetadataRepository() {
        return new PostMetadataRepository();
    }

    @Bean
    public UsuarioMetadataRepository usuarioMetadataRepository() {
        return new UsuarioMetadataRepository();
    }
}

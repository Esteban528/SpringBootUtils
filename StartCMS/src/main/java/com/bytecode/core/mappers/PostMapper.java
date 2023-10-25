package com.bytecode.core.mappers;

import com.bytecode.core.model.Post;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostMapper implements RowMapper<Post> {

    @Override
    public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
        Post post = new Post();
        post.setIdPost(rs.getInt("IdPost"));
        post.setTitulo(rs.getString("Tiutlo"));
        post.setSlug(rs.getString("Slug"));
        post.setExtracto(rs.getString("Extracto"));
        post.setCategoria(rs.getInt("Categoria"));
        post.setImagenDestacada(rs.getString("ImagenDestacada"));
        post.setTipo(rs.getString("Tipo"));
        post.setIdUsuario(rs.getInt("IdUsuario"));
        return post;
    }
}

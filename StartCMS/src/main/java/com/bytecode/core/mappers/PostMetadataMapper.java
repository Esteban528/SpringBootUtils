package com.bytecode.core.mappers;

import com.bytecode.core.model.PostMetadata;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostMetadataMapper implements RowMapper<PostMetadata> {

    @Override
    public PostMetadata mapRow(ResultSet rs, int rowNum) throws SQLException {
        PostMetadata postMetadata = new PostMetadata();
        postMetadata.setIdPostMetadata(rs.getInt("IdPostMetadata"));
        postMetadata.setClave(rs.getString("Clave"));
        postMetadata.setValor(rs.getString("Valor"));
        postMetadata.setTipo(rs.getString("Tipo"));
        postMetadata.setIdPost(rs.getInt("IdPost"));
        return postMetadata;
    }
}

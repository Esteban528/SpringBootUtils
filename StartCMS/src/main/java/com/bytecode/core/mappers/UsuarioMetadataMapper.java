package com.bytecode.core.mappers;

import com.bytecode.core.model.UsuarioMetadata;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioMetadataMapper implements RowMapper<UsuarioMetadata> {
    @Override
    public UsuarioMetadata mapRow(ResultSet rs, int rowNum) throws SQLException {
        UsuarioMetadata usuarioMetadata = new UsuarioMetadata();
        usuarioMetadata.setIdUsuarioMetadata(rs.getInt("IdUsuarioMetadata"));
        usuarioMetadata.setClave(rs.getString("Clave"));
        usuarioMetadata.setValor(rs.getString("Valor"));
        usuarioMetadata.setTipo(rs.getString("Tipo"));
        usuarioMetadata.setIdUsuario(rs.getInt("IdUsuario"));
        return usuarioMetadata;
    }
}

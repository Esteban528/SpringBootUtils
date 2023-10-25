package com.bytecode.core.mappers;

import com.bytecode.core.model.Categoria;
import com.bytecode.core.model.Comentario;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ComentarioMapper implements RowMapper<Comentario> {
    @Override
    public Comentario mapRow(ResultSet rs, int rowNum) throws SQLException {
        Comentario comentario = new Comentario();

        comentario.setIdComentario(rs.getInt("IdComentario"));
        comentario.setComentario((rs.getString("Comentario")));
        comentario.setIdPost(rs.getInt("IdPost"));
        comentario.setIdUsuario(rs.getInt("IdUsuario"));
        comentario.setFecha(rs.getDate("Fecha"));
        comentario.setRespuesta(rs.getString("Respuesta"));
        return comentario;
    }
}

package com.bytecode.core.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.core.model.Categoria;
import com.bytecode.core.model.Comentario;

@Repository
public class ComentarioRepository implements ComentarioRep{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Comentario object) {
		try {
			String sql = String.format("insert into comentario "
					+ "(Comentario, IdPost, IdUsuario, Respuesta) "
					+ "values"
					+ " ('%s', %d, %d, '%s')", 
					object.getComentario(), object.getIdPost(), object.getIdUsuario(), object.getFecha(), object.getRespuesta()
					);
			jdbcTemplate.execute(sql);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean update(Comentario object) {
		if (object.getIdComentario() != 0) {
			String sql = String.format("update comentario set "
					+ "Comentario='%s', IdPost=%d, IdUsuario=%d, Respuesta='%s'"
					+ " where IdComentario=%d",
					object.getComentario(), object.getIdPost(), object.getIdUsuario(),
					object.getRespuesta(), object.getIdComentario()
			);
			
			
			
			jdbcTemplate.execute(sql);
			return true;
		}
		return false;
	}

	@Override
	public List<Comentario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comentario findById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}
}

package com.bytecode.core.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.core.model.Post;

@Repository
public class PostRepository implements PostRep {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Post object) {
		try {
			String sql = String.format("insert into post "
					+ "(Titulo, Slug, Extracto, Categoria, ImagenDestacada, Tipo, IdUsuario) "
					+ "values"
					+ " ('%s', '%s', '%s', %d, '%s', '%s', %d)", 
					object.getTitulo(), object.getSlug(), object.getExtracto(), object.getCategoria(), object.getImagenDestacada(),
					object.getTipo(), object.getIdUsuario()
					);
			jdbcTemplate.execute(sql);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Post object) {
		if (object.getIdPost() != 0) {
			String sql = String.format("update post set "
					+ "Tiulo='%s', Slug='%s', Extracto='%s', Categoria=%d, ImagenDestacada='%s', Tipo='%s' IdUsuario=%d"
					+ " where IdPost=%d",
					object.getTitulo(), object.getSlug(), object.getExtracto(), object.getCategoria(), object.getImagenDestacada(),
					object.getTipo(), object.getIdUsuario()
					, object.getIdPost()
			);
			
			jdbcTemplate.execute(sql);
			return true;
		}
		return false;
	}

	@Override
	public List<Post> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post findById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}
}

package com.bytecode.core.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.core.model.Grupo;

@Repository
public class GrupoRepository implements GrupoRep{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Grupo object) {
		String sql = String.format("insert into grupo "
				+ "(Nombre) "
				+ "values"
				+ " ('%s')", 
				object.getNombre()
				);
		jdbcTemplate.execute(sql);
		return false;
	}

	@Override
	public boolean update(Grupo object) {
		if (object.getIdGrupo() != 0) {
			String sql = String.format("update grupo set "
					+ "Nombre='%s'"
					+ " where IdGrupo=%d",
					object.getNombre(), object.getIdGrupo()
			);
			
			jdbcTemplate.execute(sql);
			return true;
		}
		return false;
	}

	@Override
	public List<Grupo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grupo findById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}
}

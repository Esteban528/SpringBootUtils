package com.bytecode.core.repository;

import java.util.List;

import com.bytecode.core.mappers.CategoriaMapper;
import com.bytecode.core.mappers.PermisoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.core.model.Permiso;

@Repository
public class PermisoRepository implements PermisoRep {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Permiso object) {
		String sql = String.format("insert into permiso "
				+ "(Nombre) "
				+ "values"
				+ " ('%s')", 
				object.getNombre()
				);
		jdbcTemplate.execute(sql);
		return true;
	}

	@Override
	public boolean update(Permiso object) {
		if (object.getIdPermiso() != 0) {
			String sql = String.format("update permiso set "
					+ "Nombre='%s'"
					+ " where IdPermiso=%d",
					object.getNombre(), object.getIdPermiso()
			);
			
			jdbcTemplate.execute(sql);
			return true;
		}
		return false;
	}

	@Override
	public List<Permiso> findAll(Pageable pageable) {
		return jdbcTemplate.query("select * from permiso", new PermisoMapper());
	}

	@Override
	public Permiso findById(int Id) {
		Object [] params = new Object[] {Id};
		return jdbcTemplate.queryForObject("select * from permiso where IdPermiso = ?", params,   new PermisoMapper());
	}
}

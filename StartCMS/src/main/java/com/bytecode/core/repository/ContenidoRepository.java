package com.bytecode.core.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.core.model.Contenido;

@Repository
public class 	ContenidoRepository implements ContenidoRep{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(Contenido object) {
		try {
			String sql = String.format("insert into contenido "
					+ "(Tipo, Contenido, IdPost) "
					+ "values"
					+ " ('%s', '%s', %d)", 
					object.getTipo(), object.getContenido(), object.getIdPost()
					);
			jdbcTemplate.execute(sql);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Contenido object) {
		if (object.getIdContenido() > 0) {
			String sql = String.format("update contenido set "
					+ "Tipo='%s', Contenido='%s'"
					+ " where IdContenido=%d",
					object.getTipo(), object.getContenido(), 
					object.getIdContenido()
			);
			
			jdbcTemplate.execute(sql);
			return true;
		}
		return false;
	}

	@Override
	public List<Contenido> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contenido findById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}
}

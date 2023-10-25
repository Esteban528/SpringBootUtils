package com.bytecode.core.repository;

import java.util.List;

import jakarta.annotation.PostConstruct;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bytecode.core.model.Categoria;
import com.bytecode.core.mappers.*;

import javax.sql.DataSource;

@Repository
public class CategoriaRepository implements CategoriaRep{

	private Log logger = LogFactory.getLog(getClass());

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@PostConstruct
	public void postConstruct(){
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean save(Categoria categoria) {
		try {
			String sql = String.format("insert into categoria (Nombre, Descripcion, CategoriaSuperior) values ('%s', '%s', %d)", 
					categoria.getNombre(), categoria.getDescripcion(), categoria.getCategoriaSuperior()
					);
			jdbcTemplate.execute(sql);
			return true;
		} catch (Exception e) {
			logger.error(e);
			return false;
		}
		
	}

	@Override
	public boolean update(Categoria categoria) {
		if (categoria.getIdCategoria() != 0) {
			String sql = String.format("update categoria set Nombre='%s', Descripcion='%s', CategoriaSuperior=%d"
					+ " where IdCategoria=%d",
					categoria.getNombre(), categoria.getDescripcion(), categoria.getCategoriaSuperior(),
					categoria.getIdCategoria()
			);
			
			jdbcTemplate.execute(sql);
			return true;
		}
		return false;
	}

	public void deleteAll () {
		jdbcTemplate.execute("DELETE FROM categoria");
	}

	@Override
	public List<Categoria> findAll(Pageable pageable) {
		return jdbcTemplate.query("select * from Categoria", new CategoriaMapper());
	}

	@Override
	public Categoria findById(int Id) {
		Object [] params = new Object[] {Id};
		return jdbcTemplate.queryForObject("select * from Categoria where IdCateogoria = ?", params,   new CategoriaMapper());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Object deleteById(int id) {
		return null;
	}
}

package com.bytecode.core.mappers;

import com.bytecode.core.model.GrupoPermiso;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GrupoPermisoMapper implements RowMapper<GrupoPermiso> {

    @Override
    public GrupoPermiso mapRow(ResultSet rs, int rowNum) throws SQLException {
        GrupoPermiso grupoPermiso = new GrupoPermiso();
        grupoPermiso.setIdGrupo(rs.getInt("IdGrupo"));
        grupoPermiso.setIdPermiso(rs.getInt("IdPermiso"));
        return grupoPermiso;
    }
}

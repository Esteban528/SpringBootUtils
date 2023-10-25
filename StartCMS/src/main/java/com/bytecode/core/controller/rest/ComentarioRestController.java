package com.bytecode.core.controller.rest;

import com.bytecode.core.model.Comentario;
import com.bytecode.core.model.Usuario;
import com.bytecode.core.model.common.RepBase;
import com.bytecode.core.repository.ComentarioRepository;
import com.bytecode.core.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ComentarioRestController {
    @Autowired
    private ComentarioRepository repository;

    @PutMapping
    public ResponseEntity<RepBase> save(@RequestBody Comentario comentario) {
        return ResponseEntity.ok(new RepBase(repository.save(comentario)));
    }

    @PostMapping
    public ResponseEntity<RepBase> update(@RequestBody Comentario comentario) {
        return ResponseEntity.ok(new RepBase(repository.update(comentario)));
    }

    @GetMapping
    public ResponseEntity<List<Comentario>> findAll(SpringDataWebProperties.Pageable pageable){
        return ResponseEntity.ok(repository.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comentario> findById(@PathVariable int id){
        return ResponseEntity.ok(repository.findById(id));
    }
}

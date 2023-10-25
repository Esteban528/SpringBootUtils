package com.bytecode.core.controller.rest;

import com.bytecode.core.model.Categoria;
import com.bytecode.core.model.Usuario;
import com.bytecode.core.model.common.RepBase;
import com.bytecode.core.repository.CategoriaRepository;
import com.bytecode.core.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaRestController {
    @Autowired
    private CategoriaRepository repository;

    @PutMapping
    public ResponseEntity<RepBase> save(@RequestBody Categoria categoria) {
        return ResponseEntity.ok(new RepBase(repository.save(categoria)));
    }

    @PostMapping
    public ResponseEntity<RepBase> update(@RequestBody Categoria categoria) {
        return ResponseEntity.ok(new RepBase(repository.update(categoria)));
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll(SpringDataWebProperties.Pageable pageable){
        return ResponseEntity.ok(repository.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable int id){
        return ResponseEntity.ok(repository.findById(id));
    }
}
package com.bytecode.core.controller.rest;

import com.bytecode.core.model.Usuario;
import com.bytecode.core.model.UsuarioMetadata;
import com.bytecode.core.model.common.RepBase;
import com.bytecode.core.repository.UsuarioMetadataRepository;
import com.bytecode.core.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuariometadata")
public class UsuarioMetadataRestController {
    @Autowired
    private UsuarioMetadataRepository repository;

    @PutMapping
    public ResponseEntity<RepBase> save(@RequestBody UsuarioMetadata usuarioMetadata) {
        return ResponseEntity.ok(new RepBase(repository.save(usuarioMetadata)));
    }

    @PostMapping
    public ResponseEntity<RepBase> update(@RequestBody UsuarioMetadata usuarioMetadata) {
        return ResponseEntity.ok(new RepBase(repository.update(usuarioMetadata)));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioMetadata>> findAll(SpringDataWebProperties.Pageable pageable){
        return ResponseEntity.ok(repository.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioMetadata> findById(@PathVariable int id){
        return ResponseEntity.ok(repository.findById(id));
    }
}

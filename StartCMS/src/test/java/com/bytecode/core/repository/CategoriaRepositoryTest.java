package com.bytecode.core.repository;

import com.bytecode.core.component.TestDatabaseConfiguration;
import com.bytecode.core.model.Categoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;



import java.util.Date;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {TestDatabaseConfiguration.class})
public class CategoriaRepositoryTest {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Test
    public void testInsert() {
        Categoria categoria = new Categoria();

        categoria.setNombre("Test2");
        categoria.setFecha(new Date());
        categoria.setDescripcion("Este es un ejemplo segundo!");
        categoria.setCategoriaSuperior(1);

        boolean result = categoriaRepository.save(categoria);

        //categoriaRepository.deleteAll();

        Assertions.assertTrue(result);
    }
}

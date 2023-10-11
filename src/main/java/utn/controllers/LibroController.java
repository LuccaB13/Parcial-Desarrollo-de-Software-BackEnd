package utn.controllers;

import utn.entities.Libro;
import utn.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/libros")
public class LibroController extends BaseControllerimpl<Libro, LibroServiceImpl>{
}

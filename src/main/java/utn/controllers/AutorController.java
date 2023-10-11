package utn.controllers;

import utn.entities.Autor;
import utn.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/autores")
public class AutorController extends BaseControllerimpl<Autor, AutorServiceImpl>{
}

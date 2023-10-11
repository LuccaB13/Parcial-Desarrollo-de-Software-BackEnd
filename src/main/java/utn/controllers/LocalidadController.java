package utn.controllers;

import utn.entities.Localidad;
import utn.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/localidades")
public class LocalidadController extends BaseControllerimpl<Localidad, LocalidadServiceImpl>{
}

package utn.controllers;

import utn.entities.Domicilio;
import utn.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/domicilios")
public class DomicilioController extends BaseControllerimpl<Domicilio, DomicilioServiceImpl>{
}

package utn.services;

import utn.entities.Libro;
import utn.repositories.BaseRepository;
import utn.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{
    @Autowired
    private LibroRepository libroRepository;
    public LibroServiceImpl (BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository){
        super(baseRepository);
        this.libroRepository= libroRepository;
    }
}

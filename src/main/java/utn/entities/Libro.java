package utn.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro extends Base{
    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private int fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private int paginas;

    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(
            name = "libroAutor",
            joinColumns = @JoinColumn(name = "idLibro"),
            inverseJoinColumns = @JoinColumn(name = "idAutor")
    )
    private List<Autor> autores = new ArrayList<>();
}

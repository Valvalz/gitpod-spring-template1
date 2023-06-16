package application.model;

@Entity
@Table(name="jogo")
public class Jogo {
    
    /**
     *
     */
    
    private int id;
    public Jogo(int id) {
        this.id = id;
    }
    private String titulo;
    private String isbn;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
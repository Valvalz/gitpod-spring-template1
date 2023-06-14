package application.model;



@Entity
@Table(name="jogos")

public class Jogo {

    @Override
    public String toString() {
        return "Jogo []";
    }

    
    
    private int id;
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

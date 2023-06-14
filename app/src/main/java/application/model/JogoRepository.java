package application.model;

import java.util.Optional;

public interface JogoRepository extends CrudRepository<Jogo, Integer> {

    static Object findAll() {
        return null;
    }

    void save(Jogo jogo);

    Optional<Jogo> findById(int id);

    Jogo get();

    void deleteById(int id);
    
}
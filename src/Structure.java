import java.util.List;
import java.util.Optional;

public interface Structure {
    /*klasa implementująca ten interfejs będzie musiała zawierać w sobie kolekcję obiektów klasy implementującej interfejs Block
        Czyli struktura (obiekt klasy implementującej interfejs Structure) będzię zbiorem wielu bloków,
        wynika to z poniższych metod które mają zwrócić informacje o blokach zawartych w tej strukturze
    * */

    Optional<Block> findBlockByColor(String color);
    List<Block> findBlocksByMaterial(String material);
    int count();

}

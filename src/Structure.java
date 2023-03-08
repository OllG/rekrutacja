import java.util.List;
import java.util.Optional;

public interface Structure {
    /*klasa implementująca ten interfejs będzie musiała zwracać listę obiektów klasy implementującej interfejs Block.
        Czyli struktura (obiekt klasy implementującej interfejs Structure) będzię zbiorem wielu bloków,
        Jest to najbardziej intuicyjny rozwiązanie, by zaimplementować metody tego interfejsu.
    * */

    Optional<Block> findBlockByColor(String color);
    List<Block> findBlocksByMaterial(String material);
    int count();

}

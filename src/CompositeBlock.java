import java.util.List;

public interface CompositeBlock extends Block{
    /*
    Interfejs ten rozszerza interfejs Block, więc, obiekt klasy implementującej ten interfejs może być traktowany jako zwykły blok (polimorfizm)
    Jednak będzie on musiał dodatkowo posiadać możliwość zwrócenia listy bloków. Najoczywistszym rozwiązaniem, na które wskazuje również nazwa interfejsu
    blok kompozytowy będzię się składać z kilku bloków i obiekt klasy implementującej ten interfejs będzie posiadać pole, które będzie listą innych bloków

    Niejednoznaczne jest jednak to w jaki sposób blok kompozytowy powinien zwracać kolor i materiał, przyjmę więc założenie, że blok kompozytowy będzie zawierał
    własne pole odpowiadające za kolor i materiał, niezależne od tego jakie wartości mają bloki które wchodzą w jego skład
     */
    List<Block> getBlocks();
}

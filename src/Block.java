public interface Block {
    /*
        Klasa implementująca ten interfejs będzie musiała zwracać string odpowiadający za kolor i materiał bloku.
        Najoczywistszym rozwiązaniem jest by klasa implementująca ten interfejs posiadała dwa pola(field) będące Stringami
    */
    String getColor();
    String getMaterial();
}

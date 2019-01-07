package ru.rzn.sbt.javaschool.lesson3.cards;

public class Solution {

    /**
     * Колода карт
     *
     * 1. Создайте класс CardImpl в пакете ru.rzn.sbt.javaschool.lesson3.cards, реализующий интерфейс {@link Card} и
     * описывающий игральную карту.
     * 2. В классе CardImpl создайте private поле suit типа int - масть карты.
     * 3. В классе CardImpl создайте неизменяемые классовые поля (static final) типа int или внутренний enum для мастей:
     * "бубны" - 0, "трефы" - 1, "черви" - 2 и "пики" - 3.
     * 4. В классе CardImpl создайте private поле rank типа int - достоинство карты.
     * 5. В классе CardImpl создайте неизменяемые классовые поля (static final) типа int иил внутренний enum для достоинств карт:
     * "туз" - 0, "шестёрка" - 1, "семёрка" - 2, "восьмёрка" - 3, "девятка" - 4, "десятка" - 5, "валет" - 6, "дама" - 7, "король" - 8
     * 6. В классе CardImpl объявите public конструктор с двумя аргументами(int, int): масть и достоинство
     * 7. В классе CardImpl переопределите метод toString, класса Object чтобы он возвращал строку вида "туз бубны", "шестёрка трефы" и т.д.
     *
     * 8. Создайте класс DeckImpl в пакете ru.rzn.sbt.javaschool.lesson3.cards, реализующий интерфейс {@link Deck} и
     * описывающий колоду из 36 игральных карт.
     * 9. В классе DeckImpl создайте private поле CardImpl[][] cards.
     * 10. В классе DeckImpl создайте public конструктор без аргументов, в котором инициализируейте поле cards всеми возможными картами.
     * Индексы в массиве должны соответствовать масти и достоинству карт (cards[масть][достоинство]).
     * 11. В классе DeckImpl создайте public метод получения произвольной карты из колоды getCard(int suit, int rank).
     *
     * 12. В методе logDeck класса Solution реализуйте создание объекта класса DeckImpl и верните его.
     */
    public static Deck getDeck() {

        DecImpl o = new DecImpl();

        return o;
    }
}

package blackjack.model

enum class Denomination(val symbol: String, val point: Int) {
    ACE("A", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    JACK("J", 10),
    QUEEN("Q", 10),
    KING("K", 10);

    companion object {

        fun findBySymbol(symbol: String) = values().first { it.symbol == symbol }

        fun isAce(point: Int) = ACE.point == point
    }
}

package blackjack.model

import java.util.LinkedList
import java.util.Queue

object Deck {
    const val TOTAL_DECK_SIZE = 52

    val cards: Queue<Card> = LinkedList<Card>(
        accumulateCards()
            .flatten()
            .shuffled()
    )

    fun pop(): Card = cards.poll()

    private fun accumulateCards(): List<List<Card>> =
        Denomination.values()
            .map(Deck::setupCard)

    private fun setupCard(denomination: Denomination): List<Card> =
        Shape.values().map { shape ->
            Card(denomination, shape)
        }
}

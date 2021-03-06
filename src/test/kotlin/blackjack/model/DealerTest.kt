package blackjack.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DealerTest {

    @Test
    fun `한 장 더 받기 가능 여부`() {
        val dealer = Dealer().apply {
            requestCard(Card(Denomination.ACE, Shape.DIAMOND))
            requestCard(Card(Denomination.FIVE, Shape.DIAMOND))
        }

        assertThat(dealer.checkIfExtraCardOrNot()).isTrue()
    }

    @Test
    fun `한 장 더 받기`() {
        val dealer = Dealer().apply {
            requestCard(Card(Denomination.ACE, Shape.DIAMOND))
            requestCard(Card(Denomination.FIVE, Shape.DIAMOND))
        }

        dealer.requestCardIfPossibleExtraCard(Card(Denomination.TWO, Shape.CLUB))

        assertThat(dealer.myCards.size).isEqualTo(3)
    }
}

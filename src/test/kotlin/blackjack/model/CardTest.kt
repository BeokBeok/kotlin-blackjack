package blackjack.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardTest {

    @Test
    fun `카드 만들기`() {
        val card =
            Card(Denomination.ACE, Shape.CLUB)

        assertThat(card.toString()).isEqualTo("A클로버")
    }
}

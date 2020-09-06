package step2.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {
    private Ladder ladder;

    @Test
    void create_Ladder_Collection() {
        ladder = Ladder.of(Height.valueOf(4), 4, () -> true);
        assertThat(ladder.getLineOfHeight(0)).isNotNull();
    }
}
package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LottoRankTest {

    @DisplayName("일치 개수와 보너스 여부에 따라 정확한 등수를 반환한다.")
    @ParameterizedTest
    @CsvSource({
            // matchingCount, isSecond, expectedRank
            "6, false, FIRST",   // 1등 (보너스 상관없음)
            "6, true, FIRST",    // 1등 (보너스 상관없음)

            "5, true, SECOND",   // 2등 (5개 일치, 보너스 일치)
            "5, false, THIRD",   // 3등 (5개 일치, 보너스 불일치)

            "4, false, FOURTH",  // 4등 (보너스 상관없음)
            "4, true, FOURTH",   // 4등 (보너스 상관없음)

            "3, false, FIFTH",   // 5등 (보너스 상관없음)
            "3, true, FIFTH",    // 5등 (보너스 상관없음)

            "2, false, MISS",    // 꽝
            "2, true, MISS",     // 꽝
            "1, false, MISS",    // 꽝
            "1, false, MISS",    // 꽝
            "0, true, MISS",     // 꽝
            "0, false, MISS"     // 꽝
    })
    void getRankTest(int matchingCount, boolean isSecond, LottoRank expectedRank) {
        LottoRank actualRank = LottoRank.getRank(matchingCount, isSecond);

        assertThat(actualRank).isEqualTo(expectedRank);

    }
}
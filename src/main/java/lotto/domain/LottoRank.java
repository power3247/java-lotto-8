package lotto.domain;

import java.util.Arrays;

public enum LottoRank {
    FIRST("1등", 2000000000, 6),
    SECOND("2등", 30000000, 5),
    THIRD("3등", 1500000, 5),
    FOURTH("4등", 50000, 4),
    FIFTH("5등", 5000, 3),
    MISS("없음",0,0);

    private String lottoRank;
    private long lottoPrize;
    private int matchingCount;

    private LottoRank(String lottoRank, int lottoPrize, int matchingCount) {
        this.lottoRank = lottoRank;
        this.lottoPrize = lottoPrize;
        this.matchingCount = matchingCount;
    }

    public String getLottoRank() {
        return lottoRank;
    }

    public long getLottoPrize() {
        return lottoPrize;
    }

    public int getMatchingCount() {
        return matchingCount;
    }

    public static LottoRank getRank(long matchingCount, boolean isSecond) {
        if ((!isSecond) && matchingCount == THIRD.getMatchingCount()) {
            return THIRD;
        }
        return Arrays.stream(values())
                .filter(rank -> rank.matchingCount == matchingCount)
                .findFirst()
                .orElse(MISS);
    }

}

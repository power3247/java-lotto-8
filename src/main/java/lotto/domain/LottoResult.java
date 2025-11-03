package lotto.domain;

import java.util.List;

public class LottoResult {
    List<LottoRank> winingResult;

    public void addWiningResult(Lotto lotto, WinningLotto winningLotto) {
        long matchingCount = winningLotto.getMatchNumberCount(lotto);
        boolean hasBonus = winningLotto.getMatchBonusNumber(lotto);
        winingResult.add(LottoRank.getRank(matchingCount, hasBonus));
    }

    public double calculateProfit(long money) {
        return 0.0;
    }

}

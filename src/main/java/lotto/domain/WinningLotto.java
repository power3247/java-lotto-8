package lotto.domain;

import java.util.List;

public class WinningLotto {
    private Lotto winningLotto;
    private int bonusNumber;

    public WinningLotto(List<Integer> winningNumbers, int bonusNumber) {
        this.winningLotto = new Lotto(winningNumbers);
        this.bonusNumber = bonusNumber;
    }

    public long getMatchNumberCount(Lotto lotto) {
        return winningLotto.getNumbers().stream().filter(lotto::isInclude).count();
    }

    public boolean getMatchBonusNumber(Lotto lotto) {
        //TODO:보너스 번호가 포함되어 있는지 확인
    }
}

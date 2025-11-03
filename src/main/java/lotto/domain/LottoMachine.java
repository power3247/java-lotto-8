package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import java.util.stream.IntStream;

public class LottoMachine {
    final private static int LOTTO_PRICE = 1000;

    public Lottos issue(int money) {
        int ticketCount = calculateTicketCount(money);

        List<Lotto> generatedLottoTickets = IntStream.range(0, ticketCount)
                .mapToObj(unusedVariable -> new Lotto(Randoms.pickUniqueNumbersInRange(1, 45, 6)))
                .toList();

        return new Lottos(generatedLottoTickets);

    }

    private int calculateTicketCount(int money) {
        return money / LOTTO_PRICE;
    }

}
package lotto.domain;

import java.util.List;

public class Lottos {
    //TODO: 일급 컬렉션으로 lotto 객체 저장
    List<Lotto> lottos;
    int ticketCount;
    public Lottos(List<Lotto> LottoTickets) {
        this.lottos = LottoTickets;
        this.ticketCount = lottos.size();
    }
}

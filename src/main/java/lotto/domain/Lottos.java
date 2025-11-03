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
    
    public LottoResult getWinningResults() {
        //TODO: 발행한 로또들의 당첨 내역을 확인한다
        // LottoResult#getWinningResult(Lotto)

        return null; //임시
    }
}

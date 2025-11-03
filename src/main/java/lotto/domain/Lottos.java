package lotto.domain;

import java.util.List;

public class Lottos {
    //TODO: 일급 컬렉션으로 lotto 객체 저장
    List<Lotto> lottos;
    int ticketCount;
    long money;

    public Lottos(List<Lotto> LottoTickets, long money) {
        this.lottos = LottoTickets;
        this.ticketCount = lottos.size();
        this.money = money;
    }
    
    public LottoResult getWinningResult() {
        //TODO: 발행한 로또들의 당첨 내역을 확인한다
        LottoResult lottoResult = new LottoResult();
//        lottoResult.addWiningResult();

        return lottoResult; //임시
    }
}

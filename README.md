### 기능목록

* [x] 로또를 n개 발행한다. LottoMachine#issue()  
  * [x] 로또 금액에 맞는 갯수를 계산한다 LottoMachine#calculateTicketCount()
  * [x] Lottos 생성 Lottos()
  * [x] 로또 생성 Lotto(List<Integer>)
    * [x] 로또 번호가 1~45 인지 확인한다 Lotto#validate()
    * [x] 로또 번호가 6개 인지 확인한다 Lotto#validate()
    * [x] 로또 번호가 중복되지 않았는지 확인한다 Lotto#validate()
  * [x] 생성된 List<Lotto>를 Lottos객체에 삽입 Lottos(List<Lotto>)
* [x] 당첨번호를 추첨한다. WinningLotto 
  * [x] 입력받은 당첨Lotto 저장 WinningLotto() 
    * [x] List형태의 번호들 Lotto 객체로 저장 WinningLotto.winningLotto
  * [x] 보너스 번호 저장 WinningLotto.bonusNumber
* 발행한 **로또들**의 당첨 내역을 확인한다 Lottos#getWinningResults()
  * 로또 당첨 결과 확인 LottoResult#getWinningResult()
    * 발행한 하나의 로또와 당첨번호와 비교 WinningLotto#compareNumbers()
* 1~5등 당첨 기준 LottoRank
* 수익률을 계산한다 LottoResult#calculateProfit()
* 입력 Input
* 출력 Output
* 에러시 에러 메시지 출력후 다시 입력받는다 
 
### 기능 요구 사항
#### 간단한 로또 발매기를 구현한다. (bold 핵심 개념, 객체후보)

* **로또 번호**의 숫자 범위는 1~45까지이다.
* **1개의 로또**를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
* **당첨 번호** 추첨 시 중복되지 않는 숫자 6개와 **보너스 번호** 1개를 뽑는다.
* 당첨은 **1등부터 5등**까지 있다. 당첨 기준과 금액은 아래와 같다.
  * 1등: 6개 번호 일치 / 2,000,000,000원
  * 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
  * 3등: 5개 번호 일치 / 1,500,000원
  * 4등: 4개 번호 일치 / 50,000원
  * 5등: 3개 번호 일치 / 5,000원
* 로또 **구입 금액**을 입력하면 구입 금액에 해당하는 만큼 로또를 **발행**해야 한다.
* **로또 1장의 가격**은 1,000원이다.
* **당첨 번호와 보너스 번호를 입력**받는다.
* 사용자가 구매한 로또 번호와 당첨 번호를 비교하여 **당첨 내역** 및 **수익률**을 출력하고 로또 게임을 종료한다.
* 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
* Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.

1~45 까지의 서로 다른 임의의수 6개인 로또번호를 생성한다

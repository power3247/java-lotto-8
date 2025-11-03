package lotto.domain;

import java.util.HashSet;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    //TODO: 로또 1개 생성
    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }

        HashSet<Integer> numbersSet = new HashSet<>(numbers);
        if (numbersSet.size() != numbers.size()) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 중복될 수 없습니다.");
        }

        boolean hasInvalidNumber = numbers.stream()
                .anyMatch(number -> number > 45 || number < 1);
        if (hasInvalidNumber) {
            throw new IllegalArgumentException("[ERROR] 로또 번호의 범위는 1~45 입니다.");
        }

    }

    public boolean isInclude(int number) {
        return numbers.contains(number);
    }

}

package lotto

import camp.nextstep.edu.missionutils.Randoms

object LottoMachine {
    
    fun generate(): Lotto {
        val numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6)
        return Lotto(numbers)
    }
}
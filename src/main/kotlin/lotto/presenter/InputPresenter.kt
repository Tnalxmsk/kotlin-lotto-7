package lotto.presenter

import lotto.view.InputView
import lotto.view.OutputView

class InputPresenter(
    private val inputView: InputView,
    private val outputView: OutputView
) {

    fun onPurchaseAmountInput(): Int {
        while (true) {
            try {
                val amount = inputView.readPurchaseAmount()
                outputView.printNewLine()
                // TODO 검증예외처리
                return amount.toInt()
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }
}
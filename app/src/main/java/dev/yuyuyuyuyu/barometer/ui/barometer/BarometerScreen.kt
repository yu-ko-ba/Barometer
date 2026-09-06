package dev.yuyuyuyuyu.barometer.ui.barometer

import com.slack.circuit.runtime.CircuitUiState
import com.slack.circuit.runtime.screen.ParcelableScreen
import dev.yuyuyuyuyu.barometer.ui.barometer.model.BarometerState
import kotlinx.parcelize.Parcelize

@Parcelize
data object BarometerScreen : ParcelableScreen {
    data class State(
        val barometerState: BarometerState,
    ) : CircuitUiState
}

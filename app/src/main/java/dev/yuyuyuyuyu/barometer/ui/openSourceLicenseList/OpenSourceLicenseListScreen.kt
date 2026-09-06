package dev.yuyuyuyuyu.barometer.ui.openSourceLicenseList

import com.slack.circuit.runtime.CircuitUiState
import com.slack.circuit.runtime.screen.ParcelableScreen
import kotlinx.parcelize.Parcelize

@Parcelize
data object OpenSourceLicenseListScreen : ParcelableScreen {
    data object State : CircuitUiState
}

package maestro.cli.runner.resultview

import maestro.cli.device.Device
import maestro.cli.runner.CommandState

sealed class UiState {

    data class Error(val message: String) : UiState()

    data class Running(
        val device: Device? = null,
        val initCommands: List<CommandState> = emptyList(),
        val commands: List<CommandState>,
    ) : UiState()

}

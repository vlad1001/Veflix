package com.example.veflix.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.veflix.core.util.AppCoroutineDispatchers
import com.example.veflix.core.logger.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dispatchers: AppCoroutineDispatchers,
    private val logger: Logger,
) : ViewModel() {

    private val _navigationActions = MutableSharedFlow<NavigationActions>()
    val navigationActions = _navigationActions.asSharedFlow()

    init {
        viewModelScope.launch(dispatchers.io) {
            submitNavigationAction(NavigationActions.NavigateToLobby)
        }
    }

    private fun submitNavigationAction(action: NavigationActions) {
        viewModelScope.launch(dispatchers.io) {
            _navigationActions.emit(action)
        }
    }
}

sealed interface NavigationActions {
    object NavigateToLobby : NavigationActions
}
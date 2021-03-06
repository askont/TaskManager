package com.weber.yakow.taskmanager.presenter

import com.arellomobile.mvp.InjectViewState
import com.weber.yakow.taskmanager.extension.printConstruction
import com.weber.yakow.taskmanager.presenter.global.BasePresenter
import com.weber.yakow.taskmanager.system.ResourceManager
import ru.terrakok.cicerone.Router
import javax.inject.Inject

/**
 * Created on 09.01.19
 * @author YWeber
 * project TaskManager */
@InjectViewState
class MainPresenter @Inject constructor(
    private val resourceManager: ResourceManager,
    private val router: Router
) : BasePresenter<MainView>() {
    init {
        printConstruction()
    }
}
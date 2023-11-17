package com.example.ucp2

import androidx.lifecycle.ViewModel
import com.example.ucp2.Data.DataClass
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class View : ViewModel(){
    private val _stateUI = MutableStateFlow(DataClass())
    val stateUI: StateFlow<DataClass> = _stateUI.asStateFlow()

    fun setContact(listData:MutableList<String>){
        _stateUI.value = DataClass (
            nama = listData[0],
            nim = listData[1],
            konsentrasi = listData[2],
            judul =  listData[3])
    }
}
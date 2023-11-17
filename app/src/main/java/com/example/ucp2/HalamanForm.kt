package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    onSubmitButtonClick:(MutableList<String>) -> Unit
){
    var nameTxt by rememberSaveable {
        mutableStateOf("")
    }
    var NimTxt by rememberSaveable {
        mutableStateOf("")
    }
    var KonsentrasiTxt by rememberSaveable {
        mutableStateOf("")
    }
    var JudulTxt by remember {
        mutableStateOf("")
    }
    var  listDataTxt : MutableList<String> = mutableListOf(nameTxt, NimTxt, KonsentrasiTxt,JudulTxt)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(text = "Data Pelanggan")
        Spacer(modifier = Modifier.padding(16.dp))
        OutlinedTextField(value = nameTxt, onValueChange ={nameTxt = it },
            label  = { Text(text = "Nama Mahasiswa") } )
        OutlinedTextField(value = NimTxt, onValueChange ={NimTxt = it },
            label  = { Text(text = "NIM") } )
        OutlinedTextField(value = KonsentrasiTxt, onValueChange ={KonsentrasiTxt= it },
            label  = { Text(text = "Konsentrasi") } )
        OutlinedTextField(value = JudulTxt, onValueChange ={JudulTxt= it },
            label  = { Text(text = "Judul Skripsi") } )
        Spacer(modifier = Modifier.padding(16.dp))

        }
    var DosenPembimbing1 by remember{ mutableStateOf("") }
    var DosenPembimbing2 by remember { mutableStateOf("") }

    }

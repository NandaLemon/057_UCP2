package com.example.ucp2

import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

enum class PengelolaHalaman {
    Home,
    Regis,
    Data
}
@Composable
fun RegisAppBAr(
    bisaNavigasiBack: Boolean,
    navigasiUp: () -> Unit,
    modifier: Modifier = Modifier
){
    TopAppBar(title = { Text(stringResource(id = R.string.app_name)) })
}

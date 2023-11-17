package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.ucp2.Data.DataClass
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Halamantampilan(
    dataClass: DataClass,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    val item = listOf(
        Pair(stringResource(R.string.Nama), dataClass.nama),
        Pair(stringResource(R.string.NIM), dataClass.nim),
        Pair(stringResource(R.string.Konsentrasi), dataClass.konsentrasi),
        Pair(stringResource(R.string.Judul_Skripsi), dataClass.judul)
    )
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column(

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Data",
                modifier = Modifier.padding(20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(stringResource(id = R.string.Nama))
                Text(dataClass.nama)
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(stringResource(id = R.string.NIM))
                Text(dataClass.nim)
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(stringResource(id = R.string.Konsentrasi))
                Text(dataClass.konsentrasi)
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(stringResource(id = R.string.Judul_Skripsi))
                Text(dataClass.judul)
            }

            Text(
                text = "Detail Item",
                modifier = Modifier.padding(20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

        }
        Column(
            modifier = Modifier.padding(35.dp),
            verticalArrangement = Arrangement.spacedBy(25.dp)
        ) {
            item.forEach { item ->
                Column {
                    Text(item.first.uppercase())
                    Text(text = item.second.toString(), fontWeight = FontWeight.Bold)
                }

                Spacer(modifier = Modifier.height(13.dp))

            }
            Row(
                modifier = Modifier
                    .weight(1f, false)
                    .padding(14.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Button(modifier = Modifier.fillMaxWidth(),
                        onClick = {}
                    ) {
                    }
                    OutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = onBackButtonClicked
                    ) {
                        Text(stringResource(R.string.Back))
                    }
                }
            }
        }
    }
}
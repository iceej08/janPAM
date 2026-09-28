package com.example.janpam1.praktikum1

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun HalamanUtama(){
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize().
    padding(top = 56.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        ProfilMahasiswa()

        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = { // Intent ke WhatsApp
            val url = "https://wa.me/6282268951368" //Ganti dengan nomor bebas
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse(url)
            )
            context.startActivity(intent)
        }) {
            Text("Hubungi via WhatsApp")
        }
    }
}
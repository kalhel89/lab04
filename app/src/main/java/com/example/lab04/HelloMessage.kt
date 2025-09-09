package com.example.lab04

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HelloMessage(name: String) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Hello, $name!", style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Welcome to Lab04 🚀")
    }
}

@Preview(showBackground = true)
@Composable
fun HelloMessagePreview() {
    HelloMessage("Kalhel")
}
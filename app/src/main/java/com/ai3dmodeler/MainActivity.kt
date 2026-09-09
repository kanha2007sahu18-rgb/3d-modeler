package com.ai3dmodeler

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "AI 3D Modeler",
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text("Create 3D models using AI")

                    Spacer(modifier = Modifier.height(30.dp))

                    Button(onClick = {}) {
                        Text("Generate 3D Model")
                    }
                }
            }
        }
    }
}
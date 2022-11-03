package com.example.figmarelayplugin

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.figmarelayplugin.actionbutton.ActionButton
import com.example.figmarelayplugin.actionbutton.Design
import com.example.figmarelayplugin.ui.theme.FigmaRelayPluginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FigmaRelayPluginTheme {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    ActionButton(
                        text = "Hello world!",
                        modifier = Modifier.fillMaxWidth(),
                        design = Design.Primary,
                        onClick = {
                            Toast.makeText(
                                applicationContext,
                                "Hello world!",
                                Toast.LENGTH_LONG
                            ).show()
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = null
                            )
                        }
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ActionButton(
                        text = "Secondary CTA!",
                        modifier = Modifier.fillMaxWidth(),
                        design = Design.Secondary,
                        onClick = {
                            Toast.makeText(
                                applicationContext,
                                "Secondary CTA!",
                                Toast.LENGTH_LONG
                            ).show()
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = null,
                                tint = Color(0xFF00f15e)
                            )
                        }
                    )
                }
            }
        }
    }
}
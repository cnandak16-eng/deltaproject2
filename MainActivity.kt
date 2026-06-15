package com.example.astrodefender

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.astrodefender.ui.theme.AstrodefenderTheme
import com.example.astrodefender.game.GameView
private lateinit var gameView: GameView
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gameView = GameView(this)
        setContentView(gameView)
    }
    override fun onDestroy() {
        super.onDestroy()
        gameView.releaseResources()
    }
}


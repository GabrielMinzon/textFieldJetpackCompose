package com.example.textfieldjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.textfieldjetpackcompose.ui.theme.TextFieldJetpackComposeTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainAppContent()

        }
    }
}

@Composable
fun MainAppContent(){
    var txtFildValue by remember{
        mutableStateOf("")
    }

    TextFieldJetpackComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            TextField(value = txtFildValue, onValueChange = { txtFildValue = it })
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MainAppContent()
}
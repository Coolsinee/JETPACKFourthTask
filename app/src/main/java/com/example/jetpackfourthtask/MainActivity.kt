package com.example.jetpackfourthtask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackfourthtask.ui.theme.JETPACKFourthTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //KotlinCode()
            KotlinCode2()
        }
    }
}

@Composable
public fun KotlinCode() {
    Column{
        val createMessage = {hour: Int ->
            if (hour > 18) {
                "Добрый вечер"
            } else if (hour > 10) {
                "Добрый день"
            } else {
                "Доброе утро"
            }
        }

        Text(text = createMessage(5), fontSize = 28.sp)
        Text(text = createMessage(15), fontSize = 28.sp)
        Text(text = createMessage(2), fontSize = 28.sp)
    }
}

@Composable
public fun KotlinCode2() {
    val (value, setValue) = remember{mutableStateOf("Hello Jetpack")}

    Text(
        text = value,
        fontSize = 28.sp,
        modifier = Modifier.clickable( onClick = { setValue("Hello Metanit.com")})
    )
}
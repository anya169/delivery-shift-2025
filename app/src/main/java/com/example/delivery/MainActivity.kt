package com.example.delivery

import android.os.Bundle
import android.text.style.LineHeightSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.TextUnit


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                SetText(
                    "Мы доставим ваш заказ",
                    28,
                    700,
                    36,
                    16,
                    32,
                    20, 28, 36)
                SetText(
                    "Отправляйте посылки в приложении Шифт Delivery",
                    16,
                    300,
                    24,
                    16,
                    8,
                    99, 112, 131)
            }

        }
    }

}

@Composable
fun SetText(text: String, size: Int, weight: Int, height: Int, start: Int, top: Int, red: Int, green: Int, black: Int) {
    Text(text = text,
        fontSize = size.sp,
        fontFamily = FontFamily(Font(R.font.inter)),
        fontWeight = FontWeight(weight),
        style = TextStyle(lineHeight = height.sp),
        color = Color(red, green, black),
        modifier = Modifier
            .padding(
                start = start.dp,
                top = top.dp)
    )
}
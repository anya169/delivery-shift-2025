package com.example.delivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight



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
                Box(                                     //белая рамка
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(328.dp, 88.dp)
                        .padding(16.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(255, 255, 255)),
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.padding(16.dp)
                    ) {
                        PackageSvg(modifier = Modifier.size(56.dp))
                        Spacer(modifier = Modifier.width(16.dp))
                        QR(modifier = Modifier.size(56.dp))
                        Spacer(modifier = Modifier.width(16.dp))
                        SetText(
                            "Наведите камеру телефона нa QR‑код",
                            14,
                            400,
                            20,
                            16,
                            32,
                            99, 112, 131)
                    }
                }
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

@Composable
fun PackageSvg(modifier: Modifier) {
    Image(
        imageVector = ImageVector.vectorResource(R.drawable.package_open),
        contentDescription = "Голубая открытая коробка",
        modifier = modifier
    )
}

@Composable
fun QR(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.qr),
        contentDescription = "QR code",
        modifier = modifier
    )
}
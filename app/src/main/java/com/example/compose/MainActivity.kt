package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface {
                    newtext()
                    kittensImages()
                    lazyColumn(vertical = Alignment.Top, Arrangement.End)

                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun newtext(){
        Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.End,) {
            Text("ИКБО-06", modifier = Modifier)
            Text("-22")
        }
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.End) {
            Text("Соваренко", style = MaterialTheme.typography.displayMedium)
            Text("Василий", style = MaterialTheme.typography.bodyLarge)
            Text("Васильевич", style = MaterialTheme.typography.titleSmall)
            Button(onClick = {},  ) {
                Text("new button")
            }
        }



    }
    @Preview(showBackground = true)
    @Composable
    fun kittensImages(){
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.End) {
            Image(
                painter = painterResource(R.drawable.cat1),
                contentDescription = "кот1"

            )
            Image(
                painter = painterResource(R.drawable.cat2),
                contentDescription = "кот1"
            )
        }

    }
    @Composable
    fun lazyColumn(vertical: Alignment.Vertical, horizontal: Arrangement.Horizontal){
        LazyColumn {
            itemsIndexed(
                listOf("Замечательный котик",
                    "Очаровательный котик",
                    "Смешной котик",
                    "Неповторимый котик",
                    "Умный котик",
                    "Мягкий котик",
                    "Ласковый котик",
                    "Королевский котик",
                    "Любопытный котик",
                    "Милый котик",
                    "Великолепный котик",
                    "Забавный котик",
                    "Прекрасный котик",
                    "Пушистый котик",
                    "Теплый котик",
                    "Очаровательный маленький котик",
                    "Мечтательный котик",
                    "Нежный котик",
                    "Веселый котик",
                    "Шаловливый котик",
                    "Игривый котик",
                    "Сонный котик",
                    "Заботливый котик",
                    "Непоседливый котик",
                    "Ловкий котик",
                    "Храбрый котик",
                    "Лапочка-котик",
                    "Мурлыкающий котик",
                    "Любимый котик",
                    "Уютный котик",
                    "Непредсказуемый котик",
                    "Загадочный котик",
                    "Мягонький котик",
                    "Сладкий котик",
                    "Веселый и радостный котик",
                    "Смешной маленький котик",
                    "Добрый котик",
                    "Нежный и пушистый котик",
                    "Радостный котик",
                    "Король домашних котиков",
                    "Ласковый мурлыкающий котик",
                    "Обожаемый котик",
                    "Теплый и нежный котик",
                    "Чудесный котик",
                    "Солнышко-котик",
                    "Неповторимый пушистый котик",
                    "Очаровательный и ласковый котик",
                    "Мягкий и нежный котик",
                    "Сонный пушистый котик",
                    "Кото-улыбка",
                    "Сказочный котик",
                    "Шустрый котик",
                    "Хитрый котик",
                    "Игривый и радостный котик",
                    "Талантливый котик",
                    "Мечтательный маленький котик",
                    "Гармоничный котик",
                    "Забавный и шаловливый котик",
                    "Лучший друг-котик",
                    "Необычайный котик",
                    "Нежнейший котик",
                    "Солнечный пушистый котик",
                    "Королевский мурлыкающий котик",
                    "Забавный маленький котик",
                    "Ловкий и умный котик",
                    "Настоящий герой-котик",
                    "Любознательный котик",
                    "Озорной котик",
                    "Неугомонный котик",
                    "Сладкий маленький котик",
                    "Смешной пушистый котик",
                    "Очаровательный мурлыкающий котик",
                    "Шаловливый и милый котик",
                    "Искрометный котик",
                    "Мягкий и теплый котик",
                    "Забавный милый котик",
                    "Ласковый и уютный котик",
                    "Прыгучий котик",
                    "Маленький озорной котик",
                    "Любимчик-котик",
                    "Котик с большим сердцем",
                    "Нежный сонный котик",
                    "Пушистый домашний котик",
                    "Лапочка пушистый котик",
                    "Озорной веселый котик",
                    "Мягкий и добрый котик",
                    "Неповторимый и нежный котик",
                    "Теплый маленький котик",
                    "Забавный мурлыкающий котик",
                    "Ласковый маленький котик",
                    "Королевский пушистый котик",
                    "Заботливый пушистый котик",
                    "Шустренький котик",
                    "Игривый мурлыкающий котик",
                    "Милый пушистый котик")

            )
            {_, item->
                Text(
                    text = item
                )

            }
        }
    }
}

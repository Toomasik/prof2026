package com.example.myapplication.presentation.on_boarding

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.presentation.reusable.Space
import com.example.myapplication.presentation.ui.theme.Blue
import com.example.myapplication.presentation.ui.theme.Dark
import com.example.myapplication.presentation.ui.theme.DarkGray
import com.example.myapplication.presentation.ui.theme.LightGray
import com.example.myapplication.presentation.ui.theme.Orange

@Composable
fun OnBoarding() {
    val pagerState = rememberPagerState { 3 }
    val images = listOf(
        painterResource(R.drawable.on_board_img1),
        painterResource(R.drawable.on_board_img2),
        painterResource(R.drawable.on_board_img3),
    )
    val titles = listOf(
        "Confidence in your words",
        "Take your time to learn",
        "The lessons you need to learn",
    )
    val subtitles = listOf(
        "With conversation-based learning, you'll be talking from lesson one",
        "Develop a habit of learning and make it a part of your daily routine",
        "Using a variety of learning styles to learn and retain",
    )
    val buttontexts = listOf(
        "Next",
        "More",
        "Choose a language",
    )
    HorizontalPager(pagerState) { pageIndex ->
        OnBoardingPage(
            images[pageIndex],
            pagerState,
            titles[pageIndex],
            subtitles[pageIndex],
            buttontexts[pageIndex]
        )
    }
}

@Composable
fun OnBoardingPage(
    image: Painter,
    pagerState: PagerState,
    title: String,
    subTitle: String,
    butttonText: String
) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Space(height = 150.dp)
        Image(
            image,
            null,
            modifier = Modifier.height(240.dp),
            contentScale = ContentScale.FillHeight
        )
        Space(height = 115.dp)
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            for (i in 0..<pagerState.pageCount) {
                val backgroundColor = if (i == pagerState.currentPage) Orange else LightGray
                Box(
                    modifier = Modifier
                        .size(8.dp)
                        .background(backgroundColor, RoundedCornerShape(50))
                )
            }
        }
        Space(height = 40.dp)
        Text(title, color = Dark, fontSize = 22.sp)
        Space(height = 8.dp)
        Text(
            subTitle,
            color = DarkGray,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            style = TextStyle(letterSpacing = 0.01.em),
            modifier = Modifier.width(300.dp)
        )
        Space(height = 50.dp)
        Button(
            {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .fillMaxWidth()
                .background(Blue, RoundedCornerShape(12.dp)),
        ) {
            Text(butttonText, color = Color.White, fontSize = 20.sp)
        }
        Space(height = 16.dp)
        TextButton({}) {
            Text(
                text = "Skip onboarding",
                color = Dark,
                fontSize = 15.sp,
            )
        }
    }

}
package com.codercamp.startabview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState


@OptIn(ExperimentalPagerApi::class)
@Composable
fun StarTabLayout(
    modifier: Modifier = Modifier,
    tabList: List<StarTabItem>,
    tabColor: Color = Color.White,
    tabIndicatorColor: Color = Color.Blue,
) {

    val pagerState = rememberPagerState(initialPage = 0)

    Column(
        modifier = modifier.background(tabColor)
    ) {
        StarTabs(pagerState = pagerState, tabList = tabList, indicatorColor = tabIndicatorColor)
        StarTabsContent(
            pagerState = pagerState,
            tabList = tabList
        )
    }

}

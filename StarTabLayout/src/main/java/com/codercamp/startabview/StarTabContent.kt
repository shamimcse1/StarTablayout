package com.codercamp.startabview

import androidx.compose.runtime.Composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState


@OptIn(ExperimentalPagerApi::class)
@Composable
fun StarTabsContent(tabList: List<StarTabItem>, pagerState: PagerState) {
    HorizontalPager(
        count = tabList.size,state = pagerState) { page ->
        tabList[page].screen()
    }
}
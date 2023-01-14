package com.codercamp.startabview

import androidx.compose.runtime.Composable

typealias ComposableFun = @Composable () -> Unit

data class StarTabItem(
    var title: String,
    var screen: ComposableFun
)

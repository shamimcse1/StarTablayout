<h1 align="center">StarTablayout</h1><br/>
<p align="center"> 
An efficient TabLayout library implemented in Jetpack Compose 🚀
</p>
<br/>

<p align="center">
  
</p>

## Anatomy

1. StarTablayout
2. tabIndicatorColor (Optional, default value: blue)
3. StarTabItem
4. StarTabItem title

## Including in your project
[![](https://jitpack.io/v/shamimcse1/TabLayoutSample.svg)](https://jitpack.io/#shamimcse1/TabLayoutSample)

### Gradle
Add below codes to your **root** `build.gradle` file (not your module build.gradle file).
```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
And add a dependency code to your **module**'s `build.gradle` file.
```gradle
dependencies {
	        implementation 'com.github.shamimcse1:TabLayoutSample:1.0.0'
	}
```

## Basic Usage
Add in you Activity file.

```kotlin
/* specify your tabs */
val tabs = listOf(
    StarTabItem(title = "Tab 1") { TabItemTest(item = "tab1") },
    StarTabItem(title = "Tab 1") { TabItemTest(item = "tab2") },
  
)

Column() {
    StarTabLayout(
        tabIndicatorColor = Color.Blue,
        tabColor = Color.White,
        tabList = tabs,
    )
}

/* in this case TabItemTest contains bellow composable function, but you can pass your functions */
@Composable
fun TabItemTest(item: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = item,
            color = Color.Black,
        )
    }
}
```

## License
```
    Copyright 2022 Md. Shamim Hossain

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

```

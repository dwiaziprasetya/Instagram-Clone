    package com.example.instagram_clone

    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.layout.Arrangement
    import androidx.compose.foundation.layout.Row
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.height
    import androidx.compose.foundation.layout.padding
    import androidx.compose.foundation.layout.size
    import androidx.compose.foundation.layout.width
    import androidx.compose.foundation.lazy.LazyColumn
    import androidx.compose.foundation.lazy.items
    import androidx.compose.material.icons.Icons
    import androidx.compose.material.icons.filled.KeyboardArrowDown
    import androidx.compose.material3.ExperimentalMaterial3Api
    import androidx.compose.material3.Icon
    import androidx.compose.material3.IconButton
    import androidx.compose.material3.MaterialTheme
    import androidx.compose.material3.NavigationBar
    import androidx.compose.material3.NavigationBarItem
    import androidx.compose.material3.NavigationBarItemDefaults
    import androidx.compose.material3.Scaffold
    import androidx.compose.material3.Surface
    import androidx.compose.material3.TopAppBar
    import androidx.compose.material3.TopAppBarDefaults
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.draw.drawWithContent
    import androidx.compose.ui.geometry.Offset
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.input.nestedscroll.nestedScroll
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.unit.dp
    import com.example.instagram_clone.model.dummyPost
    import com.example.instagram_clone.ui.component.BottomBarItem
    import com.example.instagram_clone.ui.component.PostItem
    import com.example.instagram_clone.ui.component.Story
    import com.example.instagram_clone.ui.theme.InstagramCloneTheme

    class MainActivity : ComponentActivity() {
        @OptIn(ExperimentalMaterial3Api::class)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                InstagramCloneTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
                        Scaffold(
                            modifier = Modifier
                                .fillMaxSize()
                                .nestedScroll(scrollBehavior.nestedScrollConnection),
                            topBar = {
                                TopAppBar(
                                    title = {},
                                    navigationIcon = {
                                        Row(
                                            modifier = Modifier
                                                .width(150.dp),
                                            verticalAlignment = Alignment.CenterVertically,
                                        ) {
                                            Image(
                                                painter = painterResource(R.drawable.instagram_text_icon),
                                                contentDescription = null,
                                                modifier = Modifier.padding(start = 8.dp)
                                            )
                                            IconButton(onClick = {}) {
                                                Icon(
                                                    imageVector = Icons.Default.KeyboardArrowDown,
                                                    contentDescription = null
                                                )
                                            }
                                        }
                                    },
                                    actions = {
                                        Row(
                                            modifier = Modifier
                                                .padding(11.dp)
                                                .width(80.dp),
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.SpaceBetween
                                        ) {
                                            Icon(
                                                painter = painterResource(R.drawable.favourite_icon),
                                                contentDescription = "Favourite Icon",
                                                modifier = Modifier.size(30.dp)
                                            )
                                            Icon(
                                                painter = painterResource(R.drawable.messenger_icon),
                                                contentDescription = "Send Icon",
                                            )
                                        }
                                    },
                                    scrollBehavior = scrollBehavior,
                                    colors = TopAppBarDefaults.topAppBarColors(
                                        scrolledContainerColor = Color.White
                                    )
                                )
                            },
                            bottomBar = {
                                NavigationBar(
                                    containerColor = Color.White,
                                    modifier = Modifier
                                        .height(60.dp)
                                        .drawWithContent {
                                            drawContent()
                                            drawLine(
                                                color = Color(0xFFE3E3E3),
                                                start = Offset(0f, 0f),
                                                end = Offset(size.width, 0f),
                                                strokeWidth = 2f
                                            )
                                        }
                                ) {
                                    val navItems = listOf(
                                        BottomBarItem(
                                            title = "Home",
                                            icon = painterResource(R.drawable.home_filled_icon)
                                        ),
                                        BottomBarItem(
                                            title = "Search",
                                            icon = painterResource(R.drawable.search_icon)
                                        ),
                                        BottomBarItem(
                                            title = "Add",
                                            icon = painterResource(R.drawable.add_icon)
                                        ),
                                        BottomBarItem(
                                            title = "Reel",
                                            icon = painterResource(R.drawable.reel_icon)
                                        ),
                                        BottomBarItem(
                                            title = "Account",
                                            icon = painterResource(R.drawable.profile_icon)
                                        ),
                                    )
                                    navItems.map {
                                        NavigationBarItem(
                                            selected = it.title == navItems[0].title,
                                            onClick = {},
                                            icon = {
                                                Icon(
                                                    painter = it.icon,
                                                    contentDescription = it.title,
                                                    modifier = Modifier.size(30.dp)
                                                )
                                            },
                                            colors = NavigationBarItemDefaults.colors(
                                                indicatorColor = Color.White
                                            )
                                        )
                                    }
                                }
                            }
                        ) { padding ->
                            LazyColumn(
                                modifier = Modifier
                                    .padding(padding),
                            ) {
                                item { Story() }
                                items(dummyPost, key = {it.username}) { person ->
                                    PostItem(
                                        username = person.username,
                                        image = person.imagePost,
                                        profileImage = person.imageProfile,
                                        like = person.like,
                                        caption = person.caption,
                                        commentCount = person.commentCount,
                                        timePost = person.timePost
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }

package com.example.myfitnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableInferredTarget
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfitnessapp.data.Datasource
import com.example.myfitnessapp.model.DayTip
import com.example.myfitnessapp.ui.theme.MyFitnessAppTheme

import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore


@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFitnessAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FitnessApp()
                }
            }
        }
    }
}
@ExperimentalMaterial3Api
@Composable
fun FitnessApp() {
    Scaffold(
        topBar = {
            FitnessAppTopBar()
        }
    ) { paddingValues ->
        FitnessList(
            fitnessList = Datasource().loadDayTips(),
            modifier = Modifier.padding(paddingValues)
        )
    }
}

@Composable
fun FitnessList(fitnessList: List<DayTip>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(fitnessList) { dayTip ->
            FitnessCard(
                dayTip = dayTip,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

//@Composable
//fun FitnessCard(dayTip: DayTip, modifier: Modifier = Modifier) {
//    Card(modifier = modifier) {
//        Column {
//            Text(
//                text = "Day ${dayTip.day}",
//                modifier = Modifier.padding(16.dp),
//                style = MaterialTheme.typography.displayLarge
//            )
//            Text(
//            text = LocalContext.current.getString(dayTip.summary),
//            modifier = Modifier.padding(16.dp),
//            style = MaterialTheme.typography.displayMedium
//            )
//            Image(
//                painter = painterResource(dayTip.imageResourceId),
//                contentDescription = stringResource(dayTip.detail),
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(194.dp),
//                contentScale = ContentScale.Fit
//            )
//            Text(
//                text = LocalContext.current.getString(dayTip.detail),
//                modifier = Modifier.padding(16.dp),
//                style = MaterialTheme.typography.displayMedium
//            )
//        }
//    }
//}

@Composable
fun FitnessCard(dayTip: DayTip, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    Card(modifier = modifier) {
        Column(modifier = Modifier
            .clickable { expanded = !expanded }
            .padding(8.dp)
        ) {
            Text(
                text = "Day ${dayTip.day}",
                modifier = Modifier.padding(top = 0.dp, start = 16.dp, end = 16.dp, bottom = 0.dp),
                style = MaterialTheme.typography.displayLarge
            )
            Text(
                text = LocalContext.current.getString(dayTip.summary),
                modifier = Modifier.padding(top = 0.dp, start = 16.dp, end = 16.dp, bottom = 0.dp),
                style = MaterialTheme.typography.displayMedium
            )
            Image(
                painter = painterResource(dayTip.imageResourceId),
                contentDescription = stringResource(dayTip.detail),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Fit
            )
            if (expanded) {
                Text(
                    text = LocalContext.current.getString(dayTip.detail),
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.displayMedium
                )
            }
            IconButton(onClick = { expanded = !expanded }) {
                Icon(
                    imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription = stringResource(R.string.expand_button_content_description)
                )
            }
        }
    }
}


@ExperimentalMaterial3Api
@Composable
fun FitnessAppTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(8.dp),
                    painter = painterResource(R.drawable.gym),
                    contentDescription = null // Decorative image
                )
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.displayLarge
                )
            }
        }
    )
}

package com.example.datastore.util

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.datastore.data.Tasks
import com.example.datastore.util.TaskViewModel
import com.example.datastore.R

@Composable
fun TaskScreen(taskViewModel: TaskViewModel) {
    val firstText = remember {
        mutableStateOf("")
    }
    val secondText = remember {
        mutableStateOf("")
    }
    val thirdText = remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize()) {
        TaskTextField(text = firstText.value, onFieldChange = { firstText.value = it },
            label = { Text(text = stringResource(id = R.string.enter_first_task)) })

        TaskTextField(text = secondText.value, onFieldChange = { secondText.value = it },
            label = { Text(text = stringResource(id = R.string.enter_second_task)) })

        TaskTextField(text = thirdText.value, onFieldChange = { thirdText.value = it },
            label = { Text(text = stringResource(id = R.string.enter_third_task)) })

        TaskButton(onClick = {
            val tasks = Tasks(
                firstTask = firstText.value,
                secondTask = secondText.value,
                thirdTask = thirdText.value
            )
            taskViewModel.saveTaskData(tasks)
        }, text = stringResource(id = R.string.save))
    }
}
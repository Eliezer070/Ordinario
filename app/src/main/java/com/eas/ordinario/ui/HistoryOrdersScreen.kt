/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.eas.ordinario.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eas.ordinario.R
import com.eas.ordinario.data.Order


/**
 * This composable expects [orderUiState] that represents the order state, [onCancelButtonClicked]
 * lambda that triggers canceling the order and passes the final order to [onSendButtonClicked]
 * lambda
 */
@Composable
fun HistoryOrdersScreen(viewModel: OrderViewModel) {
    val ordersList by viewModel.getAll().collectAsState(initial = emptyList())
    //Columna para ver los resultados de la consulta
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {

        // Display the list of users with the same matricula
        LazyColumn(
            modifier = Modifier.weight(.9F),
            verticalArrangement = Arrangement.Center
        ) {
            items(ordersList) { order ->
                ProductItem(order)
            }
        }
    }
}

@Composable
fun ProductItem(order: Order) {

    Row(verticalAlignment = Alignment.CenterVertically) {

    }

}
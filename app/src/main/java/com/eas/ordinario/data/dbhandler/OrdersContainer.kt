package com.eas.ordinario.data.dbhandler

import android.content.Context
import com.eas.ordinario.data.OrderDataBase

class OrdersContainer (private val context: Context) {
    val orderRepository: OrderRepository by lazy {
        OrderRepository(OrderDataBase.getOrderDatabase(context).orderDao())
    }
}
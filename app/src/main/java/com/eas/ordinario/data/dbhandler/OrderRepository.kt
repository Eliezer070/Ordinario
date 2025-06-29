package com.eas.ordinario.data.dbhandler

import com.eas.ordinario.data.Order
import com.eas.ordinario.data.OrderDao
import kotlinx.coroutines.flow.Flow

class OrderRepository(private val userDao: OrderDao) {
    fun getAll():  Flow<List<Order>> = userDao.getOrders()

    suspend fun insertUser(order: Order)
            = userDao.insertOrder(order)

}
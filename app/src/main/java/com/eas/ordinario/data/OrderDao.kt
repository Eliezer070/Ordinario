package com.eas.ordinario.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface OrderDao {

    @Insert
    suspend fun insertOrder()

    @Delete
    suspend fun deleteAllUsers(order: Order)

    @Query("SELECT * from OrderData order by id DESC")
    fun getOrders():  Flow<List<Order>>
}
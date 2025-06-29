package com.eas.ordinario.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Order::class], version = 1)
abstract class OrderDataBase: RoomDatabase() {
    abstract fun orderDao(): OrderDao

    companion object {
        @Volatile
        private var Instance: OrderDataBase? = null

        fun getOrderDatabase(context: Context): OrderDataBase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context = context,
                    klass = OrderDataBase::class.java,
                    name = "Orders"
                )
                    .build()
                    .also { Instance = it }
            }
        }
    }
}
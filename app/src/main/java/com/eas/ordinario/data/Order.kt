package com.eas.ordinario.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "OrderData")
data class Order(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "flavor")
    val flavor: String,
    @ColumnInfo(name = "quantity")
    val quantity: String,
    @ColumnInfo(name = "pickupdate")
    val pickupdate: String,
    @ColumnInfo(name = "total")
    val total: String
)

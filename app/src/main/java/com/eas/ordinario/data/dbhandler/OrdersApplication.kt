package com.eas.ordinario.data.dbhandler

import android.app.Application

class OrdersApplication : Application() {
    lateinit var container: OrdersContainer

    override fun onCreate() {
        super.onCreate()
        container = OrdersContainer(this)
    }

}
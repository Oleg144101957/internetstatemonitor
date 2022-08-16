package com.vishnevskiypro.internetstatemonitor

import kotlinx.coroutines.flow.Flow

interface ConnectivityObserver {

    fun observe(): Flow<Status>

    enum class Status{
        Available, Unavailable, Losing, Lost
    }
}
package com.drsync.cryptocurrencyapp.domain.repository

import com.drsync.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.drsync.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}
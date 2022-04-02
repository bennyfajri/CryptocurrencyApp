package com.drsync.cryptocurrencyapp.data.repository

import com.drsync.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.drsync.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.drsync.cryptocurrencyapp.data.remote.dto.CoinDto
import com.drsync.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}
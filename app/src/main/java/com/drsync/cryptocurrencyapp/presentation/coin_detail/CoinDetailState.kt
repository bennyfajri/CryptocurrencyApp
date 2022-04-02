package com.drsync.cryptocurrencyapp.presentation.coin_detail

import com.drsync.cryptocurrencyapp.domain.model.Coin
import com.drsync.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)

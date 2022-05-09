package com.example.daggerhiltcryptoapp

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}
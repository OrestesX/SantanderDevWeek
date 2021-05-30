package com.santanderdevweekmobile.data

data class Conta (
    val numero: String,
    val agencia: String,
    val saldo: String,
    val limite: String,
    val cartao: Cartao,
    val cliente: Cliente
)
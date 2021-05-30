package com.santanderdevweekmobile.data.local

import com.santanderdevweekmobile.data.Cartao
import com.santanderdevweekmobile.data.Cliente
import com.santanderdevweekmobile.data.Conta

class FakeData {
    fun getLocalData():Conta {
        val cliente = Cliente("Marta Andrada")
        val cartao = Cartao("5026")
        return Conta(
            "01045876-7",
            "4583-7",
            "R$ 13.487,12",
            "R$ 16.987,12",
            cartao, cliente)

    }
}
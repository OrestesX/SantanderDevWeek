package com.santanderdevweekmobile

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate=menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item1 -> {
                Log.d("CLICK", "Click no item 1")
                true
            }
            else -> return when (item.itemId) {
                R.id.item2 -> {
                    Log.d("CLICK", "Acesse o item 2")
                    true
                }
                else->super.onOptionsItemSelected(item)
        }
        }
}
}
package com.helehpro.konperse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.helehpro.konperse.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tombol.setOnClickListener { converse() }
    }

    fun converse(){
        val uang = ((binding.jumlahUang.text).toString()).toDouble()
        val nilaikonversi = when (binding.pilihanUang.checkedRadioButtonId){
            R.id.euro -> 15657.86
            R.id.dollar -> 14349.15
            R.id.yen -> 114.43
            else -> 3826.75
        }
        var hasil = uang * nilaikonversi
        val indonesia = Locale("in", "ID")
        val format = NumberFormat.getCurrencyInstance(indonesia).format(hasil)
        binding.hasil.text = getString(R.string.hasil, format)
    }
}
package com.helehpro.viewview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.helehpro.viewview.adapter.ItemAdapter
import com.helehpro.viewview.data.Dataresource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataSetKu = Dataresource().muatPekerjaan()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, dataSetKu)
        recyclerView.setHasFixedSize(true)
    }
}
package com.helehpro.viewview.data
import com.helehpro.viewview.R
import com.helehpro.viewview.model.Pekerjaan

class Dataresource {
    fun muatPekerjaan(): List<Pekerjaan>{
        return listOf<Pekerjaan>(
            Pekerjaan(R.string.programmer, R.drawable.programmer),
            Pekerjaan(R.string.polisi, R.drawable.polisi),
            Pekerjaan(R.string.guru, R.drawable.guru),
            Pekerjaan(R.string.petani, R.drawable.petani),
            Pekerjaan(R.string.dosen, R.drawable.dosen),
            Pekerjaan(R.string.pengusaha, R.drawable.pengusaha),
            Pekerjaan(R.string.dokter, R.drawable.dokter)
        )
    }
}
package com.example.myserietv

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myserietv.Datamodel.SerieTv

class Adapter(val dataset: ArrayList<SerieTv>,val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    //crea un viewholder
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Crea e restituisce un viewholder, effettuando l'inflate del layout relativo alla riga
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.riga, viewGroup, false))
    }

    // Invocata per conoscere quanti elementi contiene il dataset
    override fun getItemCount(): Int {
        return dataset.size
    }

    // Invocata per visualizzare all'interno del ViewHolder il dato corrispondente alla riga
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val serietv = dataset.get(position)
        viewHolder.tvTitolo.text = serietv.titolo
    }
}

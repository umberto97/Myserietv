package com.example.myserietv

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myserietv.Datamodel.SerieTv
import kotlinx.android.synthetic.main.fragment_figlio.*

class Fragment_figlio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_figlio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Estraggo il parametro (birra) dal bundle ed eventualmente lo visualizzo
        arguments?.let {
            val birra: SerieTv? = it.getParcelable("serietv")   //TODO: Il nome dovrebbe essere in un unico punto!!
            birra?.let {
                titolo_figlio.text = it.titolo
                genere_figlio.text = it.genere
                data_figlio.text = String.format("%d", it.data)
            }
        }
    }
}

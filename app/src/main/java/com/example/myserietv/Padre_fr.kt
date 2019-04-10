package com.example.myserietv

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myserietv.Datamodel.Database
import kotlinx.android.synthetic.main.fragment_padre_fr.*

/**
 * A simple [Fragment] subclass.
 *
 */
class Padre_fr : Fragment() {

    // L'adapter va dichiarato lateinit per inizializzarlo dopo la creazione della view
    private lateinit var adapter: Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_padre_fr, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Imposto il layout manager a lineare per avere scrolling in una direzione
        lista_serietv.layoutManager = LinearLayoutManager(activity)

        // Associo l'adapter alla RecyclerView
        adapter = Adapter(Database.getElencoSerietv(), requireContext())
        lista_serietv.adapter = adapter
    }
}

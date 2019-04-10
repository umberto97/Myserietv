package com.example.myserietv.Datamodel

object Database {
    //array che rappresenta le singole serie tv
    private var array_serie = ArrayList<SerieTv>()
    //quando viene istanziato un database esso eseguirà ciò che sta in init
    init {
        //inizialmente il database contiene una serietv
        for(i in 1..20)array_serie.add(SerieTv("The Punisher","Azione",2016))
    }

    // Restituisce l'elenco di tutte le serietv presenti
    fun getElencoSerietv() : ArrayList<SerieTv> {
        return array_serie
    }

    //aggiunge una nuova birra nel database
    fun salvaSerietv(x : SerieTv) {
        array_serie.add(x)
    }
}
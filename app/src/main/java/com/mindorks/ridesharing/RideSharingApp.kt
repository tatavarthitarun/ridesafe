package com.mindorks.ridesharing

import android.app.Application
import com.google.android.libraries.places.api.Places
import com.google.maps.GeoApiContext
import com.mindorks.ridesharing.simulator.Simulator

class RideSharingApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Places.initialize(applicationContext, "AIzaSyAM4yFx07QcbFM-qWNtvYxNGdzGR8qdLbg")
        Simulator.geoApiContext = GeoApiContext.Builder()
            .apiKey("AIzaSyAM4yFx07QcbFM-qWNtvYxNGdzGR8qdLbg")
            .build()
    }

}
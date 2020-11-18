package ise308.yilmazturk.alper.tripinformation

import android.util.Log
//Child class
class Automobile (vModel : String, fueltype: String, fuelBurnedat100km: Double, tankVolume: Int): Vehicle(vModel,fueltype,fuelBurnedat100km,tankVolume){

    companion object{
        const val TAG = "Automobile"
    }
    var numOfSeats: Int = 0
        set(value) { //Override the setter of a property
            if (value!=5){
                Log.i(TAG,"set: The automobile must have 5 seat.")
                field=5
            }
            else{
                field=value
            }
        }
    override fun vehicleMaintenance() {
        Log.i(TAG,"vehicleMaintenance: Take the automobile to the service.")
    }
}
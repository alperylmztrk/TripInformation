package ise308.yilmazturk.alper.tripinformation

import android.util.Log
//Child class
class Motorcycle (vModel : String, fueltype: String, fuelBurnedat100km: Double, tankVolume: Int,numOfWheels: Int): Vehicle(vModel,fueltype,fuelBurnedat100km,tankVolume) {

    companion object{
        const val TAG = "Motorcycle"
    }
    init {
        Log.i(TAG,"The motorcycle has $numOfWheels wheels.")
    }
    var numOfSeats: Int = 0
        set(value) { //Override the setter of a property
            if (value!=1){
                Log.i(TAG,"set: The motorcycle must have 1 seat.")
                field=1
            }
            else{
                field=value
            }
        }
    override fun vehicleMaintenance() {
        Log.i(TAG,"vehicleMaintenance: Take the motorcycle to the service.")
    }
}
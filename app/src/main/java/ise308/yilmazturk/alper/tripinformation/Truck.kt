package ise308.yilmazturk.alper.tripinformation

import android.util.Log
//Child class
class Truck (vModel : String, fueltype: String, fuelBurnedat100km: Double, tankVolume: Int,numOfWheels: Int): Vehicle(vModel,fueltype,fuelBurnedat100km,tankVolume){

    companion object{
        const val TAG = "Truck"
    }
    init {
        Log.i(TAG,"The truck has $numOfWheels wheels.")
    }
    var numOfSeats: Int = 0
        set(value) { //Override the setter of a property
            if (value!=3){
                Log.i(TAG,"set: The truck must have 1 seat.")
                field=3
            }
            else{
                field=value
            }
        }
    override fun vehicleMaintenance() {
        Log.i(TAG,"vehicleMaintenance: Take the truck to the service.")
    }
}
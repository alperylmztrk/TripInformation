package ise308.yilmazturk.alper.tripinformation

import android.util.Log

const val dieselPrice:Double=6.38
const val gasolinePrice:Double=7.02
//Parent class
open class Vehicle (var vModel : String, var fueltype: String, var fuelBurnedat100km: Double,var tankVolume: Int) {//Primary constructor
    var km:Int=0
    var tsFuel: Double=0.0
        constructor(vModel : String, fueltype:String, fuelBurnedat100km: Double, tankVolume:Int, km:Int):this(vModel, fueltype, fuelBurnedat100km, tankVolume){//Secondary consturctor
            this.km=km
        }
    companion object{
        const val TAG = "Vehicle"
    }
    init {
        if (fueltype=="diesel"){
            Log.i(TAG,"Travelling by $vModel, which has a fuel tank of $tankVolume litres and consumes $fuelBurnedat100km litres of diesel per 100km.")
        }
        else{
            Log.i(TAG,"Travelling by $vModel, which has a fuel tank of $tankVolume litres and consumes $fuelBurnedat100km litres of gasoline per 100km.")
        }
    }
    fun totalSpentFuel(km: Int, fuelBurnedat100km: Double): Double{
        tsFuel = (fuelBurnedat100km/100)*km
        if (fueltype == "diesel") {
           Log.i(TAG,"totalSpentFuel: $tsFuel litres of diesel is consumed for $km km")
        }
        else{
            Log.i(TAG,"totalSpentFuel: $tsFuel litres of gasoline is consumed for $km km")
        }
        return tsFuel
    }
    fun calculatePrice() {
        var price: Double
        if (fueltype == "diesel") {
            price = totalSpentFuel(km, fuelBurnedat100km) * dieselPrice
            Log.i(TAG,"calculatePrice: $price ₺ is paid for $tsFuel litres of diesel")
        }
        else{
            price = totalSpentFuel(km,fuelBurnedat100km) * gasolinePrice
            Log.i(TAG,"calculatePrice: $price ₺ is paid for $tsFuel litres of gasoline")
        }
    }
   open fun vehicleMaintenance(){//Override a function
       Log.i(TAG,"vehicleMaintenance: Take the vehicle to the service.")
    }
    //Overload a function
    fun passengers(d1:String){
        Log.i(TAG, "passengers: Motorcycle rider is $d1")
    }
    fun passengers(d1:String,p1:String,p2:String){
        Log.i(TAG, "passengers: Truck driver is $d1 passengers are $p1 and $p2")
    }
    fun passengers(d1:String,p1:String,p2:String,p3:String,p4:String){
        Log.i(TAG, "passengers: Automobile driver is $d1 passengers are $p1, $p2, $p3 and $p4")
    }

}
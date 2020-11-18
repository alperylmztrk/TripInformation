package ise308.yilmazturk.alper.tripinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        travelInfo()
    }

    private fun travelInfo() {
        val vehicle1=Vehicle("Vehicle","diesel",8.5,60)
        val clio=Automobile("Renault Clio","diesel",4.7,55)
        vehicle1.passengers("Alper","Sinem","Murat","Nazlı","Ali")
        clio.km=550
        clio.calculatePrice()
        clio.vehicleMaintenance()
        val hondaMotor=Motorcycle("Honda CBF 250","gasoline",3.2,16,2)
        vehicle1.passengers("Alper")
        hondaMotor.km=50
        hondaMotor.numOfSeats=5
        println("The number of seats of the motorcycle is ${hondaMotor.numOfSeats}")
        hondaMotor.calculatePrice()
        hondaMotor.vehicleMaintenance()
        val man=Truck("MAN TGX Efficientline 3","diesel",27.9,160,6)
        vehicle1.passengers("Alper","Berkay","Burcu")
        man.km=1200
        man.numOfSeats=3
        println("The number of seats of the truck is ${man.numOfSeats}")
        man.calculatePrice()
        man.vehicleMaintenance()

    }
}
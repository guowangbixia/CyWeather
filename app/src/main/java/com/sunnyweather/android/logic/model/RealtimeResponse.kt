package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

class RealtimeResponse(val status: String, val result: Result) {

    class Result(val realtime: Realtime)

//    class Realtime(val skycon: String, val temperature: Float, @SerializedName("air_quality") val airQuality: AirQuality)
    class Realtime(val skycon: String, val temperature: Float, @SerializedName("air_quality") val airQuality: AirQuality, val wind:Wind,val humidity:Float,val cloudrate:Float)
    //humidity相对湿度0.xx, cloudrate云量0.xx

    class Wind(val speed:Float,val direction:Float)

    class AirQuality(val aqi: AQI,val pm25:Int)

    class AQI(val chn: Float)

}
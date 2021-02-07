package com.sunnyweather.android.logic.model

class HourlyResponse(val status:String,val result:Result) {
    class Result(val hourly:Hourly)

    class Hourly(val description:String)
    //一段关于整天的天气描述
}
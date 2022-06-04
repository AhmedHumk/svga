package com.addo.svglib


interface SVGACallback {

    fun onPause()
    fun onFinished()
    fun onRepeat()
    fun onStep(frame: Int, percentage: Double)

}
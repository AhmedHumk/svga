package com.addo.svglib.bitmap

import android.graphics.Bitmap
import android.graphics.BitmapFactory

internal object SVGABitmapFileDecoder : SVGABitmapDecoder<String>() {

    override fun onDecode(data: String, ops: BitmapFactory.Options): Bitmap? {
        return BitmapFactory.decodeFile(data, ops)
    }
}
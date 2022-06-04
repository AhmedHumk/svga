package com.addo.svglib.bitmap

import android.graphics.Bitmap
import android.graphics.BitmapFactory


internal object SVGABitmapByteArrayDecoder : SVGABitmapDecoder<ByteArray>() {

    override fun onDecode(data: ByteArray, ops: BitmapFactory.Options): Bitmap? {
        return BitmapFactory.decodeByteArray(data, 0, data.count(), ops)
    }
}
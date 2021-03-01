package io.github.ovso.ex

import android.content.Context

class Datasource(private val context: Context) {
    fun getFlowerList(): Array<String> {
        return context.resources.getStringArray(R.array.flower_array)
    }
}
package io.github.ovso.ex

import android.content.Context
import javax.inject.Inject

class DataSource @Inject constructor(private val context: Context) {
    fun getFlowerList(): Array<String> {
        return context.resources.getStringArray(R.array.flower_array)
    }
}
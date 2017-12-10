package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by Asus on 10-Dec-17.
 */
val Context.layoutInflater get() = LayoutInflater.from(this)
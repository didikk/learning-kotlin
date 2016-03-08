package me.didik.learningkotlin

import android.app.Activity
import android.widget.Toast

/**
 * Created by didik on 08/03/16.
 *
 */

fun Activity.toast(message: String, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, message, duration).show()
}

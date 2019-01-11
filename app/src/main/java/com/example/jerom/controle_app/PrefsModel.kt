package com.example.jerom.controle_app

import com.chibatching.kotpref.KotprefModel

object PrefsModel: KotprefModel() {
    var userMail by stringPref(default = "")
}
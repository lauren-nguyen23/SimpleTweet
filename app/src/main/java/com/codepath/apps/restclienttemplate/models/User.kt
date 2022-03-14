package com.codepath.apps.restclienttemplate.models

import org.json.JSONObject

class User {
    var name: String = ""
    var screenName: String = ""
    var profileImageUrl: String = ""

    companion object {
        fun fromJson (jsonObject: JSONObject): User {
            val user = User()
            user.name = jsonObject.getString("name")
            user.screenName = jsonObject.getString("screen_name")
            user.profileImageUrl = jsonObject.getString("profile_image_url_https")
            return user
        }
    }
}
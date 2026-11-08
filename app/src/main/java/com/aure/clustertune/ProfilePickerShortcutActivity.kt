package com.aure.clustertune

import android.app.Activity
import android.os.Bundle
import com.aure.clustertune.overlay.OverlayHostService

/** Opens the picker without exposing profile or tuning operations to callers. */
class ProfilePickerShortcutActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (intent?.action == "app.pocketoverlay.clustertune.OPEN_PROFILE_PICKER") {
            OverlayHostService.showProfilePicker(applicationContext)
        }
        finish()
    }
}

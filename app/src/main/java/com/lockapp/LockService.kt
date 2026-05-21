package com.lockapp

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class LockService : AccessibilityService() {
    companion object {
        var instance: LockService? = null
    }

    override fun onServiceConnected() {
        instance = this
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
    override fun onInterrupt() {}

    override fun onDestroy() {
        instance = null
    }
}

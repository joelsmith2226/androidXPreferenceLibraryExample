package com.example.basic

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.preference.MultiSelectListPreference
import androidx.preference.PreferenceFragmentCompat
import java.util.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.all_preferences, rootKey)
//        val ages = listOf("0-10", "11-20", "21-30", "31-40", "41-50", "51-60", "60+").toTypedArray()
//        findPreference<MultiSelectListPreference>("age")?.entryValues = ages


//        val context = preferenceManager.context
//        val screen = preferenceManager.createPreferenceScreen(context)
//
//        val notificationPreference = SwitchPreferenceCompat(context)
//        notificationPreference.key = "notifications"
//        notificationPreference.title = "Enable message notifications"
//
//        val notificationCategory = PreferenceCategory(context)
//        notificationCategory.key = "notifications_category"
//        notificationCategory.title = "Notifications"
//        screen.addPreference(notificationCategory)
//        notificationCategory.addPreference(notificationPreference)
//
//        val feedbackPreference = Preference(context)
//        feedbackPreference.key = "feedback"
//        feedbackPreference.title = "Send feedback"
//        feedbackPreference.summary = "Report technical issues or suggest new features"
//
//        val helpCategory = PreferenceCategory(context)
//        helpCategory.key = "help"
//        helpCategory.title = "Help"
//        screen.addPreference(helpCategory)
//        helpCategory.addPreference(feedbackPreference)
//
//        preferenceScreen = screen
    }


}
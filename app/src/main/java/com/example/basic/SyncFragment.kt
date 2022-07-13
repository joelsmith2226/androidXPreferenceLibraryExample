package com.example.basic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.preference.*
import com.example.basic.databinding.FragmentFirstBinding
import java.text.DateFormat.getTimeInstance
import java.text.SimpleDateFormat
import java.util.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SyncFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.sync_preferences, rootKey)

        val syncSummaryProvider = Preference.SummaryProvider<SwitchPreferenceCompat> { preference ->
            val lastSyncTime = getTimeInstance().format(Date())
            if (preference.isChecked) {
                "Last synced at $lastSyncTime"
            } else {
                "Syncing is currently disabled"
            }
        }
        findPreference<SwitchPreferenceCompat>("enableSync")?.summaryProvider = syncSummaryProvider

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
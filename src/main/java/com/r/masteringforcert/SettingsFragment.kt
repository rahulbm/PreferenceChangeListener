package com.r.masteringforcert

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat

class SettingsFragment : PreferenceFragmentCompat(), Preference.OnPreferenceChangeListener {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
        val pref =  findPreference<Preference>("sync")
        pref?.onPreferenceChangeListener = this
    }
    override fun onPreferenceChange(preference: Preference?, newValue: Any?): Boolean {
        Toast.makeText(activity, newValue.toString(), Toast.LENGTH_LONG).show()
        return true
    }
}
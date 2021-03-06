package nz.net.io.jarvis;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * This is for displaying the settings (or preferences) activity
 * @author Aaron Barnes
 */
public class SettingsFragment  extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}

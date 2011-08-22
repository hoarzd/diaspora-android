package org.diaspora.android;

import org.diaspora.android.activityPresets.DiasporaActivity;

import android.os.Bundle;

public class MainActivity extends DiasporaActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setDiasporaContentView(R.layout.main);
    }
}
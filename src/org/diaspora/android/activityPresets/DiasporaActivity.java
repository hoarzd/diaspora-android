package org.diaspora.android.activityPresets;

import org.diaspora.android.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.Window;

/**
 * Extended Activity with stuff like our custom titlebar and so on.
 */
public class DiasporaActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeatures();
    }
    
    /**
     * Build the main menu in every activity
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    
    /**
     * This function should request all "default" window features
     */
    public void requestWindowFeatures() {
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
    }
    
    /**
     * Used to set the view and the titlebar
     */
    public void setDiasporaContentView(Integer view) {
        super.setContentView(view);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar);
    }
}
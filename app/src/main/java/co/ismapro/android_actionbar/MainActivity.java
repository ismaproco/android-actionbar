package co.ismapro.android_actionbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

// when the app extends from ActionBarActivity it shows the action bar
// in Android versions previous 3.0, using the Android Support Library.
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    // Method to manage the search button action
    public void openSearch() {
        // get the TextView and set the Search text
        TextView appText = (TextView)findViewById(R.id.appText);
        appText.setText("Search Action executed!");
    }

    // Method to manage the settings action
    public void openSettings() {
        // get the TextView and set the Settings text
        TextView appText = (TextView)findViewById(R.id.appText);
        appText.setText("Settings Action executed!");
    }

}

package nicolagigante.celieye.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import nicolagigante.celieye.R;

public class First extends Activity {

    public static final String FIRST_RUN = "FirstRun";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().hide();
        setContentView(R.layout.activity_first);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(FIRST_RUN, false);
        editor.commit();

    }

        public void first(View view){
        Intent enabler=new Intent(this, AndroidFileDownloader.class);
        startActivity(enabler);
    }
}

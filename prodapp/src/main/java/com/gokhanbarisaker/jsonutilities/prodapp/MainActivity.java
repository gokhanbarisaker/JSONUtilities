package com.gokhanbarisaker.jsonutilities.prodapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.gokhanbarisaker.utilities.JSONUtilities;

import org.json.JSONArray;
import org.json.JSONObject;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Move this junk to tests

        String jsonObjectString = "{\"foo\":\"bar\",\"baz\":1}";
        JSONObject object = JSONUtilities.parseObject(jsonObjectString, null);

        if (object == null)
        {
            Log.e("foo", "foo");
        }

        String jsonArrayString = "[1, \"two\", 3.00]";
        JSONArray array = JSONUtilities.parseArray(jsonArrayString, null);

        if (array == null)
        {
            Log.e("bar", "bar");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

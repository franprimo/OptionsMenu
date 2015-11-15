package com.example.franprimo.optionsmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //Con este metodo asociamos el menu que hemos creado en el top_menu a la app
        getMenuInflater().inflate(R.menu.top_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;

        switch (item.getItemId()){
            case R.id.item1:
                intent = new Intent(getApplicationContext(), CheckButton.class);
                startActivity(intent);
                break;
            case R.id.item2:
                intent = new Intent(getApplicationContext(), RadioButton.class);
                startActivity(intent);
                break;
            case R.id.item3:
                Toast t = Toast.makeText(getBaseContext(), "Submenu 1 seleccionado", Toast.LENGTH_LONG);
                t.show();
                break;
        }
        
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.janina.ramadan.com.najat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.janina.ramadan.R;

public class N10Activity extends ActionBarActivity {
    TextView dhaka_time,chittogong_time,khulna_time;
    TextView rajshahi_time,sylhet_time;
    TextView borishal_time,dinajpur_time;
    Button dhaka,chittogong,rajshahi,khulna,sylhet,borishal,dinajpur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n10);

        dhaka = (Button)findViewById(R.id.dhaka);
        dhaka_time = (TextView)findViewById(R.id.dhaka_time);
        rajshahi = (Button)findViewById(R.id.rajshahi);
        rajshahi_time = (TextView)findViewById(R.id.rajshahi_time);
        sylhet = (Button)findViewById(R.id.sylhet);
        sylhet_time =(TextView)findViewById(R.id.sylhet_time);
        chittogong = (Button)findViewById(R.id.chittogong);
        chittogong_time = (TextView)findViewById(R.id.chittogong_time);
        dinajpur = (Button)findViewById(R.id.dinajpur);
        dinajpur_time = (TextView)findViewById(R.id.dinajpur_time);
        borishal = (Button)findViewById(R.id.borishal);
        borishal_time = (TextView)findViewById(R.id.borishal_time);
        khulna = (Button)findViewById(R.id.khulna);
        khulna_time = (TextView)findViewById(R.id.khulna_time);

        String sehri,ifter;

        sehri =getString(R.string.sehri_dhaka30);
        ifter = getString(R.string.ifter_dhaka30);
        dhaka_time.setText("\n\t"+sehri + "\n\t"+ifter+"\n");

        sehri=getString(R.string.sehri_sylhet30);
        ifter = getString(R.string.ifter_sylhet30);
        sylhet_time.setText("\n\t"+sehri + "\n\t"+ifter+"\n");

        sehri = getString(R.string.sehri_borishal30);
        ifter = getString(R.string.ifter_borishal30);
        borishal_time.setText("\n\t"+sehri + "\n\t"+ifter+"\n");

        sehri = getString(R.string.sehri_chittagong30);
        ifter = getString(R.string.ifter_chittagong30);
        chittogong_time.setText("\n\t"+sehri + "\n\t"+ifter+"\n");

        sehri = getString(R.string.sehri_dinajpur30);
        ifter = getString(R.string.ifter_dinajpur30);
        dinajpur_time.setText("\n\t"+sehri + "\n\t"+ifter+"\n");

        sehri = getString(R.string.sehri_khulna30);
        ifter = getString(R.string.ifter_khulna30);
        khulna_time.setText("\n\t"+sehri + "\n\t"+ifter+"\n");

        sehri = getString(R.string.sehri_rajshahi30);
        ifter = getString(R.string.ifter_rajshahi30);
        rajshahi_time.setText("\n\t"+sehri + "\n\t"+ifter+"\n");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_n10, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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

package com.example.janina.ramadan;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.janina.ramadan.com.magfirat.M10Activity;
import com.example.janina.ramadan.com.magfirat.M1Activity;
import com.example.janina.ramadan.com.magfirat.M2Activity;
import com.example.janina.ramadan.com.magfirat.M3Activity;
import com.example.janina.ramadan.com.magfirat.M4Activity;
import com.example.janina.ramadan.com.magfirat.M5Activity;
import com.example.janina.ramadan.com.magfirat.M6Activity;
import com.example.janina.ramadan.com.magfirat.M7Activity;
import com.example.janina.ramadan.com.magfirat.M8Activity;
import com.example.janina.ramadan.com.magfirat.M9Activity;
import com.example.janina.ramadan.com.najat.N10Activity;
import com.example.janina.ramadan.com.najat.N1Activity;
import com.example.janina.ramadan.com.najat.N2Activity;
import com.example.janina.ramadan.com.najat.N3Activity;
import com.example.janina.ramadan.com.najat.N4Activity;
import com.example.janina.ramadan.com.najat.N5Activity;
import com.example.janina.ramadan.com.najat.N6Activity;
import com.example.janina.ramadan.com.najat.N7Activity;
import com.example.janina.ramadan.com.najat.N8Activity;
import com.example.janina.ramadan.com.najat.N9Activity;
import com.example.janina.ramadan.com.rahmat.R10Activity;
import com.example.janina.ramadan.com.rahmat.R1Activity;
import com.example.janina.ramadan.com.rahmat.R2Activity;
import com.example.janina.ramadan.com.rahmat.R3Activity;
import com.example.janina.ramadan.com.rahmat.R4Activity;
import com.example.janina.ramadan.com.rahmat.R5Activity;
import com.example.janina.ramadan.com.rahmat.R6Activity;
import com.example.janina.ramadan.com.rahmat.R7Activity;
import com.example.janina.ramadan.com.rahmat.R8Activity;
import com.example.janina.ramadan.com.rahmat.R9Activity;


public class MainActivityRamadan extends ActionBarActivity {

    Button magfirat,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
    Button rahmat,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
    Button najat,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_ramadan);

        magfirat = (Button)findViewById(R.id.magfirat);
        m1 = (Button)findViewById(R.id.m1);
        m2 = (Button)findViewById(R.id.m2);
        m3 =(Button)findViewById(R.id.m3);
        m4 = (Button)findViewById(R.id.m4);
        m5 = (Button)findViewById(R.id.m5);
        m6 = (Button)findViewById(R.id.m6);
        m7 = (Button)findViewById(R.id.m7);
        m8 = (Button)findViewById(R.id.m8);
        m9 = (Button)findViewById(R.id.m9);
        m10 = (Button)findViewById(R.id.m10);

        rahmat = (Button)findViewById(R.id.rahmat);
        r1 = (Button)findViewById(R.id.r1);
        r2 = (Button)findViewById(R.id.r2);
        r3 =(Button)findViewById(R.id.r3);
        r4 = (Button)findViewById(R.id.r4);
        r5 = (Button)findViewById(R.id.r5);
        r6 = (Button)findViewById(R.id.r6);
        r7 = (Button)findViewById(R.id.r7);
        r8 = (Button)findViewById(R.id.r8);
        r9 = (Button)findViewById(R.id.r9);
        r10 = (Button)findViewById(R.id.r10);

        najat = (Button)findViewById(R.id.najat);
        n1 = (Button)findViewById(R.id.n1);
        n2 = (Button)findViewById(R.id.n2);
        n3 =(Button)findViewById(R.id.n3);
        n4 = (Button)findViewById(R.id.n4);
        n5 = (Button)findViewById(R.id.n5);
        n6 = (Button)findViewById(R.id.n6);
        n7 = (Button)findViewById(R.id.n7);
        n8 = (Button)findViewById(R.id.n8);
        n9 = (Button)findViewById(R.id.n9);
        n10 = (Button)findViewById(R.id.n10);



        m1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent m1start = new Intent(getApplicationContext(), M1Activity.class);
                        startActivity(m1start);
                    }
                }
        );
        m2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent m2start = new Intent(getApplicationContext(), M2Activity.class);
                        startActivity(m2start);
                    }
                }
        );

        m3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent m3start = new Intent(getApplicationContext(), M3Activity.class);
                        startActivity(m3start);
                    }
                }
        );
        m4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent m4start = new Intent(getApplicationContext(), M4Activity.class);
                        startActivity(m4start);
                    }
                }
        );

        m5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent m5start = new Intent(getApplicationContext(), M5Activity.class);
                        startActivity(m5start);
                    }
                }
        );
        m6.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent m6start = new Intent(getApplicationContext(), M6Activity.class);
                        startActivity(m6start);
                    }
                }
        );

        m7.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent start = new Intent(getApplicationContext(), M7Activity.class);
                        startActivity(start);
                    }
                }
        );
        m8.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent start = new Intent(getApplicationContext(), M8Activity.class);
                        startActivity(start);
                    }
                }
        );

        m9.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent start = new Intent(getApplicationContext(), M9Activity.class);
                        startActivity(start);
                    }
                }
        );
        m10.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent start = new Intent(getApplicationContext(), M10Activity.class);
                        startActivity(start);
                    }
                }
        );

        r1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent start = new Intent(getApplicationContext(), R1Activity.class);
                        startActivity(start);
                    }
                }
        );
        r2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), R2Activity.class);
                        startActivity(start);
                    }
                }
        );

        r3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent start = new Intent(getApplicationContext(), R3Activity.class);
                        startActivity(start);
                    }
                }
        );
        r4.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), R4Activity.class);
                        startActivity(start);
                    }
                }
        );
        r5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent start = new Intent(getApplicationContext(), R5Activity.class);
                        startActivity(start);
                    }
                }
        );
        r6.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), R6Activity.class);
                        startActivity(start);
                    }
                }
        );
        r7.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent start = new Intent(getApplicationContext(), R7Activity.class);
                        startActivity(start);
                    }
                }
        );
        r8.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), R8Activity.class);
                        startActivity(start);
                    }
                }
        );
        r9.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        Intent start = new Intent(getApplicationContext(), R9Activity.class);
                        startActivity(start);
                    }
                }
        );
        r10.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), R10Activity.class);
                        startActivity(start);
                    }
                }
        );
        n1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), N1Activity.class);
                        startActivity(start);
                    }
                }
        );
        n2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), N2Activity.class);
                        startActivity(start);
                    }
                }
        );

        n3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), N3Activity.class);
                        startActivity(start);
                    }
                }
        );
        n4.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), N4Activity.class);
                        startActivity(start);
                    }
                }
        );

        n5.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), N5Activity.class);
                        startActivity(start);
                    }
                }
        );
        n6.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), N6Activity.class);
                        startActivity(start);
                    }
                }
        );
        n7.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), N7Activity.class);
                        startActivity(start);
                    }
                }
        );
        n8.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), N8Activity.class);
                        startActivity(start);
                    }
                }
        );
        n9.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), N9Activity.class);
                        startActivity(start);
                    }
                }
        );
        n10.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Intent start = new Intent(getApplicationContext(), N10Activity.class);
                        startActivity(start);
                    }
                }
        );
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_ramadan, menu);
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

package com.mclhrn.studiotipstricks;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    // logt


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // FAB
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        showImplementations();
    }














    /**
     * =============================================================================================
     * Navigation
     * =============================================================================================
     *
     * Find action                          Sft+Cmd+A
     *
     * Find file                            Sft+Cmd+O / Partial Matching Supported
     *
     * Last edited file                     Sft+Cmd+Backspace
     *
     * Recently edited file list            Cmd+E
     *
     * Open/Show tool window                DblTap Sft / Cmd+<window number>
     *
     * Go to declaration/implementation     Cmd+B
     *
     * Go to Super                          Cmd+U
     *
     * Show class hierarchy                 Ctrl+H
     *
     * =============================================================================================
     * */

    // Go to declaration/implementation:     Cmd+B
    public void showImplementations() {
        Log.i("", "showImplementations: ");
    }














    /**
     * =============================================================================================
     * Text Selection
     * =============================================================================================
     *
     * Multi Select            ^G
     *
     * Select Scopes           Alt+Arrow-Up / Alt+Arrow-Down
     *
     * Multi-cursor            Assign a keymap - Sft+^+] : Sft+Alt+Arrow-right : Sft+Cmd+U
     *
     * =============================================================================================
     * */
    public void textSelection() {


        // Multi Select            ^G
        // Select Scopes           Alt+Arrow-Up / Alt+Arrow-Down
        WindowManager wm = (WindowManager) new WindowManager.LayoutParams();
        Display display = wm.getDefaultDisplay();
        int newVar;
        if(android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2){
            Point size = new Point();
            display.getSize(size);
            newVar = size.x;
            Log.i("", "textSelection: Selecting this text");
        } else newVar = display.getWidth();
        Log.i("", "textSelection: Selecting this text" + newVar);


        // Multi-cursor            Assign a keymap - Sft+^+] : Sft+Alt+Arrow-right : Sft+Cmd+U
        String ONE= "One";
        String TWO= "Two";
        String THREE= "Three";
        String FOUR= "Four";
        String FIVE= "Five";
        String SIX= "Six";
        String SEVEN= "Seven";
        String EIGHT= "Eight";
        String NINE= "Nine";
        String TEN= "Ten";
    }














    /**
     * =============================================================================================
     * Create Code Completion
     * =============================================================================================
     *
     * Extract variable         Cmd+Alt+V
     *
     * Extract method           Cmd+Alt+M
     *
     * Surround with            Cmd+Alt+T
     *
     * Smart Completion
     *
     * Intention Actions
     *
     * Live Templates
     *
     * =============================================================================================
     * */
    public void codeCompletion(boolean create, Context context) {

        String ONE= "One";
        String TWO= "Two";
        String THREE= "Three";
        String FOUR= "Four";
        String FIVE= "Five";
        String SIX= "Six";
        String SEVEN= "Seven";
        String EIGHT= "Eight";
        String NINE= "Nine";
        String TEN= "Ten";




        // Basic Completion: Type+Enter / Type+Tab
        TextView tv = (TextView) findViewById(R.id.hello);




        // Intention Actions: Where is caret & what can we do with it:      Alt+Enter




        // Extract Variable:                Cmd+Alt+V
        tv.setText("Say What again! ");




        // Extract Method:                  Cmd+Alt+M   ^^^^^(FAB in onCreate)




        // More Intention Actions
        // Bind constructor params to fields
        class InitializeFields {

            //alt+enter = bind cnstr params to fields

            // Create Getters & Setters
            private InitializeFields(int first, String second, boolean third) {

            }
        }




        // More Completion
        // Smart completion:                Ctrl+Space
        // Smarter Completion:              Ctrl+Shft+Space
        // Smartest Completion:             Ctrl+Shft+Space TWICE
        Drawable d = null;




        ArrayList<String> list = new ArrayList<>();
        // Surround with            Cmd+Alt+T
        list.add(ONE);
        list.add(TWO);
        list.add(THREE);
        list.add(FOUR);
        list.add(FIVE);
        list.add(SIX);
        list.add(SEVEN);
        list.add(EIGHT);
        list.add(NINE);
        list.add(TEN);


        /**
         * LIVE TEMPLATES
         * loops
         */
        // Basic for loopwith 'i' var:                      fori

        // Foreach:                                         foreach

        // iterate on an existing list:                     list.fori

        // iterate on an existing list:                     list.for

        // reverse iterate over an existing list:           list.forr


        /**
         * General
         */
        // Compare to null:     ifn

        // Show Toast:          Toast

        // String formatter:     Sfmt

        // Run on UI Thread:     rouiT

        // Quick TODO:           todo

        /**
         * logging
         */
        // Log level: Info:     logi

        // Log level: debug:    logd

        // Log level: error: Takes a Throwable that will have the current Stack Trace:      loge

        // Log level: warn: Takes an Exception that will have the current Stack Trace:    logw

        // Constructs a log that shows a method was called by printing with method params:  logm: see below

        // Shows the return value of a method call: logr: see below

        // Create Live Template
        if (create) {
            // prefs > LT > Android > new LT > class path > add vars > add completion > autoComplete for string names
            SharedPreferences sharedPreferences = getSharedPreferences("MY_PREFS", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean(getString(R.string.app_name), true);
            editor.apply();
        } else {
            // do something
        }
    }














    /**
     * =============================================================================================
     * Other
     * =============================================================================================
     *
     * Version Control
     *
     * Local History
     *
     * =============================================================================================
     * */





    private String loggingExample(String string) {

        //logd
        string += " I dare you!";
        // logr

        return string;
    }
}

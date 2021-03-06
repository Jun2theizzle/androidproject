package com.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	public final static String EXTRA_MESSAGE = "com.helloworld.MESSAGE";
	@Override
       protected void onCreate(Bundle savedInstanceState) {
               super.onCreate(savedInstanceState);
               setContentView(R.layout.activity_main);
       }

       @Override
       public boolean onCreateOptionsMenu(Menu menu) {
               // Inflate the menu; this adds items to the action bar if it is present.
               MenuInflater inflater = getMenuInflater();
               inflater.inflate(R.menu.main, menu);
               return super.onCreateOptionsMenu(menu);
       }
       
       /** Do something when the user clicks the Send button */
       public void sendMessage(View view) {
    	   Intent intent = new Intent(this, DisplayMessageActivity.class);
    	   EditText editText = (EditText) findViewById(R.id.edit_message);
    	   String message = editText.getText().toString();
    	   intent.putExtra(EXTRA_MESSAGE, message);
    	   startActivity(intent);
    	   
       }
}

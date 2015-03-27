package net.learn2develop.MyActionBar;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.*;
import android.widget.Toast;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

   
       
@SuppressWarnings("unused")
public class MyActionBarActivity extends Activity {
	private Object wv;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
         	
        
        super.onCreate(savedInstanceState);

        WebView myWebview = new WebView(this);

        myWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;

        myWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        myWebview .loadUrl("http://portal.solent.ac.uk");
        setContentView(myWebview );

    
        
        
        
        
        
      
        
        
        
    
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    
    
            
        
        
    
   
        //actionBar.setDisplayShowHomeEnabled(true);
        //actionBar.hide();
        //actionBar.show(); //---show it again---
    
  

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {    	
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }
 
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {    
         return MenuChoice(item);    
    }    
    
    private void CreateMenu(Menu menu)
    {
        MenuItem mnu1 = menu.add(0, 0, 0, "Monday");
        {         
            mnu1.setIcon(R.drawable.ic_tue);
            mnu1.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_IF_ROOM |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);            
        }
        MenuItem mnu2 = menu.add(0, 1, 1, "Tuesday");
        {         
            mnu2.setIcon(R.drawable.ic_tue);            
            mnu2.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_IF_ROOM |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
        MenuItem mnu3 = menu.add(0, 2, 2, "Wednesday");
        {         
            mnu3.setIcon(R.drawable.ic_tue);
            mnu3.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_IF_ROOM |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
        MenuItem mnu4 = menu.add(0, 3, 3, "Thursday");
        {            
        	mnu4.setIcon(R.drawable.ic_tue);
            mnu4.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_IF_ROOM |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
        MenuItem mnu5 = menu.add(0, 4, 4, "Friday");
        {            
        	mnu5.setIcon(R.drawable.ic_tue);
            mnu5.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_IF_ROOM |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
        
        MenuItem mnu6 = menu.add(0, 5, 5, "Map");
        {            
        	mnu6.setIcon(R.drawable.ic_tue);
            mnu6.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_IF_ROOM |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
        
        MenuItem mnu7 = menu.add(0, 6, 6, "Calendar");
        {            
        	mnu6.setIcon(R.drawable.ic_calendar);
            mnu6.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_IF_ROOM |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
        
        MenuItem mnu8 = menu.add(0, 7, 7, "Information");
        {            
        	mnu7.setIcon(R.drawable.ic_info);
            mnu7.setShowAsAction(
            	MenuItem.SHOW_AS_ACTION_IF_ROOM |
                MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
        
    }
 
    private boolean MenuChoice(MenuItem item)
    {        
        switch (item.getItemId()) {
        case  android.R.id.home:
            Toast.makeText(this, 
                "Solent Home", 
                Toast.LENGTH_LONG).show();
            


            Intent i = new Intent(this, MyActionBarActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);

            return true;
        case 0:
            Toast.makeText(this, "Monday", 
                Toast.LENGTH_LONG).show();
            setContentView(R.layout.monday);
            return true;
        case 1:
        	setContentView(R.layout.tuesday);
            Toast.makeText(this, "Tuesday", 
                Toast.LENGTH_LONG).show();
            

            return true;
        case 2:
            Toast.makeText(this, "Wednesday", 
                Toast.LENGTH_LONG).show();
            setContentView(R.layout.wednesday);
            return true;
        case 3:
            Toast.makeText(this, "Thursday", 
                Toast.LENGTH_LONG).show();
            setContentView(R.layout.thursday);

            return true;
        case 4:
            Toast.makeText(this, "Friday", 
                Toast.LENGTH_LONG).show();
            setContentView(R.layout.friday);

            return true;        
                    
        case 5:
        Toast.makeText(this, "Map", 
            Toast.LENGTH_LONG).show();
        setContentView(R.layout.map);
        
        return true;
        
        case 6:
            Toast.makeText(this, "Calendar", 
                Toast.LENGTH_LONG).show();
            setContentView(R.layout.calendar);

        return true;       
        
        case 7:
            Toast.makeText(this, "Information", 
                Toast.LENGTH_LONG).show();
            setContentView(R.layout.info);

        return true;
        
    }

        return false;
    }    
   
  
              
        


    
    
    
    

}

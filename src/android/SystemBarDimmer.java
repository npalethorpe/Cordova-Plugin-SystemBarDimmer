package com.twin3.plugin;

import android.util.Log;
import android.view.View;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class SystemBarDimmer extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, final CallbackContext callbackContext) throws JSONException {
        
        if (action.equals("Dim")){

            cordova.getActivity().runOnUiThread(new Runnable() {
        
                @Override
                public void run() {

                    View decorView = cordova.getActivity().getWindow().getDecorView();
                    int uiOptions = View.SYSTEM_UI_FLAG_LOW_PROFILE;
                    decorView.setSystemUiVisibility(uiOptions);
                    callbackContext.success();

                }

            });

            return true;

        } else if (action.equals("Reset")){
            
            cordova.getActivity().runOnUiThread(new Runnable() {
        
                @Override
                public void run() {

                    View decorView = cordova.getActivity().getWindow().getDecorView();
                    decorView.setSystemUiVisibility(0);

                    callbackContext.success();
                }

            });

            return true;
            
        } else {
            
            return false;

        }
    }

}

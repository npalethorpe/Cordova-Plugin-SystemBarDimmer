package com.twin3.plugin;

import android.util.Log;
import android.view.View;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class SystemBarDimmer extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        
        if (action.equals("Dim")){

            View decorView = cordova.getActivity().getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_LOW_PROFILE;
            decorView.setSystemUiVisibility(uiOptions);

            return true;

        } else if (action.equals("Reset")){
            
            View decorView = cordova.getActivity().getWindow().getDecorView();
            decorView.setSystemUiVisibility(0);

            return true;
            
        } else {
            
            return false;

        }
    }

}
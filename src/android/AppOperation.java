package com.foreveross.plugins.AppExitPlugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by zhouzhineng on 17/1/16.
 * @Description 应用操作插件
 */
public class AppOperation extends CordovaPlugin {

    public String ACTION_EXIT_APP = "appExit";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if(action.equalsIgnoreCase(ACTION_EXIT_APP)) {
            System.exit(1);
        }
        return super.execute(action, args, callbackContext);
    }
}

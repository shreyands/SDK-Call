package com.awesometsproject; // replace com.your-app-name with your app’s name

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;


public class CallSdkModule extends ReactContextBaseJavaModule{
    CallSdkModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "CallSdkModule";
    }

    public void createSdkCallEvent() {
        Log.d("SDK has been called");
    }

    @ReactMethod
    public void call(){
        // call SDK method from here
    }
}

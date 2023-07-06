package wendu.jsbdemo;

import android.webkit.JavascriptInterface;

import org.json.JSONException;

import wendu.dsbridge.CompletionHandler;

/**
 * Created by du on 16/12/31.
 */

public class JsEchoApi implements IJsEchoApi{

    @Override
    public Object syn(Object args) throws JSONException {
        return  args;
    }

    @Override
    public void asyn(Object args,CompletionHandler handler){
        handler.complete(args);
    }
}
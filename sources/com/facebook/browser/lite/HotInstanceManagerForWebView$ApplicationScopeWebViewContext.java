package com.facebook.browser.lite;

import X.0KC;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;

public class HotInstanceManagerForWebView$ApplicationScopeWebViewContext extends ContextWrapper {
    public WeakReference mActivityWeakRef;
    public final Context mApplicationContext;

    public Context getBaseContext() {
        Context context = (Context) this.mActivityWeakRef.get();
        if (context == null) {
            return this.mApplicationContext;
        }
        return context;
    }

    public Object getSystemService(String str) {
        Context context = (Context) this.mActivityWeakRef.get();
        if (context == null) {
            context = this.mApplicationContext;
        }
        return context.getSystemService(str);
    }

    public void setActivityContext(Activity activity) {
        this.mActivityWeakRef = new WeakReference(activity);
    }

    public void startActivityForResult(String str, Intent intent, int i, Bundle bundle) {
        Object obj = this.mActivityWeakRef.get();
        if (obj != null) {
            try {
                obj.getClass().getMethod("startActivityForResult", new Class[]{String.class, Intent.class, Integer.TYPE, Bundle.class}).invoke(obj, new Object[]{str, intent, Integer.valueOf(i), bundle});
            } catch (IllegalAccessException | NoSuchMethodException e) {
                0KC.A0J("HotInstanceManagerForWebView", "Error while opening activity.startActivityForResult:", e);
            }
        } else {
            0KC.A0E("HotInstanceManagerForWebView", "startActivityForResult called when activity is null");
        }
    }

    public HotInstanceManagerForWebView$ApplicationScopeWebViewContext(Context context, Activity activity) {
        super(context);
        this.mActivityWeakRef = new WeakReference(activity);
        this.mApplicationContext = context;
    }
}

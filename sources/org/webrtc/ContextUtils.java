package org.webrtc;

import X.AnonymousClass7TE;
import android.content.Context;

public class ContextUtils {
    public static final String TAG = "ContextUtils";
    public static Context applicationContext;

    public static void initialize(Context context) {
        if (context != null) {
            applicationContext = context;
            return;
        }
        throw AnonymousClass7TE.A0w("Application context cannot be null for ContextUtils.initialize.");
    }

    @Deprecated
    public static Context getApplicationContext() {
        return applicationContext;
    }
}

package com.facebook.analytics2.logger.interfaces;

import X.1qQ;
import X.Pxf;
import android.content.Context;
import android.os.HandlerThread;

public class DefaultHandlerThreadFactory implements 1qQ {
    public final boolean E62() {
        return true;
    }

    public final HandlerThread ALR(String str, int i) {
        HandlerThread A0J = Pxf.A0J(str, i);
        A0J.start();
        return A0J;
    }

    public DefaultHandlerThreadFactory(Context context) {
    }
}

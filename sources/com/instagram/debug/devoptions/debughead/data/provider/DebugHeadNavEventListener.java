package com.instagram.debug.devoptions.debughead.data.provider;

import X.AnonymousClass3LM;
import X.AnonymousClass7TF;
import com.instagram.debug.devoptions.apiperf.NavEventProvider;
import com.instagram.debug.devoptions.debughead.data.delegates.NavEventDelegate;

public class DebugHeadNavEventListener implements NavEventProvider {
    public static DebugHeadNavEventListener sInstance;
    public NavEventDelegate mDelegate;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.instagram.debug.devoptions.debughead.data.provider.DebugHeadNavEventListener] */
    public static synchronized DebugHeadNavEventListener getInstance() {
        DebugHeadNavEventListener debugHeadNavEventListener;
        synchronized (DebugHeadNavEventListener.class) {
            DebugHeadNavEventListener debugHeadNavEventListener2 = sInstance;
            debugHeadNavEventListener = debugHeadNavEventListener2;
            if (debugHeadNavEventListener2 == null) {
                ? obj = new Object();
                sInstance = obj;
                debugHeadNavEventListener = obj;
            }
        }
        return debugHeadNavEventListener;
    }

    public static synchronized boolean isEnabled() {
        boolean A1V;
        synchronized (DebugHeadNavEventListener.class) {
            A1V = AnonymousClass7TF.A1V(sInstance);
        }
        return A1V;
    }

    public void onNavEvent(Object obj) {
        NavEventDelegate navEventDelegate = this.mDelegate;
        if (navEventDelegate != null) {
            navEventDelegate.onNavEvent((AnonymousClass3LM) obj);
        }
    }

    public void setDelegate(NavEventDelegate navEventDelegate) {
        this.mDelegate = navEventDelegate;
    }
}

package com.instagram.debug.devoptions.debughead.data.provider;

import X.0xI;
import X.AnonymousClass7TF;
import X.C229462nR;
import X.C361488gJ;
import com.instagram.debug.devoptions.debughead.data.delegates.DropFrameDelegate;

public class DebugHeadDebugDropFrameListener implements C229462nR {
    public static DebugHeadDebugDropFrameListener sInstance;
    public DropFrameDelegate mDelegate;

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.debug.devoptions.debughead.data.provider.DebugHeadDebugDropFrameListener, java.lang.Object] */
    public static synchronized DebugHeadDebugDropFrameListener getInstance() {
        DebugHeadDebugDropFrameListener debugHeadDebugDropFrameListener;
        synchronized (DebugHeadDebugDropFrameListener.class) {
            DebugHeadDebugDropFrameListener debugHeadDebugDropFrameListener2 = sInstance;
            debugHeadDebugDropFrameListener = debugHeadDebugDropFrameListener2;
            if (debugHeadDebugDropFrameListener2 == null) {
                ? obj = new Object();
                sInstance = obj;
                debugHeadDebugDropFrameListener = obj;
            }
        }
        return debugHeadDebugDropFrameListener;
    }

    public static synchronized boolean isEnabled() {
        boolean A1V;
        synchronized (DebugHeadDebugDropFrameListener.class) {
            A1V = AnonymousClass7TF.A1V(sInstance);
        }
        return A1V;
    }

    public void onLargeFrameDrop(String str, int i) {
        this.mDelegate.onFrameDrop(str, i);
    }

    public void onScrollStart() {
        this.mDelegate.onScrollStatusChange(DropFrameDelegate.ScrollStatus.START);
    }

    public void onScrollStop() {
        this.mDelegate.onScrollStatusChange(DropFrameDelegate.ScrollStatus.STOP);
    }

    public void onScrolled(int i, int i2) {
        this.mDelegate.onScrolled(i, i2);
    }

    public void onSmallFrameDrop(String str) {
        this.mDelegate.onFrameDrop(str, 1);
    }

    public void registerModule(String str) {
        this.mDelegate.onRegisterModule(str);
    }

    public void reportScrollForDebug(0xI r2) {
        this.mDelegate.reportScrollForDebug(r2);
    }

    public void reportScrollForDebugNew(C361488gJ r2) {
        this.mDelegate.reportScrollForDebugNew(r2);
    }

    public void setDelegate(DropFrameDelegate dropFrameDelegate) {
        this.mDelegate = dropFrameDelegate;
    }
}

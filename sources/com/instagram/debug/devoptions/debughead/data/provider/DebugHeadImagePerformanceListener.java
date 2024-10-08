package com.instagram.debug.devoptions.debughead.data.provider;

import X.AnonymousClass7TF;
import X.C254683ss;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.apiperf.ImagePerformanceProvider;
import com.instagram.debug.devoptions.debughead.data.delegates.ImageFailureDelegate;
import com.instagram.debug.devoptions.debughead.data.delegates.ImagePprDelegate;

public class DebugHeadImagePerformanceListener implements ImagePerformanceProvider {
    public static DebugHeadImagePerformanceListener sInstance;
    public ImageFailureDelegate mFailureDelegate;
    public ImagePprDelegate mPprDelegate;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.instagram.debug.devoptions.debughead.data.provider.DebugHeadImagePerformanceListener] */
    public static synchronized DebugHeadImagePerformanceListener getInstance() {
        DebugHeadImagePerformanceListener debugHeadImagePerformanceListener;
        synchronized (DebugHeadImagePerformanceListener.class) {
            DebugHeadImagePerformanceListener debugHeadImagePerformanceListener2 = sInstance;
            debugHeadImagePerformanceListener = debugHeadImagePerformanceListener2;
            if (debugHeadImagePerformanceListener2 == null) {
                ? obj = new Object();
                sInstance = obj;
                debugHeadImagePerformanceListener = obj;
            }
        }
        return debugHeadImagePerformanceListener;
    }

    public static synchronized boolean isEnabled() {
        boolean A1V;
        synchronized (DebugHeadImagePerformanceListener.class) {
            A1V = AnonymousClass7TF.A1V(sInstance);
        }
        return A1V;
    }

    public void onEnterViewport() {
        ImagePprDelegate imagePprDelegate = this.mPprDelegate;
        if (imagePprDelegate != null) {
            imagePprDelegate.onEnterViewport();
        }
    }

    public void onImageFailure(String str, Object obj) {
        ImageFailureDelegate imageFailureDelegate = this.mFailureDelegate;
        if (imageFailureDelegate != null) {
            imageFailureDelegate.onImageFailure(str, (C254683ss) obj);
        }
    }

    public void onImageSuccess(String str) {
        ImageFailureDelegate imageFailureDelegate = this.mFailureDelegate;
        if (imageFailureDelegate != null) {
            imageFailureDelegate.onImageSuccess(str);
        }
    }

    public void onLeaveViewportRendered(ImageUrl imageUrl) {
        ImagePprDelegate imagePprDelegate = this.mPprDelegate;
        if (imagePprDelegate != null) {
            imagePprDelegate.onLeaveViewportRendered(imageUrl);
        }
    }

    public void onLeaveViewportUnrendered(ImageUrl imageUrl) {
        ImagePprDelegate imagePprDelegate = this.mPprDelegate;
        if (imagePprDelegate != null) {
            imagePprDelegate.onLeaveViewportUnrendered(imageUrl);
        }
    }

    public void onRender(long j) {
        ImagePprDelegate imagePprDelegate = this.mPprDelegate;
        if (imagePprDelegate != null) {
            imagePprDelegate.onRender(j);
        }
    }

    public void setFailureDelegate(ImageFailureDelegate imageFailureDelegate) {
        this.mFailureDelegate = imageFailureDelegate;
    }

    public void setPprDelegate(ImagePprDelegate imagePprDelegate) {
        this.mPprDelegate = imagePprDelegate;
    }
}

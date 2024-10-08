package com.facebook.browser.lite.util.clickid;

import X.0dV;
import X.0qQ;
import X.C254643so;
import com.facebook.jni.HybridData;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ClickIDAppender {
    public static final C254643so Companion = new Object();
    public final HybridData mHybridData;

    public ClickIDAppender(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0(List list, List list2);

    public final native String appendFbclid(String str, String str2);

    public final native String appendParams(String str, Map map);

    public final native String extractDestDomain(String str);

    public final native String extractDestUri(String str);

    public final native String getFbclid(String str);

    public final native Map getParams(String str, Set set);

    public final native String injectFbclidClickTimestamp(String str, long j);

    public final native String removeParams(String str, Set set);

    public final native String setClickTimestamp(String str, long j);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3so, java.lang.Object] */
    static {
        0dV.A0C("clickid");
    }
}

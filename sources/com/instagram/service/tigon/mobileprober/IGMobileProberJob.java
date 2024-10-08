package com.instagram.service.tigon.mobileprober;

import X.0dV;
import X.C375499Dv;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.instagram.service.tigon.IGTigonService;

public final class IGMobileProberJob {
    public static final C375499Dv Companion = new Object();

    public static final native void initializeMobileProberNative(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, IGTigonService iGTigonService);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9Dv, java.lang.Object] */
    static {
        0dV.A0C("igmobileproberjob");
    }
}

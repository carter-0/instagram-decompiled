package com.facebook.common.networkreachability;

import X.0dV;
import X.C10961S2t;
import X.SmA;
import com.facebook.jni.HybridData;

public class AndroidReachabilityListener {
    public static final AndroidReachabilityListener $redex_init_class = null;
    public final HybridData mHybridData;
    public final NetworkStateInfo mNetworkStateInfo;
    public final C10961S2t mNetworkTypeProvider;

    private native HybridData initHybrid(NetworkStateInfo networkStateInfo);

    public native void networkStateChanged(int i, int i2);

    static {
        0dV.A0C("android-reachability-announcer");
    }

    public AndroidReachabilityListener(C10961S2t s2t) {
        SmA smA = new SmA(this);
        this.mNetworkStateInfo = smA;
        this.mHybridData = initHybrid(smA);
        this.mNetworkTypeProvider = s2t;
    }
}

package X;

import com.facebook.common.networkreachability.AndroidReachabilityListener;
import com.facebook.common.networkreachability.NetworkStateInfo;

public final class SmA implements NetworkStateInfo {
    public final /* synthetic */ AndroidReachabilityListener A00;

    public SmA(AndroidReachabilityListener androidReachabilityListener) {
        this.A00 = androidReachabilityListener;
    }

    public final int getNetworkState() {
        AndroidReachabilityListener androidReachabilityListener = this.A00;
        AndroidReachabilityListener androidReachabilityListener2 = AndroidReachabilityListener.$redex_init_class;
        return androidReachabilityListener.mNetworkTypeProvider.A00().A00;
    }
}

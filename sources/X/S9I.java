package X;

import com.facebook.jni.HybridData;
import com.facebook.realtime.common.streamid.RSStreamIdProvider;

public final class S9I {
    private final HybridData initHybrid() {
        return RSStreamIdProvider.initHybrid();
    }
}

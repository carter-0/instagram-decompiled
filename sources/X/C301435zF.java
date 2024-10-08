package X;

import com.facebook.distribgw.client.DGWClient;
import com.facebook.distribgw.client.msys.DgwNetworkSessionPluginImpl;
import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.5zF  reason: invalid class name and case insensitive filesystem */
public final class C301435zF {
    private final HybridData initHybrid(DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService) {
        return DgwNetworkSessionPluginImpl.initHybrid(dGWClient, scheduledExecutorService);
    }
}

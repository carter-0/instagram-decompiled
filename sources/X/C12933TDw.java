package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.TDw  reason: case insensitive filesystem */
public final class C12933TDw implements Runnable {
    public final /* synthetic */ T79 A00;

    public C12933TDw(T79 t79) {
        this.A00 = t79;
    }

    public final void run() {
        1Ef maxToleratedCacheAgeMs = new PandoGraphQLRequest(C41845B3m.A05(), "IGOnDeviceAppHistoryPrivacyQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C270614h1.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_on_device_app_history_privacy", AnonymousClass7TE.A1C()).setMaxToleratedCacheAgeMs(0);
        T79 t79 = this.A00;
        t79.A03.A06(maxToleratedCacheAgeMs, new C8764R8p((Object) t79, 7));
    }
}

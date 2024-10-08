package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;

/* renamed from: X.3Fs  reason: invalid class name and case insensitive filesystem */
public final class C239253Fs implements Runnable {
    public final /* synthetic */ 2KL A00;

    public C239253Fs(2KL r1) {
        this.A00 = r1;
    }

    public final void run() {
        2KL r3 = this.A00;
        long j = r3.A08.getLong("last_upload_time_in_sec", -1);
        if (j == -1 || (System.currentTimeMillis() / 1000) - j > r3.A03) {
            2IS r2 = new 2IS();
            2IS r1 = new 2IS();
            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
            r3.A07.A06(new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGOnDeviceAppHistoryPrivacyQuery", r2.getParamsCopy(), r1.getParamsCopy(), C270614h1.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_on_device_app_history_privacy", new ArrayList()).setMaxToleratedCacheAgeMs(0), new C283445Hs(r3));
        }
    }
}

package X;

import com.facebook.msys.mci.EventLogSubscriber;
import com.facebook.msys.mci.EventLoggingData;
import com.facebook.msys.mci.NoOpAnalytics;

/* renamed from: X.XMb  reason: case insensitive filesystem */
public final class C21192XMb extends EventLogSubscriber {
    public final /* synthetic */ NoOpAnalytics A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21192XMb(NoOpAnalytics noOpAnalytics, String[] strArr) {
        super(1, strArr);
        this.A00 = noOpAnalytics;
    }

    public final void onLogTalEvent(EventLoggingData eventLoggingData) {
    }
}

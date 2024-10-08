package X;

import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLoggingController;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;
import java.util.Map;

/* renamed from: X.7Of  reason: invalid class name and case insensitive filesystem */
public final class C330787Of implements C61110lV {
    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-738194964);
        IGFOAMessagingThreadViewNavigationLoggingController iGFOAMessagingThreadViewNavigationLoggingController = IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE;
        for (Map.Entry entry : 0Yt.A0B(iGFOAMessagingThreadViewNavigationLoggingController.activeLoggers).entrySet()) {
            ((Number) entry.getKey()).intValue();
            ((FOAMessagingPerformanceLogger) entry.getValue()).onAppBackgrounded();
        }
        iGFOAMessagingThreadViewNavigationLoggingController.activeLoggers.clear();
        AnonymousClass0fD.A0A(1853943309, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-372750726, AnonymousClass0fD.A03(-1733566456));
    }
}

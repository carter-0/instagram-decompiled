package X;

import android.content.Intent;

/* renamed from: X.RUb  reason: case insensitive filesystem */
public abstract class C9224RUb {
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.ThK] */
    public static final C13801ThK A00(Intent intent) {
        0qQ.A0B(intent, 0);
        if (intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_FROM_E2EE_THREAD", false) || intent.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_LOG_OPEN_SWB_EVENTS_AS_E2EE", false)) {
            return new Object();
        }
        return new SlM(DbW.A0J(09i.A0A.A06(C61350mg.A00(intent)), "safe_browsing"));
    }
}

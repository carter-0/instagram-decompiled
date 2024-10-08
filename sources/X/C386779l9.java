package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.9l9  reason: invalid class name and case insensitive filesystem */
public final class C386779l9 extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1KS A01;

    public final void run() {
        1KS r6 = this.A01;
        UserSession userSession = this.A00;
        if (Systrace.A0E(1)) {
            0fS.A01("StartupReelTrayPrefetcher.prefetchMainCacheReelInternal", 1023979529);
        }
        try {
            AnonymousClass4Z5 r3 = r6.A00;
            if (r3 == null) {
                1OE A002 = 1KS.A00(userSession, AnonymousClass05K.A0C);
                0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.model.reels.ReelTrayRequest.Http");
                r3 = (AnonymousClass4Z5) A002;
                r6.A00 = r3;
            }
            if (r3 != null) {
                1OC r2 = r3.A00;
                if (Systrace.A0E(1)) {
                    0fS.A01("StartupReelTrayPrefetcher.getCacheReelsPrefetchCallback", -1682768251);
                }
                H51 h51 = new H51(20, (Object) r3, (Object) r6);
                if (Systrace.A0E(1)) {
                    0fS.A00(975222966);
                }
                r2.A00 = h51;
                ((1ET) 1ET.A01.getValue()).schedule(r2);
            }
            if (Systrace.A0E(1)) {
                0fS.A00(-785275080);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-1552955487);
            }
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386779l9(UserSession userSession, 1KS r5) {
        super(1891488840, 1, false, true);
        this.A01 = r5;
        this.A00 = userSession;
    }
}

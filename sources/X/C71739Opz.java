package X;

import java.util.Map;

/* renamed from: X.Opz  reason: case insensitive filesystem */
public final class C71739Opz implements AnonymousClass66d {
    public final /* synthetic */ C66633Ma2 A00;

    public C71739Opz(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r3, Map map) {
        C2366634p r0;
        if (0qQ.A0K(str, "MEMOfflineHandlingCompletionNotification") && (r0 = C66633Ma2.A04(this.A00).A08) != null) {
            r0.A03();
        }
    }
}

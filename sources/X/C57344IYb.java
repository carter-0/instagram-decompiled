package X;

import java.util.Map;

/* renamed from: X.IYb  reason: case insensitive filesystem */
public final class C57344IYb implements C228232l0 {
    public final C296295pp A00;
    public final C296325ps A01;

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r3, C233162v9 r4, Object obj, Object obj2) {
        C267324bN r5 = (C267324bN) obj;
        AnonymousClass7TG.A1T(r4, r5, obj2);
        if (r4 == C233162v9.MEDIA_SWIPE_LEFT) {
            this.A00.A00(C51974G9v.A0R(r5), r4, r5, obj2);
            return;
        }
        throw C51973G9u.A0g(r4, "Wrong signal type in MediaSwipeLeftRealtimeSignalProviderImpl: ", AnonymousClass7TE.A1A());
    }

    public C57344IYb(C296325ps r1, C296295pp r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public final Map AUH(String str) {
        return 0Yt.A0E();
    }
}

package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KWh  reason: case insensitive filesystem */
public final class C62031KWh extends C252733pa {
    public final C63605Kzt A00;
    public final UserSession A01;
    public final String A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    public final void A00(String str, boolean z) {
        0qQ.A0B(str, 0);
        if (z) {
            05G r2 = this.A03;
            do {
            } while (!r2.AIY(r2.getValue(), C59702JUj.A00));
        }
        MGE.A01(this, str, this.A01, 27);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C62031KWh(UserSession userSession, String str) {
        super("ReelsBlend", AnonymousClass43D.A00(1374169865));
        C63605Kzt kzt = new C63605Kzt(1vm.A01(userSession));
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = kzt;
        02z A012 = 106.A01((Object) null);
        this.A03 = A012;
        this.A04 = A012;
    }
}

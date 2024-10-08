package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.H8e  reason: case insensitive filesystem */
public final class C54332H8e extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final String A02;

    public C54332H8e(UserSession userSession, AnonymousClass4DU r4, String str) {
        super(C51969G9p.A0i(1Bk.A03, userSession, AnonymousClass000.A00(1295)));
        this.A00 = userSession;
        this.A01 = r4;
        this.A02 = str;
    }

    private final void A00(1Xj r5, String str) {
        AnonymousClass4DU r3 = this.A01;
        C254523sc A0n = C51965G9l.A0n(r3, str);
        A0n.A5u = r5.getId();
        A0n.A58 = this.A02;
        A0n.A3V = 2AL.A08(r5.A2b());
        C233822wX.A0B(this.A00, A0n, r5, r3, AnonymousClass05K.A00);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        A00(C51968G9o.A0m(obj), "instagram_organic_impression");
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        A00(C51968G9o.A0m(obj), C273654mx.A00(2880));
    }
}

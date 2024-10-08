package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LMy  reason: case insensitive filesystem */
public final class C64104LMy {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(C66292MMb.A01(this, 1));

    public C64104LMy(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A1M(r2, str, str2);
        this.A01 = userSession;
        this.A00 = r2;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
    }

    public static void A00(0Aj r2, C64104LMy lMy, Long l) {
        r2.A9F("upcoming_event_id", l);
        r2.AAJ("creation_session_id", lMy.A02);
        r2.AAJ(C273654mx.A00(194), AnonymousClass000.A00(1777));
        r2.Cgf();
    }
}

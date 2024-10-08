package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.H8c  reason: case insensitive filesystem */
public final class C54330H8c extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final String A02;
    public final String A03;

    public C54330H8c(UserSession userSession, AnonymousClass4DU r4, String str, String str2) {
        super(C51969G9p.A0i(1Bk.A03, userSession, AnonymousClass000.A00(1295)));
        this.A00 = userSession;
        this.A01 = r4;
        this.A03 = str;
        this.A02 = str2;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        1Xj r4 = (1Xj) obj;
        C55594HkE hkE = (C55594HkE) obj2;
        AnonymousClass7TG.A1N(r4, hkE);
        0Aj A0N = C51972G9s.A0N(this.A01, this.A00);
        if (A0N.isSampled()) {
            C51965G9l.A1E(A0N, Long.getLong(r4.getId()));
            A0N.AAJ(AnonymousClass000.A00(77), this.A03);
            A0N.AAJ("camera_session_id", this.A02);
            A0N.AAJ("search_session_id", (String) null);
            A0N.A9F("effect_id", 2AL.A08(r4.A2b()));
            A0N.A9F("row", DbS.A0j(hkE.A01));
            A0N.AAJ("position", String.valueOf(hkE.A00));
            G9w.A17(A0N);
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        1Xj r5 = (1Xj) obj;
        C55594HkE hkE = (C55594HkE) obj2;
        AnonymousClass7TG.A1N(r5, hkE);
        AnonymousClass4DU r3 = this.A01;
        0qQ.A0A(r3);
        C254523sc A0n = C51965G9l.A0n(r3, "instagram_thumbnail_sub_impression");
        A0n.A5u = r5.getId();
        String str = this.A03;
        0qQ.A0A(str);
        A0n.A58 = str;
        A0n.A4b = this.A02;
        A0n.A6r = null;
        A0n.A3V = 2AL.A08(r5.A2b());
        A0n.A0I = hkE.A01;
        A0n.A0H = hkE.A00;
        C233822wX.A0B(this.A00, A0n, r5, r3, AnonymousClass05K.A00);
    }
}

package X;

import com.instagram.common.session.UserSession;

public final class U8T extends 2YL {
    public final 2Fk A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final AnonymousClass0eM A04;

    public U8T(UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1O(userSession, str);
        0qQ.A0B(str2, 3);
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = str2;
        String str3 = WGU.A00(userSession).A03;
        0qQ.A07(str3);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        C51968G9o.A1K(A0a, "ads/ads_manager/fetch_promotion_information_v2/", str);
        A0a.A9m("fb_auth_token", str2);
        A0a.A0G("flow_id", str3);
        AnonymousClass11O.A03(C318116oQ.A00(this), DbT.A0R((15p) null, A0a, NHR.class, C70856OOl.class, false).A04(1481009581, 3));
        0t0 A012 = AnonymousClass0eN.A01(new C20690WxM(this, 48));
        this.A04 = A012;
        C73522Pe8 pe8 = new C73522Pe8(0, this, new C61860pz(new MGZ(this, (AnonymousClass4D7) null, 41), (AnonymousClass0r6) A012.getValue()));
        this.A00 = DbT.A0G(10b.A02(new C53336GmM((QP7) null, false), C318116oQ.A00(this), pe8, AnonymousClass10A.A00));
    }
}

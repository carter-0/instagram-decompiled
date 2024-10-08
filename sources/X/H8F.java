package X;

import com.instagram.common.session.UserSession;

public final class H8F extends 0ng {
    public final /* synthetic */ C57903IiK A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ String A02;

    public final void run() {
        String str;
        try {
            C57903IiK iiK = this.A00;
            AnonymousClass3KN r4 = iiK.A00;
            UserSession userSession = r4.A00;
            AnonymousClass4DU r6 = r4.A03;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_media_screenshot");
            String str2 = this.A02;
            A0e.A9F("mediaid", DbV.A0q(str2.split("[_@]")[0]));
            Integer num = iiK.A01;
            switch (num.intValue()) {
                case 1:
                    str = "reel";
                    break;
                case 2:
                    str = "clips";
                    break;
                default:
                    str = "feed";
                    break;
            }
            A0e.AAJ("media_source", str);
            A0e.A9F("viewer_id", DbV.A0q(userSession.A06));
            C51965G9l.A1Q(A0e, iiK.A02);
            C51973G9u.A14(A0e, "containermodule", r6.getModuleName());
            1Xj r62 = this.A01;
            if (r62 != null) {
                A0e.AAJ("source", C51965G9l.A0t(r62));
                A0e.AAJ("delivery_class", C2606846q.A00(r62.A2L()));
                AnonymousClass3KP r10 = r4.A04;
                C55651HlA hlA = new C55651HlA(r10.A00);
                if (r62.A5L()) {
                    if (182.A06(0Tu.A05, ((AnonymousClass35H) hlA.A01.getValue()).A00, 2342171663669673475L)) {
                        ((C56037Hrk) r10.A03.getValue()).A00(r62, "screenshot");
                    }
                }
            }
            Integer A002 = C271444ir.A00(str2);
            if (A002 != null) {
                A0e.A9F("client_position", C51968G9o.A0v(A002));
            }
            Long A012 = C271444ir.A01(str2);
            if (A012 != null) {
                A0e.A8D(AnonymousClass000.A00(5382), Double.valueOf(A012.doubleValue()));
            }
            A0e.Cgf();
            1Xj A022 = 1E7.A00(userSession).A02(r4.A01.getMediaId());
            if (!(A022 == null || A022.A2A(userSession) == null || !AnonymousClass3QO.FAN_CLUB.equals(A022.A1t()))) {
                C273004lm A003 = C272994ll.A00(userSession);
                long parseLong = Long.parseLong(A022.A2A(userSession).getId());
                String id = A022.getId();
                id.getClass();
                0Aj A0e2 = AnonymousClass7TE.A0e(A003.A00, "instagram_fan_club_story_screenshot_detected");
                Dbb.A1D(A0e2, C273654mx.A00(977), parseLong);
                A0e2.AAe("media_ids", AnonymousClass7TE.A1I(id));
                A0e2.Cgf();
            }
            if (!num.equals(AnonymousClass05K.A00)) {
                return;
            }
            if (r62 == null || !r62.CcK()) {
                1GI r42 = r4.A02;
                if (182.A06(0Tu.A05, r42.A00, 36317105289040673L) && !00l.A0W(str2)) {
                    r42.A05.add(str2);
                }
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8F(C57903IiK iiK, 1Xj r5, String str) {
        super(1373352527, 5, false, false);
        this.A00 = iiK;
        this.A02 = str;
        this.A01 = r5;
    }
}

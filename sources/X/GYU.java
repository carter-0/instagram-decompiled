package X;

import com.instagram.common.session.UserSession;

public final class GYU extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final AnonymousClass0eM A02 = C58715IwO.A00(this, 0eO.A02, 38);
    public final AnonymousClass07V A03;
    public final AnonymousClass93U A04;

    public GYU(AnonymousClass07V r3, UserSession userSession, AnonymousClass4DU r5, AnonymousClass93U r6) {
        super(C51969G9p.A0i(1Bk.A03, userSession, "clips_viewer_netego"));
        this.A03 = r3;
        this.A00 = userSession;
        this.A01 = r5;
        this.A04 = r6;
    }

    private final C254523sc A00(C267324bN r6, C52058GDe gDe, String str) {
        String str2;
        Integer num;
        int i;
        C254523sc A042 = C254513sb.A04(r6, this.A01, str);
        0jB A0k = C51965G9l.A0k();
        A042.A5d = r6.getId();
        A042.A66 = r6.getId();
        C53328GmE A022 = r6.A02();
        String str3 = null;
        if (A022 == null || (str2 = A022.A0B) == null) {
            str2 = "";
        }
        A042.A68 = str2;
        if (A022 != null) {
            num = A022.A03;
        } else {
            num = null;
        }
        A042.A32 = num;
        if (A022 != null) {
            str3 = A022.A0E;
        }
        A042.A7J = str3;
        A042.A09(gDe.A09());
        A042.A6t = this.A04.getSessionId();
        A042.A0E(A0k);
        AnonymousClass3W1 r0 = gDe.A0E;
        if (r0 != null) {
            i = r0.A0H;
        } else {
            i = -1;
        }
        A042.A0Q(Integer.valueOf(i));
        return A042;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        String str;
        C267324bN r9 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TF.A1H(r9, gDe);
        UserSession userSession = this.A00;
        AnonymousClass4DU r3 = this.A01;
        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
        C254523sc A002 = A00(r9, gDe, "instagram_netego_impression");
        if (AnonymousClass7TF.A0R(0Tu.A06, userSession, 36330067499958708L).booleanValue()) {
            I3O.A00(userSession).A01(r9, (Long) null, gDe.A09());
        }
        C292925jk.A01(A012, A002, r3);
        C53328GmE A022 = r9.A02();
        if (A022 != null) {
            str = A022.A0D;
        } else {
            str = null;
        }
        if ("Reels Upsell".equals(str)) {
            1Au.A00(userSession).A0l(AnonymousClass7TG.A0I());
        }
        C3728893a A0p = C51965G9l.A0p(this.A02);
        if (A0p != null) {
            C52058GDe.A07(r9, gDe, r3, A0p, false);
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C267324bN r5 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        boolean A1Z = AnonymousClass7TG.A1Z(r5, gDe);
        UserSession userSession = this.A00;
        AnonymousClass4DU r2 = this.A01;
        C292495j3.A00(AnonymousClass0kN.A01(r2, userSession), A00(r5, gDe, C273654mx.A00(2878)), r2);
        C3728893a A0p = C51965G9l.A0p(this.A02);
        if (A0p != null) {
            C52058GDe.A07(r5, gDe, r2, A0p, A1Z);
        }
    }
}
